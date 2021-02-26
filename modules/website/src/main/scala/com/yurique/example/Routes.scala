package com.yurique.example

import com.raquo.laminar.api.L._
import io.frontroute._
import com.yurique.example.layout.PageWrap
import org.scalajs.dom

object Routes {

  private val (page, route) = makeRoute[Page] { render =>

    concat(
      (pathEnd.mapTo(true) | path("page-1").mapTo(false)) { isIndex =>
        render(Page.Page1(isIndex))
      },
      pathPrefix("page-2") {
        concat(
          pathEnd {
            render(Page.Page2())
          },
          path("sub-page") {
            render(Page.Page2SubPage())
          }
        )
      },
      path("page-3") {
        render(Page.Page3())
      },
      path("page-3" / "sub-page") {
        render(Page.Page3SubPage())
      },
      path("embedded-file") {
        render(Page.EmbeddedFilePage())
      },
      render(Page.NotFound())
    )
  }

  def start(): Unit = {
    val appContainer = dom.document.querySelector("#app")
    val appContent   = PageWrap(page)
    appContainer.innerHTML = ""
    com.raquo.laminar.api.L.render(appContainer, appContent)
    runRoute(route, LocationProvider.browser(windowEvents.onPopState))(unsafeWindowOwner)
    BrowserNavigation.emitPopStateEvent()
  }

}
