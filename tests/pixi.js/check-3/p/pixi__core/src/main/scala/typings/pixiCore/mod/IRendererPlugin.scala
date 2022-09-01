package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRendererPlugin extends StObject {
  
  def destroy(): Unit
}
object IRendererPlugin {
  
  inline def apply(destroy: () => Unit): IRendererPlugin = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IRendererPlugin]
  }
  
  extension [Self <: IRendererPlugin](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
