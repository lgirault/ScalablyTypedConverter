package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISystem extends StObject {
  
  /** Generic destroy methods to be overridden by the subclass */
  def destroy(): Unit
}
object ISystem {
  
  inline def apply(destroy: () => Unit): ISystem = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[ISystem]
  }
  
  extension [Self <: ISystem](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
