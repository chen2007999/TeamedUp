
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
    """),format.raw/*4.5*/("""<head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.at("stylesheets/style.css")),format.raw/*6.80*/("""" type="text/css">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("stylesheets/bootmetro.css")),format.raw/*8.100*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.at("stylesheets/bootmetro-responsive.css")),format.raw/*9.111*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.at("stylesheets/bootmetro-icons.css")),format.raw/*10.106*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.at("stylesheets/bootmetro-ui-light.css")),format.raw/*11.109*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.55*/routes/*12.61*/.Assets.at("stylesheets/datepicker.css")),format.raw/*12.101*/("""">
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/modernizr-2.6.2.min.js")),format.raw/*13.77*/(""""></script>
    </head>

"""),_display_(/*16.2*/helper/*16.8*/.form(routes.Application.createTask())/*16.46*/ {_display_(Seq[Any](format.raw/*16.48*/("""
"""),format.raw/*17.1*/("""<input type="text" name="taskName" placeholder="task name"><br>
<textarea name="content" cols="40" rows="5" placeholder="description"></textarea> <br>
<button type="submit">Create</button><br>
""")))}),format.raw/*20.2*/("""

"""),_display_(/*22.2*/helper/*22.8*/.form(routes.Application.teamPage(team.teamName))/*22.57*/ {_display_(Seq[Any](format.raw/*22.59*/("""
"""),format.raw/*23.1*/("""<button type="submit">Go back</button><br>
""")))}),format.raw/*24.2*/("""

""")))}))}
  }

  def render(team:models.Team,unreadNum:Integer): play.twirl.api.HtmlFormat.Appendable = apply(team,unreadNum)

  def f:((models.Team,Integer) => play.twirl.api.HtmlFormat.Appendable) = (team,unreadNum) => apply(team,unreadNum)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 13:01:46 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/createTask.scala.html
                  HASH: a940007e6e1d67788e7d324b29d4e2515e0ecc09
                  MATRIX: 741->1|868->40|896->43|929->68|968->70|999->75|1149->199|1163->205|1218->240|1437->433|1451->439|1511->478|1594->535|1608->541|1679->591|1763->648|1778->654|1845->699|1929->756|1944->762|2014->810|2098->867|2113->873|2175->913|2227->938|2242->944|2311->992|2363->1018|2377->1024|2424->1062|2464->1064|2492->1065|2716->1259|2745->1262|2759->1268|2817->1317|2857->1319|2885->1320|2959->1364
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|44->16|44->16|44->16|44->16|45->17|48->20|50->22|50->22|50->22|50->22|51->23|52->24
                  -- GENERATED --
              */
          