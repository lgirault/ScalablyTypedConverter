package typingsSlinky.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRef extends js.Object {
  var ref: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
  ] = js.native
}

object AnonRef {
  @scala.inline
  def apply(ref: /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any = null): AnonRef = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRef]
  }
}

