
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
object registration extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[models.Client],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clients: java.util.List[models.Client], error: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.57*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

    <head>
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
                    <li><a href="/landing">Home</a></li>
                    <li class="active"><a href="#">Register</a></li>
                 </ul>
            </div>
            """),_display_(/*40.14*/if(error.length() >0)/*40.35*/{_display_(Seq[Any](format.raw/*40.36*/("""
         """),format.raw/*41.10*/("""<div class="alert">
          <button type="button" class="close" data-dismiss="alert"><a data-dismiss="alert" href="#"></a></button>
          <strong>Warning!</strong> There must have been an error in your entered details. Please try again. """),_display_(/*43.111*/error),format.raw/*43.116*/("""
        """),format.raw/*44.9*/("""</div>
        <script>
            $(".alert").alert()     
        </script>
        """)))}),format.raw/*48.10*/("""
       """),format.raw/*49.8*/("""</div>
       
    </head>

<body class="body-landing">

    <div id="background" class="mouse-bg"></div>
        <script src=""""),_display_(/*56.23*/routes/*56.29*/.Assets.at("javascripts/parallax/mouse.parallax.js")),format.raw/*56.81*/(""""></script>
    <script>
    $(document).ready(function() """),format.raw/*58.34*/("""{"""),format.raw/*58.35*/("""
    				"""),format.raw/*59.9*/("""$('#background').mouseParallax("""),format.raw/*59.40*/("""{"""),format.raw/*59.41*/(""" """),format.raw/*59.42*/("""moveFactor: 5 """),format.raw/*59.56*/("""}"""),format.raw/*59.57*/(""");
    
    				$('body').height(3000);
    			"""),format.raw/*62.8*/("""}"""),format.raw/*62.9*/(""");
    </script>
    <div class="container">

        <h1 align="center">Create a new account</h1>
        <div class="row-fluid" id="login-div">
        
            <div class="well span4 offset4" style="background: rgba(234, 239, 244, .5);" align="center">
                
                   """),_display_(/*71.21*/helper/*71.27*/.form(routes.Application.createUser())/*71.65*/ {_display_(Seq[Any](format.raw/*71.67*/("""
                       """),format.raw/*72.24*/("""<input name="email" placeholder="Email address"><br>
                       <input name="password" placeholder="Password"><br>
                       <input name="password2" placeholder="Comfirm password"><br>
                       <input name="name" placeholder="Name"><br>
                       <button type="submit">Create</button>
                   """)))}),format.raw/*77.21*/("""
                   """),_display_(/*78.21*/helper/*78.27*/.form(routes.Application.landing())/*78.62*/ {_display_(Seq[Any](format.raw/*78.64*/("""
                       """),format.raw/*79.24*/("""<button type="submit">Go back</button>
                   """)))}),format.raw/*80.21*/("""
               """),format.raw/*81.16*/("""</div>
           </div>
           <div class="row metro">
                """),_display_(/*84.18*/for(client <- clients) yield /*84.40*/ {_display_(Seq[Any](format.raw/*84.42*/("""
                    """),_display_(/*85.22*/helper/*85.28*/.form(routes.Application.deleteUserFromDB(client.email))/*85.84*/ {_display_(Seq[Any](format.raw/*85.86*/("""
                        """),format.raw/*86.25*/("""<button class="tile square text" type="submit">
                            <div class="text">"""),_display_(/*87.48*/client/*87.54*/.email),format.raw/*87.60*/("""</div>
                            <div class="text">"""),_display_(/*88.48*/client/*88.54*/.name),format.raw/*88.59*/("""</div>
                            <div class="text">"""),_display_(/*89.48*/client/*89.54*/.password),format.raw/*89.63*/("""</div>
                        </button>
                    """)))}),format.raw/*91.22*/("""
                """)))}),format.raw/*92.18*/("""
               
           """),format.raw/*94.12*/("""</div>
    </div>
 
</body>


</html>"""))}
  }

  def render(clients:java.util.List[models.Client],error:String): play.twirl.api.HtmlFormat.Appendable = apply(clients,error)

  def f:((java.util.List[models.Client],String) => play.twirl.api.HtmlFormat.Appendable) = (clients,error) => apply(clients,error)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 19:30:08 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/registration.scala.html
                  HASH: d4e2ea4b84bd6f67c4c6d4e92ee97c53f147e162
                  MATRIX: 760->1|903->56|930->57|1101->202|1115->208|1170->243|1389->436|1403->442|1463->481|1546->538|1560->544|1631->594|1715->651|1730->657|1797->702|1881->759|1896->765|1966->813|2050->870|2065->876|2127->916|2179->941|2194->947|2260->992|2329->1034|2344->1040|2413->1088|2474->1122|2489->1128|2562->1180|2642->1232|2671->1233|2712->1246|2766->1272|2795->1273|2836->1286|2874->1296|2903->1297|2944->1310|3087->1425|3116->1426|3157->1439|3197->1451|3226->1452|3267->1465|3382->1552|3411->1553|3447->1562|3822->1910|3852->1931|3891->1932|3929->1942|4201->2186|4228->2191|4264->2200|4383->2288|4418->2296|4573->2424|4588->2430|4661->2482|4747->2540|4776->2541|4812->2550|4871->2581|4900->2582|4929->2583|4971->2597|5000->2598|5074->2645|5102->2646|5426->2943|5441->2949|5488->2987|5528->2989|5580->3013|5968->3370|6016->3391|6031->3397|6075->3432|6115->3434|6167->3458|6257->3517|6301->3533|6405->3610|6443->3632|6483->3634|6532->3656|6547->3662|6612->3718|6652->3720|6705->3745|6827->3840|6842->3846|6869->3852|6950->3906|6965->3912|6991->3917|7072->3971|7087->3977|7117->3986|7210->4048|7259->4066|7315->4094
                  LINES: 26->1|29->1|30->2|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|47->19|48->20|48->20|49->21|49->21|49->21|50->22|55->27|55->27|56->28|56->28|56->28|57->29|58->30|58->30|59->31|68->40|68->40|68->40|69->41|71->43|71->43|72->44|76->48|77->49|84->56|84->56|84->56|86->58|86->58|87->59|87->59|87->59|87->59|87->59|87->59|90->62|90->62|99->71|99->71|99->71|99->71|100->72|105->77|106->78|106->78|106->78|106->78|107->79|108->80|109->81|112->84|112->84|112->84|113->85|113->85|113->85|113->85|114->86|115->87|115->87|115->87|116->88|116->88|116->88|117->89|117->89|117->89|119->91|120->92|122->94
                  -- GENERATED --
              */
          