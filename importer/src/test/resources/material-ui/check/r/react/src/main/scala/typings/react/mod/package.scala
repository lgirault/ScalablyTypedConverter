package typings.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentState = js.Object
  type Key = String | Double
  type ReactNode = js.UndefOr[String | Double | Boolean]
  type SFC[P] = StatelessComponent[P]
  type SVGAttributes[T] = DOMAttributes[T]
}
