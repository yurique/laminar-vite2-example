package com.yurique.example
package layout

import com.yurique.example.Page
import com.raquo.laminar.api.L._
import com.raquo.laminar.nodes.ReactiveHtmlElement

object PageHeader {

  def apply(
    $page: Signal[Option[Page]]
  ): ReactiveHtmlElement.Base = {
    div(
      cls := "flex bg-gray-900 text-white py-4 px-8 items-center space-x-8",
      nav(
        cls := "flex space-x-4 items-center justify-start",
        components.HeaderLink(
          href := "/",
          "/"
        ),
        components.HeaderLink(
          href := "/page-1",
          "Page 1"
        ),
        components.HeaderLink(
          href := "/page-2",
          "Page 2"
        ),
        components.HeaderLink(
          href := "/page-2/sub-page",
          "Page 2 / Sub Page"
        ),
        components.HeaderLink(
          href := s"/page-3",
          "Page 3"
        ),
        components.HeaderLink(
          href := s"/page-3/sub-page",
          "Page 3 / Sub Page"
        ),
        components.HeaderLink(
          href := s"/embedded-file",
          "Embedded File"
        ),
        components.HeaderLink(
          href := s"/i-dont-exist-in-routes",
          "Non-existent"
        )
      ),
      nav(
        cls := "flex-1 flex space-x-4 justify-start items-center",
      ),
      div(
        cls := "relative inline-block text-left",
      )
    )
  }

}
