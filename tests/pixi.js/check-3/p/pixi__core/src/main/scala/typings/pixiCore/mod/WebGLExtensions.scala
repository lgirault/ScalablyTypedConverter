package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLExtensions extends StObject {
  
  var anisotropicFiltering: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EXT_texture_filter_anisotropic */ Any
  ] = js.undefined
  
  var astc: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_astc */ Any
  ] = js.undefined
  
  var atc: js.UndefOr[WEBGLCompressedTextureAtc] = js.undefined
  
  var colorBufferFloat: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_color_buffer_float */ Any
  ] = js.undefined
  
  var depthTexture: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_texture_float */ Any
  ] = js.undefined
  
  var drawBuffers: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_draw_buffers */ Any
  ] = js.undefined
  
  var etc: js.UndefOr[WEBGLCompressedTextureEtc2] = js.undefined
  
  var etc1: js.UndefOr[WEBGLCompressedTextureEtc12] = js.undefined
  
  var floatTexture: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_texture_float */ Any
  ] = js.undefined
  
  var floatTextureLinear: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_texture_float_linear */ Any
  ] = js.undefined
  
  var loseContext: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_lose_context */ Any
  ] = js.undefined
  
  var pvrtc: js.UndefOr[WEBGLCompressedTexturePvrtc2] = js.undefined
  
  var s3tc: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_s3tc */ Any
  ] = js.undefined
  
  var s3tc_sRGB: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_s3tc_srgb */ Any
  ] = js.undefined
  
  var textureHalfFloat: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_texture_half_float */ Any
  ] = js.undefined
  
  var textureHalfFloatLinear: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_texture_half_float_linear */ Any
  ] = js.undefined
  
  var uint32ElementIndex: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_element_index_uint */ Any
  ] = js.undefined
  
  var vertexArrayObject: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_vertex_array_object */ Any
  ] = js.undefined
}
object WebGLExtensions {
  
  inline def apply(): WebGLExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLExtensions]
  }
  
  extension [Self <: WebGLExtensions](x: Self) {
    
    inline def setAnisotropicFiltering(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EXT_texture_filter_anisotropic */ Any
    ): Self = StObject.set(x, "anisotropicFiltering", value.asInstanceOf[js.Any])
    
    inline def setAnisotropicFilteringUndefined: Self = StObject.set(x, "anisotropicFiltering", js.undefined)
    
    inline def setAstc(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_astc */ Any
    ): Self = StObject.set(x, "astc", value.asInstanceOf[js.Any])
    
    inline def setAstcUndefined: Self = StObject.set(x, "astc", js.undefined)
    
    inline def setAtc(value: WEBGLCompressedTextureAtc): Self = StObject.set(x, "atc", value.asInstanceOf[js.Any])
    
    inline def setAtcUndefined: Self = StObject.set(x, "atc", js.undefined)
    
    inline def setColorBufferFloat(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_color_buffer_float */ Any
    ): Self = StObject.set(x, "colorBufferFloat", value.asInstanceOf[js.Any])
    
    inline def setColorBufferFloatUndefined: Self = StObject.set(x, "colorBufferFloat", js.undefined)
    
    inline def setDepthTexture(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_texture_float */ Any
    ): Self = StObject.set(x, "depthTexture", value.asInstanceOf[js.Any])
    
    inline def setDepthTextureUndefined: Self = StObject.set(x, "depthTexture", js.undefined)
    
    inline def setDrawBuffers(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_draw_buffers */ Any
    ): Self = StObject.set(x, "drawBuffers", value.asInstanceOf[js.Any])
    
    inline def setDrawBuffersUndefined: Self = StObject.set(x, "drawBuffers", js.undefined)
    
    inline def setEtc(value: WEBGLCompressedTextureEtc2): Self = StObject.set(x, "etc", value.asInstanceOf[js.Any])
    
    inline def setEtc1(value: WEBGLCompressedTextureEtc12): Self = StObject.set(x, "etc1", value.asInstanceOf[js.Any])
    
    inline def setEtc1Undefined: Self = StObject.set(x, "etc1", js.undefined)
    
    inline def setEtcUndefined: Self = StObject.set(x, "etc", js.undefined)
    
    inline def setFloatTexture(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_texture_float */ Any
    ): Self = StObject.set(x, "floatTexture", value.asInstanceOf[js.Any])
    
    inline def setFloatTextureLinear(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_texture_float_linear */ Any
    ): Self = StObject.set(x, "floatTextureLinear", value.asInstanceOf[js.Any])
    
    inline def setFloatTextureLinearUndefined: Self = StObject.set(x, "floatTextureLinear", js.undefined)
    
    inline def setFloatTextureUndefined: Self = StObject.set(x, "floatTexture", js.undefined)
    
    inline def setLoseContext(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_lose_context */ Any
    ): Self = StObject.set(x, "loseContext", value.asInstanceOf[js.Any])
    
    inline def setLoseContextUndefined: Self = StObject.set(x, "loseContext", js.undefined)
    
    inline def setPvrtc(value: WEBGLCompressedTexturePvrtc2): Self = StObject.set(x, "pvrtc", value.asInstanceOf[js.Any])
    
    inline def setPvrtcUndefined: Self = StObject.set(x, "pvrtc", js.undefined)
    
    inline def setS3tc(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_s3tc */ Any
    ): Self = StObject.set(x, "s3tc", value.asInstanceOf[js.Any])
    
    inline def setS3tcUndefined: Self = StObject.set(x, "s3tc", js.undefined)
    
    inline def setS3tc_sRGB(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WEBGL_compressed_texture_s3tc_srgb */ Any
    ): Self = StObject.set(x, "s3tc_sRGB", value.asInstanceOf[js.Any])
    
    inline def setS3tc_sRGBUndefined: Self = StObject.set(x, "s3tc_sRGB", js.undefined)
    
    inline def setTextureHalfFloat(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_texture_half_float */ Any
    ): Self = StObject.set(x, "textureHalfFloat", value.asInstanceOf[js.Any])
    
    inline def setTextureHalfFloatLinear(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_texture_half_float_linear */ Any
    ): Self = StObject.set(x, "textureHalfFloatLinear", value.asInstanceOf[js.Any])
    
    inline def setTextureHalfFloatLinearUndefined: Self = StObject.set(x, "textureHalfFloatLinear", js.undefined)
    
    inline def setTextureHalfFloatUndefined: Self = StObject.set(x, "textureHalfFloat", js.undefined)
    
    inline def setUint32ElementIndex(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_element_index_uint */ Any
    ): Self = StObject.set(x, "uint32ElementIndex", value.asInstanceOf[js.Any])
    
    inline def setUint32ElementIndexUndefined: Self = StObject.set(x, "uint32ElementIndex", js.undefined)
    
    inline def setVertexArrayObject(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OES_vertex_array_object */ Any
    ): Self = StObject.set(x, "vertexArrayObject", value.asInstanceOf[js.Any])
    
    inline def setVertexArrayObjectUndefined: Self = StObject.set(x, "vertexArrayObject", js.undefined)
  }
}
