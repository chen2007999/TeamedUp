
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
object unreadPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[java.util.List[Comment],java.util.List[Task],java.util.List[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(comments: java.util.List[Comment], tasks: java.util.List[Task], events:java.util.List[Event]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.96*/("""

"""),_display_(/*3.2*/main("Unread")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""

"""),format.raw/*5.1*/("""<h1>Unread</h1>

<ul>
    """),_display_(/*8.6*/for(event <- events) yield /*8.26*/ {_display_(Seq[Any](format.raw/*8.28*/("""
    """),format.raw/*9.5*/("""<li>
        """),_display_(/*10.10*/helper/*10.16*/.form(routes.Application.redirectUnreadEvent(event.id))/*10.71*/ {_display_(Seq[Any](format.raw/*10.73*/("""
        """),format.raw/*11.9*/("""<button type="submit"> <h3> """),_display_(/*11.38*/event/*11.43*/.ownerName),format.raw/*11.53*/(""" """),format.raw/*11.54*/("""created an event """),_display_(/*11.72*/event/*11.77*/.eventName),format.raw/*11.87*/(""" """),format.raw/*11.88*/("""</h3></button><br>
        """)))}),format.raw/*12.10*/("""
    """),format.raw/*13.5*/("""</li>
    """)))}),format.raw/*14.6*/("""
"""),format.raw/*15.1*/("""</ul>

<ul>
    """),_display_(/*18.6*/for(comment <- Unread.getUnreadComments(Application.currentClient)) yield /*18.73*/ {_display_(Seq[Any](format.raw/*18.75*/("""
    """),format.raw/*19.5*/("""<li>
        """),_display_(/*20.10*/helper/*20.16*/.form(routes.Application.redirectUnreadComment(comment.id))/*20.75*/ {_display_(Seq[Any](format.raw/*20.77*/("""
        """),format.raw/*21.9*/("""<button type="submit"> <h3> <strong>"""),_display_(/*21.46*/comment/*21.53*/.ownerName),format.raw/*21.63*/(""":</strong>  """),_display_(/*21.76*/comment/*21.83*/.content),format.raw/*21.91*/("""</h3></button><br>
        """)))}),format.raw/*22.10*/("""
    """),format.raw/*23.5*/("""</li>
    """)))}),format.raw/*24.6*/("""
"""),format.raw/*25.1*/("""</ul>



<ul>
    """),_display_(/*30.6*/for(task <- tasks) yield /*30.24*/ {_display_(Seq[Any](format.raw/*30.26*/("""
    """),format.raw/*31.5*/("""<li>
        """),_display_(/*32.10*/helper/*32.16*/.form(routes.Application.redirectUnreadTask(task.taskId))/*32.73*/ {_display_(Seq[Any](format.raw/*32.75*/("""
        """),format.raw/*33.9*/("""<button type="submit"><h3> A new task """),_display_(/*33.48*/task/*33.52*/.taskName),format.raw/*33.61*/(""" """),format.raw/*33.62*/("""is created</h3></button><br>
        """)))}),format.raw/*34.10*/("""
    """),format.raw/*35.5*/("""</li>
    """)))}),format.raw/*36.6*/("""
"""),format.raw/*37.1*/("""</ul>

"""),_display_(/*39.2*/helper/*39.8*/.form(routes.Application.mainPage())/*39.44*/ {_display_(Seq[Any](format.raw/*39.46*/("""
"""),format.raw/*40.1*/("""<button type="submit">Go back</button><br>
""")))}),format.raw/*41.2*/("""


""")))}),format.raw/*44.2*/("""
"""))}
  }

  def render(comments:java.util.List[Comment],tasks:java.util.List[Task],events:java.util.List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(comments,tasks,events)

  def f:((java.util.List[Comment],java.util.List[Task],java.util.List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (comments,tasks,events) => apply(comments,tasks,events)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 20:12:32 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/unreadPage.scala.html
                  HASH: 53e39ca47cd5f22f1088415cdb023f6a908d83c5
                  MATRIX: 788->1|970->95|998->98|1020->112|1059->114|1087->116|1139->143|1174->163|1213->165|1244->170|1285->184|1300->190|1364->245|1404->247|1440->256|1496->285|1510->290|1541->300|1570->301|1615->319|1629->324|1660->334|1689->335|1748->363|1780->368|1821->379|1849->380|1892->397|1975->464|2015->466|2047->471|2088->485|2103->491|2171->550|2211->552|2247->561|2311->598|2327->605|2358->615|2398->628|2414->635|2443->643|2502->671|2534->676|2575->687|2603->688|2648->707|2682->725|2722->727|2754->732|2795->746|2810->752|2876->809|2916->811|2952->820|3018->859|3031->863|3061->872|3090->873|3159->911|3191->916|3232->927|3260->928|3294->936|3308->942|3353->978|3393->980|3421->981|3495->1025|3529->1029
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|36->8|36->8|36->8|37->9|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|39->11|39->11|39->11|39->11|39->11|40->12|41->13|42->14|43->15|46->18|46->18|46->18|47->19|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|49->21|49->21|49->21|50->22|51->23|52->24|53->25|58->30|58->30|58->30|59->31|60->32|60->32|60->32|60->32|61->33|61->33|61->33|61->33|61->33|62->34|63->35|64->36|65->37|67->39|67->39|67->39|67->39|68->40|69->41|72->44
                  -- GENERATED --
              */
          