package org.kurochan.sippo

import java.io.{InputStream, OutputStream}

import org.apache.sshd.server.{Command => CommandOrig, Environment, ExitCallback}

class Command extends CommandOrig {
  var exitCallback: Option[ExitCallback] = None
  var in: Option[InputStream] = None
  var out: Option[OutputStream] = None
  var err: Option[OutputStream] = None

  def destroy(): Unit = {
    println("##### destroy!! #####")
  }

  def setInputStream(in: InputStream): Unit = {
    println("##### set input!! #####")
    this.in = Option(in)
  }

  def setErrorStream(err: OutputStream): Unit = {
    println("##### set error!! #####")
    this.err = Option(err)
  }

  def setOutputStream(out: OutputStream): Unit = {
    println("##### set output!! #####")
    this.out = Option(out)
  }

  def start(env: Environment): Unit = {
    println("##### start!! #####")
    exitCallback.map(_.onExit(0, "bye"))
  }

  def setExitCallback(callback: ExitCallback): Unit = {
    exitCallback = Some(callback)
    println("##### exit!! #####")
  }
}