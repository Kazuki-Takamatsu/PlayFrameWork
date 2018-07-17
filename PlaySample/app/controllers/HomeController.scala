package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import forms.GetUser._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {


  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def test()=Action {
    Ok(views.html.test("高松"))
  }

    def home()=Action{
      Ok(views.html.home())
    }

  def getUser()=Action{ implicit request =>
    val userData = userForm.bindFromRequest.get
    println(userData)
    Ok(views.html.complete(userData))
  }

}
