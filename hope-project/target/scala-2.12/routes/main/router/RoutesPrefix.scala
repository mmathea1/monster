
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mingina/Workspace/hope/hope-project/conf/routes
// @DATE:Wed Sep 06 22:36:51 EAT 2017


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
