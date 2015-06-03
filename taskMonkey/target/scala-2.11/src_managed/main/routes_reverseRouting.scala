// @SOURCE:/Users/apple/Desktop/productivity/productivity/conf/routes
// @HASH:7e6da18e1c2d71fcf715056bbd01529ffaa0d036
// @DATE:Tue Jun 02 23:40:31 BST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:56
// @LINE:55
// @LINE:54
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
                          

// @LINE:56
// @LINE:55
// @LINE:54
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
                        

// @LINE:28
def landing(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "landing")
}
                        

// @LINE:54
def createEventPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "createEventPage")
}
                        

// @LINE:15
def createUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createUser")
}
                        

// @LINE:44
def createComment(currentTaskId:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createComment/" + implicitly[PathBindable[Long]].unbind("currentTaskId", currentTaskId))
}
                        

// @LINE:41
def createTask(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createTask")
}
                        

// @LINE:37
def deleteUserFromTeam(email:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deleteUserFromTeam/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/delete")
}
                        

// @LINE:55
def createEvent(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createEvent")
}
                        

// @LINE:18
def deleteUserFromDB(email:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deleteUser/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/delete")
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
                        

// @LINE:25
def register(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                        

// @LINE:12
def displayAllUsersFromDB(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users")
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
                  


// @LINE:56
// @LINE:55
// @LINE:54
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
              

// @LINE:56
// @LINE:55
// @LINE:54
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
                        

// @LINE:28
def landing : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.landing",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "landing"})
      }
   """
)
                        

// @LINE:54
def createEventPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createEventPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createEventPage"})
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
                        

// @LINE:44
def createComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createComment",
   """
      function(currentTaskId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createComment/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("currentTaskId", currentTaskId)})
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
                        

// @LINE:37
def deleteUserFromTeam : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteUserFromTeam",
   """
      function(email) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUserFromTeam/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/delete"})
      }
   """
)
                        

// @LINE:55
def createEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createEvent",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createEvent"})
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
                        

// @LINE:25
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:12
def displayAllUsersFromDB : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.displayAllUsersFromDB",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
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
        


// @LINE:56
// @LINE:55
// @LINE:54
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
                          

// @LINE:56
// @LINE:55
// @LINE:54
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
   controllers.Application.logIn(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logIn", Seq(), "POST", """ Check user's login information and determines success or failure""", _prefix + """logIn""")
)
                      

// @LINE:28
def landing(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.landing(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "landing", Seq(), "GET", """ Diaplay the landing page""", _prefix + """landing""")
)
                      

// @LINE:54
def createEventPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createEventPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createEventPage", Seq(), "GET", """""", _prefix + """createEventPage""")
)
                      

// @LINE:15
def createUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createUser", Seq(), "POST", """ Add a new user to database""", _prefix + """createUser""")
)
                      

// @LINE:44
def createComment(currentTaskId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createComment(currentTaskId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createComment", Seq(classOf[Long]), "POST", """""", _prefix + """createComment/$currentTaskId<[^/]+>""")
)
                      

// @LINE:41
def createTask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createTask(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createTask", Seq(), "POST", """""", _prefix + """createTask""")
)
                      

// @LINE:37
def deleteUserFromTeam(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteUserFromTeam(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteUserFromTeam", Seq(classOf[String]), "POST", """""", _prefix + """deleteUserFromTeam/$email<[^/]+>/delete""")
)
                      

// @LINE:55
def createEvent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createEvent(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createEvent", Seq(), "POST", """""", _prefix + """createEvent""")
)
                      

// @LINE:18
def deleteUserFromDB(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteUserFromDB(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteUserFromDB", Seq(classOf[String]), "POST", """ Delete a registered user from database""", _prefix + """deleteUser/$email<[^/]+>/delete""")
)
                      

// @LINE:48
def unreadPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.unreadPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "unreadPage", Seq(), "GET", """""", _prefix + """unreadPage""")
)
                      

// @LINE:36
def addUserToTeam(teamName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addUserToTeam(teamName), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addUserToTeam", Seq(classOf[String]), "POST", """""", _prefix + """addUserToTeam/$teamName<[^/]+>""")
)
                      

// @LINE:25
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Seq(), "GET", """ Take user's registration information and create a new account""", _prefix + """register""")
)
                      

// @LINE:12
def displayAllUsersFromDB(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.displayAllUsersFromDB(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "displayAllUsersFromDB", Seq(), "GET", """ Display all users in the database""", _prefix + """users""")
)
                      

// @LINE:38
def teamPage(teamName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.teamPage(teamName), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "teamPage", Seq(classOf[String]), "GET", """""", _prefix + """teamPage/$teamName<[^/]+>""")
)
                      

// @LINE:40
def taskCreationPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.taskCreationPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "taskCreationPage", Seq(), "GET", """""", _prefix + """taskCreationPage""")
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
        
    