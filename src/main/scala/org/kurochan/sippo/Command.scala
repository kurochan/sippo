package org.kurochan.sippo

import java.io._

import org.apache.sshd.server.{Command => CommandOrig, Environment, ExitCallback}
import com.typesafe.scalalogging.slf4j.StrictLogging

class Command extends CommandOrig with StrictLogging {
  var exitCallback: Option[ExitCallback] = None
  var in: Option[InputStream] = None
  var out: Option[OutputStream] = None
  var err: Option[OutputStream] = None

  def destroy(): Unit = {
    logger.info("##### destroy!! #####")
  }

  def setInputStream(in: InputStream): Unit = {
    logger.info("##### set input!! #####")
    this.in = Option(in)
  }

  def setErrorStream(err: OutputStream): Unit = {
    logger.info("##### set error!! #####")
    this.err = Option(err)
  }

  def setOutputStream(out: OutputStream): Unit = {
    logger.info("##### set output!! #####")
    this.out = Option(out)
  }

  def start(env: Environment): Unit = {
    logger.info("##### start!! #####")
    exitCallback.map(_.onExit(0, "bye"))
  }

  def setExitCallback(callback: ExitCallback): Unit = {
    exitCallback = Some(callback)
    logger.info("##### exit!! #####")
  }
}