package controllers

import javax.inject._
import models.Team
import play.api.Logger
import play.api.mvc._
import repositories.TeamRepository

import scala.concurrent.ExecutionContext

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class TeamController @Inject()(cc: ControllerComponents, teamRepository: TeamRepository)(implicit ec: ExecutionContext) extends AbstractController(cc) {

  private val logger = Logger(getClass)

  import play.api.libs.json._

  case class TeamRepresentation(id : Option[Long] , name: String)

  object TeamRepresentation {
    implicit val teamFormat = Json.format[TeamRepresentation]
    implicit val teamWrites = Json.writes[TeamRepresentation]
  }

  def list() = Action.async { implicit request =>
    teamRepository
      .list()
      .map(x => x.map(y => TeamRepresentation(Option.apply(y.id), y.name)))
      .map{ teams => Ok(Json.toJson(teams))}
  }

  def create() = Action.async(parse.json) { implicit request =>
    val parsedTeam:TeamRepresentation = Json.parse(request.body.toString()).as[TeamRepresentation]
    teamRepository
      .create(parsedTeam.name)
      .map(x => TeamRepresentation(Option.apply(x.id), x.name))
      .map { team =>
        Created(Json.toJson(team))
      }
  }

}