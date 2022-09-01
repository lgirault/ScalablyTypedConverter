package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GLBuffer extends StObject {
  
  var buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebGLBuffer */ Any
  
  var byteLength: Double
  
  var refCount: Double
  
  var updateID: Double
}
object GLBuffer {
  
  inline def apply(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebGLBuffer */ Any,
    byteLength: Double,
    refCount: Double,
    updateID: Double
  ): GLBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], updateID = updateID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLBuffer]
  }
  
  extension [Self <: GLBuffer](x: Self) {
    
    inline def setBuffer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebGLBuffer */ Any
    ): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    inline def setRefCount(value: Double): Self = StObject.set(x, "refCount", value.asInstanceOf[js.Any])
    
    inline def setUpdateID(value: Double): Self = StObject.set(x, "updateID", value.asInstanceOf[js.Any])
  }
}
