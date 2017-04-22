package io.scalajs.dom.html.phaser.component

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
//@JSGlobal("Phaser.Component.Animation")
trait Animation extends js.Object {

  def play(key: String, frameRate: Double = 60, loop: Boolean = false, killOnComplete: Boolean = false): Animation =
    js.native

}
