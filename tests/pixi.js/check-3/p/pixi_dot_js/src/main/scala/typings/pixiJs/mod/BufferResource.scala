package typings.pixiJs.mod

import typings.pixiMath.mod.ISize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "BufferResource")
@js.native
open class BufferResource protected ()
  extends typings.pixiCore.mod.BufferResource {
  /**
    * @param source - Source buffer
    * @param options - Options
    * @param {number} options.width - Width of the texture
    * @param {number} options.height - Height of the texture
    */
  def this(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Float32Array */ Any,
    options: ISize
  ) = this()
}
/* static members */
object BufferResource {
  
  @JSImport("pixi.js", "BufferResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to auto-detect the type of resource.
    * @param {*} source - The source object
    * @returns {boolean} `true` if <canvas>
    */
  inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
