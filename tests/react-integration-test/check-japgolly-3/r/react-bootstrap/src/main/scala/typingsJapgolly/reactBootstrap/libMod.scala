package typingsJapgolly.reactBootstrap

import typingsJapgolly.reactBootstrap.bootstrapUtilsMod.BSProps
import typingsJapgolly.reactBootstrap.buttonGroupMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("react-bootstrap/lib", "ButtonGroup")
  @js.native
  open class ButtonGroup () extends ^
  
  @JSImport("react-bootstrap/lib", "ToggleButtonGroup")
  @js.native
  open class ToggleButtonGroup ()
    extends typingsJapgolly.reactBootstrap.toggleButtonGroupMod.^
  
  object utils {
    
    @JSImport("react-bootstrap/lib", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    object bootstrapUtils {
      
      @JSImport("react-bootstrap/lib", "utils.bootstrapUtils")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getBsProps(props: Any): BSProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getBsProps")(props.asInstanceOf[js.Any]).asInstanceOf[BSProps]
    }
    
    inline def createChainedFunction(funcs: js.Function*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("createChainedFunction")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function]
  }
}
