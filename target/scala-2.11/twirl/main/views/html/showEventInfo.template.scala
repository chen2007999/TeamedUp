
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
object showEventInfo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Event,String,String,String,java.util.List[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(event : Event, date : String, startTime : String, endTime : String, events : java.util.List[Event]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.102*/("""

"""),_display_(/*3.2*/main(event.eventName)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.at("stylesheets/bootmetro.css")),format.raw/*7.100*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("stylesheets/bootmetro-responsive.css")),format.raw/*8.111*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.at("stylesheets/bootmetro-icons.css")),format.raw/*9.106*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.at("stylesheets/bootmetro-ui-light.css")),format.raw/*10.109*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.at("stylesheets/bootstrap/simple-sidebar.css")),format.raw/*11.115*/("""">
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/bootstrap/jquery.js")),format.raw/*12.74*/(""""></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/bootstrap/bootstrap.js")),format.raw/*13.77*/(""""></script>
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
                            <button class="btn" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" href="#"><span class="badge">"""),_display_(/*30.162*/Unread/*30.168*/.getUnreadNum(Application.currentClient)),format.raw/*30.208*/("""</span> unread</button>
                            <ul class="dropdown-menu pull-right unread" role="menu" arie-labelledby="dLabel">
                            """),_display_(/*32.30*/for(task <- Unread.getUnreadTasks(Application.currentClient)) yield /*32.91*/ {_display_(Seq[Any](format.raw/*32.93*/("""
                                """),format.raw/*33.33*/("""<li>
                                    """),_display_(/*34.38*/helper/*34.44*/.form(routes.Application.redirectUnreadTask(task.taskId))/*34.101*/ {_display_(Seq[Any](format.raw/*34.103*/("""
                                    """),format.raw/*35.37*/("""<button type="submit"><h3> A new task """),_display_(/*35.76*/task/*35.80*/.taskName),format.raw/*35.89*/(""" """),format.raw/*35.90*/("""is created</h3></button><br>
                                    """)))}),format.raw/*36.38*/("""
                                """),format.raw/*37.33*/("""</li>
                            """)))}),format.raw/*38.30*/("""
                            """),_display_(/*39.30*/for(event <- Unread.getUnreadEvents(Application.currentClient)) yield /*39.93*/ {_display_(Seq[Any](format.raw/*39.95*/("""
                                """),format.raw/*40.33*/("""<li>
                                    Haha
                                    """),_display_(/*42.38*/helper/*42.44*/.form(routes.Application.redirectUnreadEvent(event.id))/*42.99*/ {_display_(Seq[Any](format.raw/*42.101*/("""
                                    """),format.raw/*43.37*/("""<button type="submit"> <h3> <strong>"""),_display_(/*43.74*/event/*43.79*/.ownerName),format.raw/*43.89*/(""":</strong>  """),_display_(/*43.102*/event/*43.107*/.content),format.raw/*43.115*/("""</h3></button><br>
                                    """)))}),format.raw/*44.38*/("""
                                """),format.raw/*45.33*/("""</li>
                            """)))}),format.raw/*46.30*/("""
                            """),_display_(/*47.30*/for(comment <- Unread.getUnreadComments(Application.currentClient)) yield /*47.97*/ {_display_(Seq[Any](format.raw/*47.99*/("""
                                """),format.raw/*48.33*/("""<li>
                                    """),_display_(/*49.38*/helper/*49.44*/.form(routes.Application.redirectUnreadComment(comment.id))/*49.103*/ {_display_(Seq[Any](format.raw/*49.105*/("""
                                    """),format.raw/*50.37*/("""<button type="submit"> <h3> <strong>"""),_display_(/*50.74*/comment/*50.81*/.ownerName),format.raw/*50.91*/(""":</strong>  """),_display_(/*50.104*/comment/*50.111*/.content),format.raw/*50.119*/("""</h3></button><br>
                                    """)))}),format.raw/*51.38*/("""
                                """),format.raw/*52.33*/("""</li>
                            """)))}),format.raw/*53.30*/("""
                            """),format.raw/*54.29*/("""</ul>
                        
                        <form action="/landing">
                            <button class="btn" href="/landing">Logout</button> 
                        </form>
                     </div>
                </div>
             </div>
          </div>
       </div>
    </head>
    
    <body class="fill">
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
    <div class="container">
        <div class="row-fluid" id="fill">
            <br>
            <div class="span4 offset4 well well-small">
                <h2>Event name: """),_display_(/*94.34*/event/*94.39*/.eventName),format.raw/*94.49*/("""</h2>
                <h2>Creator: """),_display_(/*95.31*/event/*95.36*/.ownerName),format.raw/*95.46*/("""</h2>
                <h2>Location: """),_display_(/*96.32*/event/*96.37*/.location),format.raw/*96.46*/("""</h2>
                <h2>Date: """),_display_(/*97.28*/date),format.raw/*97.32*/("""</h2>
                <h2>Start time: """),_display_(/*98.34*/startTime),format.raw/*98.43*/("""</h2>
                <h2>End time: """),_display_(/*99.32*/endTime),format.raw/*99.39*/("""</h2>
                <h2>Description: """),_display_(/*100.35*/event/*100.40*/.content),format.raw/*100.48*/("""</h2>
                
                <h2>Members: </h2>
                """),_display_(/*103.18*/for(e <- events) yield /*103.34*/ {_display_(Seq[Any](format.raw/*103.36*/("""
                   """),format.raw/*104.20*/("""<h2>"""),_display_(/*104.25*/e/*104.26*/.involvedEmail),format.raw/*104.40*/("""</h2>
                """)))}),format.raw/*105.18*/(""" 
            """),format.raw/*106.13*/("""</div>
        </div>
    </div>
                <!-- Menu Toggle Script -->
        <script>
        $("#menu-toggle").click(function(e) """),format.raw/*111.45*/("""{"""),format.raw/*111.46*/("""
            """),format.raw/*112.13*/("""$("#wrapper").toggleClass("toggled");
        """),format.raw/*113.9*/("""}"""),format.raw/*113.10*/(""");
        </script>
        <!-- DropDown -->
        <script>$('.dropdown-toggle').dropdown()</script>
    </body>

""")))}))}
  }

  def render(event:Event,date:String,startTime:String,endTime:String,events:java.util.List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(event,date,startTime,endTime,events)

  def f:((Event,String,String,String,java.util.List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (event,date,startTime,endTime,events) => apply(event,date,startTime,endTime,events)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 20:12:31 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/showEventInfo.scala.html
                  HASH: defdd7f93844c145afca3bd0bc129597f572beba
                  MATRIX: 773->1|962->101|990->104|1019->125|1058->127|1089->132|1375->392|1389->398|1449->437|1532->494|1546->500|1617->550|1700->607|1714->613|1780->658|1864->715|1879->721|1949->769|2033->826|2048->832|2124->886|2176->911|2191->917|2257->962|2318->996|2333->1002|2402->1050|3386->2006|3402->2012|3464->2052|3654->2215|3731->2276|3771->2278|3832->2311|3901->2353|3916->2359|3983->2416|4024->2418|4089->2455|4155->2494|4168->2498|4198->2507|4227->2508|4324->2574|4385->2607|4451->2642|4508->2672|4587->2735|4627->2737|4688->2770|4798->2853|4813->2859|4877->2914|4918->2916|4983->2953|5047->2990|5061->2995|5092->3005|5133->3018|5148->3023|5178->3031|5265->3087|5326->3120|5392->3155|5449->3185|5532->3252|5572->3254|5633->3287|5702->3329|5717->3335|5786->3394|5827->3396|5892->3433|5956->3470|5972->3477|6003->3487|6044->3500|6061->3507|6091->3515|6178->3571|6239->3604|6305->3639|6362->3668|6936->4215|7012->4275|7051->4276|7104->4301|7198->4368|7213->4374|7274->4426|7314->4428|7375->4461|7572->4630|7583->4631|7615->4641|7706->4705|7716->4706|7746->4715|7837->4779|7847->4780|7878->4790|7967->4852|7977->4853|8006->4861|8110->4934|8167->4963|8254->5019|8303->5040|8569->5279|8583->5284|8614->5294|8677->5330|8691->5335|8722->5345|8786->5382|8800->5387|8830->5396|8890->5429|8915->5433|8981->5472|9011->5481|9075->5518|9103->5525|9171->5565|9186->5570|9216->5578|9319->5653|9352->5669|9393->5671|9442->5691|9475->5696|9486->5697|9522->5711|9577->5734|9620->5748|9787->5886|9817->5887|9859->5900|9933->5946|9963->5947
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|58->30|58->30|58->30|60->32|60->32|60->32|61->33|62->34|62->34|62->34|62->34|63->35|63->35|63->35|63->35|63->35|64->36|65->37|66->38|67->39|67->39|67->39|68->40|70->42|70->42|70->42|70->42|71->43|71->43|71->43|71->43|71->43|71->43|71->43|72->44|73->45|74->46|75->47|75->47|75->47|76->48|77->49|77->49|77->49|77->49|78->50|78->50|78->50|78->50|78->50|78->50|78->50|79->51|80->52|81->53|82->54|100->72|100->72|100->72|101->73|103->75|103->75|103->75|103->75|104->76|105->77|105->77|105->77|106->78|106->78|106->78|107->79|107->79|107->79|108->80|108->80|108->80|110->82|111->83|113->85|114->86|122->94|122->94|122->94|123->95|123->95|123->95|124->96|124->96|124->96|125->97|125->97|126->98|126->98|127->99|127->99|128->100|128->100|128->100|131->103|131->103|131->103|132->104|132->104|132->104|132->104|133->105|134->106|139->111|139->111|140->112|141->113|141->113
                  -- GENERATED --
              */
          