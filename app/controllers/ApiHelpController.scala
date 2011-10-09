package controllers

import play.mvc.Controller
import play.modules.swagger.ApiHelpInventory

/**
  * This controller exposes swagger compatiable help apis.<br/>
  * The routing for the two apis supported by this controller is automatically injected by SwaggerPlugin
  *
  * @author ayush
  * @since 10/9/11 4:37 PM
  *
  */
object ApiHelpController extends Controller {

  /**
    * Get a list of all top level resources
    */
  def getResources() = {
    Json(ApiHelpInventory.getResources())
  }

  /**
    * Get detailed API/models for a given resource
    */
  def getResourceHelp(name: String) = {
    ApiHelpInventory.getResourceHelp(name) match {
      case Some(response) => Json(response)
      case None => NotFound
    }
  }


}