package typings.pixiCore.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayBuffer * / any */ trait ITypedArray
  extends StObject
     with /* index */ NumberDictionary[Double] {
  
  val BYTES_PER_ELEMENT: Double
  
  val length: Double
}
object ITypedArray {
  
  inline def apply(BYTES_PER_ELEMENT: Double, length: Double): ITypedArray = {
    val __obj = js.Dynamic.literal(BYTES_PER_ELEMENT = BYTES_PER_ELEMENT.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypedArray]
  }
  
  extension [Self <: ITypedArray](x: Self) {
    
    inline def setBYTES_PER_ELEMENT(value: Double): Self = StObject.set(x, "BYTES_PER_ELEMENT", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
