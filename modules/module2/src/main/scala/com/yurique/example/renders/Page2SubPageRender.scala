package com.yurique.example
package renders

import com.raquo.laminar.api.L._

object Page2SubPageRender {

  val render: Render = page("Page 2 / Sub Page") { () =>
    components.PageTitle("Page 2 / Sub Page")
  }

}
