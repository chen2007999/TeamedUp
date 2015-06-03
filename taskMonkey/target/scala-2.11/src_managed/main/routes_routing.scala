// @SOURCE:/Users/apple/Desktop/productivity/productivity/conf/routes
// @HASH:7e6da18e1c2d71fcf715056bbd01529ffaa0d036
// @DATE:Tue Jun 02 23:40:31 BST 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:12
private[this] lazy val controllers_Application_displayAllUsersFromDB2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
private[this] lazy val controllers_Application_displayAllUsersFromDB2_invoker = createInvoker(
controllers.Application.displayAllUsersFromDB(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "displayAllUsersFromDB", Nil,"GET", """ Display all users in the database""", Routes.prefix + """users"""))
        

// @LINE:15
private[this] lazy val controllers_Application_createUser3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createUser"))))
private[this] lazy val controllers_Application_createUser3_invoker = createInvoker(
controllers.Application.createUser(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createUser", Nil,"POST", """ Add a new user to database""", Routes.prefix + """createUser"""))
        

// @LINE:18
private[this] lazy val controllers_Application_deleteUserFromDB4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteUser/"),DynamicPart("email", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_Application_deleteUserFromDB4_invoker = createInvoker(
controllers.Application.deleteUserFromDB(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteUserFromDB", Seq(classOf[String]),"POST", """ Delete a registered user from database""", Routes.prefix + """deleteUser/$email<[^/]+>/delete"""))
        

// @LINE:22
private[this] lazy val controllers_Application_logIn5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logIn"))))
private[this] lazy val controllers_Application_logIn5_invoker = createInvoker(
controllers.Application.logIn(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logIn", Nil,"POST", """ Check user's login information and determines success or failure""", Routes.prefix + """logIn"""))
        

// @LINE:25
private[this] lazy val controllers_Application_register6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
private[this] lazy val controllers_Application_register6_invoker = createInvoker(
controllers.Application.register(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Nil,"GET", """ Take user's registration information and create a new account""", Routes.prefix + """register"""))
        

// @LINE:28
private[this] lazy val controllers_Application_landing7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("landing"))))
private[this] lazy val controllers_Application_landing7_invoker = createInvoker(
controllers.Application.landing(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "landing", Nil,"GET", """ Diaplay the landing page""", Routes.prefix + """landing"""))
        

// @LINE:29
private[this] lazy val controllers_Application_mainPage8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mainPage"))))
private[this] lazy val controllers_Application_mainPage8_invoker = createInvoker(
controllers.Application.mainPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "mainPage", Nil,"GET", """""", Routes.prefix + """mainPage"""))
        

