package org.kurochan.sippo

import org.apache.sshd.server.session.ServerSession
import org.apache.sshd.server.{PasswordAuthenticator => PasswordAuthenticatorOrig}

object PasswordAuthenticator extends PasswordAuthenticatorOrig {

  def authenticate(username: String, password: String, session: ServerSession): Boolean = {
    true
  }
}
