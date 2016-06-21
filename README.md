Sippo
=====

SSH Honeypot Written in Scala.

## Quick Start

```bash
$ mkdir sippo
$ wget https://github.com/kurochan/sippo/releases/download/v0.1.0/sippo-0.1.0.jar

# startup with port 10022 by default
$ java -jar sippo-0.1-SNAPSHOT.jar

# or specifying listening port
$ java -jar sippo-0.1-SNAPSHOT.jar 12345
```

## Build

```bash
$ git clone https://github.com/kurochan/sippo.git
$ cd sippo
$ sbt compile
$ sbt assembly
```

## Prerequisities
* [SBT](http://www.scala-sbt.org)
