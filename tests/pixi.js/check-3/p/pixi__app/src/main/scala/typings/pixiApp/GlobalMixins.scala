package typings.pixiApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalMixins {
  
  trait Application extends StObject {
    
    def cancelResize(): Unit
    
    def queueResize(): Unit
    
    def resize(): Unit
    
    var resizeTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Window */ Any
  }
  object Application {
    
    inline def apply(
      cancelResize: () => Unit,
      queueResize: () => Unit,
      resize: () => Unit,
      resizeTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Window */ Any
    ): Application = {
      val __obj = js.Dynamic.literal(cancelResize = js.Any.fromFunction0(cancelResize), queueResize = js.Any.fromFunction0(queueResize), resize = js.Any.fromFunction0(resize), resizeTo = resizeTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Application]
    }
    
    extension [Self <: Application](x: Self) {
      
      inline def setCancelResize(value: () => Unit): Self = StObject.set(x, "cancelResize", js.Any.fromFunction0(value))
      
      inline def setQueueResize(value: () => Unit): Self = StObject.set(x, "queueResize", js.Any.fromFunction0(value))
      
      inline def setResize(value: () => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
      
      inline def setResizeTo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Window */ Any
      ): Self = StObject.set(x, "resizeTo", value.asInstanceOf[js.Any])
    }
  }
  
  trait IApplicationOptions extends StObject {
    
    var resizeTo: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Window */ Any
      ] = js.undefined
  }
  object IApplicationOptions {
    
    inline def apply(): IApplicationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IApplicationOptions]
    }
    
    extension [Self <: IApplicationOptions](x: Self) {
      
      inline def setResizeTo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Window */ Any
      ): Self = StObject.set(x, "resizeTo", value.asInstanceOf[js.Any])
      
      inline def setResizeToUndefined: Self = StObject.set(x, "resizeTo", js.undefined)
    }
  }
}
