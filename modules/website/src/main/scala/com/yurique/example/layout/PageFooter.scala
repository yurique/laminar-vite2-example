package com.yurique.example.layout

import com.raquo.laminar.api.L._
import com.raquo.laminar.nodes.ReactiveHtmlElement

object PageFooter {

  def apply(
  ): ReactiveHtmlElement.Base =
    div(
      cls := "bg-gray-900 text-white p-4",
      "I'm a footer."
    )

}
