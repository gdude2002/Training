What is this I don't even?
==========================

RMI is a form of remote procedure calling - except the procedures are simply
supplied by the remote, and executed on the client.

What'd you do?
==============

Using Java's RMI registry stuff, we created a server and client tied together
with a common interface. On the remote (or server) machine, we..

* Start up the RMI registry
* Call our Server class as a program, which registers our interface

..and then on the client computer, we..

* Call our Client class, which connects to the remote RMI registry and gets
  the day of the week

What challenges were there?
===========================

Video quality mostly - the video we were shown went too fast and the speaker
was impossible to understand. We got around this by googling up Oracle's
["hello world" RMI example](http://docs.oracle.com/javase/7/docs/technotes/guides/rmi/hello/hello-world.html).

Anything else?
==============

There's not much to say, really. This was a fairly simple exercise.