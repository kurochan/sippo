package org.kurochan.sippo

import org.apache.sshd.SshServer
import org.apache.sshd.server.keyprovider.SimpleGeneratorHostKeyProvider
import org.slf4j.LoggerFactory

object Boot {

  def main(args: Array[String]) {
    val console = LoggerFactory.getLogger("consoleLogger")
    val sshd = SshServer.setUpDefaultServer

    sshd.setPort(10022)
    sshd.setKeyPairProvider(new SimpleGeneratorHostKeyProvider("hostkey.ser"))
    sshd.setPasswordAuthenticator(PasswordAuthenticator)
    sshd.setShellFactory(new CommandFactory)
    sshd.start

    console.info("SSH Honeypot Started.")
  }
}
