
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
object unread extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[Comment],java.util.List[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(comments: java.util.List[Comment], tasks: java.util.List[Task]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.66*/("""

"""),_display_(/*3.2*/main("Unread")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""

"""),format.raw/*5.1*/("""<h1>Unread</h1>
<ul>
    """),_display_(/*7.6*/for(comment <- comments) yield /*7.30*/ {_display_(Seq[Any](format.raw/*7.32*/("""
    """),format.raw/*8.5*/("""<li>
        <h3> <strong>"""),_display_(/*9.23*/comment/*9.30*/.ownerName),format.raw/*9.40*/(""":</strong>  """),_display_(/*9.53*/comment/*9.60*/.content),format.raw/*9.68*/("""</h3>
    </li>
    """)))}),format.raw/*11.6*/("""
"""),format.raw/*12.1*/("""</ul>


<ul>
    """),_display_(/*16.6*/for(task <- tasks) yield /*16.24*/ {_display_(Seq[Any](format.raw/*16.26*/("""
    """),format.raw/*17.5*/("""<li>
        <h3> A new team """),_display_(/*18.26*/task/*18.30*/.taskName),format.raw/*18.39*/(""" """),format.raw/*18.40*/("""is created</h3>
    </li>
    """)))}),format.raw/*20.6*/("""
"""),format.raw/*21.1*/("""</ul>

"""),_display_(/*23.2*/helper/*23.8*/.form(routes.Application.mainPage())/*23.44*/ {_display_(Seq[Any](format.raw/*23.46*/("""
"""),format.raw/*24.1*/("""<button type="submit">Go back</button><br>
""")))}),format.raw/*25.2*/("""


""")))}),format.raw/*28.2*/("""
"""))}
  }

  def render(comments:java.util.List[Comment],tasks:java.util.List[Task]): play.twirl.api.HtmlFormat.Appendable = apply(comments,tasks)

  def f:((java.util.List[Comment],java.util.List[Task]) => play.twirl.api.HtmlFormat.Appendable) = (comments,tasks) => apply(comments,tasks)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 31 14:11:10 BST 2015
                  SOURCE: /Users/apple/Desktop/productivity/productivity/app/views/unreadPage.scala.html
                  HASH: c110a040a20ce750c2f4870309c2e057eb0bf213
                  MATRIX: 762->1|914->65|942->68|964->82|1003->84|1031->86|1082->112|1121->136|1160->138|1191->143|1244->170|1259->177|1289->187|1328->200|1343->207|1371->215|1422->236|1450->237|1494->255|1528->273|1568->275|1600->280|1657->310|1670->314|1700->323|1729->324|1790->355|1818->356|1852->364|1866->370|1911->406|1951->408|1979->409|2053->453|2087->457
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|35->7|35->7|35->7|36->8|37->9|37->9|37->9|37->9|37->9|37->9|39->11|40->12|44->16|44->16|44->16|45->17|46->18|46->18|46->18|46->18|48->20|49->21|51->23|51->23|51->23|51->23|52->24|53->25|56->28
                  -- GENERATED --
              */
          