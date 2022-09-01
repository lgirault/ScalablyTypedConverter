package typings.pixiCore.mod

import typings.pixiUtils.mod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "ShaderSystem")
@js.native
open class ShaderSystem protected ()
  extends StObject
     with ISystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: Renderer) = this()
  
  /* private */ var _uboCache: Any = js.native
  
  /**
    * Changes the current shader to the one given in parameter.
    * @param shader - the new shader
    * @param dontSync - false if the shader should automatically sync its uniforms.
    * @returns the glProgram that belongs to the shader.
    */
  def bind(shader: Shader): GLProgram = js.native
  def bind(shader: Shader, dontSync: Boolean): GLProgram = js.native
  
  /** Cache to holds the generated functions. Stored against UniformObjects unique signature. */
  /* private */ var cache: Any = js.native
  
  /* protected */ def contextChange(gl: IRenderingContext): Unit = js.native
  
  /**
    * Will create a function that uploads a uniform buffer using the STD140 standard.
    * The upload function will then be cached for future calls
    * If a group is manually managed, then a simple upload function is generated
    * @param group - the uniform buffer group to sync
    * @param glProgram - the gl program to attach the uniform bindings to
    * @param name - the name of the uniform buffer (must exist on the shader)
    */
  /* protected */ def createSyncBufferGroup(group: UniformGroup[Dict[Any]], glProgram: GLProgram, name: String): UniformsSyncCallback2 = js.native
  
  def createSyncGroups(group: UniformGroup[Dict[Any]]): UniformsSyncCallback2 = js.native
  
  /** Generic destroy methods to be overridden by the subclass */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  var destroyed: Boolean = js.native
  
  /**
    * Generates a glProgram version of the Shader provided.
    * @param shader - The shader that the glProgram will be based on.
    * @returns A shiny new glProgram!
    */
  def generateProgram(shader: Shader): GLProgram = js.native
  
  /**
    * Returns the underlying GLShade rof the currently bound shader.
    *
    * This can be handy for when you to have a little more control over the setting of your uniforms.
    * @returns The glProgram for the currently bound Shader for this context
    */
  def getGlProgram(): GLProgram = js.native
  
  /**
    * Takes a uniform group and data and generates a unique signature for them.
    * @param group - The uniform group to get signature of
    * @param group.uniforms
    * @param uniformData - Uniform information generated by the shader
    * @param preFix
    * @returns Unique signature of the uniform group
    */
  /* private */ var getSignature: Any = js.native
  
  /**
    * The current WebGL rendering context.
    * @member {WebGLRenderingContext}
    */
  /* protected */ var gl: IRenderingContext = js.native
  
  var id: Double = js.native
  
  var program: Program = js.native
  
  /* private */ var renderer: Any = js.native
  
  /** Resets ShaderSystem state, does not affect WebGL state. */
  def reset(): Unit = js.native
  
  /**
    * Uploads the uniforms values to the currently bound shader.
    * @param uniforms - the uniforms values that be applied to the current shader
    */
  def setUniforms(uniforms: Dict[Any]): Unit = js.native
  
  var shader: Shader = js.native
  
  /**
    * Syncs uniform buffers
    * @param group - the uniform buffer group to sync
    * @param name - the name of the uniform buffer
    */
  def syncUniformBufferGroup(group: UniformGroup[Dict[Any]]): Unit = js.native
  def syncUniformBufferGroup(group: UniformGroup[Dict[Any]], name: String): Unit = js.native
  
  /**
    * Syncs uniforms on the group
    * @param group - the uniform group to sync
    * @param syncData - this is data that is passed to the sync function and any nested sync functions
    */
  def syncUniformGroup(group: UniformGroup[Dict[Any]]): Unit = js.native
  def syncUniformGroup(group: UniformGroup[Dict[Any]], syncData: Any): Unit = js.native
  
  /**
    * Overrideable by the @pixi/unsafe-eval package to use static syncUniforms instead.
    * @param group
    * @param glProgram
    * @param syncData
    */
  def syncUniforms(group: UniformGroup[Dict[Any]], glProgram: GLProgram, syncData: Any): Unit = js.native
  
  /**
    * Overrideable function by `@pixi/unsafe-eval` to silence
    * throwing an error if platform doesn't support unsafe-evals.
    * @private
    */
  def systemCheck(): Unit = js.native
}
