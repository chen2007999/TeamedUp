
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
object createEvent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(unreadNum : Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""

"""),_display_(/*3.2*/main("Event")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
"""),format.raw/*4.1*/("""<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.at("stylesheets/style.css")),format.raw/*6.76*/("""" type="text/css">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.51*/routes/*8.57*/.Assets.at("stylesheets/bootmetro.css")),format.raw/*8.96*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.51*/routes/*9.57*/.Assets.at("stylesheets/bootmetro-responsive.css")),format.raw/*9.107*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.51*/routes/*10.57*/.Assets.at("stylesheets/bootmetro-icons.css")),format.raw/*10.102*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.51*/routes/*11.57*/.Assets.at("stylesheets/bootmetro-ui-light.css")),format.raw/*11.105*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.51*/routes/*12.57*/.Assets.at("stylesheets/datepicker.css")),format.raw/*12.97*/("""">
    <script src=""""),_display_(/*13.19*/routes/*13.25*/.Assets.at("javascripts/modernizr-2.6.2.min.js")),format.raw/*13.73*/(""""></script>
        <div class="navbar">
        <div class="navbar-inner">

             <div class="row-fluid">

                 <div class="span6">
                    <a class="brand" href="#">Distration Blocker</a>
                     <ul class="nav">
                        <li><a href="/landing">Home</a></li>
                        <li class="active"><a href="#">Main Page</a></li>
                    </ul>
                 </div>
                 <div class="span6" align="right">
                     <div class="btn-group">
                        """),_display_(/*28.26*/helper/*28.32*/.form(routes.Application.landing())/*28.67*/ {_display_(Seq[Any](format.raw/*28.69*/("""
                            """),format.raw/*29.29*/("""<button class="btn">Logout</button>
                        """)))}),format.raw/*30.26*/("""
                        """),_display_(/*31.26*/helper/*31.32*/.form(routes.Application.unreadPage())/*31.70*/ {_display_(Seq[Any](format.raw/*31.72*/("""
                            """),format.raw/*32.29*/("""<button class="btn">"""),_display_(/*32.50*/unreadNum),format.raw/*32.59*/(""" """),format.raw/*32.60*/("""unread</button>
                        """)))}),format.raw/*33.26*/("""

                     """),format.raw/*35.22*/("""</div>
                </div>
             </div>

          </div>
       </div>
    </head>



<h1>Create a new event</h1>
<ul>
   """),_display_(/*47.5*/helper/*47.11*/.form(routes.Application.createEvent())/*47.50*/ {_display_(Seq[Any](format.raw/*47.52*/("""
                       """),format.raw/*48.24*/("""<input name="eventName" placeholder="event name"><br>
                       <input name="startTime" placeholder="start time"><br>
                       <input name="endTime" placeholder="end time"><br>
                       <input name="location" placeholder="location"><br>
                       <textarea name="content" cols="40" rows="5" placeholder="description"></textarea>
                       <h4>add all users before creating</h4>
                       """),_display_(/*54.25*/helper/*54.31*/.form(routes.Application.addUserToEvent())/*54.73*/ {_display_(Seq[Any](format.raw/*54.75*/("""
                           """),format.raw/*55.28*/("""<input name="involvedEmail" placeholder="email address"><br>
                           <button type="submit">Add</button><br>
                       """)))}),format.raw/*57.25*/("""
                       """),format.raw/*58.24*/("""<button class="icon-key-2" type="submit"> Create</button><br>
   """)))}),format.raw/*59.5*/("""





"""),format.raw/*65.1*/("""</ul>



<h1>                     </h1>
"""),_display_(/*70.2*/helper/*70.8*/.form(routes.Application.mainPage())/*70.44*/ {_display_(Seq[Any](format.raw/*70.46*/("""
"""),format.raw/*71.1*/("""<button type="submit">Main Page</button><br>
""")))}),format.raw/*72.2*/("""
"""),_display_(/*73.2*/helper/*73.8*/.form(routes.Application.landing())/*73.43*/ {_display_(Seq[Any](format.raw/*73.45*/("""
"""),format.raw/*74.1*/("""<button type="submit">Log out</button><br>
""")))}),format.raw/*75.2*/("""

""")))}),format.raw/*77.2*/("""
"""))}
  }

  def render(unreadNum:Integer): play.twirl.api.HtmlFormat.Appendable = apply(unreadNum)

  def f:((Integer) => play.twirl.api.HtmlFormat.Appendable) = (unreadNum) => apply(unreadNum)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jun 03 00:12:35 BST 2015
                  SOURCE: /Users/apple/Desktop/productivity/productivity/app/views/createEvent.scala.html
                  HASH: d0692f4b7937d87ee332231c1a129cc5eb62f45c
                  MATRIX: 730->1|839->22|867->25|888->38|927->40|954->41|1096->157|1110->163|1165->198|1376->383|1390->389|1449->428|1528->481|1542->487|1613->537|1693->590|1708->596|1775->641|1855->694|1870->700|1940->748|2020->801|2035->807|2096->847|2144->868|2159->874|2228->922|2820->1487|2835->1493|2879->1528|2919->1530|2976->1559|3068->1620|3121->1646|3136->1652|3183->1690|3223->1692|3280->1721|3328->1742|3358->1751|3387->1752|3459->1793|3510->1816|3670->1950|3685->1956|3733->1995|3773->1997|3825->2021|4321->2490|4336->2496|4387->2538|4427->2540|4483->2568|4665->2719|4717->2743|4813->2809|4846->2815|4913->2856|4927->2862|4972->2898|5012->2900|5040->2901|5116->2947|5144->2949|5158->2955|5202->2990|5242->2992|5270->2993|5344->3037|5377->3040
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|56->28|56->28|56->28|56->28|57->29|58->30|59->31|59->31|59->31|59->31|60->32|60->32|60->32|60->32|61->33|63->35|75->47|75->47|75->47|75->47|76->48|82->54|82->54|82->54|82->54|83->55|85->57|86->58|87->59|93->65|98->70|98->70|98->70|98->70|99->71|100->72|101->73|101->73|101->73|101->73|102->74|103->75|105->77
                  -- GENERATED --
              */
          