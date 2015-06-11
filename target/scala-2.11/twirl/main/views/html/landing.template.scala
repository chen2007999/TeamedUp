
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
"""),_display_(/*3.2*/main("TeamedUp")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.at("stylesheets/style.css")),format.raw/*6.80*/("""" type="text/css">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("stylesheets/bootmetro.css")),format.raw/*8.100*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.at("stylesheets/bootmetro-responsive.css")),format.raw/*9.111*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.at("stylesheets/bootmetro-icons.css")),format.raw/*10.106*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.at("stylesheets/bootmetro-ui-light.css")),format.raw/*11.109*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.55*/routes/*12.61*/.Assets.at("stylesheets/datepicker.css")),format.raw/*12.101*/("""">
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/bootstrap/jquery.js")),format.raw/*13.74*/(""""></script>
                <script src=""""),_display_(/*14.31*/routes/*14.37*/.Assets.at("javascripts/bootstrap/bootstrap.js")),format.raw/*14.85*/(""""></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/bootstrap/bootstrap.min.js")),format.raw/*15.81*/(""""></script>
        
        <style>
            body, html """),format.raw/*18.24*/("""{"""),format.raw/*18.25*/("""
            """),format.raw/*19.13*/("""height: 100%;
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/("""
            """),format.raw/*21.13*/(""".mouse-bg """),format.raw/*21.23*/("""{"""),format.raw/*21.24*/("""
            """),format.raw/*22.13*/("""left: 0;
            right: 0;
            bottom: 0;
            top: 0;
            position: fixed;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
            """),format.raw/*28.13*/("""#background """),format.raw/*28.25*/("""{"""),format.raw/*28.26*/("""
            """),format.raw/*29.13*/("""background-image: url('http://localhost:9000/assets/stylesheets/new.jpg');
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/("""
        """),format.raw/*31.9*/("""</style>
        <div class="navbar">
        <div class="navbar-inner">
             <a class="brand" href="#">TeamedUp</a>
             <ul class="nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="test">Test page</a></li>
                <li><a href="#">Link 2</a></li>
             </ul>
          </div>
       </div>
    </head>
    
<body class="body-landing">
    <div id="background" class="mouse-bg"></div>
    <script src=""""),_display_(/*46.19*/routes/*46.25*/.Assets.at("javascripts/parallax/mouse.parallax.js")),format.raw/*46.77*/(""""></script>
    <script>
    $(document).ready(function() """),format.raw/*48.34*/("""{"""),format.raw/*48.35*/("""
    				"""),format.raw/*49.9*/("""$('#background').mouseParallax("""),format.raw/*49.40*/("""{"""),format.raw/*49.41*/(""" """),format.raw/*49.42*/("""moveFactor: 5 """),format.raw/*49.56*/("""}"""),format.raw/*49.57*/(""");
    
    				$('body').height(3000);
    			"""),format.raw/*52.8*/("""}"""),format.raw/*52.9*/(""");
    </script>
    <div class="container">
        <h1 align="center">Welcome to TeamedUp</h1>
        
        <div class="row-fluid" id="login-div"> 
            <div class="well span4 offset4"  style="background: rgba(234, 239, 244, .5);" align="center">
            """),_display_(/*59.14*/helper/*59.20*/.form(routes.Application.logIn())/*59.53*/ {_display_(Seq[Any](format.raw/*59.55*/("""
               """),format.raw/*60.16*/("""<input class="stretch" name="email" placeholder="Email Address"> <br>
               <input class="stretch" name="password" placeholder="Password">  <br>
               <button class="btstretch" type="submit">Log in</button>
            """)))}),format.raw/*63.14*/("""
            """),_display_(/*64.14*/helper/*64.20*/.form(routes.Application.register(""))/*64.58*/ {_display_(Seq[Any](format.raw/*64.60*/("""
               """),format.raw/*65.16*/("""<button class="btstretch" type="submit">Register</button>
            """)))}),format.raw/*66.14*/("""
            """),format.raw/*67.13*/("""</div>
        </div>
    </div>
</body>
""")))}),format.raw/*71.2*/("""
"""),format.raw/*72.1*/("""</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 13:01:47 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/landing.scala.html
                  HASH: 0387b27bc2c3353ccb56d8f901829f68dc45e360
                  MATRIX: 832->0|874->51|898->67|937->69|968->74|1118->198|1132->204|1187->239|1406->432|1420->438|1480->477|1563->534|1577->540|1648->590|1732->647|1747->653|1814->698|1898->755|1913->761|1983->809|2067->866|2082->872|2144->912|2196->937|2211->943|2277->988|2346->1030|2361->1036|2430->1084|2491->1118|2506->1124|2579->1176|2667->1236|2696->1237|2737->1250|2791->1276|2820->1277|2861->1290|2899->1300|2928->1301|2969->1314|3112->1429|3141->1430|3182->1443|3222->1455|3251->1456|3292->1469|3407->1556|3436->1557|3472->1566|3979->2046|3994->2052|4067->2104|4153->2162|4182->2163|4218->2172|4277->2203|4306->2204|4335->2205|4377->2219|4406->2220|4480->2267|4508->2268|4808->2541|4823->2547|4865->2580|4905->2582|4949->2598|5218->2836|5259->2850|5274->2856|5321->2894|5361->2896|5405->2912|5507->2983|5548->2996|5620->3038|5648->3039
                  LINES: 29->1|30->3|30->3|30->3|31->4|33->6|33->6|33->6|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|42->15|42->15|42->15|45->18|45->18|46->19|47->20|47->20|48->21|48->21|48->21|49->22|54->27|54->27|55->28|55->28|55->28|56->29|57->30|57->30|58->31|73->46|73->46|73->46|75->48|75->48|76->49|76->49|76->49|76->49|76->49|76->49|79->52|79->52|86->59|86->59|86->59|86->59|87->60|90->63|91->64|91->64|91->64|91->64|92->65|93->66|94->67|98->71|99->72
                  -- GENERATED --
              */
          