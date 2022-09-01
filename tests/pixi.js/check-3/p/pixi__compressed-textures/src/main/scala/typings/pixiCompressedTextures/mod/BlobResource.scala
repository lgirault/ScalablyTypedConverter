package typings.pixiCompressedTextures.mod

import typings.pixiCore.mod.BufferResource
import typings.pixiCore.mod.ViewableBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/compressed-textures", "BlobResource")
@js.native
abstract class BlobResource protected () extends BufferResource {
  /**
    * @param {string} source - the URL of the texture file
    * @param {PIXI.IBlobOptions} options
    * @param {boolean}[options.autoLoad] - whether to fetch the data immediately;
    *  you can fetch it later via {@link BlobResource#load}
    * @param {boolean}[options.width] - the width in pixels.
    * @param {boolean}[options.height] - the height in pixels.
    */
  def this(source: String) = this()
  def this(source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Uint8Array */ Any) = this()
  def this(source: String, options: IBlobOptions) = this()
  def this(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Uint8Array */ Any,
    options: IBlobOptions
  ) = this()
  
  /* protected */ var buffer: ViewableBuffer = js.native
  
  /* protected */ var loaded: Boolean = js.native
  
  /* protected */ def onBlobLoaded(
    _data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayBuffer */ Any
  ): Unit = js.native
  
  /* protected */ var origin: String = js.native
}
