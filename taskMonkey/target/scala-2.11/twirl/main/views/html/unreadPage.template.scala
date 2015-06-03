
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
object unreadPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[Comment],java.util.List[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(comments: java.util.List[Comment], tasks: java.util.List[Task]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.66*/("""

"""),_display_(/*3.2*/main("Unread")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""

"""),format.raw/*5.1*/("""<h1>Unread</h1>
<ul>
    """),_display_(/*7.6*/for(comment <- comments) yield /*7.30*/ {_display_(Seq[Any](format.raw/*7.32*/("""
    """),format.raw/*8.5*/("""<li>
        """),_display_(/*9.10*/helper/*9.16*/.form(routes.Application.redirectUnreadComment(comment.id))/*9.75*/ {_display_(Seq[Any](format.raw/*9.77*/("""
        """),format.raw/*10.9*/("""<button type="submit"> <h3> <strong>"""),_display_(/*10.46*/comment/*10.53*/.ownerName),format.raw/*10.63*/(""":</strong>  """),_display_(/*10.76*/comment/*10.83*/.content),format.raw/*10.91*/("""</h3></button><br>
        """)))}),format.raw/*11.10*/("""
    """),format.raw/*12.5*/("""</li>
    """)))}),format.raw/*13.6*/("""
"""),format.raw/*14.1*/("""</ul>



<ul>
    """),_display_(/*19.6*/for(task <- tasks) yield /*19.24*/ {_display_(Seq[Any](format.raw/*19.26*/("""
    """),format.raw/*20.5*/("""<li>
        """),_display_(/*21.10*/helper/*21.16*/.form(routes.Application.redirectUnreadTask(task.taskId))/*21.73*/ {_display_(Seq[Any](format.raw/*21.75*/("""
        """),format.raw/*22.9*/("""<button type="submit"><h3> A new task """),_display_(/*22.48*/task/*22.52*/.taskName),format.raw/*22.61*/(""" """),format.raw/*22.62*/("""is created</h3></button><br>
        """)))}),format.raw/*23.10*/("""
    """),format.raw/*24.5*/("""</li>
    """)))}),format.raw/*25.6*/("""
"""),format.raw/*26.1*/("""</ul>

"""),_display_(/*28.2*/helper/*28.8*/.form(routes.Application.mainPage())/*28.44*/ {_display_(Seq[Any](format.raw/*28.46*/("""
"""),format.raw/*29.1*/("""<button type="submit">Go back</button><br>
""")))}),format.raw/*30.2*/("""


""")))}),format.raw/*33.2*/("""
"""))}
  }

  def render(comments:java.util.List[Comment],tasks:java.util.List[Task]): play.twirl.api.HtmlFormat.Appendable = apply(comments,tasks)

  def f:((java.util.List[Comment],java.util.List[Task]) => play.twirl.api.HtmlFormat.Appendable) = (comments,tasks) => apply(comments,tasks)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 01 00:57:57 BST 2015
                  SOURCE: /Users/apple/Desktop/productivity/productivity/app/views/unreadPage.scala.html
                  HASH: da0f027d76282278bf393f8502ff7cf1a0c15a1d
                  MATRIX: 766->1|918->65|946->68|968->82|1007->84|1035->86|1086->112|1125->136|1164->138|1195->143|1235->157|1249->163|1316->222|1355->224|1391->233|1455->270|1471->277|1502->287|1542->300|1558->307|1587->315|1646->343|1678->348|1719->359|1747->360|1792->379|1826->397|1866->399|1898->404|1939->418|1954->424|2020->481|2060->483|2096->492|2162->531|2175->535|2205->544|2234->545|2303->583|2335->588|2376->599|2404->600|2438->608|2452->614|2497->650|2537->652|2565->653|2639->697|2673->701
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|35->7|35->7|35->7|36->8|37->9|37->9|37->9|37->9|38->10|38->10|38->10|38->10|38->10|38->10|38->10|39->11|40->12|41->13|42->14|47->19|47->19|47->19|48->20|49->21|49->21|49->21|49->21|50->22|50->22|50->22|50->22|50->22|51->23|52->24|53->25|54->26|56->28|56->28|56->28|56->28|57->29|58->30|61->33
                  -- GENERATED --
              */
          