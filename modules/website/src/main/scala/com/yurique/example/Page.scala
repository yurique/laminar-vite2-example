package com.yurique.example

import com.yurique.example.renders.EmbeddedFileRender
import com.yurique.example.renders.Page1Render
import com.yurique.example.renders.Page2Render
import com.yurique.example.renders.Page2SubPageRender
import com.yurique.example.renders.Page3Render
import com.yurique.example.renders.Page3SubPageRender
import com.yurique.example.renders.Render

abstract class Page(val render: Render)

object Page {

  case class Page1(isIndex: Boolean) extends Page(Page1Render.render(isIndex))
  case class Page2()                 extends Page(Page2Render.render)
  case class Page2SubPage()          extends Page(Page2SubPageRender.render)
  case class Page3()                 extends Page(Page3Render.render)
  case class Page3SubPage()          extends Page(Page3SubPageRender.render)
  case class EmbeddedFilePage()      extends Page(EmbeddedFileRender.render)
  case class NotFound()              extends Page(() => Left((404, "Not Found")))

}
