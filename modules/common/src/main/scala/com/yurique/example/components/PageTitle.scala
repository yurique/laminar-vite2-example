package com.yurique.example.components

import com.raquo.laminar.api.L._
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.html.Heading

object PageTitle {

  def apply(mods: Modifier[HtmlElement]*): ReactiveHtmlElement[Heading] =
    h1(
      cls := "text-3xl text-semibold tracking-wide",
      mods
    )

}
