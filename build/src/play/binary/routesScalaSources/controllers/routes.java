// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mapsi/Development/Repositories/bee-effect-ms/bee-effect-team-ms/conf/routes
// @DATE:Sun Mar 10 23:52:09 CLST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseTeamController TeamController = new controllers.ReverseTeamController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseTeamController TeamController = new controllers.javascript.ReverseTeamController(RoutesPrefix.byNamePrefix());
  }

}
