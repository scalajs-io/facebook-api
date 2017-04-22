package io.scalajs.social

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Facebook package object
  * @author lawrence.daniels@gmail.com
  */
package object facebook {

  /**
    * Facebook Singleton
    */
  @js.native
  @JSGlobal("FB")
  object FB extends Facebook

}
