// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mapsi/Development/Repositories/default-ms/default-team-ms/conf/routes
// @DATE:Sun Mar 10 23:52:09 CLST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseTeamController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "teams")
    }
  
    // @LINE:8
    def show(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "teams/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }


}
