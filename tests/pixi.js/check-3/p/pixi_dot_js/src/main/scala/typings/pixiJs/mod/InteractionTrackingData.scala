package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "InteractionTrackingData")
@js.native
open class InteractionTrackingData protected ()
  extends typings.pixiInteraction.mod.InteractionTrackingData {
  /**
    * @param {number} pointerId - Unique pointer id of the event
    * @private
    */
  def this(pointerId: Double) = this()
}
/* static members */
object InteractionTrackingData {
  
  @JSImport("pixi.js", "InteractionTrackingData")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pixi.js", "InteractionTrackingData.FLAGS")
  @js.native
  def FLAGS: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Readonly<InteractionTrackingFlags> */ Any = js.native
  inline def FLAGS_=(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Readonly<InteractionTrackingFlags> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAGS")(x.asInstanceOf[js.Any])
}
