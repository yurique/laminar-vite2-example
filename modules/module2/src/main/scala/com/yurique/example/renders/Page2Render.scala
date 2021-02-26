package com.yurique.example
package renders

import com.raquo.laminar.api.L._

import scala.scalajs.js.JSON

object Page2Render {

  val render: Render = page("Page 2") { () =>
    div(
      components.PageTitle("Page 2"),
      cls := "prose",
      div(
        cls := "font-medium text-2xl text-gray-800",
        "Configuration:"
      ),
      pre(
        code(
          JSON.stringify(Configuration.config, space = 4)
        )
      )
    )
  }

}
