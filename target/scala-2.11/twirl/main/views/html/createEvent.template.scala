
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
object createEvent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Integer,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(unreadNum : Integer, startTime : String, status : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.60*/("""

"""),format.raw/*3.1*/("""<head>
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
        """),_display_(/*62.10*/if(status.length() >0)/*62.32*/{_display_(Seq[Any](format.raw/*62.33*/("""
        
        """),_display_(/*64.10*/if(status.equals("success"))/*64.38*/{_display_(Seq[Any](format.raw/*64.39*/("""
         """),format.raw/*65.10*/("""<div class="alert alert-success">
          <button type="button" class="close" data-dismiss="alert"><a data-dismiss="alert" href="#"></a></button>
          Event is successfully created, waiting for other members to comfirm.
        </div>
        """)))}/*69.11*/else/*69.15*/{_display_(Seq[Any](format.raw/*69.16*/("""
        """),format.raw/*70.9*/("""<div class="alert alert-danger">
          <button type="button" class="close" data-dismiss="alert"><a data-dismiss="alert" href="#"></a></button>
          <strong>Warning!</strong> There must have been an error in your entered details. Please try again.
        </div>
        """)))}),format.raw/*74.10*/("""
        """),format.raw/*75.9*/("""<script>
            $(".alert").alert()     
        </script>
        """)))}),format.raw/*78.10*/("""
                """),format.raw/*79.17*/("""<script type="text/javascript" src=""""),_display_(/*79.54*/routes/*79.60*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*79.102*/(""""></script> 
          
       </div>
    </head>

<body>
        <div id="wrapper" class="toggled">
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                   <div class="container">
                   <hr>
                    """),_display_(/*90.22*/for(e <- Event.findDailySchedule(Application.currentClient)) yield /*90.82*/{_display_(Seq[Any](format.raw/*90.83*/("""
                        """),format.raw/*91.25*/("""<li>    
                            
                            """),_display_(/*93.30*/helper/*93.36*/.form(routes.Application.showEventInfo(e.eventName))/*93.88*/ {_display_(Seq[Any](format.raw/*93.90*/("""
                                """),format.raw/*94.33*/("""<ul style="color: white;">
                                <a href="#" style="color: white; text-decoration: underline;" onclick="$(this).closest('form').submit()"><h3>"""),_display_(/*95.143*/e/*95.144*/.eventName),format.raw/*95.154*/("""</h3></a>
                                <li id="li-event">At """),_display_(/*96.55*/e/*96.56*/.location),format.raw/*96.65*/("""</li>
                                <li id="li-event">Start: """),_display_(/*97.59*/e/*97.60*/.startTime),format.raw/*97.70*/("""</li>
                                <li id="li-event">End: """),_display_(/*98.57*/e/*98.58*/.endTime),format.raw/*98.66*/("""</li>
                                </ul>
                            """)))}),format.raw/*100.30*/("""
                            """),format.raw/*101.29*/("""<hr>
                        </li>
                    """)))}),format.raw/*103.22*/("""
                    """),format.raw/*104.21*/("""</div>
                </ul>
            </div>
        </div>
<div class="container well" align="center" id="fill">
    <h1>Create a new event</h1>

       """),_display_(/*111.9*/helper/*111.15*/.form(routes.Application.createEvent(startTime))/*111.63*/ {_display_(Seq[Any](format.raw/*111.65*/("""
                           """),format.raw/*112.28*/("""<input name="eventName" placeholder="event name"><br>
                           <h4>enter the time interval of the event </h4>
                           <input name="slotChosenStart" placeholder="The starting hour of your event, 2-digit number smaller than 24"><br>
                           <input name="slotChosenEnd" placeholder="The finishing hour of your event, 2-digit number smaller than 24"><br>
                           <input name="location" placeholder="location"><br>
                           <textarea name="content" cols="40" rows="5" placeholder="description"></textarea><br>
                           <button type="submit">Create</button><br>
       """)))}),format.raw/*119.9*/("""

"""),format.raw/*121.1*/("""</div>
                <!-- Menu Toggle Script -->
        <script>
        $("#menu-toggle").click(function(e) """),format.raw/*124.45*/("""{"""),format.raw/*124.46*/("""
            """),format.raw/*125.13*/("""$("#wrapper").toggleClass("toggled");
        """),format.raw/*126.9*/("""}"""),format.raw/*126.10*/(""");
        </script>
        <!-- DropDown -->
        <script>$('.dropdown-toggle').dropdown()</script>
</body>
"""))}
  }

  def render(unreadNum:Integer,startTime:String,status:String): play.twirl.api.HtmlFormat.Appendable = apply(unreadNum,startTime,status)

  def f:((Integer,String,String) => play.twirl.api.HtmlFormat.Appendable) = (unreadNum,startTime,status) => apply(unreadNum,startTime,status)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 20:12:30 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/createEvent.scala.html
                  HASH: e1959289b84d1baac1568045847b061f2529fd32
                  MATRIX: 744->1|890->59|918->61|1204->321|1218->327|1278->366|1361->423|1375->429|1446->479|1529->536|1543->542|1609->587|1692->644|1706->650|1775->698|1859->755|1874->761|1950->815|2002->840|2017->846|2083->891|2144->925|2159->931|2228->979|3212->1935|3243->1944|3433->2107|3510->2168|3550->2170|3611->2203|3680->2245|3695->2251|3762->2308|3803->2310|3868->2347|3934->2386|3947->2390|3977->2399|4006->2400|4103->2466|4164->2499|4230->2534|4287->2564|4366->2627|4406->2629|4467->2662|4577->2745|4592->2751|4656->2806|4697->2808|4762->2845|4826->2882|4840->2887|4871->2897|4912->2910|4927->2915|4957->2923|5044->2979|5105->3012|5171->3047|5228->3077|5311->3144|5351->3146|5412->3179|5481->3221|5496->3227|5565->3286|5606->3288|5671->3325|5735->3362|5751->3369|5782->3379|5823->3392|5840->3399|5870->3407|5957->3463|6018->3496|6084->3531|6141->3560|6458->3850|6489->3872|6528->3873|6574->3892|6611->3920|6650->3921|6688->3931|6958->4183|6971->4187|7010->4188|7046->4197|7357->4477|7393->4486|7497->4559|7542->4576|7606->4613|7621->4619|7685->4661|7981->4930|8057->4990|8096->4991|8149->5016|8243->5083|8258->5089|8319->5141|8359->5143|8420->5176|8617->5345|8628->5346|8660->5356|8751->5420|8761->5421|8791->5430|8882->5494|8892->5495|8923->5505|9012->5567|9022->5568|9051->5576|9156->5649|9214->5678|9302->5734|9352->5755|9537->5913|9553->5919|9611->5967|9652->5969|9709->5997|10415->6672|10445->6674|10586->6786|10616->6787|10658->6800|10732->6846|10762->6847
                  LINES: 26->1|29->1|31->3|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|57->29|57->29|59->31|59->31|59->31|60->32|61->33|61->33|61->33|61->33|62->34|62->34|62->34|62->34|62->34|63->35|64->36|65->37|66->38|66->38|66->38|67->39|69->41|69->41|69->41|69->41|70->42|70->42|70->42|70->42|70->42|70->42|70->42|71->43|72->44|73->45|74->46|74->46|74->46|75->47|76->48|76->48|76->48|76->48|77->49|77->49|77->49|77->49|77->49|77->49|77->49|78->50|79->51|80->52|81->53|90->62|90->62|90->62|92->64|92->64|92->64|93->65|97->69|97->69|97->69|98->70|102->74|103->75|106->78|107->79|107->79|107->79|107->79|118->90|118->90|118->90|119->91|121->93|121->93|121->93|121->93|122->94|123->95|123->95|123->95|124->96|124->96|124->96|125->97|125->97|125->97|126->98|126->98|126->98|128->100|129->101|131->103|132->104|139->111|139->111|139->111|139->111|140->112|147->119|149->121|152->124|152->124|153->125|154->126|154->126
                  -- GENERATED --
              */
          