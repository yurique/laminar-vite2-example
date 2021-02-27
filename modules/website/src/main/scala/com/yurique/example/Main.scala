package com.yurique.example

import com.raquo.laminar.api.L._
import io.frontroute._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("stylesheets/main.css", JSImport.Namespace)
object Css extends js.Any

object Main {

  val css: Css.type = Css

  def main(args: Array[String]): Unit = {
    val _ = documentEvents.onDomContentLoaded.foreach { _ =>
      LinkHandler.install()
      Routes.start()
    }(unsafeWindowOwner)
  }

}
