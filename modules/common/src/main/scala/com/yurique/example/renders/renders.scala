package com.yurique.example

import com.raquo.laminar.api.L._

package object renders {

  type Render       = () => RenderResult
  type RenderResult = Either[(Int, String), (Element, String)]

  def page(title: String)(content: () => Element): Render = () => Right((content(), title))
  def error(code: Int, message: String): Render           = () => Left((code, message))

}
