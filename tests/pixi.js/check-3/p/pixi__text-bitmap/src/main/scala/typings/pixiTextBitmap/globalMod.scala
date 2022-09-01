package typings.pixiTextBitmap

import typings.pixiTextBitmap.mod.BitmapFont
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  object GlobalMixins {
    
    trait IBitmapFontResource extends StObject {
      
      var bitmapFont: BitmapFont
    }
    object IBitmapFontResource {
      
      inline def apply(bitmapFont: BitmapFont): IBitmapFontResource = {
        val __obj = js.Dynamic.literal(bitmapFont = bitmapFont.asInstanceOf[js.Any])
        __obj.asInstanceOf[IBitmapFontResource]
      }
      
      extension [Self <: IBitmapFontResource](x: Self) {
        
        inline def setBitmapFont(value: BitmapFont): Self = StObject.set(x, "bitmapFont", value.asInstanceOf[js.Any])
      }
    }
    
    trait IBitmapFontResourceMetadata extends StObject {
      
      var pageFile: String
    }
    object IBitmapFontResourceMetadata {
      
      inline def apply(pageFile: String): IBitmapFontResourceMetadata = {
        val __obj = js.Dynamic.literal(pageFile = pageFile.asInstanceOf[js.Any])
        __obj.asInstanceOf[IBitmapFontResourceMetadata]
      }
      
      extension [Self <: IBitmapFontResourceMetadata](x: Self) {
        
        inline def setPageFile(value: String): Self = StObject.set(x, "pageFile", value.asInstanceOf[js.Any])
      }
    }
    
    // eslint-disable-next-line @typescript-eslint/no-empty-interface
    type IResourceMetadata = Partial[IBitmapFontResourceMetadata]
    
    // eslint-disable-next-line @typescript-eslint/no-empty-interface
    type LoaderResource = Partial[IBitmapFontResource]
  }
}
