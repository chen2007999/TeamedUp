// @SOURCE:/Users/apple/Desktop/tmdUp/conf/routes
// @HASH:3e69a8f56db6e9ffda448bc9ff31ecf44e4097c2
// @DATE:Thu Jun 11 19:30:05 BST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:78
// @LINE:76
// @LINE:74
// @LINE:72
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:59
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {


// @LINE:9
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:78
// @LINE:76
// @LINE:74
// @LINE:72
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:59
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:51
def redirectUnreadTask(taskId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "redirectUnreadTask/" + implicitly[PathBindable[Long]].unbind("taskId", taskId))
}
                        

// @LINE:53
def redirectUnreadEvent(eventId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "redirectUnreadEvent/" + implicitly[PathBindable[Long]].unbind("eventId", eventId))
}
                        

// @LINE:46
def markTaskAsDoing(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "markTaskAsDoing")
}
                        

// @LINE:42
def taskPage(taskName:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "taskPage/" + implicitly[PathBindable[String]].unbind("taskName", dynamicString(taskName)))
}
                        

// @LINE:45
def markTaskAsDone(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "markTaskAsDone")
}
                        

// @LINE:22
def logIn(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "logIn")
}
                        

// @LINE:69
def updateImage(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "updateImage")
}
                        

// @LINE:28
def landing(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "landing")
}
                        

// @LINE:15
def createUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createUser")
}
                        

// @LINE:76
def showEventInfo(eventName:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "showEventInfo/" + implicitly[PathBindable[String]].unbind("eventName", dynamicString(eventName)))
}
                        

// @LINE:63
def profile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                        

// @LINE:44
def createComment(currentTaskId:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createComment/" + implicitly[PathBindable[Long]].unbind("currentTaskId", currentTaskId))
}
                        

// @LINE:74
def commonTimeList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "commonTimeList")
}
                        

// @LINE:41
def createTask(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createTask")
}
                        

// @LINE:57
def deleteUserFromEventList(email:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deleteUserFromEventList/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:37
def deleteUserFromTeam(email:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deleteUserFromTeam/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/delete")
}
                        

// @LINE:25
def register(error:String = ""): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "register" + queryString(List(if(error == "") None else Some(implicitly[QueryStringBindable[String]].unbind("error", error)))))
}
                        

// @LINE:55
def createEvent(startTime:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createEvent/" + implicitly[PathBindable[String]].unbind("startTime", dynamicString(startTime)))
}
                        

// @LINE:18
def deleteUserFromDB(email:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deleteUser/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/delete")
}
                        

// @LINE:72
def chooseCommonTime(slot:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "chooseCommonTime/" + implicitly[PathBindable[String]].unbind("slot", dynamicString(slot)))
}
                        

// @LINE:48
def unreadPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unreadPage")
}
                        

// @LINE:36
def addUserToTeam(teamName:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addUserToTeam/" + implicitly[PathBindable[String]].unbind("teamName", dynamicString(teamName)))
}
                        

// @LINE:59
def test(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                        

// @LINE:61
def eventPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "eventPage")
}
                        

// @LINE:12
def displayAllUsersFromDB(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clients")
}
                        

// @LINE:78
def dailySchedule(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dailySchedule")
}
                        

// @LINE:38
def teamPage(teamName:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "teamPage/" + implicitly[PathBindable[String]].unbind("teamName", dynamicString(teamName)))
}
                        

// @LINE:40
def taskCreationPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "taskCreationPage")
}
                        

// @LINE:67
def postPage(postName:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "postPage/" + implicitly[PathBindable[String]].unbind("postName", dynamicString(postName)))
}
                        

// @LINE:65
def createPost(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createPost")
}
                        

// @LINE:52
def redirectUnreadComment(commentId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "redirectUnreadComment/" + implicitly[PathBindable[Long]].unbind("commentId", commentId))
}
                        

// @LINE:35
def createTeam(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createTeam")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:56
def addUserToEvent(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addUserToEvent")
}
                        

// @LINE:29
def mainPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mainPage")
}
                        

}
                          
}
                  


// @LINE:78
// @LINE:76
// @LINE:74
// @LINE:72
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:59
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
class ReverseAssets {


// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:78
// @LINE:76
// @LINE:74
// @LINE:72
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:59
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:51
def redirectUnreadTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.redirectUnreadTask",
   """
      function(taskId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "redirectUnreadTask/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("taskId", taskId)})
      }
   """
)
                        

// @LINE:53
def redirectUnreadEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.redirectUnreadEvent",
   """
      function(eventId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "redirectUnreadEvent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("eventId", eventId)})
      }
   """
)
                        

// @LINE:46
def markTaskAsDoing : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.markTaskAsDoing",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "markTaskAsDoing"})
      }
   """
)
                        

// @LINE:42
def taskPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.taskPage",
   """
      function(taskName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskPage/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("taskName", encodeURIComponent(taskName))})
      }
   """
)
                        

// @LINE:45
def markTaskAsDone : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.markTaskAsDone",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "markTaskAsDone"})
      }
   """
)
                        

