package com.yurique.example
package renders

import com.raquo.laminar.api.L._

object Page1Render {

  def render(isIndex: Boolean): Render = page("Page 1") { () =>
    div(
      components.PageTitle("Page 1"),
      div(
        cls := "flex space-x-1",
        div(
          "is `/`:"
        ),
        div(
          isIndex.toString
        )
      )
    )
  }

}
