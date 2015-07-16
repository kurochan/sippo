package org.kurochan.sippo

import org.apache.sshd.server.session.ServerSession
import org.apache.sshd.server.{PasswordAuthenticator => PasswordAuthenticatorOrig}
import org.slf4j.LoggerFactory

object PasswordAuthenticator extends PasswordAuthenticatorOrig {

  def authenticate(username: String, password: String, session: ServerSession): Boolean = {
    val logger = LoggerFactory.getLogger("sshLogger")
    logger.info(s"${username}\t${password}")
    true
  }
}
