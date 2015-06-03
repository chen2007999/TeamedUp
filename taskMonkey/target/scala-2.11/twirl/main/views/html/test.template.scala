
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

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Example</title>
        <link rel="stylesheet" href=""""),_display_(/*5.39*/routes/*5.45*/.Assets.at("stylesheets/style.css")),format.raw/*5.80*/("""" type="text/css">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.at("stylesheets/bootmetro.css")),format.raw/*7.100*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("stylesheets/bootmetro-responsive.css")),format.raw/*8.111*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.at("stylesheets/bootmetro-icons.css")),format.raw/*9.106*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.at("stylesheets/bootmetro-ui-light.css")),format.raw/*10.109*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.at("stylesheets/datepicker.css")),format.raw/*11.101*/("""">
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/modernizr-2.6.2.min.js")),format.raw/*12.77*/(""""></script>
        <div id="nav-bar" class="navig" bgcolor="silver">
            <div class="row">
                <div class="span9">
                    <div id="header-container">
                    <a id="backbutton" class="win-backbutton" href="http://localhost:9000/landing"></a>
                        <div class="dropdown">
                            <h1 class="header-dropdown accent-color">Back to landing</h1>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
    </head>
    
    <body>
        <div class="container">
            <h1>Main header</h1>
            <h2>Secondary headerk</h2>
            <div class="row">
                <div class="span4">
                    <h3>Task 1</h3>
                    <p>A little bit of text</p>
                </div>
                <div class="span4">
                    <h3>Task 2</h3>
                    <p>Even more dummy text</p>
                </div>
                <div class="span4">
                    <h3>Task 3</h3>
                    <p>Once more, some text</p>
                </div>
                <div class="span4">
                    <h3>Task 4</h3>
                    <p>Text text text text text text text text text text text text text text text text text text text</p>
                </div>
                 <div class="span4">
                    <h3>Task 5</h3>
                    <p>so muuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuch text here</p>
                </div>
            </div>
        </div>
        <div class="metro">
            <h1>Metro style DIV</h1>
            <a class="tile squarepeek bg-color-green" href="http://google.com">
                <img src="http://icons.iconarchive.com/icons/graphics-vibe/simple-rounded-social/256/google-icon.png">
                <div class = "text-inner">
                    <div class="text-header">Google.com</div>
                    <div class="text4">This will take you to google</div>
                </div>    
            </a>
            <a class="tile square text" href="http://facebook.com">
                
                    <div class="text-header">FB</div>
                    <div class="text4">This will take you to facebook</div>
               
            </a>
             <a class="tile wide text" href="#">
                <div class="text-header">Wide tile</div>
                <div class="text">Line 1</div>
                <div class="text">Line 2</div>
                <div class="text">Line 3</div>
                <div class="text">Line 4</div>
            </a>
  
        </div>
        <script type="text/javascript" src=""""),_display_(/*79.46*/routes/*79.52*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*79.94*/(""""></script>  
        <script type="text/javascript" src=""""),_display_(/*80.46*/routes/*80.52*/.Assets.at("javascripts/bootmetro-panorama.js")),format.raw/*80.99*/(""""></script> 
        <script type="text/javascript" src=""""),_display_(/*81.46*/routes/*81.52*/.Assets.at("javascripts/bootmetro-pivot.js")),format.raw/*81.96*/(""""></script> 
        <script type="text/javascript" src=""""),_display_(/*82.46*/routes/*82.52*/.Assets.at("javascripts/bootmetro-charms.js")),format.raw/*82.97*/(""""></script> 

    </body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 31 23:33:39 BST 2015
                  SOURCE: /Users/apple/Desktop/productivity/productivity/app/views/test.scala.html
                  HASH: bd9e32e11ae174859be1678225b4ccf209557e99
                  MATRIX: 797->0|998->175|1012->181|1067->216|1286->409|1300->415|1360->454|1443->511|1457->517|1528->567|1611->624|1625->630|1691->675|1775->732|1790->738|1860->786|1944->843|1959->849|2021->889|2073->914|2088->920|2157->968|4871->3655|4886->3661|4949->3703|5035->3762|5050->3768|5118->3815|5203->3873|5218->3879|5283->3923|5368->3981|5383->3987|5449->4032
                  LINES: 29->1|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|107->79|107->79|107->79|108->80|108->80|108->80|109->81|109->81|109->81|110->82|110->82|110->82
                  -- GENERATED --
              */
          