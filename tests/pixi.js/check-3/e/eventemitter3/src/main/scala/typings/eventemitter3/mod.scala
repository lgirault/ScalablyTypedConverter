package typings.eventemitter3

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("eventemitter3", JSImport.Namespace)
  @js.native
  open class ^[EventTypes /* <: String | js.Symbol */] ()
    extends StObject
       with typings.eventemitter3.mod.EventEmitter[EventTypes]
  @JSImport("eventemitter3", JSImport.Namespace)
  @js.native
  val ^ : EventEmitterStatic = js.native
  
  @js.native
  trait EventEmitter[EventTypes /* <: String | js.Symbol */] extends StObject {
    
    def addListener(event: EventTypes, fn: ListenerFn): this.type = js.native
    def addListener(event: EventTypes, fn: ListenerFn, context: Any): this.type = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit(event: EventTypes, args: Any*): Boolean = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventTypes] = js.native
    
    /**
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventTypes): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners(event: EventTypes): js.Array[ListenerFn] = js.native
    
    def off(event: EventTypes): this.type = js.native
    def off(event: EventTypes, fn: Unit, context: Any): this.type = js.native
    def off(event: EventTypes, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off(event: EventTypes, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off(event: EventTypes, fn: ListenerFn): this.type = js.native
    def off(event: EventTypes, fn: ListenerFn, context: Any): this.type = js.native
    def off(event: EventTypes, fn: ListenerFn, context: Any, once: Boolean): this.type = js.native
    def off(event: EventTypes, fn: ListenerFn, context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on(event: EventTypes, fn: ListenerFn): this.type = js.native
    def on(event: EventTypes, fn: ListenerFn, context: Any): this.type = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once(event: EventTypes, fn: ListenerFn): this.type = js.native
    def once(event: EventTypes, fn: ListenerFn, context: Any): this.type = js.native
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventTypes): this.type = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener(event: EventTypes): this.type = js.native
    def removeListener(event: EventTypes, fn: Unit, context: Any): this.type = js.native
    def removeListener(event: EventTypes, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener(event: EventTypes, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener(event: EventTypes, fn: ListenerFn): this.type = js.native
    def removeListener(event: EventTypes, fn: ListenerFn, context: Any): this.type = js.native
    def removeListener(event: EventTypes, fn: ListenerFn, context: Any, once: Boolean): this.type = js.native
    def removeListener(event: EventTypes, fn: ListenerFn, context: Unit, once: Boolean): this.type = js.native
  }
  @JSImport("eventemitter3", "EventEmitter")
  @js.native
  val EventEmitter: EventEmitterStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("eventemitter3", "EventEmitter")
  @js.native
  open class EventEmitterCls[EventTypes /* <: String | js.Symbol */] ()
    extends StObject
       with typings.eventemitter3.mod.EventEmitter[EventTypes]
  
  /* static member */
  @JSImport("eventemitter3", "prefixed")
  @js.native
  def prefixed: String | Boolean = js.native
  inline def prefixed_=(x: String | Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixed")(x.asInstanceOf[js.Any])
  
  @js.native
  trait EventEmitterStatic
    extends StObject
       with Instantiable0[typings.eventemitter3.mod.EventEmitter[String | js.Symbol]]
  
  type ListenerFn = js.Function1[/* repeated */ Any, Unit]
  
  type _To = EventEmitterStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: EventEmitterStatic = ^
}
