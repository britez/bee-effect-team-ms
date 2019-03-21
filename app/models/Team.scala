package models

import play.api.libs.json._

case class Team(id : Option[Long] , name: String)

object Team {
  implicit val teamFormat = Json.format[Team]
  implicit val teamWrites = Json.writes[Team]
}