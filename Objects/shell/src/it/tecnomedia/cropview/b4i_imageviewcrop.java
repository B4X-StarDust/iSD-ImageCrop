
package it.tecnomedia.cropview;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_imageviewcrop {
    public static RemoteObject myClass;
	public b4i_imageviewcrop() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_imageviewcrop.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("NSObject");
public static RemoteObject _mbase = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _demo = RemoteObject.createImmutable(false);
public static RemoteObject _sizepoint = RemoteObject.createImmutable(0);
public static RemoteObject _sizecircle = RemoteObject.createImmutable(0);
public static RemoteObject _cropmode = RemoteObject.createImmutable("");
public static RemoteObject _imageview1 = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _colorbc = RemoteObject.declareNull("b4i_bitmapcreator");
public static RemoteObject _greybc = RemoteObject.declareNull("b4i_bitmapcreator");
public static RemoteObject _cropbc = RemoteObject.declareNull("b4i_bitmapcreator");
public static RemoteObject _targetbc = RemoteObject.declareNull("b4i_bitmapcreator");
public static RemoteObject _originalbmp = RemoteObject.declareNull("B4XBitmapWrapper");
public static RemoteObject _rotatebmp = RemoteObject.declareNull("B4XBitmapWrapper");
public static RemoteObject _selectionrect = RemoteObject.declareNull("B4XRect");
public static RemoteObject _pnl = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _ghierazoom = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _ghierarotate = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _originalx = RemoteObject.createImmutable(0);
public static RemoteObject _originaly = RemoteObject.createImmutable(0);
public static RemoteObject _offsetx = RemoteObject.createImmutable(0);
public static RemoteObject _offsety = RemoteObject.createImmutable(0);
public static RemoteObject _operation = RemoteObject.createImmutable(0);
public static RemoteObject _fingers = RemoteObject.declareNull("B4IMap");
public static RemoteObject _fingerslist = RemoteObject.declareNull("B4IList");
public static RemoteObject _xi = RemoteObject.createImmutable(0.0f);
public static RemoteObject _yi = RemoteObject.createImmutable(0.0f);
public static RemoteObject _xf = RemoteObject.createImmutable(0.0f);
public static RemoteObject _yf = RemoteObject.createImmutable(0.0f);
public static RemoteObject _sx = RemoteObject.createImmutable(0.0f);
public static RemoteObject _sy = RemoteObject.createImmutable(0.0f);
public static RemoteObject _zoom = RemoteObject.createImmutable(0.0f);
public static RemoteObject _zoomposition = RemoteObject.createImmutable(0.0f);
public static RemoteObject _degree = RemoteObject.createImmutable(0.0f);
public static RemoteObject _demolabel = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _nativeme = RemoteObject.declareNull("B4INativeObject");
public static b4i_main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ColorBC",_ref.getField(false, "_colorbc"),"CropBC",_ref.getField(false, "_cropbc"),"CropMode",_ref.getField(false, "_cropmode"),"Degree",_ref.getField(false, "_degree"),"Demo",_ref.getField(false, "_demo"),"DemoLabel",_ref.getField(false, "_demolabel"),"fingers",_ref.getField(false, "_fingers"),"fingersList",_ref.getField(false, "_fingerslist"),"GhieraRotate",_ref.getField(false, "_ghierarotate"),"GhieraZoom",_ref.getField(false, "_ghierazoom"),"GreyBC",_ref.getField(false, "_greybc"),"ImageView1",_ref.getField(false, "_imageview1"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"NativeMe",_ref.getField(false, "_nativeme"),"OffsetX",_ref.getField(false, "_offsetx"),"OffsetY",_ref.getField(false, "_offsety"),"Operation",_ref.getField(false, "_operation"),"OriginalBmp",_ref.getField(false, "_originalbmp"),"OriginalX",_ref.getField(false, "_originalx"),"OriginalY",_ref.getField(false, "_originaly"),"pnl",_ref.getField(false, "_pnl"),"RotateBmp",_ref.getField(false, "_rotatebmp"),"SelectionRect",_ref.getField(false, "_selectionrect"),"SizeCircle",_ref.getField(false, "_sizecircle"),"SizePoint",_ref.getField(false, "_sizepoint"),"sx",_ref.getField(false, "_sx"),"sy",_ref.getField(false, "_sy"),"TargetBC",_ref.getField(false, "_targetbc"),"Xf",_ref.getField(false, "_xf"),"Xi",_ref.getField(false, "_xi"),"xui",_ref.getField(false, "_xui"),"Yf",_ref.getField(false, "_yf"),"Yi",_ref.getField(false, "_yi"),"Zoom",_ref.getField(false, "_zoom"),"ZoomPosition",_ref.getField(false, "_zoomposition")};
}
}