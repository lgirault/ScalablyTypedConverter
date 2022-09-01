package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "ImageBitmapResource")
@js.native
open class ImageBitmapResource protected () extends BaseImageResource {
  /**
    * @param source - Image element to use
    */
  def this(source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageBitmap */ Any) = this()
}
/* static members */
object ImageBitmapResource {
  
  @JSImport("@pixi/core", "ImageBitmapResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to auto-detect the type of resource.
    * @param {*} source - The source object
    * @returns {boolean} `true` if source is an ImageBitmap
    */
  inline def test(source: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageBitmap * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageBitmap * / any */ Boolean]
}
