package org.kurochan.sippo

import org.apache.sshd.common.Factory
import org.apache.sshd.server.{Command => CommandOrig}

class CommandFactory extends Factory[CommandOrig] {
  def create(): Command = {
    new Command
  }
}
