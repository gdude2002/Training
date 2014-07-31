Pitfalls: Common problems
=========================

Java is a very versatile language. It takes the best of C, throws in
some object-oriented goodness and ties it all together with JVM
bytecode. The versatility is great, but sometimes, there are some things
it will allow you to do that you simply shouldn't.

Conditionals: Common pitfalls
-----------------------------

### Checking booleans

Something I see a lot of Java newcomers doing is this..

```java
boolean x = true; // Value from somewhere..

if (x == true) {
    // Some code
}
```

This is a very common mistake. It's best explained by looking at the comparison
operators - the main ones being `==`, `===`, `!=`, `<`, `<=`, `>=`, `>`, and so on.

Each operator can be thought of as a function. For example, `==` can be thought of
(in pseudocode) like this..

```java
boolean equalsEqualsOperator(left, right) {
    return left.equals(right) // Do actual comparisons here
}
```

As you can see, operators return things too. Comparison operators do, in fact,
return booleans. So, we can simplify the comparison.

```java
boolean x = true; // Value from somewhere..

// Our actual comparison
if (true == true) {
    // Some code
}

// So, basically..
if (true) {
    // Some code
}
```

Hopefully, then, it should make sense that all we really needed to do was the following.

```java
boolean x = true;

// Our actual comparison
if (x) {
    // Some code
}
```

Note that Java doesn't support truthy/falsey values - and that booleans cannot be
represented as integers. Someone suggested that this be added to Java
[here](http://octodecillion.com/blog/use-truthy-falsey-booleans-in-java/),
but I feel like they're really missing the point of Java.

### Curly braces

In Java, C, and other languages, you have two options for conditionals that only
have one line in their block: Use curly braces, or leave them out. Let's look
at both options..

```java
boolean x = true;

// With curly braces
if (x) {
    doSomethingWithX(x);
}

// Without curly braces
if (x)
    doSomethingWithX(x);
```

At first glance, the second option appears to be the cleanest and better-looking
option. I mean, we don't have to deal with those nasty curly braces, and since
we're good programmers, we'll never accidentally break a program with this, right?

Wrong. Allow me to illustrate this with an example.

Sometime in February of 2014, Apple pushed a [security update](http://support.apple.com/kb/HT6147)
for iOS. If you don't feel like clicking links, the summary was as follows:

> An attacker with a privileged network position may capture or modify data in sessions protected by SSL/TLS.
>
> Secure Transport failed to validate the authenticity of the connection.
> This issue was addressed by restoring missing validation steps.

This was a huge, huge problem - attackers on the same network (in this case, wifi) were able to
forge SSL certificates and hand them to users on the network along with fake websites. These
SSL certificates would be verified by iOS, and thus the attacker could easily steal any passwords
or session data provided by users, thinking they were sending data to a website securely - for
example, to Facebook.

This was **obviously** a huge problem, and Apple didn't provide any extra detail on what the
problem was or how it worked, but [a lot](https://news.ycombinator.com/item?id=7281378)
[of people](https://www.imperialviolet.org/2014/02/22/applebug.html) managed to track it down.
Let's take a look at this C code, taken from
[Apple's code](http://opensource.apple.com/source/Security/Security-55471/libsecurity_ssl/lib/sslKeyExchange.c?txt)..

```c
static OSStatus
SSLVerifySignedServerKeyExchange(SSLContext *ctx, bool isRsa, SSLBuffer signedParams,
                                 uint8_t *signature, UInt16 signatureLen)
{
    OSStatus err;

    // ...

    if ((err = SSLHashSHA1.update(&hashCtx, &serverRandom)) != 0)
        goto fail;
    if ((err = SSLHashSHA1.update(&hashCtx, &signedParams)) != 0)
        goto fail;
        goto fail;
    if ((err = SSLHashSHA1.final(&hashCtx, &hashOut)) != 0)
        goto fail;

    // ...

    fail:
        SSLFreeBuffer(&signedHashes);
        SSLFreeBuffer(&hashCtx);
        return err;
}
```

See the problem?

```c
    if ((err = SSLHashSHA1.update(&hashCtx, &signedParams)) != 0)
        goto fail;
        goto fail; // Uh-oh.
```

Oh dear.

As you can see, even the Apple engineers fell pray to what, until a few moments ago,
you probably considered to be a very basic mistake that only a newcomer could make.
However, as you can see, that's just not the case, and this code had been present
in iOS for years, up until it was discovered.

Hopefully this emphasizes my point - **Never leave out the curly braces on a
conditional**. Get into the habit now, or you'll regret it later.