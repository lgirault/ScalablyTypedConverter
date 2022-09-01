package typings.pixiCompressedTextures

import typings.pixiCompressedTextures.mod.CompressedTextureResource
import typings.pixiConstants.mod.FORMATS
import typings.pixiConstants.mod.TYPES
import typings.pixiCore.mod.BufferResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compressed extends StObject {
    
    var compressed: js.UndefOr[js.Array[CompressedTextureResource]] = js.undefined
    
    var kvData: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Map<string, DataView> */ Any) | Null
    
    var uncompressed: js.UndefOr[js.Array[Resource]] = js.undefined
  }
  object Compressed {
    
    inline def apply(): Compressed = {
      val __obj = js.Dynamic.literal(kvData = null)
      __obj.asInstanceOf[Compressed]
    }
    
    extension [Self <: Compressed](x: Self) {
      
      inline def setCompressed(value: js.Array[CompressedTextureResource]): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
      
      inline def setCompressedVarargs(value: CompressedTextureResource*): Self = StObject.set(x, "compressed", js.Array(value*))
      
      inline def setKvData(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Map<string, DataView> */ Any
      ): Self = StObject.set(x, "kvData", value.asInstanceOf[js.Any])
      
      inline def setKvDataNull: Self = StObject.set(x, "kvData", null)
      
      inline def setUncompressed(value: js.Array[Resource]): Self = StObject.set(x, "uncompressed", value.asInstanceOf[js.Any])
      
      inline def setUncompressedUndefined: Self = StObject.set(x, "uncompressed", js.undefined)
      
      inline def setUncompressedVarargs(value: Resource*): Self = StObject.set(x, "uncompressed", js.Array(value*))
    }
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[
        /* keyof @pixi/compressed-textures.@pixi/compressed-textures.INTERNAL_FORMATS */ String
      ] = js.undefined
    
    var src: String
  }
  object Format {
    
    inline def apply(src: String): Format = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: /* keyof @pixi/compressed-textures.@pixi/compressed-textures.INTERNAL_FORMATS */ String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait Resource extends StObject {
    
    var format: FORMATS
    
    var resource: BufferResource
    
    var `type`: TYPES
  }
  object Resource {
    
    inline def apply(format: FORMATS, resource: BufferResource, `type`: TYPES): Resource = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    extension [Self <: Resource](x: Self) {
      
      inline def setFormat(value: FORMATS): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setResource(value: BufferResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setType(value: TYPES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
