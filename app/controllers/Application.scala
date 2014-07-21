package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
  	Logger.debug("This is a DEBUG log statement - it should not show up in prod!")
  	Ok(views.html.index("Your new application is ready"))
  }
}