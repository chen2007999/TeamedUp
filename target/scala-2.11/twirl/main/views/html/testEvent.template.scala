
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object testEvent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(strings : java.util.List[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.36*/("""

"""),_display_(/*3.2*/main("Event")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""

"""),_display_(/*5.2*/for(s <- strings) yield /*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""

    """),format.raw/*7.5*/("""<h2> """),_display_(/*7.11*/s),format.raw/*7.12*/(""" """),format.raw/*7.13*/("""</h2>
    """)))}),format.raw/*8.6*/("""


""")))}))}
  }

  def render(strings:java.util.List[String]): play.twirl.api.HtmlFormat.Appendable = apply(strings)

  def f:((java.util.List[String]) => play.twirl.api.HtmlFormat.Appendable) = (strings) => apply(strings)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 13:01:47 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/testEvent.scala.html
                  HASH: 11647dc925f2d84b3f6b18f15593ff89c249ba46
                  MATRIX: 743->1|865->35|893->38|914->51|953->53|981->56|1013->73|1052->75|1084->81|1116->87|1137->88|1165->89|1205->100
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|35->7|35->7|35->7|35->7|36->8
                  -- GENERATED --
              */
          