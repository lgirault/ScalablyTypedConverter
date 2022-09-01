package typings.pixiCompressedTextures

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalMixins {
  
  // eslint-disable-next-line @typescript-eslint/no-empty-interface
  trait BaseTexture extends StObject {
    
    var ktxKeyValueData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Map<string, DataView> */ Any
  }
  object BaseTexture {
    
    inline def apply(
      ktxKeyValueData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Map<string, DataView> */ Any
    ): BaseTexture = {
      val __obj = js.Dynamic.literal(ktxKeyValueData = ktxKeyValueData.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTexture]
    }
    
    extension [Self <: BaseTexture](x: Self) {
      
      inline def setKtxKeyValueData(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Map<string, DataView> */ Any
      ): Self = StObject.set(x, "ktxKeyValueData", value.asInstanceOf[js.Any])
    }
  }
}
