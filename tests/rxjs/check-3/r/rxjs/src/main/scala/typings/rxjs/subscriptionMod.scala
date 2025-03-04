package typings.rxjs

import typings.rxjs.typesMod.SubscriptionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionMod {
  
  @JSImport("rxjs/internal/Subscription", "Subscription")
  @js.native
  /**
    * @param {function(): void} [unsubscribe] A function describing how to
    * perform the disposal of resources when the `unsubscribe` method is called.
    */
  open class Subscription ()
    extends StObject
       with SubscriptionLike {
    def this(unsubscribe: js.Function0[Unit]) = this()
    
    /** @internal */
    /* private */ var _subscriptions: Any = js.native
    
    /* CompleteClass */
    override val closed: Boolean = js.native
    
    /* CompleteClass */
    override def unsubscribe(): Unit = js.native
  }
  /* static members */
  object Subscription {
    
    @JSImport("rxjs/internal/Subscription", "Subscription")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("rxjs/internal/Subscription", "Subscription.EMPTY")
    @js.native
    def EMPTY: Subscription = js.native
    inline def EMPTY_=(x: Subscription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  }
}
