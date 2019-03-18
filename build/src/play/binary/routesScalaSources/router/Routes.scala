// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mapsi/Development/Repositories/bee-effect-ms/bee-effect-team-ms/conf/routes
// @DATE:Sun Mar 10 23:52:09 CLST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  TeamController_0: controllers.TeamController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    TeamController_0: controllers.TeamController
  ) = this(errorHandler, TeamController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, TeamController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teams""", """controllers.TeamController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teams/""" + "$" + """id<[^/]+>""", """controllers.TeamController.show(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_TeamController_list0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teams")))
  )
  private[this] lazy val controllers_TeamController_list0_invoker = createInvoker(
    TeamController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TeamController",
      "list",
      Nil,
      "GET",
      this.prefix + """teams""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_TeamController_show1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teams/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TeamController_show1_invoker = createInvoker(
    TeamController_0.show(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TeamController",
      "show",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """teams/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_TeamController_list0_route(params@_) =>
      call { 
        controllers_TeamController_list0_invoker.call(TeamController_0.list)
      }
  
    // @LINE:8
    case controllers_TeamController_show1_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TeamController_show1_invoker.call(TeamController_0.show(id))
      }
  }
}