// @LINE:22
def logIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logIn",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logIn"})
      }
   """
)
                        

// @LINE:69
def updateImage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateImage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateImage"})
      }
   """
)
                        

// @LINE:28
def landing : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.landing",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "landing"})
      }
   """
)
                        

// @LINE:15
def createUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createUser"})
      }
   """
)
                        

// @LINE:76
def showEventInfo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showEventInfo",
   """
      function(eventName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showEventInfo/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("eventName", encodeURIComponent(eventName))})
      }
   """
)
                        

// @LINE:63
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:44
def createComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createComment",
   """
      function(currentTaskId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createComment/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("currentTaskId", currentTaskId)})
      }
   """
)
                        

// @LINE:74
def commonTimeList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.commonTimeList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "commonTimeList"})
      }
   """
)
                        

// @LINE:41
def createTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createTask",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createTask"})
      }
   """
)
                        

// @LINE:57
def deleteUserFromEventList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteUserFromEventList",
   """
      function(email) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUserFromEventList/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:37
def deleteUserFromTeam : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteUserFromTeam",
   """
      function(email) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUserFromTeam/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/delete"})
      }
   """
)
                        

// @LINE:25
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function(error) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register" + _qS([(error == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("error", error))])})
      }
   """
)
                        

// @LINE:55
def createEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createEvent",
   """
      function(startTime) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createEvent/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("startTime", encodeURIComponent(startTime))})
      }
   """
)
                        

// @LINE:18
def deleteUserFromDB : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteUserFromDB",
   """
      function(email) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/delete"})
      }
   """
)
                        

// @LINE:72
def chooseCommonTime : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.chooseCommonTime",
   """
      function(slot) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chooseCommonTime/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("slot", encodeURIComponent(slot))})
      }
   """
)
                        

// @LINE:48
def unreadPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.unreadPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unreadPage"})
      }
   """
)
                        

// @LINE:36
def addUserToTeam : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addUserToTeam",
   """
      function(teamName) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUserToTeam/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("teamName", encodeURIComponent(teamName))})
      }
   """
)
                        

// @LINE:59
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.test",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        

// @LINE:61
def eventPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.eventPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eventPage"})
      }
   """
)
                        

// @LINE:12
def displayAllUsersFromDB : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.displayAllUsersFromDB",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clients"})
      }
   """
)
                        

// @LINE:78
def dailySchedule : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.dailySchedule",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dailySchedule"})
      }
   """
)
                        

// @LINE:38
def teamPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.teamPage",
   """
      function(teamName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teamPage/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("teamName", encodeURIComponent(teamName))})
      }
   """
)
                        

// @LINE:40
def taskCreationPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.taskCreationPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskCreationPage"})
      }
   """
)
                        

// @LINE:67
def postPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postPage",
   """
      function(postName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "postPage/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("postName", encodeURIComponent(postName))})
      }
   """
)
                        

// @LINE:65
def createPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createPost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createPost"})
      }
   """
)
                        

// @LINE:52
def redirectUnreadComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.redirectUnreadComment",
   """
      function(commentId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "redirectUnreadComment/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("commentId", commentId)})
      }
   """
)
                        

// @LINE:35
def createTeam : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createTeam",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createTeam"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:56
def addUserToEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addUserToEvent",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUserToEvent"})
      }
   """
)
                        

// @LINE:29
def mainPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.mainPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mainPage"})
      }
   """
)
                        

}
              
}
        


