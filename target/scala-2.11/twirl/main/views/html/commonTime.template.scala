
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
object commonTime extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.5*/("""<div class="container-fluid" id="fill" align="center">
        <h2>Below are the time slots when all the members are free, choose one for your event</h2>
        <div class="row-fluid" id="fill">
            <div class="span6 offset3 well">
                <ul class="list-group">
                """),_display_(/*6.18*/for(slot <- Event.timeListToString(Event.findWeeklyCommonFreetime(Application.eventClientList, Event.currentDate()))) yield /*6.135*/ {_display_(Seq[Any](format.raw/*6.137*/("""
                """),format.raw/*7.17*/("""<li class="list-group-item">
                    """),_display_(/*8.22*/helper/*8.28*/.form(routes.Application.chooseCommonTime(slot))/*8.76*/ {_display_(Seq[Any](format.raw/*8.78*/("""
                    """),format.raw/*9.21*/("""<button class="list-button-time" type="submit">"""),_display_(/*9.69*/slot),format.raw/*9.73*/("""</button>
                    """)))}),format.raw/*10.22*/("""
                """),format.raw/*11.17*/("""</li>
                """)))}),format.raw/*12.18*/("""
                """),format.raw/*13.17*/("""</ul>
                """),_display_(/*14.18*/helper/*14.24*/.form(routes.Application.eventPage())/*14.61*/ {_display_(Seq[Any](format.raw/*14.63*/("""
                """),format.raw/*15.17*/("""<button type="submit">Go back</button><br>
                """)))}),format.raw/*16.18*/("""
            """),format.raw/*17.13*/("""</div>
        </div>
    </div>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 20:12:29 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/commonTime.scala.html
                  HASH: 40166515f7c50bb013a8858f2cd14597e80397b5
                  MATRIX: 803->4|1127->302|1260->419|1300->421|1344->438|1420->488|1434->494|1490->542|1529->544|1577->565|1651->613|1675->617|1737->648|1782->665|1836->688|1881->705|1931->728|1946->734|1992->771|2032->773|2077->790|2168->850|2209->863
                  LINES: 29->1|34->6|34->6|34->6|35->7|36->8|36->8|36->8|36->8|37->9|37->9|37->9|38->10|39->11|40->12|41->13|42->14|42->14|42->14|42->14|43->15|44->16|45->17
                  -- GENERATED --
              */
          