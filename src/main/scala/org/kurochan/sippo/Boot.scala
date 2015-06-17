package org.kurochan.sippo

import org.apache.sshd.SshServer
import org.apache.sshd.server.keyprovider.SimpleGeneratorHostKeyProvider

object Boot {

  def main(args: Array[String]) {
  	println("Hello")
    val sshd = SshServer.setUpDefaultServer
    sshd.setPort(10022)
    sshd.setKeyPairProvider(new SimpleGeneratorHostKeyProvider("hostkey.ser"))
    sshd.start
  }
}
