
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
object profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Client,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(client: models.Client):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
    <head>
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
                <img src="""),_display_(/*94.27*/client/*94.33*/.image),format.raw/*94.39*/(""" """),format.raw/*94.40*/("""height="200" width="200" class="img-circle">
                    <!-- Modal -->
                    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                      <div class="modal-dialog">
                        <div class="modal-content">
                          <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="myModalLabel">Update your image</h4>
                          </div>
                          <div class="modal-body">
                              <div class="row-fluid">
                                    <div class="span4 offset4" align="center">
                                        """),_display_(/*106.42*/helper/*106.48*/.form(routes.Application.updateImage())/*106.87*/ {_display_(Seq[Any](format.raw/*106.89*/("""
                                            """),format.raw/*107.45*/("""<input type="text" name="image" placeholder="Image URL"><br>
                                            <button type="submit">Update</button><br>
                                        """)))}),format.raw/*109.42*/("""
                                    """),format.raw/*110.37*/("""</div>
                                </div>
                          </div>
                          <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                          </div>
                        </div>
                      </div>
                    </div>
                <button data-toggle="modal" data-target="#myModal">Update picture</button>
                <h1>Name: """),_display_(/*120.28*/client/*120.34*/.name),format.raw/*120.39*/(""" """),format.raw/*120.40*/("""</h1>
                <h2>E-mail: """),_display_(/*121.30*/client/*121.36*/.email),format.raw/*121.42*/("""</h2>
                <form action="" enctype="multipart/form-data" method="post">
                    <p>
                        Please upload a file:<br>
                        <input type="file" name="datafile" size="40">
                    </p>
                    <div>
                        <input type="submit" value="Send">
                    </div>
                </form>
            </div>
        </div>
    </div>

                <!-- Menu Toggle Script -->
        <script>
        $("#menu-toggle").click(function(e) """),format.raw/*137.45*/("""{"""),format.raw/*137.46*/("""
            """),format.raw/*138.13*/("""$("#wrapper").toggleClass("toggled");
        """),format.raw/*139.9*/("""}"""),format.raw/*139.10*/(""");
        </script>
        <!-- DropDown -->
        <script>$('.dropdown-toggle').dropdown()</script>
    </body>
</html>"""))}
  }

  def render(client:models.Client): play.twirl.api.HtmlFormat.Appendable = apply(client)

  def f:((models.Client) => play.twirl.api.HtmlFormat.Appendable) = (client) => apply(client)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 19:35:51 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/profile.scala.html
                  HASH: 05d63ff74573e4ad128d5bfbf3bdd1db3322fd8e
                  MATRIX: 732->1|843->24|871->26|1177->306|1191->312|1251->351|1334->408|1348->414|1419->464|1502->521|1516->527|1582->572|1666->629|1681->635|1751->683|1835->740|1850->746|1926->800|1978->825|1993->831|2059->876|2120->910|2135->916|2204->964|3188->1920|3204->1926|3266->1966|3456->2129|3533->2190|3573->2192|3634->2225|3703->2267|3718->2273|3785->2330|3826->2332|3891->2369|3957->2408|3970->2412|4000->2421|4029->2422|4126->2488|4187->2521|4253->2556|4310->2586|4389->2649|4429->2651|4490->2684|4600->2767|4615->2773|4679->2828|4720->2830|4785->2867|4849->2904|4863->2909|4894->2919|4935->2932|4950->2937|4980->2945|5067->3001|5128->3034|5194->3069|5251->3099|5334->3166|5374->3168|5435->3201|5504->3243|5519->3249|5588->3308|5629->3310|5694->3347|5758->3384|5774->3391|5805->3401|5846->3414|5863->3421|5893->3429|5980->3485|6041->3518|6107->3553|6164->3582|6742->4133|6818->4193|6857->4194|6910->4219|7004->4286|7019->4292|7080->4344|7120->4346|7181->4379|7378->4548|7389->4549|7421->4559|7512->4623|7522->4624|7552->4633|7643->4697|7653->4698|7684->4708|7773->4770|7783->4771|7812->4779|7916->4852|7973->4881|8060->4937|8109->4958|8368->5190|8383->5196|8410->5202|8439->5203|9341->6077|9357->6083|9406->6122|9447->6124|9521->6169|9741->6357|9807->6394|10315->6874|10331->6880|10358->6885|10388->6886|10451->6921|10467->6927|10495->6933|11063->7472|11093->7473|11135->7486|11209->7532|11239->7533
                  LINES: 26->1|29->1|31->3|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|58->30|58->30|58->30|60->32|60->32|60->32|61->33|62->34|62->34|62->34|62->34|63->35|63->35|63->35|63->35|63->35|64->36|65->37|66->38|67->39|67->39|67->39|68->40|70->42|70->42|70->42|70->42|71->43|71->43|71->43|71->43|71->43|71->43|71->43|72->44|73->45|74->46|75->47|75->47|75->47|76->48|77->49|77->49|77->49|77->49|78->50|78->50|78->50|78->50|78->50|78->50|78->50|79->51|80->52|81->53|82->54|100->72|100->72|100->72|101->73|103->75|103->75|103->75|103->75|104->76|105->77|105->77|105->77|106->78|106->78|106->78|107->79|107->79|107->79|108->80|108->80|108->80|110->82|111->83|113->85|114->86|122->94|122->94|122->94|122->94|134->106|134->106|134->106|134->106|135->107|137->109|138->110|148->120|148->120|148->120|148->120|149->121|149->121|149->121|165->137|165->137|166->138|167->139|167->139
                  -- GENERATED --
              */
          