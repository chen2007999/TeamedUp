
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
object registration extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: java.util.List[models.User]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.38*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

"""),_display_(/*4.2*/main("Create an account")/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""

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
             <a class="brand" href="#">Distration Blocker</a>
             <ul class="nav">
                <li><a href="/landing">Home</a></li>
                <li class="active"><a href="#">Register</a></li>
             </ul>
          </div>
       </div>
    </head>

<body>
    <div class="container">
        <h1 align="center">Create a new account</h1>
        <div class="well row">
            <div class="well well-small span4 offset4" align="center">
               
                
                
                   """),_display_(/*35.21*/helper/*35.27*/.form(routes.Application.createUser())/*35.65*/ {_display_(Seq[Any](format.raw/*35.67*/("""
                       """),format.raw/*36.24*/("""<input name="email" placeholder="email address"><br>
                       <input name="password" placeholder="password"><br>
                       <input name="password2" placeholder="comfirm password"><br>
                       <input name="name" placeholder="name"><br>
                       <button class="icon-key-2" type="submit"> Create</button><br>
                   """)))}),format.raw/*41.21*/("""
                
                   """),_display_(/*43.21*/helper/*43.27*/.form(routes.Application.landing())/*43.62*/ {_display_(Seq[Any](format.raw/*43.64*/("""
                       """),format.raw/*44.24*/("""<button type="submit">Go back</button><br>
                   """)))}),format.raw/*45.21*/("""
               """),format.raw/*46.16*/("""</div>
           </div>
           <div class="row metro">
                """),_display_(/*49.18*/for(user <- users) yield /*49.36*/ {_display_(Seq[Any](format.raw/*49.38*/("""
                    """),_display_(/*50.22*/helper/*50.28*/.form(routes.Application.deleteUserFromDB(user.email))/*50.82*/ {_display_(Seq[Any](format.raw/*50.84*/("""
                        """),format.raw/*51.25*/("""<button class="tile square text" type="submit">
                            <div class="text">"""),_display_(/*52.48*/user/*52.52*/.email),format.raw/*52.58*/("""</div>
                            <div class="text">"""),_display_(/*53.48*/user/*53.52*/.name),format.raw/*53.57*/("""</div>
                            <div class="text">"""),_display_(/*54.48*/user/*54.52*/.password),format.raw/*54.61*/("""</div>
                        </button>
                    """)))}),format.raw/*56.22*/("""
                """)))}),format.raw/*57.18*/("""
               
           """),format.raw/*59.12*/("""</div>
    </div>
</body>
""")))}),format.raw/*62.2*/("""

"""),format.raw/*64.1*/("""</html>"""))}
  }

  def render(users:java.util.List[models.User]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((java.util.List[models.User]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 02 13:47:26 BST 2015
                  SOURCE: /Users/apple/Desktop/productivity/productivity/app/views/registration.scala.html
                  HASH: 375e6e4a5802420a2829f23461804ccf23229f28
                  MATRIX: 751->1|875->37|902->38|945->56|978->81|1017->83|1049->89|1199->213|1213->219|1268->254|1488->447|1503->453|1564->492|1648->549|1663->555|1735->605|1819->662|1834->668|1901->713|1985->770|2000->776|2070->824|2154->881|2169->887|2231->927|2283->952|2298->958|2367->1006|3003->1615|3018->1621|3065->1659|3105->1661|3157->1685|3569->2066|3634->2104|3649->2110|3693->2145|3733->2147|3785->2171|3879->2234|3923->2250|4027->2327|4061->2345|4101->2347|4150->2369|4165->2375|4228->2429|4268->2431|4321->2456|4443->2551|4456->2555|4483->2561|4564->2615|4577->2619|4603->2624|4684->2678|4697->2682|4727->2691|4820->2753|4869->2771|4925->2799|4982->2826|5011->2828
                  LINES: 26->1|29->1|30->2|32->4|32->4|32->4|34->6|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|63->35|63->35|63->35|63->35|64->36|69->41|71->43|71->43|71->43|71->43|72->44|73->45|74->46|77->49|77->49|77->49|78->50|78->50|78->50|78->50|79->51|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|82->54|84->56|85->57|87->59|90->62|92->64
                  -- GENERATED --
              */
          