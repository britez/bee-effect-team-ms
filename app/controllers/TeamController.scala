package controllers

import javax.inject._

import play.api.Logger
import play.api._
import play.api.mvc._

import play.api.libs.json._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class TeamController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  private val logger = Logger(getClass)

  case class TeamRepresentation(id:Long, name:String)

  object TeamRepresentation {
    implicit val teamFormat = Json.format[TeamRepresentation]
  }

  def list() = Action { implicit request: Request[AnyContent] =>
    val teamJson: JsValue = Json.toJson(List(TeamRepresentation(id=1, name="Equipo ofertador")))
    Ok(teamJson)
  }

  def show(id:Long) = Action { implicit request: Request[AnyContent] =>
    Ok(Json.toJson(TeamRepresentation(id=id, name="Equipo de prueba")))
  }
}