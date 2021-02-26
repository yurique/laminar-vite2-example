package com.yurique.example
package renders

import com.raquo.laminar.api.L._

object Page3Render {

  val render: Render = page("Page 3") { () =>
    components.PageTitle("Page 3")
  }

}
