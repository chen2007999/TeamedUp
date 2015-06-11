
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
      _display_ {

Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main("Team")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("stylesheets/bootmetro.css")),format.raw/*8.100*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.at("stylesheets/bootmetro-responsive.css")),format.raw/*9.111*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.at("stylesheets/bootmetro-icons.css")),format.raw/*10.106*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.at("stylesheets/bootmetro-ui-light.css")),format.raw/*11.109*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.55*/routes/*12.61*/.Assets.at("stylesheets/bootstrap/simple-sidebar.css")),format.raw/*12.115*/("""">
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/bootstrap/jquery.js")),format.raw/*13.74*/(""""></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/bootstrap/bootstrap.js")),format.raw/*14.77*/(""""></script>
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
                            <button class="btn" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" href="#"><span class="badge">"""),_display_(/*31.162*/unreadNum),format.raw/*31.171*/("""</span> unread</button>
                            <ul class="dropdown-menu pull-right unread" role="menu" arie-labelledby="dLabel">
                            """),_display_(/*33.30*/for(task <- Unread.getUnreadTasks(Application.currentClient)) yield /*33.91*/ {_display_(Seq[Any](format.raw/*33.93*/("""
                                """),format.raw/*34.33*/("""<li>
                                    """),_display_(/*35.38*/helper/*35.44*/.form(routes.Application.redirectUnreadTask(task.taskId))/*35.101*/ {_display_(Seq[Any](format.raw/*35.103*/("""
                                    """),format.raw/*36.37*/("""<button type="submit"><h3> A new task """),_display_(/*36.76*/task/*36.80*/.taskName),format.raw/*36.89*/(""" """),format.raw/*36.90*/("""is created</h3></button><br>
                                    """)))}),format.raw/*37.38*/("""
                                """),format.raw/*38.33*/("""</li>
                            """)))}),format.raw/*39.30*/("""
                            """),_display_(/*40.30*/for(event <- Unread.getUnreadEvents(Application.currentClient)) yield /*40.93*/ {_display_(Seq[Any](format.raw/*40.95*/("""
                                """),format.raw/*41.33*/("""<li>
                                    Haha
                                    """),_display_(/*43.38*/helper/*43.44*/.form(routes.Application.redirectUnreadEvent(event.id))/*43.99*/ {_display_(Seq[Any](format.raw/*43.101*/("""
                                    """),format.raw/*44.37*/("""<button type="submit"> <h3> <strong>"""),_display_(/*44.74*/event/*44.79*/.ownerName),format.raw/*44.89*/(""":</strong>  """),_display_(/*44.102*/event/*44.107*/.content),format.raw/*44.115*/("""</h3></button><br>
                                    """)))}),format.raw/*45.38*/("""
                                """),format.raw/*46.33*/("""</li>
                            """)))}),format.raw/*47.30*/("""
                            """),_display_(/*48.30*/for(comment <- Unread.getUnreadComments(Application.currentClient)) yield /*48.97*/ {_display_(Seq[Any](format.raw/*48.99*/("""
                                """),format.raw/*49.33*/("""<li>
                                    """),_display_(/*50.38*/helper/*50.44*/.form(routes.Application.redirectUnreadComment(comment.id))/*50.103*/ {_display_(Seq[Any](format.raw/*50.105*/("""
                                    """),format.raw/*51.37*/("""<button type="submit"> <h3> <strong>"""),_display_(/*51.74*/comment/*51.81*/.ownerName),format.raw/*51.91*/(""":</strong>  """),_display_(/*51.104*/comment/*51.111*/.content),format.raw/*51.119*/("""</h3></button><br>
                                    """)))}),format.raw/*52.38*/("""
                                """),format.raw/*53.33*/("""</li>
                            """)))}),format.raw/*54.30*/("""
                            """),format.raw/*55.29*/("""</ul>
                        
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
                    """),_display_(/*73.22*/for(e <- Event.findDailySchedule(Application.currentClient)) yield /*73.82*/{_display_(Seq[Any](format.raw/*73.83*/("""
                        """),format.raw/*74.25*/("""<li>    
                            
                            """),_display_(/*76.30*/helper/*76.36*/.form(routes.Application.showEventInfo(e.eventName))/*76.88*/ {_display_(Seq[Any](format.raw/*76.90*/("""
                                """),format.raw/*77.33*/("""<ul style="color: white;">
                                <a href="#" style="color: white; text-decoration: underline;" onclick="$(this).closest('form').submit()"><h3>"""),_display_(/*78.143*/e/*78.144*/.eventName),format.raw/*78.154*/("""</h3></a>
                                <li id="li-event">At """),_display_(/*79.55*/e/*79.56*/.location),format.raw/*79.65*/("""</li>
                                <li id="li-event">Start: """),_display_(/*80.59*/e/*80.60*/.startTime),format.raw/*80.70*/("""</li>
                                <li id="li-event">End: """),_display_(/*81.57*/e/*81.58*/.endTime),format.raw/*81.66*/("""</li>
                                </ul>
                            """)))}),format.raw/*83.30*/("""
                            """),format.raw/*84.29*/("""<hr>
                        </li>
                    """)))}),format.raw/*86.22*/("""
                    """),format.raw/*87.21*/("""</div>
                </ul>
            </div>
        </div>

        
        
<div class="metro well well-small teams" id="fill">
    
    <!-- Modal -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"></button>
            <h4 class="modal-title" id="myModalLabel">Create a new team</h4>
          </div>
          <div class="modal-body">
              <div class="row-fluid">
                    <div class="span4 offset4" align="center">
                        """),_display_(/*107.26*/helper/*107.32*/.form(routes.Application.createTeam())/*107.70*/ {_display_(Seq[Any](format.raw/*107.72*/("""
                            """),format.raw/*108.29*/("""<input type="text" name="teamName" placeholder="team name"><br>
                            <button type="submit">Create</button><br>
                        """)))}),format.raw/*110.26*/("""
                    """),format.raw/*111.21*/("""</div>
                </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          </div>
        </div>
      </div>
    </div>
    
    <button class="win-command orange add-team" type="button" data-toggle="modal" data-target="#myModal" rel="tooltip" title="Add a new team">
        <span class="win-commandimage win-commandring"><img src=""""),_display_(/*122.67*/routes/*122.73*/.Assets.at("images/plus.png")),format.raw/*122.102*/(""""></span>
    </button>
    """),_display_(/*124.6*/for(team <- teams) yield /*124.24*/ {_display_(Seq[Any](format.raw/*124.26*/("""
        """),format.raw/*125.9*/("""<a class="tile wide text """),_display_(/*125.35*/Team/*125.39*/.color()),format.raw/*125.47*/("""" href="/teamPage/"""),_display_(/*125.66*/team/*125.70*/.teamName),format.raw/*125.79*/("""">
                <div class="text-header">
                    """),_display_(/*127.22*/team/*127.26*/.teamName),format.raw/*127.35*/("""
                """),format.raw/*128.17*/("""</div>
            
        </a>
    """)))}),format.raw/*131.6*/("""
"""),format.raw/*132.1*/("""</div>
                <!-- Menu Toggle Script -->
        <script>
        $("#menu-toggle").click(function(e) """),format.raw/*135.45*/("""{"""),format.raw/*135.46*/("""
            """),format.raw/*136.13*/("""$("#wrapper").toggleClass("toggled");
        """),format.raw/*137.9*/("""}"""),format.raw/*137.10*/(""");
        </script>
        <!-- DropDown -->
        <script>$('.dropdown-toggle').dropdown()</script>
</body>

    
</html>


""")))}),format.raw/*147.2*/("""
"""))}
  }

  def render(teams:java.util.List[models.Team],unreadNum:Integer): play.twirl.api.HtmlFormat.Appendable = apply(teams,unreadNum)

  def f:((java.util.List[models.Team],Integer) => play.twirl.api.HtmlFormat.Appendable) = (teams,unreadNum) => apply(teams,unreadNum)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 20:12:30 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/mainPage.scala.html
                  HASH: 3222c0752823df48db5544965b26022c2c489089
                  MATRIX: 755->1|900->58|928->61|948->73|987->75|1014->76|1320->356|1334->362|1394->401|1477->458|1491->464|1562->514|1646->571|1661->577|1728->622|1812->679|1827->685|1897->733|1981->790|1996->796|2072->850|2124->875|2139->881|2205->926|2266->960|2281->966|2350->1014|3334->1970|3365->1979|3555->2142|3632->2203|3672->2205|3733->2238|3802->2280|3817->2286|3884->2343|3925->2345|3990->2382|4056->2421|4069->2425|4099->2434|4128->2435|4225->2501|4286->2534|4352->2569|4409->2599|4488->2662|4528->2664|4589->2697|4699->2780|4714->2786|4778->2841|4819->2843|4884->2880|4948->2917|4962->2922|4993->2932|5034->2945|5049->2950|5079->2958|5166->3014|5227->3047|5293->3082|5350->3112|5433->3179|5473->3181|5534->3214|5603->3256|5618->3262|5687->3321|5728->3323|5793->3360|5857->3397|5873->3404|5904->3414|5945->3427|5962->3434|5992->3442|6079->3498|6140->3531|6206->3566|6263->3595|6816->4121|6892->4181|6931->4182|6984->4207|7078->4274|7093->4280|7154->4332|7194->4334|7255->4367|7452->4536|7463->4537|7495->4547|7586->4611|7596->4612|7626->4621|7717->4685|7727->4686|7758->4696|7847->4758|7857->4759|7886->4767|7990->4840|8047->4869|8134->4925|8183->4946|8948->5683|8964->5689|9012->5727|9053->5729|9111->5758|9302->5917|9352->5938|9828->6386|9844->6392|9896->6421|9952->6450|9987->6468|10028->6470|10065->6479|10119->6505|10133->6509|10163->6517|10210->6536|10224->6540|10255->6549|10349->6615|10363->6619|10394->6628|10440->6645|10509->6683|10538->6684|10679->6796|10709->6797|10751->6810|10825->6856|10855->6857|11016->6987
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|59->31|59->31|61->33|61->33|61->33|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|64->36|64->36|65->37|66->38|67->39|68->40|68->40|68->40|69->41|71->43|71->43|71->43|71->43|72->44|72->44|72->44|72->44|72->44|72->44|72->44|73->45|74->46|75->47|76->48|76->48|76->48|77->49|78->50|78->50|78->50|78->50|79->51|79->51|79->51|79->51|79->51|79->51|79->51|80->52|81->53|82->54|83->55|101->73|101->73|101->73|102->74|104->76|104->76|104->76|104->76|105->77|106->78|106->78|106->78|107->79|107->79|107->79|108->80|108->80|108->80|109->81|109->81|109->81|111->83|112->84|114->86|115->87|135->107|135->107|135->107|135->107|136->108|138->110|139->111|150->122|150->122|150->122|152->124|152->124|152->124|153->125|153->125|153->125|153->125|153->125|153->125|153->125|155->127|155->127|155->127|156->128|159->131|160->132|163->135|163->135|164->136|165->137|165->137|175->147
                  -- GENERATED --
              */
          