package typingsJapgolly.reactContextmenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.ReactText
import typingsJapgolly.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-contextmenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-contextmenu", "ContextMenu")
  @js.native
  open class ContextMenu protected ()
    extends Component[ContextMenuProps, js.Object, Any] {
    def this(props: ContextMenuProps) = this()
    def this(props: ContextMenuProps, context: Any) = this()
  }
  @JSImport("react-contextmenu", "ContextMenu")
  @js.native
  val ContextMenu: ComponentClassP[ContextMenuProps & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-contextmenu", "ContextMenuTrigger")
  @js.native
  open class ContextMenuTrigger protected ()
    extends Component[ContextMenuTriggerProps, js.Object, Any] {
    def this(props: ContextMenuTriggerProps) = this()
    def this(props: ContextMenuTriggerProps, context: Any) = this()
  }
  @JSImport("react-contextmenu", "ContextMenuTrigger")
  @js.native
  val ContextMenuTrigger: ComponentClassP[ContextMenuTriggerProps & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-contextmenu", "MenuItem")
  @js.native
  open class MenuItem protected ()
    extends Component[MenuItemProps, js.Object, Any] {
    def this(props: MenuItemProps) = this()
    def this(props: MenuItemProps, context: Any) = this()
  }
  @JSImport("react-contextmenu", "MenuItem")
  @js.native
  val MenuItem: ComponentClassP[MenuItemProps & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-contextmenu", "SubMenu")
  @js.native
  open class SubMenu protected ()
    extends Component[SubMenuProps, js.Object, Any] {
    def this(props: SubMenuProps) = this()
    def this(props: SubMenuProps, context: Any) = this()
  }
  @JSImport("react-contextmenu", "SubMenu")
  @js.native
  val SubMenu: ComponentClassP[SubMenuProps & js.Object] = js.native
  
  inline def connectMenu(menuId: String): js.Function1[/* menu */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectMenu")(menuId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* menu */ Any, Any]]
  
  inline def hideMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideMenu")().asInstanceOf[Unit]
  inline def hideMenu(opts: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideMenu")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def hideMenu(opts: Any, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hideMenu")(opts.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hideMenu(opts: Unit, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hideMenu")(opts.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def showMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showMenu")().asInstanceOf[Unit]
  inline def showMenu(opts: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showMenu")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def showMenu(opts: Any, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showMenu")(opts.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def showMenu(opts: Unit, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showMenu")(opts.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ContextMenuProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var hideOnLeave: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var onHide: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[
        (js.Function3[
          /* event */ ReactMouseEventFrom[HTMLElement], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ Any, 
          /* target */ HTMLElement, 
          Unit
        ]) | js.Function
      ] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
  }
  object ContextMenuProps {
    
    inline def apply(id: String): ContextMenuProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuProps]
    }
    
    extension [Self <: ContextMenuProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHideOnLeave(value: Boolean): Self = StObject.set(x, "hideOnLeave", value.asInstanceOf[js.Any])
      
      inline def setHideOnLeaveUndefined: Self = StObject.set(x, "hideOnLeave", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnHide(value: /* event */ Any => Callback): Self = StObject.set(x, "onHide", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnMouseLeave(
        value: (js.Function3[
              /* event */ ReactMouseEventFrom[HTMLElement], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ Any, 
              /* target */ HTMLElement, 
              Unit
            ]) | js.Function
      ): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeaveFunction3(
        value: (/* event */ ReactMouseEventFrom[HTMLElement], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ Any, /* target */ HTMLElement) => Callback
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction3((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ Any, t2: /* target */ HTMLElement) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnShow(value: /* event */ Any => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
  
  trait ContextMenuTriggerProps extends StObject {
    
    var attributes: js.UndefOr[HTMLAttributes[Any]] = js.undefined
    
    var collect: js.UndefOr[js.Function1[/* data */ Any, Any]] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var holdToDisplay: js.UndefOr[Double] = js.undefined
    
    var id: String
    
    var renderTag: js.UndefOr[ReactType[Any]] = js.undefined
  }
  object ContextMenuTriggerProps {
    
    inline def apply(id: String): ContextMenuTriggerProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuTriggerProps]
    }
    
    extension [Self <: ContextMenuTriggerProps](x: Self) {
      
      inline def setAttributes(value: HTMLAttributes[Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setCollect(value: /* data */ Any => Any): Self = StObject.set(x, "collect", js.Any.fromFunction1(value))
      
      inline def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setHoldToDisplay(value: Double): Self = StObject.set(x, "holdToDisplay", value.asInstanceOf[js.Any])
      
      inline def setHoldToDisplayUndefined: Self = StObject.set(x, "holdToDisplay", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRenderTag(value: ReactType[Any]): Self = StObject.set(x, "renderTag", value.asInstanceOf[js.Any])
      
      inline def setRenderTagUndefined: Self = StObject.set(x, "renderTag", js.undefined)
    }
  }
  
  trait MenuItemProps extends StObject {
    
    var attributes: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ Any
      ] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var divider: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[
        (js.Function3[
          /* event */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ Any, 
          /* target */ HTMLElement, 
          Unit
        ]) | js.Function
      ] = js.undefined
    
    var preventClose: js.UndefOr[Boolean] = js.undefined
  }
  object MenuItemProps {
    
    inline def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    extension [Self <: MenuItemProps](x: Self) {
      
      inline def setAttributes(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ Any
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setOnClick(
        value: (js.Function3[
              /* event */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ Any, 
              /* target */ HTMLElement, 
              Unit
            ]) | js.Function
      ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickFunction3(
        value: (/* event */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ Any, /* target */ HTMLElement) => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction3((t0: /* event */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement], t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ Any, t2: /* target */ HTMLElement) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPreventClose(value: Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
      
      inline def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    }
  }
  
  trait SubMenuProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hoverDelay: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[
        (js.Function3[
          /* event */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ Any, 
          /* target */ HTMLElement, 
          Unit
        ]) | js.Function
      ] = js.undefined
    
    var preventCloseOnClick: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var title: Element | ReactText
  }
  object SubMenuProps {
    
    inline def apply(title: Element | ReactText): SubMenuProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubMenuProps]
    }
    
    extension [Self <: SubMenuProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
      
      inline def setOnClick(
        value: (js.Function3[
              /* event */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ Any, 
              /* target */ HTMLElement, 
              Unit
            ]) | js.Function
      ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickFunction3(
        value: (/* event */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ Any, /* target */ HTMLElement) => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction3((t0: /* event */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement], t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ Any, t2: /* target */ HTMLElement) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPreventCloseOnClick(value: Boolean): Self = StObject.set(x, "preventCloseOnClick", value.asInstanceOf[js.Any])
      
      inline def setPreventCloseOnClickUndefined: Self = StObject.set(x, "preventCloseOnClick", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setTitle(value: Element | ReactText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
