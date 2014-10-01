**Please read this README before the code** - there is lots of useful information here that may
not be covered on our course!

Quick links
===========

* Examples
    * [GreetingsUniverse](https://github.com/gdude2002/Training/blob/master/src/exercises/july31/GreetingsUniverse.md)
* Documents
    * [Pitfalls document](https://github.com/gdude2002/Training/blob/master/docs/PITFALLS.md)
    * [Wat?](https://github.com/gdude2002/Training/blob/master/docs/WAT.md) (Exceptions)
* Test analyses
    * [August 5th](https://github.com/gdude2002/Training/blob/master/docs/tests/August05.md)
* Other stuff
    * [August 12th exercises](https://github.com/gdude2002/Training/blob/master/src/exercises/august12/README.md)
    * [RMI example exercise](https://github.com/gdude2002/Training/blob/master/src/RMI/)


Training
========

If you're in my course group and you're struggling to follow the exercises
that are being put on the board, you can refer here for alternate solutions.

If you have GitHub, feel free to create issues and comments, or fork this repo
and create pull requests to suggest better solutions to the exercises.

Oh, and remember: **Don't copy that floppy!** If you're doing homework, you should
still come up with your own answers! Don't directly copy my work - instead, use
it to give yourself an idea of what to do to solve your specific problem.

Recommendations
===============

## Tools and IDEs

Our tutor prefers Eclipse. This is fine, as it's his opinion. My opinion, however, is
quite different.

In my experience, Eclipse tends to be slow, buggy, confusing to configure, and often
actually can be more of a hindrance than a help. While you can be a good programmer
without good tools, they often make or break the development process, and one should
not be spending large amounts of time on fighting with their tools - and the bottom
line is, **we deserve better**.

Personally, I use IntelliJ's IDEA, which is a modern, fast and powerful IDE for Java,
written in Java, and with tons of features that are useful to Java programmers. IntelliJ
also produces a lot of other IDEs based on the IDEA platform, including IDEs for Python,
PHP, JavaScript and general web development.

If you still want to use Eclipse or simply try another IDE, I've listed the links below
in order of my personal preference.

* [IntelliJ IDEA](http://www.jetbrains.com/idea/download/)
    (Arguably the best - the community edition is just fine)
* [NetBeans](https://netbeans.org/downloads/)
    (The official Java IDE, by Oracle - Get the Java SE version)
* [JDeveloper](http://www.oracle.com/technetwork/developer-tools/jdev/overview/index.html)
    (Oracle's open-source Java development toolkit)
* [Eclipse for Java Developers](https://eclipse.org/downloads/packages/eclipse-ide-java-developers/lunar)
    (Ew)

## Java version differences

Our course appears to be using course material from the Java 5 days. It's not less relevant
today than it was when Java 5 became the latest version, but there are some key differences that
should be taken into account.

Firstly, the current version of Java is Java 8. However, it's wise to target Java 7, as that's what
most people will be using. If users demand Java 6, politely point out that support for Java 6 ended
in November of 2012, and that it may be wise to update to at least Java 7 for performance and
security reasons.

Of course, never turn down a job offer because they're using an old version of Java - they
may have reasons to do so that nobody understands.

Also, please note, I'm only going to cover the important details here; there are far too many
changes to detail in this README.

### Differences: Java 5 -> 6 (Mustang)

Full changelog: http://www.oracle.com/technetwork/java/javase/features-141434.html

* [Changes](http://docs.oracle.com/javase/6/docs/technotes/guides/collections/changes6.html)
    to the Collections framework
    * [Deque](http://docs.oracle.com/javase/6/docs/api/java/util/Deque.html) -
        A double-ended queue (supporting element insertion and removal at both ends)
    * [NavigableSet](http://docs.oracle.com/javase/6/docs/api/java/util/NavigableSet.html)
        and [NavigableMap](http://docs.oracle.com/javase/6/docs/api/java/util/NavigableMap.html)
    * [newSetFromMap(Map)](http://docs.oracle.com/javase/6/docs/api/java/util/Collections.html#newSetFromMap(java.util.Map))
        and [asLifoQueue(Deque)](http://docs.oracle.com/javase/6/docs/api/java/util/Collections.html#asLifoQueue(java.util.Deque))
* [Enhancements](http://docs.oracle.com/javase/6/docs/technotes/guides/jar/changes6.html)
    to jar and zip support
* [Enhancements](http://docs.oracle.com/javase/6/docs/technotes/guides/io/enhancements.html#6)
    to the `java.io` package
    * [Console](http://docs.oracle.com/javase/6/docs/api/java/io/Console.html) - A better alternative to `Scanner`
* [Changes](http://docs.oracle.com/javase/6/docs/technotes/guides/net/enhancements-6.0.html)
    to Java networking, especially support for internationalized domain names
* Support for `@Override` in Interfaces

### Differences: Java 6 -> 7 (Dolphin)

Full changelog: http://www.oracle.com/technetwork/java/javase/jdk7-relnotes-418459.html

* Lots of small but nice language changes
    * Switches now support strings as well as numeric types
    * Automatic resource management in `try...catch` blocks
    * Diamond types, for example..
        * Java 6: `Map<String, Integer> map = new HashMap<String, Integer>();`
        * Java 7: `Map<String, Integer> map = new HashMap<>();`
    * Underscores are now allowed in numeric literals
    * Catching multiple exception types in one block, and rethrowing exceptions with improved type-checking
* The removal of a few features which will be replaced in Java 8 and Java 9
    * Lambdas (in-place functions)
    * Jigsaw (Java's implementation of modules)
    * Parts of Coin

### Differences: Java 7 -> 8 (Codenames dropped but Spider is often used)

Full changelog: http://www.oracle.com/technetwork/java/javase/8-whats-new-2157071.html

* Project Lambda - Language-level support for lambdas (which are really just closures)
* Multiple inheritance (of implementation)
* Project Nashorn (A JavaScript runtime that can be embedded within applications)
* Annotations on Java types
* New time and date APIs
* Better concurrency

There are a few good articles on these changes
[here](http://www.takipiblog.com/2014/03/18/5-features-in-java-8-that-will-change-how-you-code/),
[here](http://www.techempower.com/blog/2013/03/26/everything-about-java-8/) and
[here](http://zeroturnaround.com/rebellabs/java-8-revealed-lambdas-default-methods-and-bulk-data-operations/).

## Libraries and frameworks

When you're looking for a job, working with a Java project, employers will often ask that you have a grasp
of various frameworks and libraries. Sometimes these will be monolithic frameworks with lots of features,
or they'll be small but game-changing libraries that help you do everything better, but as soon as you
see an offering asking for experience with them, you'll want to look them up and see what makes them
tick.

Even if you don't get the job or, heck, apply for it in the first place, these companies are using these
libraries and frameworks for a reason, and you may find them useful over your programming career too. Some
common frameworks and libraries are..

* [Apache Commons](http://commons.apache.org) - A huge collection of useful and re-usable Java classes.
    Definitely check this out!
* [Apache Tapestry](http://tapestry.apache.org) - A rather massive web framework, designed for robustness
    and scalability.
* [Clojure](http://clojure.org) - A lisp-based functional programming language that runs on top of the JVM.
* [Grails](https://grails.org) - A web framework designed to be like Ruby on Rails, which uses the Groovy
   language.
* [Groovy](http://groovy.codehaus.org) - An agile language that runs on top of the JVM and is used in a large
   number of places.
* [Hibernate](http://hibernate.org) - Everything data. An object-relational mapper for databases, and more
    besides.
* [HornetQ](http://hornetq.jboss.org) by JBoss - A robust, embeddable asynchronous messaging system.
* [Scala](http://www.scala-lang.org) - A hybrid language that runs on top of the JVM, that seems to be
   popular for some reason.
* [Spring](http://spring.io) - A huge framework that comes with its own Eclipse-based IDE.

## Version control and programming in teams

When you're working with a team of programmers, as you almost certainly will be, it is *essential* that
you are all able to coordinate and share code without standing on each others' feet. The best way to do
this is through a **version control system**. There are many, many, *many* different VCS applications, but
the major ones are..

* Bazaar (bzr)
* CVS
* Git
* Mercurial (hg)
* Subversion

As you're probably reading this on GitHub, you can probably guess that Git is my VCS of choice. I'm not
going to detail the differences between each system here, but I do implore you, dear reader, to Google
around, try out Git and a few other systems, and see what suits you. It's also good to have an idea
how each of the above VCS tools work, as you may be required to use one (or more) of them when you
get a job, working with a team.

## Building and distributing

For the most part, your Java projects are going to be packages as JARs, and shipped off to the client
or whoever may end up using your application or library. Many IDEs can create these JARs for you, but
when you're working on a team or with a lot of code, this is time-consuming and far from ideal. On top
of this, you don't want to spend large amounts of time finding and downloading the correct version
of every library your project needs.

Fortunately, there's a better way. Enter: build tools.

Build tools provide automated ways of..

* Downloading required libraries
* Creating and packaging JAR files
* Creating methods of distribution for your libraries

..and more besides.

If you're using a build tool, you basically have three options.

* [Apache Ant](http://ant.apache.org) - An old and somewhat archaic build tool solution
* [Apache Maven](http://maven.apache.org) - A common but unfortunately XML-based solution
* [Gradle](http://www.gradle.org) - A modern build tool that uses Groovy extensively

I recommend Gradle as the build tool of choice, and I use it for all of my projects. Again, I'm
not going to cover the differences in the build tools here, but please do check them all out as
you may be required to use one (or more) of them when you get a job.

How to use this repo
====================

* All source code can be found in the `src/` folder.
* For exercises, there's an `exercises` package.
    * There is a package for each date that I did the exercises for.
        * For example, `exercises.july30`
* Anything else won't be in the `exercises` package. It may be best to just explore.