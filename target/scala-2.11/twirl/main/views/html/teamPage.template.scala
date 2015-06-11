
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
object teamPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,java.util.List[Team],java.util.List[Task],java.util.List[Post],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(teamName: String, teams : java.util.List[Team], tasks : java.util.List[Task], posts : java.util.List[Post], unreadNum : Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.131*/("""

"""),_display_(/*3.2*/main(teamName)/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
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
                            <button class="btn" onclick="drop()" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" href="#"><span class="badge">"""),_display_(/*31.179*/unreadNum),format.raw/*31.188*/("""</span> unread</button>
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
                    """),_display_(/*72.22*/for(e <- Event.findDailySchedule(Application.currentClient)) yield /*72.82*/{_display_(Seq[Any](format.raw/*72.83*/("""
                        """),format.raw/*73.25*/("""<li>    
                            """),_display_(/*74.30*/helper/*74.36*/.form(routes.Application.showEventInfo(e.eventName))/*74.88*/ {_display_(Seq[Any](format.raw/*74.90*/("""
                                """),format.raw/*75.33*/("""<ul style="color: white;">
                                <a href="#" style="color: white; text-decoration: underline;" onclick="$(this).closest('form').submit()"><h3>"""),_display_(/*76.143*/e/*76.144*/.eventName),format.raw/*76.154*/("""</h3></a>
                                <li id="li-event">At """),_display_(/*77.55*/e/*77.56*/.location),format.raw/*77.65*/("""</li>
                                <li id="li-event">Start: """),_display_(/*78.59*/e/*78.60*/.startTime),format.raw/*78.70*/("""</li>
                                <li id="li-event">End: """),_display_(/*79.57*/e/*79.58*/.endTime),format.raw/*79.66*/("""</li>
                                </ul>
                            """)))}),format.raw/*81.30*/("""
                            """),format.raw/*82.29*/("""<hr>
                        </li>
                    """)))}),format.raw/*84.22*/("""
                    """),format.raw/*85.21*/("""</div>
                </ul>
            </div>
        </div>

<div class="container" id="fill">
<h1 align="center">Team: """),_display_(/*91.27*/teamName),format.raw/*91.35*/("""</h1>

"""),_display_(/*93.2*/helper/*93.8*/.form(routes.Application.eventPage())/*93.45*/ {_display_(Seq[Any](format.raw/*93.47*/("""
"""),format.raw/*94.1*/("""<button type="submit">Create a new event</button><br>
""")))}),format.raw/*95.2*/("""

"""),format.raw/*97.1*/("""<div class="row-fluid" id="fill" style="margin-top:0px;">
    <div class="span4 well well-small div-list" style="overflow-y: scroll;" id="fill">
        <ul class="list-group">
            <li class="list-group-item"><h2>Team members:</h2></li>
        """),_display_(/*101.10*/for(team <- teams) yield /*101.28*/ {_display_(Seq[Any](format.raw/*101.30*/("""
            
            """),format.raw/*103.13*/("""<li class="list-group-item">
                <button class="list-button" type="submit">
                    """),_display_(/*105.22*/team/*105.26*/.memberEmail),format.raw/*105.38*/("""
                """),format.raw/*106.17*/("""</button>
                """),_display_(/*107.18*/helper/*107.24*/.form(routes.Application.deleteUserFromTeam(team.memberEmail))/*107.86*/ {_display_(Seq[Any](format.raw/*107.88*/("""
                """),format.raw/*108.17*/("""<button class="delete">x</button>
                """)))}),format.raw/*109.18*/("""
            """),format.raw/*110.13*/("""</li>
           
        """)))}),format.raw/*112.10*/("""
        """),_display_(/*113.10*/helper/*113.16*/.form(routes.Application.addUserToTeam(teamName))/*113.65*/ {_display_(Seq[Any](format.raw/*113.67*/("""
            """),format.raw/*114.13*/("""<input name="email" placeholder="email address"><br>
            <button type="submit">Add a member</button><br>
        """)))}),format.raw/*116.10*/("""
        """),format.raw/*117.9*/("""</ul>

    </div>
    <div class="span8 well well-small" style="overflow-y: scroll;" id="fill">
            <ul class="nav nav-tabs" role="tablist" id="myTab">
              <li role="presentation" class="active">
                <a id="ontop" onclick="$('tasks').tab('show')" href="#tasks" aria-controls="tasks" role="tab" data-toggle="tab">Tasks</a>
              </li>
              <li role="presentation">
                <a id="ontop" "$('posts').tab('show')" href="#posts" aria-controls="posts" role="tab" data-toggle="tab">Posts</a>  
              </li>
            </ul>
            
            <div class="tab-content">
              <div role="tabpanel" class="tab-pane fade in active" id="tasks">
                <div class="metro">
                       <button class="win-command orange add-team" type="button" data-toggle="modal" data-target="#myModalT" rel="tooltip" title="Add a new task">
                            <span class="win-commandimage win-commandring"><img src=""""),_display_(/*134.87*/routes/*134.93*/.Assets.at("images/plus.png")),format.raw/*134.122*/(""""></span>
                        </button> 
                    """),_display_(/*136.22*/if(tasks.size() == 0)/*136.43*/{_display_(Seq[Any](format.raw/*136.44*/("""
                        """),format.raw/*137.25*/("""<h1>You have no tasks</h1>
                        <h2>You can add a new task using the button on the right</h2>
                    """)))}),format.raw/*139.22*/("""
                    """),_display_(/*140.22*/for(task <- tasks) yield /*140.40*/ {_display_(Seq[Any](format.raw/*140.42*/("""

                        """),_display_(/*142.26*/defining(if (task.status.equals("In Progress")) "bg-color-green" else "bg-color-blue")/*142.112*/ { color =>_display_(Seq[Any](format.raw/*142.123*/("""
                            """),format.raw/*143.29*/("""<a class="tile square text tilesquareblock """),_display_(/*143.73*/color),format.raw/*143.78*/("""" href="/taskPage/"""),_display_(/*143.97*/task/*143.101*/.taskName),format.raw/*143.110*/("""">
                                <div class="text">"""),_display_(/*144.52*/task/*144.56*/.taskName),format.raw/*144.65*/("""</div>
                                """),_display_(/*145.34*/defining(if (task.content.length() > 9) task.content.substring(0,8) + "..." else task.content)/*145.128*/ { cont =>_display_(Seq[Any](format.raw/*145.138*/("""
                                """),format.raw/*146.33*/("""<div class="text">"""),_display_(/*146.52*/cont),format.raw/*146.56*/("""</div>
                                """)))}),format.raw/*147.34*/("""
                            """),format.raw/*148.29*/("""</a>    
                        """)))}),format.raw/*149.26*/("""
                    """)))}),format.raw/*150.22*/("""              
                """),format.raw/*151.17*/("""</div>
              </div>
              <div role="tabpanel" class="tab-pane fade" id="posts">
                <div class="metro">
                        <button class="win-command orange add-team" type="button" data-toggle="modal" data-target="#myModalP" rel="tooltip" title="Add a new post">
                            <span class="win-commandimage win-commandring"><img src=""""),_display_(/*156.87*/routes/*156.93*/.Assets.at("images/plus.png")),format.raw/*156.122*/(""""></span>
                        </button>
                    """),_display_(/*158.22*/if(posts.size() == 0)/*158.43*/{_display_(Seq[Any](format.raw/*158.44*/("""
                        """),format.raw/*159.25*/("""<h1>You have no posts</h1>
                        <h2>You can add a new post using the button on the right</h2>
                    """)))}),format.raw/*161.22*/("""
                    """),_display_(/*162.22*/for(post <- posts) yield /*162.40*/ {_display_(Seq[Any](format.raw/*162.42*/("""
                        """),format.raw/*163.25*/("""<a class="tile square text tilesquareblock bg-color-purple" href="/postPage/"""),_display_(/*163.102*/post/*163.106*/.postName),format.raw/*163.115*/("""">
                            <div class="text">Post:</div>
                            <div class="text">"""),_display_(/*165.48*/post/*165.52*/.postName),format.raw/*165.61*/("""</div>
                            """),_display_(/*166.30*/defining(if (post.content.length() > 9) post.content.substring(0,8) + "..." else post.content)/*166.124*/ { cont =>_display_(Seq[Any](format.raw/*166.134*/("""
                                """),format.raw/*167.33*/("""<div class="text">"""),_display_(/*167.52*/cont),format.raw/*167.56*/("""</div>
                            """)))}),format.raw/*168.30*/("""
                        """),format.raw/*169.25*/("""</a>
                    """)))}),format.raw/*170.22*/("""
                """),format.raw/*171.17*/("""</div>
              </div>
            </div>
    </div>
</div>

<!-- Modal -->
    <div class="modal hide fade" id="myModalT" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"></button>
            <h4 class="modal-title" id="myModalLabel">Create</h4>
          </div>
          <div class="modal-body">
              <div class="row-fluid">
                    <div class="span4 offset4" align="center">
                        """),_display_(/*188.26*/helper/*188.32*/.form(routes.Application.createTask())/*188.70*/ {_display_(Seq[Any](format.raw/*188.72*/("""
                            """),format.raw/*189.29*/("""<input name="taskName" placeholder="task name" id="text-inmodal"><br>
                            <textarea name="content" cols="40" rows="5" placeholder="description" id="text-inmodal"></textarea> <br>
                            <button type="submit">Create</button><br>
                        """)))}),format.raw/*192.26*/("""
                    """),format.raw/*193.21*/("""</div>
                </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          </div>
        </div>
      </div>
    </div>


<!-- Modal -->
    <div class="modal hide fade" id="myModalP" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"></button>
            <h4 class="modal-title" id="myModalLabel">Create</h4>
          </div>
          <div class="modal-body">
              <div class="row-fluid">
                    <div class="span4 offset4" align="center">
                        """),_display_(/*215.26*/helper/*215.32*/.form(routes.Application.createPost())/*215.70*/ {_display_(Seq[Any](format.raw/*215.72*/("""
                            """),format.raw/*216.29*/("""<input name="postName" placeholder="post name" id="text-inmodal"><br>
                            <textarea name="content" cols="40" rows="5" placeholder="description" id="text-inmodal"></textarea> <br>
                            <button type="submit">Create</button><br>
                        """)))}),format.raw/*219.26*/("""
                    """),format.raw/*220.21*/("""</div>
                </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          </div>
        </div>
      </div>
    </div>
    
            <!-- Menu Toggle Script -->
            <script>
            $("#menu-toggle").click(function(e) """),format.raw/*232.49*/("""{"""),format.raw/*232.50*/("""
                """),format.raw/*233.17*/("""$("#wrapper").toggleClass("toggled");
            """),format.raw/*234.13*/("""}"""),format.raw/*234.14*/(""");
            </script>
            <script>
            function drop()"""),format.raw/*237.28*/("""{"""),format.raw/*237.29*/("""
                """),format.raw/*238.17*/("""$('.dropdown-toggle').dropdown();                
            """),format.raw/*239.13*/("""}"""),format.raw/*239.14*/("""
            """),format.raw/*240.13*/("""</script>
</body>
</html>


""")))}))}
  }

  def render(teamName:String,teams:java.util.List[Team],tasks:java.util.List[Task],posts:java.util.List[Post],unreadNum:Integer): play.twirl.api.HtmlFormat.Appendable = apply(teamName,teams,tasks,posts,unreadNum)

  def f:((String,java.util.List[Team],java.util.List[Task],java.util.List[Post],Integer) => play.twirl.api.HtmlFormat.Appendable) = (teamName,teams,tasks,posts,unreadNum) => apply(teamName,teams,tasks,posts,unreadNum)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 20:12:31 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/teamPage.scala.html
                  HASH: d14e6ddf0a85e91ccb1c0e8875634685b3f73194
                  MATRIX: 797->1|1015->130|1043->133|1065->147|1104->149|1131->150|1437->430|1451->436|1511->475|1594->532|1608->538|1679->588|1763->645|1778->651|1845->696|1929->753|1944->759|2014->807|2098->864|2113->870|2189->924|2241->949|2256->955|2322->1000|2383->1034|2398->1040|2467->1088|3468->2061|3499->2070|3689->2233|3766->2294|3806->2296|3867->2329|3936->2371|3951->2377|4018->2434|4059->2436|4124->2473|4190->2512|4203->2516|4233->2525|4262->2526|4359->2592|4420->2625|4486->2660|4543->2690|4622->2753|4662->2755|4723->2788|4833->2871|4848->2877|4912->2932|4953->2934|5018->2971|5082->3008|5096->3013|5127->3023|5168->3036|5183->3041|5213->3049|5300->3105|5361->3138|5427->3173|5484->3203|5567->3270|5607->3272|5668->3305|5737->3347|5752->3353|5821->3412|5862->3414|5927->3451|5991->3488|6007->3495|6038->3505|6079->3518|6096->3525|6126->3533|6213->3589|6274->3622|6340->3657|6397->3686|6929->4191|7005->4251|7044->4252|7097->4277|7162->4315|7177->4321|7238->4373|7278->4375|7339->4408|7536->4577|7547->4578|7579->4588|7670->4652|7680->4653|7710->4662|7801->4726|7811->4727|7842->4737|7931->4799|7941->4800|7970->4808|8074->4881|8131->4910|8218->4966|8267->4987|8418->5111|8447->5119|8481->5127|8495->5133|8541->5170|8581->5172|8609->5173|8694->5228|8723->5230|9005->5484|9040->5502|9081->5504|9136->5530|9273->5639|9287->5643|9321->5655|9367->5672|9422->5699|9438->5705|9510->5767|9551->5769|9597->5786|9680->5837|9722->5850|9781->5877|9819->5887|9835->5893|9894->5942|9935->5944|9977->5957|10131->6079|10168->6088|11192->7084|11208->7090|11260->7119|11354->7185|11385->7206|11425->7207|11479->7232|11645->7366|11695->7388|11730->7406|11771->7408|11826->7435|11923->7521|11974->7532|12032->7561|12104->7605|12131->7610|12178->7629|12193->7633|12225->7642|12307->7696|12321->7700|12352->7709|12420->7749|12525->7843|12575->7853|12637->7886|12684->7905|12710->7909|12782->7949|12840->7978|12906->8012|12960->8034|13020->8065|13431->8448|13447->8454|13499->8483|13592->8548|13623->8569|13663->8570|13717->8595|13883->8729|13933->8751|13968->8769|14009->8771|14063->8796|14169->8873|14184->8877|14216->8886|14352->8994|14366->8998|14397->9007|14461->9043|14566->9137|14616->9147|14678->9180|14725->9199|14751->9203|14819->9239|14873->9264|14931->9290|14977->9307|15660->9962|15676->9968|15724->10006|15765->10008|15823->10037|16153->10335|16203->10356|17056->11181|17072->11187|17120->11225|17161->11227|17219->11256|17549->11554|17599->11575|17976->11923|18006->11924|18052->11941|18131->11991|18161->11992|18263->12065|18293->12066|18339->12083|18430->12145|18460->12146|18502->12159
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|59->31|59->31|61->33|61->33|61->33|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|64->36|64->36|65->37|66->38|67->39|68->40|68->40|68->40|69->41|71->43|71->43|71->43|71->43|72->44|72->44|72->44|72->44|72->44|72->44|72->44|73->45|74->46|75->47|76->48|76->48|76->48|77->49|78->50|78->50|78->50|78->50|79->51|79->51|79->51|79->51|79->51|79->51|79->51|80->52|81->53|82->54|83->55|100->72|100->72|100->72|101->73|102->74|102->74|102->74|102->74|103->75|104->76|104->76|104->76|105->77|105->77|105->77|106->78|106->78|106->78|107->79|107->79|107->79|109->81|110->82|112->84|113->85|119->91|119->91|121->93|121->93|121->93|121->93|122->94|123->95|125->97|129->101|129->101|129->101|131->103|133->105|133->105|133->105|134->106|135->107|135->107|135->107|135->107|136->108|137->109|138->110|140->112|141->113|141->113|141->113|141->113|142->114|144->116|145->117|162->134|162->134|162->134|164->136|164->136|164->136|165->137|167->139|168->140|168->140|168->140|170->142|170->142|170->142|171->143|171->143|171->143|171->143|171->143|171->143|172->144|172->144|172->144|173->145|173->145|173->145|174->146|174->146|174->146|175->147|176->148|177->149|178->150|179->151|184->156|184->156|184->156|186->158|186->158|186->158|187->159|189->161|190->162|190->162|190->162|191->163|191->163|191->163|191->163|193->165|193->165|193->165|194->166|194->166|194->166|195->167|195->167|195->167|196->168|197->169|198->170|199->171|216->188|216->188|216->188|216->188|217->189|220->192|221->193|243->215|243->215|243->215|243->215|244->216|247->219|248->220|260->232|260->232|261->233|262->234|262->234|265->237|265->237|266->238|267->239|267->239|268->240
                  -- GENERATED --
              */
          