// @LINE:78
// @LINE:76
// @LINE:74
// @LINE:72
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:59
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {


// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:78
// @LINE:76
// @LINE:74
// @LINE:72
// @LINE:69
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:59
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:51
def redirectUnreadTask(taskId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.redirectUnreadTask(taskId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectUnreadTask", Seq(classOf[Long]), "GET", """""", _prefix + """redirectUnreadTask/$taskId<[^/]+>""")
)
                      

// @LINE:53
def redirectUnreadEvent(eventId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.redirectUnreadEvent(eventId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectUnreadEvent", Seq(classOf[Long]), "GET", """""", _prefix + """redirectUnreadEvent/$eventId<[^/]+>""")
)
                      

// @LINE:46
def markTaskAsDoing(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.markTaskAsDoing(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "markTaskAsDoing", Seq(), "GET", """""", _prefix + """markTaskAsDoing""")
)
                      

// @LINE:42
def taskPage(taskName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.taskPage(taskName), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "taskPage", Seq(classOf[String]), "GET", """""", _prefix + """taskPage/$taskName<[^/]+>""")
)
                      

// @LINE:45
def markTaskAsDone(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.markTaskAsDone(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "markTaskAsDone", Seq(), "GET", """""", _prefix + """markTaskAsDone""")
)
                      

// @LINE:22
def logIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logIn(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logIn", Seq(), "POST", """ Check client's login information and determines success or failure""", _prefix + """logIn""")
)
                      

// @LINE:69
def updateImage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateImage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateImage", Seq(), "POST", """""", _prefix + """updateImage""")
)
                      

// @LINE:28
def landing(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.landing(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "landing", Seq(), "GET", """ Diaplay the landing page""", _prefix + """landing""")
)
                      

// @LINE:15
def createUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createUser", Seq(), "POST", """ Add a new client to database""", _prefix + """createUser""")
)
                      

// @LINE:76
def showEventInfo(eventName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showEventInfo(eventName), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showEventInfo", Seq(classOf[String]), "GET", """""", _prefix + """showEventInfo/$eventName<[^/]+>""")
)
                      

// @LINE:63
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:44
def createComment(currentTaskId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createComment(currentTaskId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createComment", Seq(classOf[Long]), "POST", """""", _prefix + """createComment/$currentTaskId<[^/]+>""")
)
                      

// @LINE:74
def commonTimeList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.commonTimeList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "commonTimeList", Seq(), "GET", """""", _prefix + """commonTimeList""")
)
                      

// @LINE:41
def createTask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createTask(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createTask", Seq(), "POST", """""", _prefix + """createTask""")
)
                      

// @LINE:57
def deleteUserFromEventList(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteUserFromEventList(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteUserFromEventList", Seq(classOf[String]), "POST", """""", _prefix + """deleteUserFromEventList/$email<[^/]+>""")
)
                      

// @LINE:37
def deleteUserFromTeam(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteUserFromTeam(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteUserFromTeam", Seq(classOf[String]), "POST", """""", _prefix + """deleteUserFromTeam/$email<[^/]+>/delete""")
)
                      

// @LINE:25
def register(error:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(error), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Seq(classOf[String]), "GET", """ Take client's registration information and create a new account""", _prefix + """register""")
)
                      

// @LINE:55
def createEvent(startTime:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createEvent(startTime), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createEvent", Seq(classOf[String]), "POST", """""", _prefix + """createEvent/$startTime<[^/]+>""")
)
                      

// @LINE:18
def deleteUserFromDB(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteUserFromDB(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteUserFromDB", Seq(classOf[String]), "POST", """ Delete a registered client from database""", _prefix + """deleteUser/$email<[^/]+>/delete""")
)
                      

// @LINE:72
def chooseCommonTime(slot:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.chooseCommonTime(slot), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "chooseCommonTime", Seq(classOf[String]), "GET", """""", _prefix + """chooseCommonTime/$slot<[^/]+>""")
)
                      

// @LINE:48
def unreadPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.unreadPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "unreadPage", Seq(), "GET", """""", _prefix + """unreadPage""")
)
                      

// @LINE:36
def addUserToTeam(teamName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addUserToTeam(teamName), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addUserToTeam", Seq(classOf[String]), "POST", """""", _prefix + """addUserToTeam/$teamName<[^/]+>""")
)
                      

// @LINE:59
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.test(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "test", Seq(), "GET", """""", _prefix + """test""")
)
                      

// @LINE:61
def eventPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.eventPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "eventPage", Seq(), "GET", """""", _prefix + """eventPage""")
)
                      

// @LINE:12
def displayAllUsersFromDB(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.displayAllUsersFromDB(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "displayAllUsersFromDB", Seq(), "GET", """ Display all clients in the database""", _prefix + """clients""")
)
                      

// @LINE:78
def dailySchedule(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.dailySchedule(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "dailySchedule", Seq(), "GET", """""", _prefix + """dailySchedule""")
)
                      

// @LINE:38
def teamPage(teamName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.teamPage(teamName), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "teamPage", Seq(classOf[String]), "GET", """""", _prefix + """teamPage/$teamName<[^/]+>""")
)
                      

// @LINE:40
def taskCreationPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.taskCreationPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "taskCreationPage", Seq(), "GET", """""", _prefix + """taskCreationPage""")
)
                      

// @LINE:67
def postPage(postName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postPage(postName), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "postPage", Seq(classOf[String]), "GET", """""", _prefix + """postPage/$postName<[^/]+>""")
)
                      

// @LINE:65
def createPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createPost(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createPost", Seq(), "POST", """""", _prefix + """createPost""")
)
                      

// @LINE:52
def redirectUnreadComment(commentId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.redirectUnreadComment(commentId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectUnreadComment", Seq(classOf[Long]), "GET", """""", _prefix + """redirectUnreadComment/$commentId<[^/]+>""")
)
                      

// @LINE:35
def createTeam(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createTeam(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createTeam", Seq(), "POST", """""", _prefix + """createTeam""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:56
def addUserToEvent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addUserToEvent(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addUserToEvent", Seq(), "POST", """""", _prefix + """addUserToEvent""")
)
                      

// @LINE:29
def mainPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mainPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "mainPage", Seq(), "GET", """""", _prefix + """mainPage""")
)
                      

}
                          
}
        
    