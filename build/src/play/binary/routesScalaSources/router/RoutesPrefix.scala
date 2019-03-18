// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mapsi/Development/Repositories/bee-effect-ms/bee-effect-team-ms/conf/routes
// @DATE:Sun Mar 10 23:52:09 CLST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
