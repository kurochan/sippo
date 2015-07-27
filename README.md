Sippo
=====

SSH Honeypot Written in Scala.

## Quick Start

```bash
$ mkdir sippo
$ wget https://github.com/kurochan/sippo/releases/download/v0.1/sippo-0.1-SNAPSHOT.jar
$ java -jar sippo-0.1-SNAPSHOT.jar
```

* startup with port 10022 by default

## Build

```bash
$ git clone https://github.com/kurochan/sippo.git
$ cd sippo
$ sbt compile
$ sbt assembly
```

## Features
* [Scala](http://www.scala-lang.org)
* SBT plugins
  * [gen-idea](https://github.com/mpeltonen/sbt-idea)
  * [eclipse](https://github.com/typesafehub/sbteclipse)

## Prerequisities
* [SBT](http://www.scala-sbt.org)
