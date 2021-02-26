package com.yurique.example

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Configuration {

  @js.native
  @JSImport("website-config", JSImport.Default)
  private object WebsiteConfig extends js.Object

  lazy val config: js.Object = WebsiteConfig

}
