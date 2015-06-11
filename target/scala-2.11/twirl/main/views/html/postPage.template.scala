
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
object postPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Post,java.util.List[Comment],String,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post : Post, comments : java.util.List[Comment], teamName : String, unreadNum :Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.90*/("""

"""),_display_(/*3.2*/main(post.postName)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

    """),format.raw/*5.5*/("""<head>
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

<body onload="description()">
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
<script>
    function description()"""),format.raw/*92.27*/("""{"""),format.raw/*92.28*/("""
        """),format.raw/*93.9*/("""var text = """"),_display_(/*93.22*/post/*93.26*/.content),format.raw/*93.34*/("""";
        var $descr = $("#descr");
        $("#descr").html(htmlDecode(text));
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/("""
    """),format.raw/*97.5*/("""function htmlDecode(input)"""),format.raw/*97.31*/("""{"""),format.raw/*97.32*/("""
        """),format.raw/*98.9*/("""var e = document.createElement('div');
        e.innerHTML = input;
        return e.childNodes[0].nodeValue;
    """),format.raw/*101.5*/("""}"""),format.raw/*101.6*/("""
"""),format.raw/*102.1*/("""</script>
<div class="container well" style="margin-top: 20px;" align="center">
    <h2>Post Name: """),_display_(/*104.21*/post/*104.25*/.postName),format.raw/*104.34*/(""" """),format.raw/*104.35*/("""</h2>
    <div class="well well-small" id="descr"></div>
</div>


<div class="container well well-small">

"""),_display_(/*111.2*/helper/*111.8*/.form(routes.Application.teamPage(teamName))/*111.52*/ {_display_(Seq[Any](format.raw/*111.54*/("""
"""),format.raw/*112.1*/("""<button type="submit">Go back</button><br>
""")))}),format.raw/*113.2*/("""
"""),format.raw/*114.1*/("""</div>
                <!-- Menu Toggle Script -->
        <script>
        $("#menu-toggle").click(function(e) """),format.raw/*117.45*/("""{"""),format.raw/*117.46*/("""
            """),format.raw/*118.13*/("""$("#wrapper").toggleClass("toggled");
        """),format.raw/*119.9*/("""}"""),format.raw/*119.10*/(""");
        </script>
        <!-- DropDown -->
        <script>$('.dropdown-toggle').dropdown()</script>
</body>



""")))}))}
  }

  def render(post:Post,comments:java.util.List[Comment],teamName:String,unreadNum:Integer): play.twirl.api.HtmlFormat.Appendable = apply(post,comments,teamName,unreadNum)

  def f:((Post,java.util.List[Comment],String,Integer) => play.twirl.api.HtmlFormat.Appendable) = (post,comments,teamName,unreadNum) => apply(post,comments,teamName,unreadNum)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 20:12:30 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/postPage.scala.html
                  HASH: 8ce93badf84910c039972b38adb8313483e3f82e
                  MATRIX: 763->1|939->89|967->92|994->111|1033->113|1065->119|1351->379|1365->385|1425->424|1508->481|1522->487|1593->537|1677->594|1692->600|1759->645|1843->702|1858->708|1928->756|2012->813|2027->819|2103->873|2155->898|2170->904|2236->949|2297->983|2312->989|2381->1037|3365->1993|3396->2002|3586->2165|3663->2226|3703->2228|3764->2261|3833->2303|3848->2309|3915->2366|3956->2368|4021->2405|4087->2444|4100->2448|4130->2457|4159->2458|4256->2524|4317->2557|4383->2592|4440->2622|4519->2685|4559->2687|4620->2720|4730->2803|4745->2809|4809->2864|4850->2866|4915->2903|4979->2940|4993->2945|5024->2955|5065->2968|5080->2973|5110->2981|5197->3037|5258->3070|5324->3105|5381->3135|5464->3202|5504->3204|5565->3237|5634->3279|5649->3285|5718->3344|5759->3346|5824->3383|5888->3420|5904->3427|5935->3437|5976->3450|5993->3457|6023->3465|6110->3521|6171->3554|6237->3589|6294->3618|6874->4171|6950->4231|6989->4232|7042->4257|7136->4324|7151->4330|7212->4382|7252->4384|7313->4417|7510->4586|7521->4587|7553->4597|7644->4661|7654->4662|7684->4671|7775->4735|7785->4736|7816->4746|7905->4808|7915->4809|7944->4817|8048->4890|8105->4919|8192->4975|8241->4996|8367->5094|8396->5095|8432->5104|8472->5117|8485->5121|8514->5129|8626->5214|8654->5215|8686->5220|8740->5246|8769->5247|8805->5256|8947->5370|8976->5371|9005->5372|9133->5472|9147->5476|9178->5485|9208->5486|9343->5594|9358->5600|9412->5644|9453->5646|9482->5647|9557->5691|9586->5692|9727->5804|9757->5805|9799->5818|9873->5864|9903->5865
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|59->31|59->31|61->33|61->33|61->33|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|64->36|64->36|65->37|66->38|67->39|68->40|68->40|68->40|69->41|71->43|71->43|71->43|71->43|72->44|72->44|72->44|72->44|72->44|72->44|72->44|73->45|74->46|75->47|76->48|76->48|76->48|77->49|78->50|78->50|78->50|78->50|79->51|79->51|79->51|79->51|79->51|79->51|79->51|80->52|81->53|82->54|83->55|101->73|101->73|101->73|102->74|104->76|104->76|104->76|104->76|105->77|106->78|106->78|106->78|107->79|107->79|107->79|108->80|108->80|108->80|109->81|109->81|109->81|111->83|112->84|114->86|115->87|120->92|120->92|121->93|121->93|121->93|121->93|124->96|124->96|125->97|125->97|125->97|126->98|129->101|129->101|130->102|132->104|132->104|132->104|132->104|139->111|139->111|139->111|139->111|140->112|141->113|142->114|145->117|145->117|146->118|147->119|147->119
                  -- GENERATED --
              */
          