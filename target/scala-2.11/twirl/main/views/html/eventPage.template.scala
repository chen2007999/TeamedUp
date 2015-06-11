
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
object eventPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[java.util.List[Client],String,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clients : java.util.List[Client], teamName : String, unreadNum :Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.75*/("""

    """),format.raw/*3.5*/("""<head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*6.55*/routes/*6.61*/.Assets.at("stylesheets/bootmetro.css")),format.raw/*6.100*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.at("stylesheets/bootmetro-responsive.css")),format.raw/*7.111*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("stylesheets/bootmetro-icons.css")),format.raw/*8.106*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.at("stylesheets/bootmetro-ui-light.css")),format.raw/*9.109*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.at("stylesheets/bootstrap/simple-sidebar.css")),format.raw/*10.115*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/bootstrap/jquery.js")),format.raw/*11.74*/(""""></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/bootstrap/bootstrap.js")),format.raw/*12.77*/(""""></script>
        <div class="navbar">
        <div class="navbar-inner">
             <div class="row-fluid">
                 <div class="span6">
                    <a class="brand" href="#">TeamedUp</a>
                     <ul class="nav">
                        <li><a href="/landing">Home</a></li>
                        <li class="active"><a href="#">Main Page</a></li>
                    </ul>
                 </div>
                 <div class="span6" align="right">
                     <div class="btn-group">
                        <button class="btn" href="#menu-toggle" id="menu-toggle">Daily schedule</button>
                        <form action="/profile">
                            <button class="btn" href="/profile">Profile</button>
                        </form>
                            <button class="btn" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" href="#"><span class="badge">"""),_display_(/*29.162*/unreadNum),format.raw/*29.171*/("""</span> unread</button>
                            <ul class="dropdown-menu pull-right unread" role="menu" arie-labelledby="dLabel">
                            """),_display_(/*31.30*/for(task <- Unread.getUnreadTasks(Application.currentClient)) yield /*31.91*/ {_display_(Seq[Any](format.raw/*31.93*/("""
                                """),format.raw/*32.33*/("""<li>
                                    """),_display_(/*33.38*/helper/*33.44*/.form(routes.Application.redirectUnreadTask(task.taskId))/*33.101*/ {_display_(Seq[Any](format.raw/*33.103*/("""
                                    """),format.raw/*34.37*/("""<button type="submit"><h3> A new task """),_display_(/*34.76*/task/*34.80*/.taskName),format.raw/*34.89*/(""" """),format.raw/*34.90*/("""is created</h3></button><br>
                                    """)))}),format.raw/*35.38*/("""
                                """),format.raw/*36.33*/("""</li>
                            """)))}),format.raw/*37.30*/("""
                            """),_display_(/*38.30*/for(event <- Unread.getUnreadEvents(Application.currentClient)) yield /*38.93*/ {_display_(Seq[Any](format.raw/*38.95*/("""
                                """),format.raw/*39.33*/("""<li>
                                    Haha
                                    """),_display_(/*41.38*/helper/*41.44*/.form(routes.Application.redirectUnreadEvent(event.id))/*41.99*/ {_display_(Seq[Any](format.raw/*41.101*/("""
                                    """),format.raw/*42.37*/("""<button type="submit"> <h3> <strong>"""),_display_(/*42.74*/event/*42.79*/.ownerName),format.raw/*42.89*/(""":</strong>  """),_display_(/*42.102*/event/*42.107*/.content),format.raw/*42.115*/("""</h3></button><br>
                                    """)))}),format.raw/*43.38*/("""
                                """),format.raw/*44.33*/("""</li>
                            """)))}),format.raw/*45.30*/("""
                            """),_display_(/*46.30*/for(comment <- Unread.getUnreadComments(Application.currentClient)) yield /*46.97*/ {_display_(Seq[Any](format.raw/*46.99*/("""
                                """),format.raw/*47.33*/("""<li>
                                    """),_display_(/*48.38*/helper/*48.44*/.form(routes.Application.redirectUnreadComment(comment.id))/*48.103*/ {_display_(Seq[Any](format.raw/*48.105*/("""
                                    """),format.raw/*49.37*/("""<button type="submit"> <h3> <strong>"""),_display_(/*49.74*/comment/*49.81*/.ownerName),format.raw/*49.91*/(""":</strong>  """),_display_(/*49.104*/comment/*49.111*/.content),format.raw/*49.119*/("""</h3></button><br>
                                    """)))}),format.raw/*50.38*/("""
                                """),format.raw/*51.33*/("""</li>
                            """)))}),format.raw/*52.30*/("""
                            """),format.raw/*53.29*/("""</ul>
                        
                        <form action="/landing">
                            <button class="btn" href="/landing">Logout</button> 
                        </form>
                     </div>
                </div>
             </div>
          </div>
       </div>
    </head>
    
    
<body>
        <div id="wrapper" class="toggled">
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                   <div class="container">
                   <hr>
                    """),_display_(/*72.22*/for(e <- Event.findDailySchedule(Application.currentClient)) yield /*72.82*/{_display_(Seq[Any](format.raw/*72.83*/("""
                        """),format.raw/*73.25*/("""<li>    
                            
                            """),_display_(/*75.30*/helper/*75.36*/.form(routes.Application.showEventInfo(e.eventName))/*75.88*/ {_display_(Seq[Any](format.raw/*75.90*/("""
                                """),format.raw/*76.33*/("""<ul style="color: white;">
                                <a href="#" style="color: white; text-decoration: underline;" onclick="$(this).closest('form').submit()"><h3>"""),_display_(/*77.143*/e/*77.144*/.eventName),format.raw/*77.154*/("""</h3></a>
                                <li id="li-event">At """),_display_(/*78.55*/e/*78.56*/.location),format.raw/*78.65*/("""</li>
                                <li id="li-event">Start: """),_display_(/*79.59*/e/*79.60*/.startTime),format.raw/*79.70*/("""</li>
                                <li id="li-event">End: """),_display_(/*80.57*/e/*80.58*/.endTime),format.raw/*80.66*/("""</li>
                                </ul>
                            """)))}),format.raw/*82.30*/("""
                            """),format.raw/*83.29*/("""<hr>
                        </li>
                    """)))}),format.raw/*85.22*/("""
                    """),format.raw/*86.21*/("""</div>
                </ul>
            </div>
        </div>
    <div class="container" id="fill" align="center">
        <h2>Add all clients before for the events </h2>
    <div class="row-fluid well well-small" id="fill">
        <div class="span4 div-list" style="overflow-y: scroll;" id="fill">
            <ul class="list-group">
                <li class="list-group-item"><h2>Team members:</h2></li>
                """),_display_(/*96.18*/for(client <- clients) yield /*96.40*/ {_display_(Seq[Any](format.raw/*96.42*/("""
                """),format.raw/*97.17*/("""<li class="list-group-item">
                    <button class="list-button" type="submit">
                        """),_display_(/*99.26*/client/*99.32*/.email),format.raw/*99.38*/("""
                    """),format.raw/*100.21*/("""</button>
                    """),_display_(/*101.22*/helper/*101.28*/.form(routes.Application.deleteUserFromEventList(client.email))/*101.91*/ {_display_(Seq[Any](format.raw/*101.93*/("""
                    """),format.raw/*102.21*/("""<button class="delete">x</button>
                    """)))}),format.raw/*103.22*/("""
                """),format.raw/*104.17*/("""</li>
                """)))}),format.raw/*105.18*/("""
                """),_display_(/*106.18*/helper/*106.24*/.form(routes.Application.addUserToEvent())/*106.66*/ {_display_(Seq[Any](format.raw/*106.68*/("""
                """),format.raw/*107.17*/("""<input name="email" placeholder="email address"><br>
                <button type="submit">Add</button><br>
                """)))}),format.raw/*109.18*/("""
            """),format.raw/*110.13*/("""</ul>
            
        </div>
        <div class="span8" id="fill">

            <button onclick="common()" type="submit">Create</button><br>
            <div class="content" id="content">
            </div>
                """),_display_(/*118.18*/helper/*118.24*/.form(routes.Application.teamPage(teamName))/*118.68*/ {_display_(Seq[Any](format.raw/*118.70*/("""
            """),format.raw/*119.13*/("""<button type="submit">Go back</button><br>
            """)))}),format.raw/*120.14*/("""
        """),format.raw/*121.9*/("""</div>
    </div>
    </div>
    <script>
        function common()"""),format.raw/*125.26*/("""{"""),format.raw/*125.27*/("""
            """),format.raw/*126.13*/("""var html = "<div class='container-fluid' id='fill' align='center'>"
                     + "<h2>Below are the time slots when all the members are free, choose one for your event</h2>"
                     + "<div class='row-fluid' id='fill'>"
                     + "<div class='span8 offset2 well' style='overflow-y: scroll;'>"
                     + "<ul class='list-group'>"
                     + """"),_display_(/*131.26*/for(slot <- Event.timeListToString(Event.findWeeklyCommonFreetime(Application.eventClientList, Event.currentDate()))) yield /*131.143*/ {_display_(Seq[Any](format.raw/*131.145*/(""""
                     + "<li class='list-group-item'>"
                     + "<form action='/chooseCommonTime/"""),_display_(/*133.58*/slot),format.raw/*133.62*/("""' method='GET'>"
                     + "<button class='list-button-time' type='submit'>"""),_display_(/*134.73*/slot),format.raw/*134.77*/("""</button>"
                     + "</form>"
                     + "</li>"
                     + """")))}),format.raw/*137.26*/(""""
                     + "</ul"
                     + "</div>"
                     + "</div>"
                     + "</div>";
            $("#content").html(html);
        """),format.raw/*143.9*/("""}"""),format.raw/*143.10*/("""
    """),format.raw/*144.5*/("""</script>
    <script>
        function slot()"""),format.raw/*146.24*/("""{"""),format.raw/*146.25*/("""
            """),format.raw/*147.13*/("""var html = "<h1> HAHAH </h1>";
            $("#content").load('"""),_display_(/*148.34*/routes/*148.40*/.Assets.at("t.scala.html")),format.raw/*148.66*/("""');
        """),format.raw/*149.9*/("""}"""),format.raw/*149.10*/("""
    """),format.raw/*150.5*/("""</script>
                    <!-- Menu Toggle Script -->
        <script>
        $("#menu-toggle").click(function(e) """),format.raw/*153.45*/("""{"""),format.raw/*153.46*/("""
            """),format.raw/*154.13*/("""$("#wrapper").toggleClass("toggled");
        """),format.raw/*155.9*/("""}"""),format.raw/*155.10*/(""");
        </script>
        <!-- DropDown -->
        <script>$('.dropdown-toggle').dropdown()</script>

</body>




"""))}
  }

  def render(clients:java.util.List[Client],teamName:String,unreadNum:Integer): play.twirl.api.HtmlFormat.Appendable = apply(clients,teamName,unreadNum)

  def f:((java.util.List[Client],String,Integer) => play.twirl.api.HtmlFormat.Appendable) = (clients,teamName,unreadNum) => apply(clients,teamName,unreadNum)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 19:33:38 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/eventPage.scala.html
                  HASH: 59913f3f77bc7c7192ea459f26612fc5d27af52f
                  MATRIX: 758->1|919->74|951->80|1237->340|1251->346|1311->385|1394->442|1408->448|1479->498|1562->555|1576->561|1642->606|1725->663|1739->669|1808->717|1892->774|1907->780|1983->834|2035->859|2050->865|2116->910|2177->944|2192->950|2261->998|3245->1954|3276->1963|3466->2126|3543->2187|3583->2189|3644->2222|3713->2264|3728->2270|3795->2327|3836->2329|3901->2366|3967->2405|3980->2409|4010->2418|4039->2419|4136->2485|4197->2518|4263->2553|4320->2583|4399->2646|4439->2648|4500->2681|4610->2764|4625->2770|4689->2825|4730->2827|4795->2864|4859->2901|4873->2906|4904->2916|4945->2929|4960->2934|4990->2942|5077->2998|5138->3031|5204->3066|5261->3096|5344->3163|5384->3165|5445->3198|5514->3240|5529->3246|5598->3305|5639->3307|5704->3344|5768->3381|5784->3388|5815->3398|5856->3411|5873->3418|5903->3426|5990->3482|6051->3515|6117->3550|6174->3579|6736->4114|6812->4174|6851->4175|6904->4200|6998->4267|7013->4273|7074->4325|7114->4327|7175->4360|7372->4529|7383->4530|7415->4540|7506->4604|7516->4605|7546->4614|7637->4678|7647->4679|7678->4689|7767->4751|7777->4752|7806->4760|7910->4833|7967->4862|8054->4918|8103->4939|8556->5365|8594->5387|8634->5389|8679->5406|8823->5523|8838->5529|8865->5535|8915->5556|8974->5587|8990->5593|9063->5656|9104->5658|9154->5679|9241->5734|9287->5751|9342->5774|9388->5792|9404->5798|9456->5840|9497->5842|9543->5859|9700->5984|9742->5997|9999->6226|10015->6232|10069->6276|10110->6278|10152->6291|10240->6347|10277->6356|10373->6423|10403->6424|10445->6437|10876->6840|11011->6957|11053->6959|11194->7072|11220->7076|11337->7165|11363->7169|11495->7269|11698->7444|11728->7445|11761->7450|11836->7496|11866->7497|11908->7510|12000->7574|12016->7580|12064->7606|12104->7618|12134->7619|12167->7624|12315->7743|12345->7744|12387->7757|12461->7803|12491->7804
                  LINES: 26->1|29->1|31->3|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|57->29|57->29|59->31|59->31|59->31|60->32|61->33|61->33|61->33|61->33|62->34|62->34|62->34|62->34|62->34|63->35|64->36|65->37|66->38|66->38|66->38|67->39|69->41|69->41|69->41|69->41|70->42|70->42|70->42|70->42|70->42|70->42|70->42|71->43|72->44|73->45|74->46|74->46|74->46|75->47|76->48|76->48|76->48|76->48|77->49|77->49|77->49|77->49|77->49|77->49|77->49|78->50|79->51|80->52|81->53|100->72|100->72|100->72|101->73|103->75|103->75|103->75|103->75|104->76|105->77|105->77|105->77|106->78|106->78|106->78|107->79|107->79|107->79|108->80|108->80|108->80|110->82|111->83|113->85|114->86|124->96|124->96|124->96|125->97|127->99|127->99|127->99|128->100|129->101|129->101|129->101|129->101|130->102|131->103|132->104|133->105|134->106|134->106|134->106|134->106|135->107|137->109|138->110|146->118|146->118|146->118|146->118|147->119|148->120|149->121|153->125|153->125|154->126|159->131|159->131|159->131|161->133|161->133|162->134|162->134|165->137|171->143|171->143|172->144|174->146|174->146|175->147|176->148|176->148|176->148|177->149|177->149|178->150|181->153|181->153|182->154|183->155|183->155
                  -- GENERATED --
              */
          