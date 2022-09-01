package typings.pixiTextBitmap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Amount extends StObject {
    
    var amount: String
    
    var first: String
    
    var second: String
  }
  object Amount {
    
    inline def apply(amount: String, first: String, second: String): Amount = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
      __obj.asInstanceOf[Amount]
    }
    
    extension [Self <: Amount](x: Self) {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    }
  }
  
  trait Count extends StObject {
    
    var count: Double
  }
  object Count {
    
    inline def apply(count: Double): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    extension [Self <: Count](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
  
  trait DistanceRange extends StObject {
    
    var distanceRange: String
    
    var fieldType: String
  }
  object DistanceRange {
    
    inline def apply(distanceRange: String, fieldType: String): DistanceRange = {
      val __obj = js.Dynamic.literal(distanceRange = distanceRange.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistanceRange]
    }
    
    extension [Self <: DistanceRange](x: Self) {
      
      inline def setDistanceRange(value: String): Self = StObject.set(x, "distanceRange", value.asInstanceOf[js.Any])
      
      inline def setFieldType(value: String): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Face extends StObject {
    
    var face: String
    
    var size: String
  }
  object Face {
    
    inline def apply(face: String, size: String): Face = {
      val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Face]
    }
    
    extension [Self <: Face](x: Self) {
      
      inline def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait File extends StObject {
    
    var file: String
    
    var id: String
  }
  object File {
    
    inline def apply(file: String, id: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: String
    
    var id: String
    
    var page: String
    
    var width: String
    
    var x: String
    
    var xadvance: String
    
    var xoffset: String
    
    var y: String
    
    var yoffset: String
  }
  object Height {
    
    inline def apply(
      height: String,
      id: String,
      page: String,
      width: String,
      x: String,
      xadvance: String,
      xoffset: String,
      y: String,
      yoffset: String
    ): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xadvance = xadvance.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXadvance(value: String): Self = StObject.set(x, "xadvance", value.asInstanceOf[js.Any])
      
      inline def setXoffset(value: String): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYoffset(value: String): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineHeight extends StObject {
    
    var lineHeight: String
  }
  object LineHeight {
    
    inline def apply(lineHeight: String): LineHeight = {
      val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineHeight]
    }
    
    extension [Self <: LineHeight](x: Self) {
      
      inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    }
  }
}
