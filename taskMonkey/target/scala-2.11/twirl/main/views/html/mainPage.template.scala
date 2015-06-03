
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
object mainPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[models.Team],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(teams: java.util.List[models.Team], unreadNum : Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper.twitterBootstrap._

Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
"""),_display_(/*4.2*/main("Team")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""

    """),format.raw/*6.5*/("""<head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href=""""),_display_(/*8.39*/routes/*8.45*/.Assets.at("stylesheets/style.css")),format.raw/*8.80*/("""" type="text/css">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.at("stylesheets/bootmetro.css")),format.raw/*10.100*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.at("stylesheets/bootmetro-responsive.css")),format.raw/*11.111*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.55*/routes/*12.61*/.Assets.at("stylesheets/bootmetro-icons.css")),format.raw/*12.106*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*13.55*/routes/*13.61*/.Assets.at("stylesheets/bootmetro-ui-light.css")),format.raw/*13.109*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*14.55*/routes/*14.61*/.Assets.at("stylesheets/datepicker.css")),format.raw/*14.101*/("""">
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/modernizr-2.6.2.min.js")),format.raw/*15.77*/(""""></script>
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
                        """),_display_(/*30.26*/helper/*30.32*/.form(routes.Application.landing())/*30.67*/ {_display_(Seq[Any](format.raw/*30.69*/("""
                            """),format.raw/*31.29*/("""<button class="btn">Logout</button> 
                        """)))}),format.raw/*32.26*/("""
                        """),_display_(/*33.26*/helper/*33.32*/.form(routes.Application.unreadPage())/*33.70*/ {_display_(Seq[Any](format.raw/*33.72*/("""
                            """),format.raw/*34.29*/("""<button class="btn">"""),_display_(/*34.50*/unreadNum),format.raw/*34.59*/(""" """),format.raw/*34.60*/("""unread</button>
                        """)))}),format.raw/*35.26*/("""
                        
                     """),format.raw/*37.22*/("""</div>
                </div>
             </div>
             
          </div>
       </div>
    </head>

<div class="row-fluid">
    <div class="span4 offset4" align="center">
        """),_display_(/*47.10*/helper/*47.16*/.form(routes.Application.createTeam())/*47.54*/ {_display_(Seq[Any](format.raw/*47.56*/("""
            """),format.raw/*48.13*/("""<input name="teamName" placeholder="team name"><br>
            <button type="submit">Create a new team</button><br>
        """)))}),format.raw/*50.10*/("""
    """),format.raw/*51.5*/("""</div>
</div>

<div class="metro">
    """),_display_(/*55.6*/for(team <- teams) yield /*55.24*/ {_display_(Seq[Any](format.raw/*55.26*/("""
        """),format.raw/*56.9*/("""<a class="tile square text tilesquareblock" href="/teamPage/"""),_display_(/*56.70*/team/*56.74*/.teamName),format.raw/*56.83*/("""">
            <div class="text-big">"""),_display_(/*57.36*/team/*57.40*/.teamName),format.raw/*57.49*/("""</div>
        </a>
    """)))}),format.raw/*59.6*/("""
"""),format.raw/*60.1*/("""</div>







""")))}),format.raw/*68.2*/("""
"""),format.raw/*69.1*/("""</html>"""))}
  }

  def render(teams:java.util.List[models.Team],unreadNum:Integer): play.twirl.api.HtmlFormat.Appendable = apply(teams,unreadNum)

  def f:((java.util.List[models.Team],Integer) => play.twirl.api.HtmlFormat.Appendable) = (teams,unreadNum) => apply(teams,unreadNum)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 02 13:42:54 BST 2015
                  SOURCE: /Users/apple/Desktop/productivity/productivity/app/views/mainPage.scala.html
                  HASH: 86e55e139781017ba7832b29a8a92e2f82d910c5
                  MATRIX: 755->1|932->58|959->93|1001->110|1021->122|1060->124|1092->130|1242->254|1256->260|1311->295|1531->488|1546->494|1607->533|1691->590|1706->596|1778->646|1862->703|1877->709|1944->754|2028->811|2043->817|2113->865|2197->922|2212->928|2274->968|2326->993|2341->999|2410->1047|3028->1638|3043->1644|3087->1679|3127->1681|3184->1710|3277->1772|3330->1798|3345->1804|3392->1842|3432->1844|3489->1873|3537->1894|3567->1903|3596->1904|3668->1945|3743->1992|3958->2180|3973->2186|4020->2224|4060->2226|4101->2239|4258->2365|4290->2370|4356->2410|4390->2428|4430->2430|4466->2439|4554->2500|4567->2504|4597->2513|4662->2551|4675->2555|4705->2564|4760->2589|4788->2590|4833->2605|4861->2606
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|33->6|35->8|35->8|35->8|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|42->15|42->15|42->15|57->30|57->30|57->30|57->30|58->31|59->32|60->33|60->33|60->33|60->33|61->34|61->34|61->34|61->34|62->35|64->37|74->47|74->47|74->47|74->47|75->48|77->50|78->51|82->55|82->55|82->55|83->56|83->56|83->56|83->56|84->57|84->57|84->57|86->59|87->60|95->68|96->69
                  -- GENERATED --
              */
          