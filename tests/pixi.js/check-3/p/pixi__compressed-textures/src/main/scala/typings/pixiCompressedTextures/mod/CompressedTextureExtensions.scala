package typings.pixiCompressedTextures.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressedTextureExtensions extends StObject {
  
  var astc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_astc */ Any
  
  var atc: Any
  
  var etc: Any
  
  var etc1: Any
  
  var pvrtc: Any
  
  var s3tc: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_s3tc */ Any
  ] = js.undefined
  
  var s3tc_sRGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_s3tc_srgb */ Any
}
object CompressedTextureExtensions {
  
  inline def apply(
    astc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_astc */ Any,
    atc: Any,
    etc: Any,
    etc1: Any,
    pvrtc: Any,
    s3tc_sRGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_s3tc_srgb */ Any
  ): CompressedTextureExtensions = {
    val __obj = js.Dynamic.literal(astc = astc.asInstanceOf[js.Any], atc = atc.asInstanceOf[js.Any], etc = etc.asInstanceOf[js.Any], etc1 = etc1.asInstanceOf[js.Any], pvrtc = pvrtc.asInstanceOf[js.Any], s3tc_sRGB = s3tc_sRGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressedTextureExtensions]
  }
  
  extension [Self <: CompressedTextureExtensions](x: Self) {
    
    inline def setAstc(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_astc */ Any
    ): Self = StObject.set(x, "astc", value.asInstanceOf[js.Any])
    
    inline def setAtc(value: Any): Self = StObject.set(x, "atc", value.asInstanceOf[js.Any])
    
    inline def setEtc(value: Any): Self = StObject.set(x, "etc", value.asInstanceOf[js.Any])
    
    inline def setEtc1(value: Any): Self = StObject.set(x, "etc1", value.asInstanceOf[js.Any])
    
    inline def setPvrtc(value: Any): Self = StObject.set(x, "pvrtc", value.asInstanceOf[js.Any])
    
    inline def setS3tc(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_s3tc */ Any
    ): Self = StObject.set(x, "s3tc", value.asInstanceOf[js.Any])
    
    inline def setS3tcUndefined: Self = StObject.set(x, "s3tc", js.undefined)
    
    inline def setS3tc_sRGB(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_s3tc_srgb */ Any
    ): Self = StObject.set(x, "s3tc_sRGB", value.asInstanceOf[js.Any])
  }
}
