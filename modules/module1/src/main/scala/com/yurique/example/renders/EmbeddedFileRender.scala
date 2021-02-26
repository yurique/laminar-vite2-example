package com.yurique.example
package renders

import com.raquo.laminar.api.L._
import io.laminext.syntax.markdown._
import com.yurique.embedded.FileAsString

object EmbeddedFileRender {

  val render: Render = page("Embedded File") { () =>
    div(
      cls := "space-y-10",
      components.PageTitle("Embedded File"),
      div(
        cls := "bg-gray-100 p-4 text-lg prose",
        unsafeMarkdown := FileAsString("/index.md")
      )
    )
  }

}
