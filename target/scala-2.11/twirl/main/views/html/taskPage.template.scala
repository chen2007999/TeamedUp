
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
object taskPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Task,java.util.List[Comment],String,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task : Task, comments : java.util.List[Comment], teamName : String, unreadNum :Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.90*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
"""),_display_(/*3.2*/main(task.taskName)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

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
        """),format.raw/*93.9*/("""var text = """"),_display_(/*93.22*/task/*93.26*/.content),format.raw/*93.34*/("""";
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
    <h2>Task Name: """),_display_(/*105.21*/task/*105.25*/.taskName),format.raw/*105.34*/(""" """),format.raw/*105.35*/("""</h2>
    <div class="well well-small" id="descr"></div>
    <h2> Status: """),_display_(/*107.19*/task/*107.23*/.status),format.raw/*107.30*/(""" """),format.raw/*107.31*/("""</h2>
    """),_display_(/*108.6*/if(task.status.equals("In Progress"))/*108.43*/{_display_(Seq[Any](format.raw/*108.44*/("""
        """),_display_(/*109.10*/helper/*109.16*/.form(routes.Application.markTaskAsDone())/*109.58*/ {_display_(Seq[Any](format.raw/*109.60*/("""
          """),format.raw/*110.11*/("""<button type="submit">Complete task</button>  
        """)))}),format.raw/*111.10*/("""
    """)))}/*112.7*/else/*112.12*/{_display_(Seq[Any](format.raw/*112.13*/("""
        """),_display_(/*113.10*/helper/*113.16*/.form(routes.Application.markTaskAsDoing())/*113.59*/ {_display_(Seq[Any](format.raw/*113.61*/("""
          """),format.raw/*114.11*/("""<button type="submit">In progress</button>  
        """)))}),format.raw/*115.10*/("""
    """)))}),format.raw/*116.6*/("""
"""),format.raw/*117.1*/("""</div>


<div class="container well well-small">
    """),_display_(/*121.6*/for(comment <- comments) yield /*121.30*/ {_display_(Seq[Any](format.raw/*121.32*/("""
    """),format.raw/*122.5*/("""<div id="comm">
        <img class="img-circle" src="""),_display_(/*123.38*/Client/*123.44*/.getImageByEmail(comment.ownerEmail)),format.raw/*123.80*/(""" """),format.raw/*123.81*/("""id="img-comment">
        <h3 id="comment"> <strong>"""),_display_(/*124.36*/comment/*124.43*/.ownerName),format.raw/*124.53*/(""":</strong>  """),_display_(/*124.66*/comment/*124.73*/.content),format.raw/*124.81*/("""</h3>
    </div>
    """)))}),format.raw/*126.6*/("""


    """),_display_(/*129.6*/helper/*129.12*/.form(routes.Application.createComment(task.taskId))/*129.64*/ {_display_(Seq[Any](format.raw/*129.66*/("""
    """),format.raw/*130.5*/("""<textarea class="messageTextarea" name="content" cols="40" rows="5" placeholder=""></textarea>
    <button type="submit">Comment</button><br>

    """)))}),format.raw/*133.6*/("""

"""),_display_(/*135.2*/helper/*135.8*/.form(routes.Application.teamPage(teamName))/*135.52*/ {_display_(Seq[Any](format.raw/*135.54*/("""
"""),format.raw/*136.1*/("""<button type="submit">Go back</button><br>
""")))}),format.raw/*137.2*/("""
    
"""),format.raw/*139.1*/("""</div>
                <!-- Menu Toggle Script -->
        <script>
        $("#menu-toggle").click(function(e) """),format.raw/*142.45*/("""{"""),format.raw/*142.46*/("""
            """),format.raw/*143.13*/("""$("#wrapper").toggleClass("toggled");
        """),format.raw/*144.9*/("""}"""),format.raw/*144.10*/(""");
        </script>
        <!-- DropDown -->
        <script>$('.dropdown-toggle').dropdown()</script>
</body>
        
""")))}),format.raw/*150.2*/("""
"""),format.raw/*151.1*/("""</html>"""))}
  }

  def render(task:Task,comments:java.util.List[Comment],teamName:String,unreadNum:Integer): play.twirl.api.HtmlFormat.Appendable = apply(task,comments,teamName,unreadNum)

  def f:((Task,java.util.List[Comment],String,Integer) => play.twirl.api.HtmlFormat.Appendable) = (task,comments,teamName,unreadNum) => apply(task,comments,teamName,unreadNum)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 11 20:12:31 BST 2015
                  SOURCE: /Users/apple/Desktop/tmdUp/app/views/taskPage.scala.html
                  HASH: ce92e982f700e1ee1413086c01b13c07753e9270
                  MATRIX: 763->1|939->89|966->90|1008->107|1035->126|1074->128|1106->134|1392->394|1406->400|1466->439|1549->496|1563->502|1634->552|1718->609|1733->615|1800->660|1884->717|1899->723|1969->771|2053->828|2068->834|2144->888|2196->913|2211->919|2277->964|2338->998|2353->1004|2422->1052|3406->2008|3437->2017|3627->2180|3704->2241|3744->2243|3805->2276|3874->2318|3889->2324|3956->2381|3997->2383|4062->2420|4128->2459|4141->2463|4171->2472|4200->2473|4297->2539|4358->2572|4424->2607|4481->2637|4560->2700|4600->2702|4661->2735|4771->2818|4786->2824|4850->2879|4891->2881|4956->2918|5020->2955|5034->2960|5065->2970|5106->2983|5121->2988|5151->2996|5238->3052|5299->3085|5365->3120|5422->3150|5505->3217|5545->3219|5606->3252|5675->3294|5690->3300|5759->3359|5800->3361|5865->3398|5929->3435|5945->3442|5976->3452|6017->3465|6034->3472|6064->3480|6151->3536|6212->3569|6278->3604|6335->3633|6915->4186|6991->4246|7030->4247|7083->4272|7177->4339|7192->4345|7253->4397|7293->4399|7354->4432|7551->4601|7562->4602|7594->4612|7685->4676|7695->4677|7725->4686|7816->4750|7826->4751|7857->4761|7946->4823|7956->4824|7985->4832|8089->4905|8146->4934|8233->4990|8282->5011|8408->5109|8437->5110|8473->5119|8513->5132|8526->5136|8555->5144|8667->5229|8695->5230|8727->5235|8781->5261|8810->5262|8846->5271|8988->5385|9017->5386|9046->5387|9175->5488|9189->5492|9220->5501|9250->5502|9353->5577|9367->5581|9396->5588|9426->5589|9464->5600|9511->5637|9551->5638|9589->5648|9605->5654|9657->5696|9698->5698|9738->5709|9826->5765|9851->5772|9865->5777|9905->5778|9943->5788|9959->5794|10012->5837|10053->5839|10093->5850|10179->5904|10216->5910|10245->5911|10326->5965|10367->5989|10408->5991|10441->5996|10522->6049|10538->6055|10596->6091|10626->6092|10707->6145|10724->6152|10756->6162|10797->6175|10814->6182|10844->6190|10897->6212|10932->6220|10948->6226|11010->6278|11051->6280|11084->6285|11263->6433|11293->6436|11308->6442|11362->6486|11403->6488|11432->6489|11507->6533|11541->6539|11682->6651|11712->6652|11754->6665|11828->6711|11858->6712|12012->6835|12041->6836
                  LINES: 26->1|29->1|30->2|31->3|31->3|31->3|33->5|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|59->31|59->31|61->33|61->33|61->33|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|64->36|64->36|65->37|66->38|67->39|68->40|68->40|68->40|69->41|71->43|71->43|71->43|71->43|72->44|72->44|72->44|72->44|72->44|72->44|72->44|73->45|74->46|75->47|76->48|76->48|76->48|77->49|78->50|78->50|78->50|78->50|79->51|79->51|79->51|79->51|79->51|79->51|79->51|80->52|81->53|82->54|83->55|101->73|101->73|101->73|102->74|104->76|104->76|104->76|104->76|105->77|106->78|106->78|106->78|107->79|107->79|107->79|108->80|108->80|108->80|109->81|109->81|109->81|111->83|112->84|114->86|115->87|120->92|120->92|121->93|121->93|121->93|121->93|124->96|124->96|125->97|125->97|125->97|126->98|129->101|129->101|130->102|133->105|133->105|133->105|133->105|135->107|135->107|135->107|135->107|136->108|136->108|136->108|137->109|137->109|137->109|137->109|138->110|139->111|140->112|140->112|140->112|141->113|141->113|141->113|141->113|142->114|143->115|144->116|145->117|149->121|149->121|149->121|150->122|151->123|151->123|151->123|151->123|152->124|152->124|152->124|152->124|152->124|152->124|154->126|157->129|157->129|157->129|157->129|158->130|161->133|163->135|163->135|163->135|163->135|164->136|165->137|167->139|170->142|170->142|171->143|172->144|172->144|178->150|179->151
                  -- GENERATED --
              */
          