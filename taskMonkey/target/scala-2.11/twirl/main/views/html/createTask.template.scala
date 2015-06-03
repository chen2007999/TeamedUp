
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
object createTask extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.Team,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(team: models.Team, unreadNum: Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.41*/("""

"""),_display_(/*3.2*/main("Create a new Task")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""

"""),_display_(/*5.2*/helper/*5.8*/.form(routes.Application.unreadPage())/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
"""),format.raw/*6.1*/("""<button type="submit">"""),_display_(/*6.24*/unreadNum),format.raw/*6.33*/(""" """),format.raw/*6.34*/("""unread</button><br>
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/helper/*9.8*/.form(routes.Application.createTask())/*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
"""),format.raw/*10.1*/("""<input name="taskName" placeholder="task name"><br>

<textarea name="content" cols="40" rows="5" placeholder="description"></textarea>
<button type="submit">Create</button><br>
""")))}),format.raw/*14.2*/("""

"""),_display_(/*16.2*/helper/*16.8*/.form(routes.Application.teamPage(team.teamName))/*16.57*/ {_display_(Seq[Any](format.raw/*16.59*/("""
"""),format.raw/*17.1*/("""<button type="submit">Go back</button><br>
""")))}),format.raw/*18.2*/("""

""")))}))}
  }

  def render(team:models.Team,unreadNum:Integer): play.twirl.api.HtmlFormat.Appendable = apply(team,unreadNum)

  def f:((models.Team,Integer) => play.twirl.api.HtmlFormat.Appendable) = (team,unreadNum) => apply(team,unreadNum)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 31 15:57:07 BST 2015
                  SOURCE: /Users/apple/Desktop/productivity/productivity/app/views/createTask.scala.html
                  HASH: 137f4aca1a66b7628c9e2e01f816c51f6243b3b5
                  MATRIX: 741->1|868->40|896->43|929->68|968->70|996->73|1009->79|1055->117|1094->119|1121->120|1170->143|1199->152|1227->153|1277->174|1305->177|1318->183|1364->221|1403->223|1431->224|1639->402|1668->405|1682->411|1740->460|1780->462|1808->463|1882->507
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|34->6|34->6|34->6|34->6|35->7|37->9|37->9|37->9|37->9|38->10|42->14|44->16|44->16|44->16|44->16|45->17|46->18
                  -- GENERATED --
              */
          