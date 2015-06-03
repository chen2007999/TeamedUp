
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
object teamPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,java.util.List[Team],java.util.List[Task],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(teamName: String, teams : java.util.List[Team], tasks : java.util.List[Task], unreadNum : Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.101*/("""

"""),_display_(/*3.2*/main(teamName)/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
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
                        """),_display_(/*34.26*/helper/*34.32*/.form(routes.Application.createEventPage())/*34.75*/ {_display_(Seq[Any](format.raw/*34.77*/("""
                            """),format.raw/*35.29*/("""<button type="submit">Create an Event</button><br>
                        """)))}),format.raw/*36.26*/("""
                        
                     """),format.raw/*38.22*/("""</div>
                </div>
             </div>
             
          </div>
       </div>
    </head>



<h1>"""),_display_(/*48.6*/teamName),format.raw/*48.14*/("""</h1>
<ul>
    """),_display_(/*50.6*/for(team <- teams) yield /*50.24*/ {_display_(Seq[Any](format.raw/*50.26*/("""

    """),format.raw/*52.5*/("""<li>Email Address: """),_display_(/*52.25*/team/*52.29*/.memberEmail),format.raw/*52.41*/("""
        """),_display_(/*53.10*/helper/*53.16*/.form(routes.Application.deleteUserFromTeam(team.memberEmail))/*53.78*/ {_display_(Seq[Any](format.raw/*53.80*/("""
        """),format.raw/*54.9*/("""<button type="submit">Delete</button>
        """)))}),format.raw/*55.10*/("""
    """),format.raw/*56.5*/("""</li>
    """)))}),format.raw/*57.6*/("""
    """),_display_(/*58.6*/helper/*58.12*/.form(routes.Application.addUserToTeam(teamName))/*58.61*/ {_display_(Seq[Any](format.raw/*58.63*/("""
    """),format.raw/*59.5*/("""<input name="email" placeholder="email address"><br>
    <button type="submit">Add</button><br>
    """)))}),format.raw/*61.6*/("""
"""),format.raw/*62.1*/("""</ul>

"""),_display_(/*64.2*/for(task <- tasks) yield /*64.20*/ {_display_(Seq[Any](format.raw/*64.22*/("""

"""),format.raw/*66.1*/("""<li><h2>Task Name: """),_display_(/*66.21*/task/*66.25*/.taskName),format.raw/*66.34*/(""" """),format.raw/*66.35*/("""</h2>
    <h2> Description: """),_display_(/*67.24*/task/*67.28*/.content),format.raw/*67.36*/(""" """),format.raw/*67.37*/("""</h2>
    <h2> Status: """),_display_(/*68.19*/task/*68.23*/.status),format.raw/*68.30*/(""" """),format.raw/*68.31*/("""</h2>
    """),_display_(/*69.6*/helper/*69.12*/.form(routes.Application.taskPage(task.taskName))/*69.61*/ {_display_(Seq[Any](format.raw/*69.63*/("""
       """),format.raw/*70.8*/("""<button type="submit">Details</button>
    """)))}),format.raw/*71.6*/("""
"""),format.raw/*72.1*/("""</li>
""")))}),format.raw/*73.2*/("""
"""),format.raw/*74.1*/("""<h1>                     </h1>


"""),_display_(/*77.2*/helper/*77.8*/.form(routes.Application.taskCreationPage())/*77.52*/ {_display_(Seq[Any](format.raw/*77.54*/("""
"""),format.raw/*78.1*/("""<button type="submit">Create a new task</button><br>
""")))}),format.raw/*79.2*/("""


"""),_display_(/*82.2*/helper/*82.8*/.form(routes.Application.mainPage())/*82.44*/ {_display_(Seq[Any](format.raw/*82.46*/("""
"""),format.raw/*83.1*/("""<button type="submit">Main Page</button><br>
""")))}),format.raw/*84.2*/("""
"""),_display_(/*85.2*/helper/*85.8*/.form(routes.Application.landing())/*85.43*/ {_display_(Seq[Any](format.raw/*85.45*/("""
"""),format.raw/*86.1*/("""<button type="submit">Log out</button><br>
""")))}),format.raw/*87.2*/("""

""")))}),format.raw/*89.2*/("""
"""))}
  }

  def render(teamName:String,teams:java.util.List[Team],tasks:java.util.List[Task],unreadNum:Integer): play.twirl.api.HtmlFormat.Appendable = apply(teamName,teams,tasks,unreadNum)

  def f:((String,java.util.List[Team],java.util.List[Task],Integer) => play.twirl.api.HtmlFormat.Appendable) = (teamName,teams,tasks,unreadNum) => apply(teamName,teams,tasks,unreadNum)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 02 23:53:37 BST 2015
                  SOURCE: /Users/apple/Desktop/productivity/productivity/app/views/teamPage.scala.html
                  HASH: 827ddc7b08bf7a565a05f24d76f3b462890ece7d
                  MATRIX: 776->1|964->100|992->103|1014->117|1053->119|1084->124|1234->248|1248->254|1303->289|1522->482|1536->488|1596->527|1679->584|1693->590|1764->640|1848->697|1863->703|1930->748|2014->805|2029->811|2099->859|2183->916|2198->922|2260->962|2312->987|2327->993|2396->1041|3014->1632|3029->1638|3073->1673|3113->1675|3170->1704|3263->1766|3316->1792|3331->1798|3378->1836|3418->1838|3475->1867|3523->1888|3553->1897|3582->1898|3654->1939|3707->1965|3722->1971|3774->2014|3814->2016|3871->2045|3978->2121|4053->2168|4194->2283|4223->2291|4265->2307|4299->2325|4339->2327|4372->2333|4419->2353|4432->2357|4465->2369|4502->2379|4517->2385|4588->2447|4628->2449|4664->2458|4742->2505|4774->2510|4815->2521|4847->2527|4862->2533|4920->2582|4960->2584|4992->2589|5123->2690|5151->2691|5185->2699|5219->2717|5259->2719|5288->2721|5335->2741|5348->2745|5378->2754|5407->2755|5463->2784|5476->2788|5505->2796|5534->2797|5585->2821|5598->2825|5626->2832|5655->2833|5692->2844|5707->2850|5765->2899|5805->2901|5840->2909|5914->2953|5942->2954|5979->2961|6007->2962|6067->2996|6081->3002|6134->3046|6174->3048|6202->3049|6286->3103|6316->3107|6330->3113|6375->3149|6415->3151|6443->3152|6519->3198|6547->3200|6561->3206|6605->3241|6645->3243|6673->3244|6747->3288|6780->3291
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|56->28|56->28|56->28|56->28|57->29|58->30|59->31|59->31|59->31|59->31|60->32|60->32|60->32|60->32|61->33|62->34|62->34|62->34|62->34|63->35|64->36|66->38|76->48|76->48|78->50|78->50|78->50|80->52|80->52|80->52|80->52|81->53|81->53|81->53|81->53|82->54|83->55|84->56|85->57|86->58|86->58|86->58|86->58|87->59|89->61|90->62|92->64|92->64|92->64|94->66|94->66|94->66|94->66|94->66|95->67|95->67|95->67|95->67|96->68|96->68|96->68|96->68|97->69|97->69|97->69|97->69|98->70|99->71|100->72|101->73|102->74|105->77|105->77|105->77|105->77|106->78|107->79|110->82|110->82|110->82|110->82|111->83|112->84|113->85|113->85|113->85|113->85|114->86|115->87|117->89
                  -- GENERATED --
              */
          