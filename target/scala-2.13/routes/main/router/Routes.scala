// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/amr.gaballah/Documents/Tweety/Tweety/conf/routes
// @DATE:Tue Mar 02 10:30:25 EET 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_0: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_0: controllers.HomeController
  ) = this(errorHandler, HomeController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(index:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """list""", """controllers.HomeController.list"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[String]),
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_HomeController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("list")))
  )
  private[this] lazy val controllers_HomeController_list1_invoker = createInvoker(
    HomeController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "list",
      Nil,
      "GET",
      this.prefix + """list""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_index0_route(params@_) =>
      call(params.fromQuery[String]("index", None)) { (index) =>
        controllers_HomeController_index0_invoker.call(HomeController_0.index(index))
      }
  
    // @LINE:2
    case controllers_HomeController_list1_route(params@_) =>
      call { 
        controllers_HomeController_list1_invoker.call(HomeController_0.list)
      }
  }
}
