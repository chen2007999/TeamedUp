
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
object landing extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper.twitterBootstrap._

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
"""),_display_(/*3.2*/main("Distraction Blocker")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
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
        <div class="navbar">
        <div class="navbar-inner">
             <a class="brand" href="#">Distration Blocker</a>
             <ul class="nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="test">Test page</a></li>
                <li><a href="#">Link 2</a></li>
             </ul>
          </div>
       </div>
    </head>
    
<body>
    <div class="container">
        <h1 align="center">Welcome to Distraction Blocker</h1>
        
        <div class="well row"> 
            <div class="well well-small span4 offset4" align="center">
            """),_display_(/*32.14*/helper/*32.20*/.form(routes.Application.logIn())/*32.53*/ {_display_(Seq[Any](format.raw/*32.55*/("""
               """),format.raw/*33.16*/("""<input name="email" placeholder="Email Address"> <br>
               <input name="password" placeholder="Password">  <br>
               <button class="icon-checkmark" type="submit"> Log in</button>
            """)))}),format.raw/*36.14*/("""
            """),_display_(/*37.14*/helper/*37.20*/.form(routes.Application.register())/*37.56*/ {_display_(Seq[Any](format.raw/*37.58*/("""
               """),format.raw/*38.16*/("""<button class="icon-cog-2" type="submit"> Register</button>
            """)))}),format.raw/*39.14*/("""
            """),format.raw/*40.13*/("""</div>
        
            
        </div>
    </div>
</body>
""")))}),format.raw/*46.2*/("""
"""),format.raw/*47.1*/("""</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 02 13:42:54 BST 2015
                  SOURCE: /Users/apple/Desktop/productivity/productivity/app/views/landing.scala.html
                  HASH: 0c70c2bf38c6aed4dfa863acd9ccb085bd9c1e03
                  MATRIX: 832->0|874->51|909->78|948->80|979->85|1129->209|1143->215|1198->250|1417->443|1431->449|1491->488|1574->545|1588->551|1659->601|1743->658|1758->664|1825->709|1909->766|1924->772|1994->820|2078->877|2093->883|2155->923|2207->948|2222->954|2291->1002|2939->1623|2954->1629|2996->1662|3036->1664|3080->1680|3323->1892|3364->1906|3379->1912|3424->1948|3464->1950|3508->1966|3612->2039|3653->2052|3747->2116|3775->2117
                  LINES: 29->1|30->3|30->3|30->3|31->4|33->6|33->6|33->6|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|59->32|59->32|59->32|59->32|60->33|63->36|64->37|64->37|64->37|64->37|65->38|66->39|67->40|73->46|74->47
                  -- GENERATED --
              */
          