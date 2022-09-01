package typings.pixiJs.mod

import typings.pixiCore.mod.IBaseTextureOptions
import typings.pixiCore.mod.TextureSource
import typings.pixiMath.mod.ISize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "TilingSprite")
@js.native
open class TilingSprite protected ()
  extends typings.pixiSpriteTiling.mod.TilingSprite {
  /**
    * @param texture - The texture of the tiling sprite.
    * @param width - The width of the tiling sprite.
    * @param height - The height of the tiling sprite.
    */
  def this(texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource]) = this()
  def this(texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource], width: Double) = this()
  def this(
    texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource],
    width: Double,
    height: Double
  ) = this()
  def this(texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource], width: Unit, height: Double) = this()
}
/* static members */
object TilingSprite {
  
  @JSImport("pixi.js", "TilingSprite")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function that creates a new tiling sprite based on the source you provide.
    * The source can be - frame id, image url, video url, canvas element, video element, base texture
    * @static
    * @param {string|PIXI.Texture|HTMLCanvasElement|HTMLVideoElement} source - Source to create texture from
    * @param {object} options - See {@link PIXI.BaseTexture}'s constructor for options.
    * @param {number} options.width - required width of the tiling sprite
    * @param {number} options.height - required height of the tiling sprite
    * - See {@link PIXI.BaseTexture}'s constructor for options.
    * @param {number} options.width - required width of the tiling sprite
    * @param {number} options.height - required height of the tiling sprite
    * @returns {PIXI.TilingSprite} The newly created texture
    */
  inline def from(source: TextureSource, options: ISize & IBaseTextureOptions[Any]): typings.pixiSpriteTiling.mod.TilingSprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiSpriteTiling.mod.TilingSprite]
  inline def from(
    source: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource],
    options: ISize & IBaseTextureOptions[Any]
  ): typings.pixiSpriteTiling.mod.TilingSprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiSpriteTiling.mod.TilingSprite]
}
