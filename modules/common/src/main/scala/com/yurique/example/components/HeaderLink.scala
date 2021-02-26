package com.yurique.example.components

import com.raquo.laminar.api.L._
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.html

object HeaderLink {

  def apply(mods: Modifier[HtmlElement]*): ReactiveHtmlElement[html.Anchor] = {
    a(
      cls := "border-b-2 px-2 border-transparent flex font-display tracking-wide",
      cls := "text-gray-300 hover:border-gray-300 hover:text-white",
      mods
    )
  }

}
