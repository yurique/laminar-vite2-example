package com.yurique.example.components

import com.raquo.laminar.api.L._
import org.scalajs.dom.ext._

object DocumentationDisplay {

  def apply(title: String, markdown: String): Element =
    div(
      cls := "prose-custom",
//      unsafeMarkdown := TemplateVars(markdown)
    )

}
