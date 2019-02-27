package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

@Singleton
class ApplicationController @Inject()(
  val controllerComponents: ControllerComponents
) extends BaseController {
  def index: Action[AnyContent] = Action {
    Ok("Success")
  }
}
