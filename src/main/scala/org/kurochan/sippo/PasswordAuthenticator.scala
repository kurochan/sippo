package org.kurochan.sippo

import java.net.InetSocketAddress

import org.apache.sshd.server.session.ServerSession
import org.apache.sshd.server.{PasswordAuthenticator => PasswordAuthenticatorOrig}
import org.slf4j.LoggerFactory

object PasswordAuthenticator extends PasswordAuthenticatorOrig {

  def authenticate(username: String, password: String, session: ServerSession): Boolean = {
    val logger = LoggerFactory.getLogger("sshLogger")

    val socket = session.getIoSession.getRemoteAddress.asInstanceOf[InetSocketAddress]
    val ip = socket.getAddress.getHostAddress
    val port = socket.getPort

    logger.info(s"${ip}\t${port}\t${username}\t${password}")
    true
  }
}
