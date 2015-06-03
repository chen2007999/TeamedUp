
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
object taskPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Task,java.util.List[Comment],String,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task : Task, comments : java.util.List[Comment], teamName : String, unreadNum :Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.90*/("""

"""),_display_(/*3.2*/main(task.taskName)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),_display_(/*4.2*/helper/*4.8*/.form(routes.Application.unreadPage())/*4.46*/ {_display_(Seq[Any](format.raw/*4.48*/("""
"""),format.raw/*5.1*/("""<button type="submit">"""),_display_(/*5.24*/unreadNum),format.raw/*5.33*/(""" """),format.raw/*5.34*/("""unread</button><br>
""")))}),format.raw/*6.2*/("""


    """),format.raw/*9.5*/("""<h2>Task Name: """),_display_(/*9.21*/task/*9.25*/.taskName),format.raw/*9.34*/(""" """),format.raw/*9.35*/("""</h2>
    <h2> Description: """),_display_(/*10.24*/task/*10.28*/.content),format.raw/*10.36*/(""" """),format.raw/*10.37*/("""</h2>
    <h2> Status: """),_display_(/*11.19*/task/*11.23*/.status),format.raw/*11.30*/(""" """),format.raw/*11.31*/("""</h2>


if(task.status.equals("Doing")) """),format.raw/*14.33*/("""{"""),format.raw/*14.34*/("""
"""),_display_(/*15.2*/helper/*15.8*/.form(routes.Application.markTaskAsDone())/*15.50*/ {_display_(Seq[Any](format.raw/*15.52*/("""
"""),format.raw/*16.1*/("""<button type="submit">Turn status to Done</button><br>
""")))}),format.raw/*17.2*/("""
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/(""" """),format.raw/*18.3*/("""else """),format.raw/*18.8*/("""{"""),format.raw/*18.9*/("""
"""),_display_(/*19.2*/helper/*19.8*/.form(routes.Application.markTaskAsDoing())/*19.51*/ {_display_(Seq[Any](format.raw/*19.53*/("""
"""),format.raw/*20.1*/("""<button type="submit">Turn status to Doing</button><br>
""")))}),format.raw/*21.2*/("""

"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""


"""),format.raw/*26.1*/("""<ul>
    """),_display_(/*27.6*/for(comment <- comments) yield /*27.30*/ {_display_(Seq[Any](format.raw/*27.32*/("""


    """),format.raw/*30.5*/("""<h3> <strong>"""),_display_(/*30.19*/comment/*30.26*/.ownerName),format.raw/*30.36*/(""":</strong>  """),_display_(/*30.49*/comment/*30.56*/.content),format.raw/*30.64*/("""</h3>

    """)))}),format.raw/*32.6*/("""
"""),format.raw/*33.1*/("""</ul>

    """),_display_(/*35.6*/helper/*35.12*/.form(routes.Application.createComment(task.taskId))/*35.64*/ {_display_(Seq[Any](format.raw/*35.66*/("""
    """),format.raw/*36.5*/("""<textarea name="content" cols="40" rows="5" placeholder=""></textarea>
    <button type="submit">Comment</button><br>
    """)))}),format.raw/*38.6*/("""

"""),_display_(/*40.2*/helper/*40.8*/.form(routes.Application.teamPage(teamName))/*40.52*/ {_display_(Seq[Any](format.raw/*40.54*/("""
"""),format.raw/*41.1*/("""<button type="submit">Go back</button><br>
""")))}),format.raw/*42.2*/("""





""")))}))}
  }

  def render(task:Task,comments:java.util.List[Comment],teamName:String,unreadNum:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,comments,teamName,unreadNum)

  def f:((Task,java.util.List[Comment],String,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,comments,teamName,unreadNum) => apply(task,comments,teamName,unreadNum)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 01 10:52:19 BST 2015
                  SOURCE: /Users/apple/Desktop/productivity/productivity/app/views/taskPage.scala.html
                  HASH: 6624b914d5e729c2fc1e5f65c57e0fc7a9b69120
                  MATRIX: 763->1|939->89|967->92|994->111|1033->113|1060->115|1073->121|1119->159|1158->161|1185->162|1234->185|1263->194|1291->195|1341->216|1374->223|1416->239|1428->243|1457->252|1485->253|1541->282|1554->286|1583->294|1612->295|1663->319|1676->323|1704->330|1733->331|1801->371|1830->372|1858->374|1872->380|1923->422|1963->424|1991->425|2077->481|2105->482|2133->483|2161->484|2193->489|2221->490|2249->492|2263->498|2315->541|2355->543|2383->544|2470->601|2499->603|2527->604|2557->607|2593->617|2633->641|2673->643|2707->650|2748->664|2764->671|2795->681|2835->694|2851->701|2880->709|2922->721|2950->722|2988->734|3003->740|3064->792|3104->794|3136->799|3289->922|3318->925|3332->931|3385->975|3425->977|3453->978|3527->1022
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|32->4|33->5|33->5|33->5|33->5|34->6|37->9|37->9|37->9|37->9|37->9|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|42->14|42->14|43->15|43->15|43->15|43->15|44->16|45->17|46->18|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|48->20|49->21|51->23|51->23|54->26|55->27|55->27|55->27|58->30|58->30|58->30|58->30|58->30|58->30|58->30|60->32|61->33|63->35|63->35|63->35|63->35|64->36|66->38|68->40|68->40|68->40|68->40|69->41|70->42
                  -- GENERATED --
              */
          