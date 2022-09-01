package typings.pixiCore.mod

import typings.pixiConstants.mod.MSAA_QUALITY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "GLFramebuffer")
@js.native
open class GLFramebuffer protected () extends StObject {
  def this(framebuffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebGLTexture */ Any) = this()
  
  /**
    * In case we use MSAA, this is actual framebuffer that has colorTextures[0]
    * The contents of that framebuffer are read when we use that renderTexture in sprites
    */
  var blitFramebuffer: Framebuffer = js.native
  
  /** Latest known version of framebuffer format. */
  var dirtyFormat: Double = js.native
  
  /** Latest known version of framebuffer. */
  var dirtyId: Double = js.native
  
  /** Latest known version of framebuffer size. */
  var dirtySize: Double = js.native
  
  /** The WebGL framebuffer. */
  var framebuffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebGLFramebuffer */ Any = js.native
  
  /** Store the current mipmap of the textures the framebuffer will write too. */
  var mipLevel: Double = js.native
  
  /** In case MSAA, we use this Renderbuffer instead of colorTextures[0] when we write info. */
  var msaaBuffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebGLRenderbuffer */ Any = js.native
  
  /** Detected AA samples number. */
  var multisample: MSAA_QUALITY = js.native
  
  /** Stencil+depth , usually costs 32bits per pixel. */
  var stencil: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebGLRenderbuffer */ Any = js.native
}
