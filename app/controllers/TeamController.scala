package controllers

import javax.inject._
import models.Team
import play.api.Logger
import play.api.mvc._
import play.api.libs.json._
import repositories.TeamRepository

import scala.concurrent.{ExecutionContext, Future}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class TeamController @Inject()(cc: ControllerComponents, teamRepository: TeamRepository)(implicit ec: ExecutionContext) extends AbstractController(cc) {

  private val logger = Logger(getClass)

  def list() = Action.async { implicit request =>
    teamRepository.list().map{ teams =>
     Ok(Json.toJson(teams))
    }
  }

  def create() = Action.async(parse.json) { implicit request =>
    val parsedTeam:Team = Json.parse(request.body.toString()).as[Team]
    teamRepository
      .create(parsedTeam.name)
      .map { team =>
        Ok(Json.toJson(team))
      }
  }

}