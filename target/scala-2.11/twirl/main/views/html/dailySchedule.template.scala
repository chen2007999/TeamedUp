
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
object dailySchedule extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events : java.util.List[Event]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""


"""),_display_(/*4.2*/main("My events")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""


"""),_display_(/*7.2*/for(e <- events) yield /*7.18*/ {_display_(Seq[Any](format.raw/*7.20*/("""
"""),format.raw/*8.1*/("""<li>
    """),_display_(/*9.6*/helper/*9.12*/.form(routes.Application.showEventInfo(e.eventName))/*9.64*/ {_display_(Seq[Any](format.raw/*9.66*/("""
    """),format.raw/*10.5*/("""<button type="submit"><h3>
 Event name: """),_display_(/*11.15*/e/*11.16*/.eventName),format.raw/*11.26*/("""
"""),format.raw/*12.1*/("""Location: """),_display_(/*12.12*/e/*12.13*/.location),format.raw/*12.22*/("""
"""),format.raw/*13.1*/("""Start time: """),_display_(/*13.14*/e/*13.15*/.startTime),format.raw/*13.25*/("""
"""),format.raw/*14.1*/("""End time: """),_display_(/*14.12*/e/*14.13*/.endTime),format.raw/*14.21*/("""
    """),format.raw/*15.5*/("""</h3></button><br>
    """)))}),format.raw/*16.6*/("""

    """),format.raw/*18.5*/("""</li>
""")))}),format.raw/*19.2*/("""






""")))}))}
  }

  def render(events:java.util.List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(events)

  def f:((java.util.List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (events) => apply(events)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 13:01:46 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/dailySchedule.scala.html
                  HASH: 7e7bfee5be83b2b1e01d0e8f3b29575bebe74808
                  MATRIX: 746->1|866->33|895->37|920->54|959->56|988->60|1019->76|1058->78|1085->79|1120->89|1134->95|1194->147|1233->149|1265->154|1333->195|1343->196|1374->206|1402->207|1440->218|1450->219|1480->228|1508->229|1548->242|1558->243|1589->253|1617->254|1655->265|1665->266|1694->274|1726->279|1780->303|1813->309|1850->316
                  LINES: 26->1|29->1|32->4|32->4|32->4|35->7|35->7|35->7|36->8|37->9|37->9|37->9|37->9|38->10|39->11|39->11|39->11|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|43->15|44->16|46->18|47->19
                  -- GENERATED --
              */
          