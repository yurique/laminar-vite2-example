package com.yurique.example
package renders

import com.raquo.laminar.api.L._

object Page3SubPageRender {

  val render: Render = page("Page 3 / Sub Page") { () =>
    components.PageTitle("Page 3 / Sub Page")
  }

}
