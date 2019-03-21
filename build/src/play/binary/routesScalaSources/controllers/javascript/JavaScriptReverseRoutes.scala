// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mapsi/Development/Repositories/default-ms/default-team-ms/conf/routes
// @DATE:Sun Mar 10 23:52:09 CLST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseTeamController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeamController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teams"})
        }
      """
    )
  
    // @LINE:8
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeamController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