// @LINE:35
private[this] lazy val controllers_Application_createTeam9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createTeam"))))
private[this] lazy val controllers_Application_createTeam9_invoker = createInvoker(
controllers.Application.createTeam(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createTeam", Nil,"POST", """""", Routes.prefix + """createTeam"""))
        

// @LINE:36
private[this] lazy val controllers_Application_addUserToTeam10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addUserToTeam/"),DynamicPart("teamName", """[^/]+""",true))))
private[this] lazy val controllers_Application_addUserToTeam10_invoker = createInvoker(
controllers.Application.addUserToTeam(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addUserToTeam", Seq(classOf[String]),"POST", """""", Routes.prefix + """addUserToTeam/$teamName<[^/]+>"""))
        

// @LINE:37
private[this] lazy val controllers_Application_deleteUserFromTeam11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteUserFromTeam/"),DynamicPart("email", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_Application_deleteUserFromTeam11_invoker = createInvoker(
controllers.Application.deleteUserFromTeam(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteUserFromTeam", Seq(classOf[String]),"POST", """""", Routes.prefix + """deleteUserFromTeam/$email<[^/]+>/delete"""))
        

// @LINE:38
private[this] lazy val controllers_Application_teamPage12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teamPage/"),DynamicPart("teamName", """[^/]+""",true))))
private[this] lazy val controllers_Application_teamPage12_invoker = createInvoker(
controllers.Application.teamPage(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "teamPage", Seq(classOf[String]),"GET", """""", Routes.prefix + """teamPage/$teamName<[^/]+>"""))
        

// @LINE:40
private[this] lazy val controllers_Application_taskCreationPage13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taskCreationPage"))))
private[this] lazy val controllers_Application_taskCreationPage13_invoker = createInvoker(
controllers.Application.taskCreationPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "taskCreationPage", Nil,"GET", """""", Routes.prefix + """taskCreationPage"""))
        

// @LINE:41
private[this] lazy val controllers_Application_createTask14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createTask"))))
private[this] lazy val controllers_Application_createTask14_invoker = createInvoker(
controllers.Application.createTask(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createTask", Nil,"POST", """""", Routes.prefix + """createTask"""))
        

// @LINE:42
private[this] lazy val controllers_Application_taskPage15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taskPage/"),DynamicPart("taskName", """[^/]+""",true))))
private[this] lazy val controllers_Application_taskPage15_invoker = createInvoker(
controllers.Application.taskPage(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "taskPage", Seq(classOf[String]),"GET", """""", Routes.prefix + """taskPage/$taskName<[^/]+>"""))
        

// @LINE:44
private[this] lazy val controllers_Application_createComment16_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createComment/"),DynamicPart("currentTaskId", """[^/]+""",true))))
private[this] lazy val controllers_Application_createComment16_invoker = createInvoker(
controllers.Application.createComment(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createComment", Seq(classOf[Long]),"POST", """""", Routes.prefix + """createComment/$currentTaskId<[^/]+>"""))
        

// @LINE:45
private[this] lazy val controllers_Application_markTaskAsDone17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("markTaskAsDone"))))
private[this] lazy val controllers_Application_markTaskAsDone17_invoker = createInvoker(
controllers.Application.markTaskAsDone(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "markTaskAsDone", Nil,"GET", """""", Routes.prefix + """markTaskAsDone"""))
        

// @LINE:46
private[this] lazy val controllers_Application_markTaskAsDoing18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("markTaskAsDoing"))))
private[this] lazy val controllers_Application_markTaskAsDoing18_invoker = createInvoker(
controllers.Application.markTaskAsDoing(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "markTaskAsDoing", Nil,"GET", """""", Routes.prefix + """markTaskAsDoing"""))
        

// @LINE:48
private[this] lazy val controllers_Application_unreadPage19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unreadPage"))))
private[this] lazy val controllers_Application_unreadPage19_invoker = createInvoker(
controllers.Application.unreadPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "unreadPage", Nil,"GET", """""", Routes.prefix + """unreadPage"""))
        

// @LINE:51
private[this] lazy val controllers_Application_redirectUnreadTask20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("redirectUnreadTask/"),DynamicPart("taskId", """[^/]+""",true))))
private[this] lazy val controllers_Application_redirectUnreadTask20_invoker = createInvoker(
controllers.Application.redirectUnreadTask(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectUnreadTask", Seq(classOf[Long]),"GET", """""", Routes.prefix + """redirectUnreadTask/$taskId<[^/]+>"""))
        

// @LINE:52
private[this] lazy val controllers_Application_redirectUnreadComment21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("redirectUnreadComment/"),DynamicPart("commentId", """[^/]+""",true))))
private[this] lazy val controllers_Application_redirectUnreadComment21_invoker = createInvoker(
controllers.Application.redirectUnreadComment(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "redirectUnreadComment", Seq(classOf[Long]),"GET", """""", Routes.prefix + """redirectUnreadComment/$commentId<[^/]+>"""))
        

// @LINE:54
private[this] lazy val controllers_Application_createEventPage22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createEventPage"))))
private[this] lazy val controllers_Application_createEventPage22_invoker = createInvoker(
controllers.Application.createEventPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createEventPage", Nil,"GET", """""", Routes.prefix + """createEventPage"""))
        

// @LINE:55
private[this] lazy val controllers_Application_createEvent23_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createEvent"))))
private[this] lazy val controllers_Application_createEvent23_invoker = createInvoker(
controllers.Application.createEvent(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createEvent", Nil,"POST", """""", Routes.prefix + """createEvent"""))
        

// @LINE:56
private[this] lazy val controllers_Application_addUserToEvent24_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addUserToEvent"))))
private[this] lazy val controllers_Application_addUserToEvent24_invoker = createInvoker(
controllers.Application.addUserToEvent(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addUserToEvent", Nil,"POST", """""", Routes.prefix + """addUserToEvent"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Application.displayAllUsersFromDB()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createUser""","""controllers.Application.createUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteUser/$email<[^/]+>/delete""","""controllers.Application.deleteUserFromDB(email:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logIn""","""controllers.Application.logIn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.register()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """landing""","""controllers.Application.landing()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mainPage""","""controllers.Application.mainPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createTeam""","""controllers.Application.createTeam()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addUserToTeam/$teamName<[^/]+>""","""controllers.Application.addUserToTeam(teamName:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteUserFromTeam/$email<[^/]+>/delete""","""controllers.Application.deleteUserFromTeam(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teamPage/$teamName<[^/]+>""","""controllers.Application.teamPage(teamName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taskCreationPage""","""controllers.Application.taskCreationPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createTask""","""controllers.Application.createTask()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taskPage/$taskName<[^/]+>""","""controllers.Application.taskPage(taskName:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createComment/$currentTaskId<[^/]+>""","""controllers.Application.createComment(currentTaskId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """markTaskAsDone""","""controllers.Application.markTaskAsDone()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """markTaskAsDoing""","""controllers.Application.markTaskAsDoing()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unreadPage""","""controllers.Application.unreadPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """redirectUnreadTask/$taskId<[^/]+>""","""controllers.Application.redirectUnreadTask(taskId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """redirectUnreadComment/$commentId<[^/]+>""","""controllers.Application.redirectUnreadComment(commentId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createEventPage""","""controllers.Application.createEventPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createEvent""","""controllers.Application.createEvent()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addUserToEvent""","""controllers.Application.addUserToEvent()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:9
case controllers_Assets_at1_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:12
case controllers_Application_displayAllUsersFromDB2_route(params) => {
   call { 
        controllers_Application_displayAllUsersFromDB2_invoker.call(controllers.Application.displayAllUsersFromDB())
   }
}
        

// @LINE:15
case controllers_Application_createUser3_route(params) => {
   call { 
        controllers_Application_createUser3_invoker.call(controllers.Application.createUser())
   }
}
        

// @LINE:18
case controllers_Application_deleteUserFromDB4_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_Application_deleteUserFromDB4_invoker.call(controllers.Application.deleteUserFromDB(email))
   }
}
        

// @LINE:22
case controllers_Application_logIn5_route(params) => {
   call { 
        controllers_Application_logIn5_invoker.call(controllers.Application.logIn())
   }
}
        

// @LINE:25
case controllers_Application_register6_route(params) => {
   call { 
        controllers_Application_register6_invoker.call(controllers.Application.register())
   }
}
        

// @LINE:28
case controllers_Application_landing7_route(params) => {
   call { 
        controllers_Application_landing7_invoker.call(controllers.Application.landing())
   }
}
        

// @LINE:29
case controllers_Application_mainPage8_route(params) => {
   call { 
        controllers_Application_mainPage8_invoker.call(controllers.Application.mainPage())
   }
}
        

// @LINE:35
case controllers_Application_createTeam9_route(params) => {
   call { 
        controllers_Application_createTeam9_invoker.call(controllers.Application.createTeam())
   }
}
        

// @LINE:36
case controllers_Application_addUserToTeam10_route(params) => {
   call(params.fromPath[String]("teamName", None)) { (teamName) =>
        controllers_Application_addUserToTeam10_invoker.call(controllers.Application.addUserToTeam(teamName))
   }
}
        

// @LINE:37
case controllers_Application_deleteUserFromTeam11_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_Application_deleteUserFromTeam11_invoker.call(controllers.Application.deleteUserFromTeam(email))
   }
}
        

// @LINE:38
case controllers_Application_teamPage12_route(params) => {
   call(params.fromPath[String]("teamName", None)) { (teamName) =>
        controllers_Application_teamPage12_invoker.call(controllers.Application.teamPage(teamName))
   }
}
        

// @LINE:40
case controllers_Application_taskCreationPage13_route(params) => {
   call { 
        controllers_Application_taskCreationPage13_invoker.call(controllers.Application.taskCreationPage())
   }
}
        

// @LINE:41
case controllers_Application_createTask14_route(params) => {
   call { 
        controllers_Application_createTask14_invoker.call(controllers.Application.createTask())
   }
}
        

// @LINE:42
case controllers_Application_taskPage15_route(params) => {
   call(params.fromPath[String]("taskName", None)) { (taskName) =>
        controllers_Application_taskPage15_invoker.call(controllers.Application.taskPage(taskName))
   }
}
        

// @LINE:44
case controllers_Application_createComment16_route(params) => {
   call(params.fromPath[Long]("currentTaskId", None)) { (currentTaskId) =>
        controllers_Application_createComment16_invoker.call(controllers.Application.createComment(currentTaskId))
   }
}
        

// @LINE:45
case controllers_Application_markTaskAsDone17_route(params) => {
   call { 
        controllers_Application_markTaskAsDone17_invoker.call(controllers.Application.markTaskAsDone())
   }
}
        

// @LINE:46
case controllers_Application_markTaskAsDoing18_route(params) => {
   call { 
        controllers_Application_markTaskAsDoing18_invoker.call(controllers.Application.markTaskAsDoing())
   }
}
        

// @LINE:48
case controllers_Application_unreadPage19_route(params) => {
   call { 
        controllers_Application_unreadPage19_invoker.call(controllers.Application.unreadPage())
   }
}
        

// @LINE:51
case controllers_Application_redirectUnreadTask20_route(params) => {
   call(params.fromPath[Long]("taskId", None)) { (taskId) =>
        controllers_Application_redirectUnreadTask20_invoker.call(controllers.Application.redirectUnreadTask(taskId))
   }
}
        

// @LINE:52
case controllers_Application_redirectUnreadComment21_route(params) => {
   call(params.fromPath[Long]("commentId", None)) { (commentId) =>
        controllers_Application_redirectUnreadComment21_invoker.call(controllers.Application.redirectUnreadComment(commentId))
   }
}
        

// @LINE:54
case controllers_Application_createEventPage22_route(params) => {
   call { 
        controllers_Application_createEventPage22_invoker.call(controllers.Application.createEventPage())
   }
}
        

// @LINE:55
case controllers_Application_createEvent23_route(params) => {
   call { 
        controllers_Application_createEvent23_invoker.call(controllers.Application.createEvent())
   }
}
        

// @LINE:56
case controllers_Application_addUserToEvent24_route(params) => {
   call { 
        controllers_Application_addUserToEvent24_invoker.call(controllers.Application.addUserToEvent())
   }
}
        
}

}
     