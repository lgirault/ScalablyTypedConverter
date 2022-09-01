package typings.pixiCore.mod

import typings.pixiConstants.mod.BLEND_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBatchableElement extends StObject {
  
  var _texture: Texture[Resource]
  
  var _tintRGB: Double
  
  var blendMode: BLEND_MODES
  
  var indices: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Uint16Array */ Any) | js.Array[Double]
  
  var uvs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Float32Array */ Any
  
  var vertexData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Float32Array */ Any
  
  var worldAlpha: Double
}
object IBatchableElement {
  
  inline def apply(
    _texture: Texture[Resource],
    _tintRGB: Double,
    blendMode: BLEND_MODES,
    indices: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Uint16Array */ Any) | js.Array[Double],
    uvs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Float32Array */ Any,
    vertexData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Float32Array */ Any,
    worldAlpha: Double
  ): IBatchableElement = {
    val __obj = js.Dynamic.literal(_texture = _texture.asInstanceOf[js.Any], _tintRGB = _tintRGB.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], uvs = uvs.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any], worldAlpha = worldAlpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchableElement]
  }
  
  extension [Self <: IBatchableElement](x: Self) {
    
    inline def setBlendMode(value: BLEND_MODES): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setIndices(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Uint16Array */ Any) | js.Array[Double]
    ): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setUvs(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Float32Array */ Any
    ): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    inline def setVertexData(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Float32Array */ Any
    ): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
    
    inline def setWorldAlpha(value: Double): Self = StObject.set(x, "worldAlpha", value.asInstanceOf[js.Any])
    
    inline def set_texture(value: Texture[Resource]): Self = StObject.set(x, "_texture", value.asInstanceOf[js.Any])
    
    inline def set_tintRGB(value: Double): Self = StObject.set(x, "_tintRGB", value.asInstanceOf[js.Any])
  }
}
