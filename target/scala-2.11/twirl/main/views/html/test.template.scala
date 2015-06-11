
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
object test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*4.51*/routes/*4.57*/.Assets.at("stylesheets/bootstrap/simple-sidebar.css")),format.raw/*4.111*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*5.51*/routes/*5.57*/.Assets.at("stylesheets/bootmetro.css")),format.raw/*5.96*/("""">
    <script src=""""),_display_(/*6.19*/routes/*6.25*/.Assets.at("javascripts/bootstrap/jquery.js")),format.raw/*6.70*/(""""></script>
    <script src=""""),_display_(/*7.19*/routes/*7.25*/.Assets.at("javascripts/bootstrap/bootstrap.js")),format.raw/*7.73*/(""""></script>
</head>

<body>

                            <button class="btn" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" href="#"><span class="badge">2</span> unread</button>
                            <ul class="dropdown-menu pull-right unread" role="menu" arie-labelledby="dLabel">

                            </ul>
        <button class="btn" href="#menu-toggle" id="menu-toggle">Daily schedule</button>
            <div id="wrapper" class="toggled">
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                   <div class="container">
              <hr>

                    </div>
                </ul>
            </div>
        </div>
                        <!-- Menu Toggle Script -->
        <script>
        $("#menu-toggle").click(function(e) """),format.raw/*29.45*/("""{"""),format.raw/*29.46*/("""
            """),format.raw/*30.13*/("""$("#wrapper").toggleClass("toggled");
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/(""");
        </script>
                    <script>
            function drop()"""),format.raw/*34.28*/("""{"""),format.raw/*34.29*/("""
                """),format.raw/*35.17*/("""$('.dropdown-toggle').dropdown();                
            """),format.raw/*36.13*/("""}"""),format.raw/*36.14*/("""
            """),format.raw/*37.13*/("""</script>
</body>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 13:01:47 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/test.scala.html
                  HASH: 182b4fc90753ee07386c3f8f676a51307dbf3050
                  MATRIX: 797->0|903->80|917->86|992->140|1071->193|1085->199|1144->238|1191->259|1205->265|1270->310|1326->340|1340->346|1408->394|2270->1228|2299->1229|2340->1242|2413->1288|2442->1289|2547->1366|2576->1367|2621->1384|2711->1446|2740->1447|2781->1460
                  LINES: 29->1|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|57->29|57->29|58->30|59->31|59->31|62->34|62->34|63->35|64->36|64->36|65->37
                  -- GENERATED --
              */
          