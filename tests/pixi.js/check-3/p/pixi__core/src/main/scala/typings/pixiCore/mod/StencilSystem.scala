package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "StencilSystem")
@js.native
open class StencilSystem protected ()
  extends StObject
     with AbstractMaskSystem {
  /**
    * @param renderer - The renderer this System works for.
    */
  def this(renderer: Renderer) = this()
  
  /**
    * Setup renderer to use the current mask data.
    * @private
    */
  /* protected */ /* CompleteClass */
  override def _useCurrent(): Unit = js.native
  
  /** Generic destroy methods to be overridden by the subclass */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /** Gets count of masks of certain type. */
  /* CompleteClass */
  override def getStackLength(): Double = js.native
  
  /**
    * Constant for gl.enable
    * @private
    */
  /* protected */ /* CompleteClass */
  var glConst: Double = js.native
  
  /**
    * The mask stack
    * @member {PIXI.MaskData[]}
    */
  /* protected */ /* CompleteClass */
  var maskStack: js.Array[MaskData] = js.native
  
  /**
    * Pops stencil mask. MaskData is already removed from stack
    * @param {PIXI.DisplayObject} maskObject - object of popped mask data
    */
  def pop(maskObject: IMaskTarget): Unit = js.native
  
  /**
    * Applies the Mask and adds it to the current stencil stack.
    * @param maskData - The mask data
    */
  def push(maskData: MaskData): Unit = js.native
  
  /* protected */ /* CompleteClass */
  var renderer: Renderer = js.native
  
  /**
    * Changes the mask stack that is used by this System.
    * @param {PIXI.MaskData[]} maskStack - The mask stack
    */
  /* CompleteClass */
  override def setMaskStack(maskStack: js.Array[MaskData]): Unit = js.native
}
