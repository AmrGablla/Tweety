// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/amr.gaballah/Documents/Tweety/Tweety/conf/routes
// @DATE:Tue Mar 02 12:49:18 EET 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:2
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "save")
    }
  
  }


}
