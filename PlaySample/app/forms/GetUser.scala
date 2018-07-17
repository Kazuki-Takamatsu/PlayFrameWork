package forms

import play.api.data._
import play.api.data.Forms._

object GetUser {

  case class UserData(name:String,age :Int)

  val userForm = Form(
    mapping(
      a1="name" -> text,
      a2="age" ->number
    )(UserData.apply)(UserData.unapply)
  )

}
