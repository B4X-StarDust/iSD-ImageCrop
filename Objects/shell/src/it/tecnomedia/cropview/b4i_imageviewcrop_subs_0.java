package it.tecnomedia.cropview;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_imageviewcrop_subs_0 {


public static RemoteObject  _activecutimage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActiveCutImage (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,124);
if (RapidSub.canDelegate("activecutimage")) { return __ref.runUserSub(false, "imageviewcrop","activecutimage", __ref);}
 BA.debugLineNum = 124;BA.debugLine="Public Sub ActiveCutImage";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="Operation=0";
Debug.ShouldStop(268435456);
__ref.setField ("_operation",BA.numberCast(int.class, 0));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activemoveimage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActiveMoveImage (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,129);
if (RapidSub.canDelegate("activemoveimage")) { return __ref.runUserSub(false, "imageviewcrop","activemoveimage", __ref);}
 BA.debugLineNum = 129;BA.debugLine="Public Sub ActiveMoveImage";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Operation=1";
Debug.ShouldStop(2);
__ref.setField ("_operation",BA.numberCast(int.class, 1));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activerotateimage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActiveRotateImage (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,134);
if (RapidSub.canDelegate("activerotateimage")) { return __ref.runUserSub(false, "imageviewcrop","activerotateimage", __ref);}
 BA.debugLineNum = 134;BA.debugLine="Public Sub ActiveRotateImage";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="GhieraRotate.Visible=Not(GhieraRotate.visible)";
Debug.ShouldStop(64);
__ref.getField(false,"_ghierarotate").runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"Not:",(Object)(__ref.getField(false,"_ghierarotate").runMethod(true,"Visible"))));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activezoomimage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActiveZoomImage (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,139);
if (RapidSub.canDelegate("activezoomimage")) { return __ref.runUserSub(false, "imageviewcrop","activezoomimage", __ref);}
 BA.debugLineNum = 139;BA.debugLine="Public Sub ActiveZoomImage";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="If GhieraZoom.Visible Then";
Debug.ShouldStop(2048);
if (__ref.getField(false,"_ghierazoom").runMethod(true,"Visible").getBoolean()) { 
 BA.debugLineNum = 141;BA.debugLine="GhieraZoom.Visible=False";
Debug.ShouldStop(4096);
__ref.getField(false,"_ghierazoom").runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 }else {
 BA.debugLineNum = 143;BA.debugLine="SelectionRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(16384);
__ref.getField(false,"_selectionrect").runVoidMethod ("Initialize::::",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 144;BA.debugLine="CropBC=GreyBC";
Debug.ShouldStop(32768);
__ref.setField ("_cropbc",__ref.getField(false,"_greybc"));
 BA.debugLineNum = 145;BA.debugLine="Yi=-50";
Debug.ShouldStop(65536);
__ref.setField ("_yi",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 146;BA.debugLine="Xf=-50";
Debug.ShouldStop(131072);
__ref.setField ("_xf",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 147;BA.debugLine="Yf=-50";
Debug.ShouldStop(262144);
__ref.setField ("_yf",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 148;BA.debugLine="sx=-SizeCircle";
Debug.ShouldStop(524288);
__ref.setField ("_sx",BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_sizecircle").<Number>get().intValue())));
 BA.debugLineNum = 149;BA.debugLine="sy=-SizeCircle";
Debug.ShouldStop(1048576);
__ref.setField ("_sy",BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_sizecircle").<Number>get().intValue())));
 BA.debugLineNum = 150;BA.debugLine="GhieraZoom.Visible=True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_ghierazoom").runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"True"));
 };
 BA.debugLineNum = 153;BA.debugLine="UpdateTarget";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4i_imageviewcrop.class, "_updatetarget");
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,89);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "imageviewcrop","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 89;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnl").runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 91;BA.debugLine="GhieraZoom.SetLayoutAnimated(0, 0, Height-30, Wid";
Debug.ShouldStop(67108864);
__ref.getField(false,"_ghierazoom").runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(30)}, "-",1, 0))),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, 30)));
 BA.debugLineNum = 92;BA.debugLine="GhieraRotate.SetLayoutAnimated(0, 0, 0, Width, 30";
Debug.ShouldStop(134217728);
__ref.getField(false,"_ghierarotate").runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, 30)));
 BA.debugLineNum = 93;BA.debugLine="If Demo Then DemoLabel.SetLayoutAnimated(0, 0,Hei";
Debug.ShouldStop(268435456);
if (__ref.getField(true,"_demo").getBoolean()) { 
__ref.getField(false,"_demolabel").runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, 20)));};
 BA.debugLineNum = 95;BA.debugLine="DrawGhieraRotate";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawghierarotate");
 BA.debugLineNum = 96;BA.debugLine="DrawGhieraZoom";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawghierazoom");
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private mEventName As String 'ignore";
b4i_imageviewcrop._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4i_imageviewcrop._meventname);
 //BA.debugLineNum = 5;BA.debugLine="Private mCallBack As Object 'ignore";
b4i_imageviewcrop._mcallback = RemoteObject.createNew ("NSObject");__ref.setField("_mcallback",b4i_imageviewcrop._mcallback);
 //BA.debugLineNum = 6;BA.debugLine="Private mBase As B4XView 'ignore";
b4i_imageviewcrop._mbase = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mbase",b4i_imageviewcrop._mbase);
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI 'ignore";
b4i_imageviewcrop._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_imageviewcrop._xui);
 //BA.debugLineNum = 9;BA.debugLine="Private Demo As Boolean = True";
b4i_imageviewcrop._demo = b4i_main.__c.runMethod(true,"True");__ref.setField("_demo",b4i_imageviewcrop._demo);
 //BA.debugLineNum = 10;BA.debugLine="Private Const SizePoint As Int = 10dip";
b4i_imageviewcrop._sizepoint = b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 10)));__ref.setField("_sizepoint",b4i_imageviewcrop._sizepoint);
 //BA.debugLineNum = 11;BA.debugLine="Private Const SizeCircle As Int = 20dip";
b4i_imageviewcrop._sizecircle = b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 20)));__ref.setField("_sizecircle",b4i_imageviewcrop._sizecircle);
 //BA.debugLineNum = 13;BA.debugLine="Private CropMode As String = \"Square\"";
b4i_imageviewcrop._cropmode = BA.ObjectToString("Square");__ref.setField("_cropmode",b4i_imageviewcrop._cropmode);
 //BA.debugLineNum = 14;BA.debugLine="Private ImageView1 As ImageView";
b4i_imageviewcrop._imageview1 = RemoteObject.createNew ("B4IImageViewWrapper");__ref.setField("_imageview1",b4i_imageviewcrop._imageview1);
 //BA.debugLineNum = 15;BA.debugLine="Private ColorBC, GreyBC, CropBC, TargetBC As Bitm";
b4i_imageviewcrop._colorbc = RemoteObject.createNew ("b4i_bitmapcreator");__ref.setField("_colorbc",b4i_imageviewcrop._colorbc);
b4i_imageviewcrop._greybc = RemoteObject.createNew ("b4i_bitmapcreator");__ref.setField("_greybc",b4i_imageviewcrop._greybc);
b4i_imageviewcrop._cropbc = RemoteObject.createNew ("b4i_bitmapcreator");__ref.setField("_cropbc",b4i_imageviewcrop._cropbc);
b4i_imageviewcrop._targetbc = RemoteObject.createNew ("b4i_bitmapcreator");__ref.setField("_targetbc",b4i_imageviewcrop._targetbc);
 //BA.debugLineNum = 16;BA.debugLine="Private OriginalBmp, RotateBmp As B4XBitmap";
b4i_imageviewcrop._originalbmp = RemoteObject.createNew ("B4XBitmapWrapper");__ref.setField("_originalbmp",b4i_imageviewcrop._originalbmp);
b4i_imageviewcrop._rotatebmp = RemoteObject.createNew ("B4XBitmapWrapper");__ref.setField("_rotatebmp",b4i_imageviewcrop._rotatebmp);
 //BA.debugLineNum = 17;BA.debugLine="Private SelectionRect As B4XRect";
b4i_imageviewcrop._selectionrect = RemoteObject.createNew ("B4XRect");__ref.setField("_selectionrect",b4i_imageviewcrop._selectionrect);
 //BA.debugLineNum = 18;BA.debugLine="Private pnl,GhieraZoom,GhieraRotate As B4XView";
b4i_imageviewcrop._pnl = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_pnl",b4i_imageviewcrop._pnl);
b4i_imageviewcrop._ghierazoom = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_ghierazoom",b4i_imageviewcrop._ghierazoom);
b4i_imageviewcrop._ghierarotate = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_ghierarotate",b4i_imageviewcrop._ghierarotate);
 //BA.debugLineNum = 19;BA.debugLine="Private OriginalX,OriginalY As Int";
b4i_imageviewcrop._originalx = RemoteObject.createImmutable(0);__ref.setField("_originalx",b4i_imageviewcrop._originalx);
b4i_imageviewcrop._originaly = RemoteObject.createImmutable(0);__ref.setField("_originaly",b4i_imageviewcrop._originaly);
 //BA.debugLineNum = 20;BA.debugLine="Private OffsetX, OffsetY As Int";
b4i_imageviewcrop._offsetx = RemoteObject.createImmutable(0);__ref.setField("_offsetx",b4i_imageviewcrop._offsetx);
b4i_imageviewcrop._offsety = RemoteObject.createImmutable(0);__ref.setField("_offsety",b4i_imageviewcrop._offsety);
 //BA.debugLineNum = 21;BA.debugLine="Private Operation As Int = 0 ' 0-Cut 1-Move";
b4i_imageviewcrop._operation = BA.numberCast(int.class, 0);__ref.setField("_operation",b4i_imageviewcrop._operation);
 //BA.debugLineNum = 22;BA.debugLine="Private fingers As Map";
b4i_imageviewcrop._fingers = RemoteObject.createNew ("B4IMap");__ref.setField("_fingers",b4i_imageviewcrop._fingers);
 //BA.debugLineNum = 23;BA.debugLine="Private fingersList As List";
b4i_imageviewcrop._fingerslist = RemoteObject.createNew ("B4IList");__ref.setField("_fingerslist",b4i_imageviewcrop._fingerslist);
 //BA.debugLineNum = 24;BA.debugLine="Private Xi,Yi,Xf,Yf,sx,sy As Float";
b4i_imageviewcrop._xi = RemoteObject.createImmutable(0.0f);__ref.setField("_xi",b4i_imageviewcrop._xi);
b4i_imageviewcrop._yi = RemoteObject.createImmutable(0.0f);__ref.setField("_yi",b4i_imageviewcrop._yi);
b4i_imageviewcrop._xf = RemoteObject.createImmutable(0.0f);__ref.setField("_xf",b4i_imageviewcrop._xf);
b4i_imageviewcrop._yf = RemoteObject.createImmutable(0.0f);__ref.setField("_yf",b4i_imageviewcrop._yf);
b4i_imageviewcrop._sx = RemoteObject.createImmutable(0.0f);__ref.setField("_sx",b4i_imageviewcrop._sx);
b4i_imageviewcrop._sy = RemoteObject.createImmutable(0.0f);__ref.setField("_sy",b4i_imageviewcrop._sy);
 //BA.debugLineNum = 25;BA.debugLine="Private Zoom As Float = 1";
b4i_imageviewcrop._zoom = BA.numberCast(float.class, 1);__ref.setField("_zoom",b4i_imageviewcrop._zoom);
 //BA.debugLineNum = 26;BA.debugLine="Private ZoomPosition As Float = 0.5";
b4i_imageviewcrop._zoomposition = BA.numberCast(float.class, 0.5);__ref.setField("_zoomposition",b4i_imageviewcrop._zoomposition);
 //BA.debugLineNum = 27;BA.debugLine="Private Degree As Float = 0";
b4i_imageviewcrop._degree = BA.numberCast(float.class, 0);__ref.setField("_degree",b4i_imageviewcrop._degree);
 //BA.debugLineNum = 29;BA.debugLine="Private DemoLabel As B4XView";
b4i_imageviewcrop._demolabel = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_demolabel",b4i_imageviewcrop._demolabel);
 //BA.debugLineNum = 31;BA.debugLine="Type C_Type(X As Int,Y As Int,Xf As Int, Yf As I";
;
 //BA.debugLineNum = 32;BA.debugLine="Private fingers As Map";
b4i_imageviewcrop._fingers = RemoteObject.createNew ("B4IMap");__ref.setField("_fingers",b4i_imageviewcrop._fingers);
 //BA.debugLineNum = 33;BA.debugLine="Private NativeMe As NativeObject";
b4i_imageviewcrop._nativeme = RemoteObject.createNew ("B4INativeObject");__ref.setField("_nativeme",b4i_imageviewcrop._nativeme);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createroundbitmap(RemoteObject __ref,RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("CreateRoundBitmap (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,331);
if (RapidSub.canDelegate("createroundbitmap")) { return __ref.runUserSub(false, "imageviewcrop","createroundbitmap", __ref, _image);}
RemoteObject _can = RemoteObject.declareNull("B4XCanvas");
RemoteObject _xview = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _path = RemoteObject.declareNull("B4XPath");
RemoteObject _res = RemoteObject.declareNull("B4XBitmapWrapper");
Debug.locals.put("Image", _image);
 BA.debugLineNum = 331;BA.debugLine="Private Sub CreateRoundBitmap(Image As B4XBitmap)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 332;BA.debugLine="Dim Can As B4XCanvas";
Debug.ShouldStop(2048);
_can = RemoteObject.createNew ("B4XCanvas");Debug.locals.put("Can", _can);
 BA.debugLineNum = 333;BA.debugLine="Dim xview As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4096);
_xview = RemoteObject.createNew ("B4XViewWrapper");
_xview = __ref.getField(false,"_xui").runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xview", _xview);Debug.locals.put("xview", _xview);
 BA.debugLineNum = 334;BA.debugLine="xview.SetLayoutAnimated(0, 0, 0, Image.Width, Ima";
Debug.ShouldStop(8192);
_xview.runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(_image.runMethod(true,"Width")),(Object)(_image.runMethod(true,"Height")));
 BA.debugLineNum = 335;BA.debugLine="Can.Initialize(xview)";
Debug.ShouldStop(16384);
_can.runVoidMethod ("Initialize:",(Object)(((_xview).getObject())));
 BA.debugLineNum = 336;BA.debugLine="Dim path As B4XPath";
Debug.ShouldStop(32768);
_path = RemoteObject.createNew ("B4XPath");Debug.locals.put("path", _path);
 BA.debugLineNum = 337;BA.debugLine="path.InitializeOval(Can.TargetRect)";
Debug.ShouldStop(65536);
_path.runVoidMethod ("InitializeOval:",(Object)(_can.runMethod(false,"TargetRect")));
 BA.debugLineNum = 338;BA.debugLine="Can.ClipPath(path)";
Debug.ShouldStop(131072);
_can.runVoidMethod ("ClipPath:",(Object)(_path));
 BA.debugLineNum = 339;BA.debugLine="Can.DrawBitmap(Image, Can.TargetRect)";
Debug.ShouldStop(262144);
_can.runVoidMethod ("DrawBitmap::",(Object)(((_image).getObject())),(Object)(_can.runMethod(false,"TargetRect")));
 BA.debugLineNum = 340;BA.debugLine="Can.RemoveClip";
Debug.ShouldStop(524288);
_can.runVoidMethod ("RemoveClip");
 BA.debugLineNum = 341;BA.debugLine="Can.Invalidate";
Debug.ShouldStop(1048576);
_can.runVoidMethod ("Invalidate");
 BA.debugLineNum = 342;BA.debugLine="Dim res As B4XBitmap = Can.CreateBitmap";
Debug.ShouldStop(2097152);
_res = RemoteObject.createNew ("B4XBitmapWrapper");
_res = _can.runMethod(false,"CreateBitmap");Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 343;BA.debugLine="Can.Release";
Debug.ShouldStop(4194304);
_can.runVoidMethod ("Release");
 BA.debugLineNum = 345;BA.debugLine="Return res";
Debug.ShouldStop(16777216);
if (true) return _res;
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createroundbitmapcreator(RemoteObject __ref,RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("CreateRoundBitmapCreator (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,273);
if (RapidSub.canDelegate("createroundbitmapcreator")) { return __ref.runUserSub(false, "imageviewcrop","createroundbitmapcreator", __ref, _image);}
RemoteObject _can = RemoteObject.declareNull("B4XCanvas");
RemoteObject _xview = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _path = RemoteObject.declareNull("B4XPath");
RemoteObject _bm = RemoteObject.declareNull("B4XBitmapWrapper");
RemoteObject _res = RemoteObject.declareNull("B4XBitmapWrapper");
RemoteObject _bc = RemoteObject.declareNull("b4i_bitmapcreator");
Debug.locals.put("Image", _image);
 BA.debugLineNum = 273;BA.debugLine="Private Sub CreateRoundBitmapCreator(Image As Bitm";
Debug.ShouldStop(65536);
 BA.debugLineNum = 274;BA.debugLine="Dim Can As B4XCanvas";
Debug.ShouldStop(131072);
_can = RemoteObject.createNew ("B4XCanvas");Debug.locals.put("Can", _can);
 BA.debugLineNum = 275;BA.debugLine="Dim xview As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(262144);
_xview = RemoteObject.createNew ("B4XViewWrapper");
_xview = __ref.getField(false,"_xui").runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xview", _xview);Debug.locals.put("xview", _xview);
 BA.debugLineNum = 276;BA.debugLine="xview.SetLayoutAnimated(0, 0, 0, SelectionRect.Wi";
Debug.ShouldStop(524288);
_xview.runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_selectionrect").runMethod(true,"Width")),(Object)(__ref.getField(false,"_selectionrect").runMethod(true,"Height")));
 BA.debugLineNum = 277;BA.debugLine="Can.Initialize(xview)";
Debug.ShouldStop(1048576);
_can.runVoidMethod ("Initialize:",(Object)(((_xview).getObject())));
 BA.debugLineNum = 278;BA.debugLine="Dim path As B4XPath";
Debug.ShouldStop(2097152);
_path = RemoteObject.createNew ("B4XPath");Debug.locals.put("path", _path);
 BA.debugLineNum = 279;BA.debugLine="path.InitializeOval(Can.TargetRect)";
Debug.ShouldStop(4194304);
_path.runVoidMethod ("InitializeOval:",(Object)(_can.runMethod(false,"TargetRect")));
 BA.debugLineNum = 280;BA.debugLine="Can.ClipPath(path)";
Debug.ShouldStop(8388608);
_can.runVoidMethod ("ClipPath:",(Object)(_path));
 BA.debugLineNum = 281;BA.debugLine="Dim Bm As B4XBitmap = Image.Bitmap";
Debug.ShouldStop(16777216);
_bm = RemoteObject.createNew ("B4XBitmapWrapper");
_bm = _image.runMethod(false,"_getbitmap");Debug.locals.put("Bm", _bm);Debug.locals.put("Bm", _bm);
 BA.debugLineNum = 282;BA.debugLine="Bm=Bm.Resize(SelectionRect.Width, SelectionRect.H";
Debug.ShouldStop(33554432);
_bm = _bm.runMethod(false,"Resize:::",(Object)(__ref.getField(false,"_selectionrect").runMethod(true,"Width")),(Object)(__ref.getField(false,"_selectionrect").runMethod(true,"Height")),(Object)(b4i_main.__c.runMethod(true,"False")));Debug.locals.put("Bm", _bm);
 BA.debugLineNum = 283;BA.debugLine="Can.DrawBitmap(Bm, Can.TargetRect)";
Debug.ShouldStop(67108864);
_can.runVoidMethod ("DrawBitmap::",(Object)(((_bm).getObject())),(Object)(_can.runMethod(false,"TargetRect")));
 BA.debugLineNum = 284;BA.debugLine="Can.RemoveClip";
Debug.ShouldStop(134217728);
_can.runVoidMethod ("RemoveClip");
 BA.debugLineNum = 285;BA.debugLine="Can.Invalidate";
Debug.ShouldStop(268435456);
_can.runVoidMethod ("Invalidate");
 BA.debugLineNum = 286;BA.debugLine="Dim res As B4XBitmap = Can.CreateBitmap";
Debug.ShouldStop(536870912);
_res = RemoteObject.createNew ("B4XBitmapWrapper");
_res = _can.runMethod(false,"CreateBitmap");Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 287;BA.debugLine="Can.Release";
Debug.ShouldStop(1073741824);
_can.runVoidMethod ("Release");
 BA.debugLineNum = 289;BA.debugLine="Dim BC As BitmapCreator";
Debug.ShouldStop(1);
_bc = RemoteObject.createNew ("b4i_bitmapcreator");Debug.locals.put("BC", _bc);
 BA.debugLineNum = 290;BA.debugLine="BC.Initialize(res.Width,res.Height)";
Debug.ShouldStop(2);
_bc.runVoidMethod ("_initialize:::",__ref.getField(false, "bi"),(Object)(BA.numberCast(int.class, _res.runMethod(true,"Width"))),(Object)(BA.numberCast(int.class, _res.runMethod(true,"Height"))));
 BA.debugLineNum = 291;BA.debugLine="BC.DrawBitmap(res,BC.TargetRect,True)";
Debug.ShouldStop(4);
_bc.runVoidMethod ("_drawbitmap:::",(Object)(_res),(Object)(_bc.getField(false,"_targetrect")),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 292;BA.debugLine="Return BC";
Debug.ShouldStop(8);
if (true) return _bc;
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createstarbitmap(RemoteObject __ref,RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("CreateStarBitmap (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,348);
if (RapidSub.canDelegate("createstarbitmap")) { return __ref.runUserSub(false, "imageviewcrop","createstarbitmap", __ref, _image);}
RemoteObject _can = RemoteObject.declareNull("B4XCanvas");
RemoteObject _xview = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _path = RemoteObject.declareNull("B4XPath");
RemoteObject _xx = RemoteObject.createImmutable(0.0f);
RemoteObject _yy = RemoteObject.createImmutable(0.0f);
RemoteObject _ray = RemoteObject.createImmutable(0.0f);
int _i = 0;
RemoteObject _res = RemoteObject.declareNull("B4XBitmapWrapper");
Debug.locals.put("Image", _image);
 BA.debugLineNum = 348;BA.debugLine="Private Sub CreateStarBitmap(Image As B4XBitmap) A";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 349;BA.debugLine="Dim Can As B4XCanvas";
Debug.ShouldStop(268435456);
_can = RemoteObject.createNew ("B4XCanvas");Debug.locals.put("Can", _can);
 BA.debugLineNum = 350;BA.debugLine="Dim xview As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(536870912);
_xview = RemoteObject.createNew ("B4XViewWrapper");
_xview = __ref.getField(false,"_xui").runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xview", _xview);Debug.locals.put("xview", _xview);
 BA.debugLineNum = 351;BA.debugLine="xview.SetLayoutAnimated(0, 0, 0, Image.Width, Ima";
Debug.ShouldStop(1073741824);
_xview.runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(_image.runMethod(true,"Width")),(Object)(_image.runMethod(true,"Height")));
 BA.debugLineNum = 352;BA.debugLine="Can.Initialize(xview)";
Debug.ShouldStop(-2147483648);
_can.runVoidMethod ("Initialize:",(Object)(((_xview).getObject())));
 BA.debugLineNum = 353;BA.debugLine="Dim path As B4XPath";
Debug.ShouldStop(1);
_path = RemoteObject.createNew ("B4XPath");Debug.locals.put("path", _path);
 BA.debugLineNum = 354;BA.debugLine="path.InitializeOval(Can.TargetRect)";
Debug.ShouldStop(2);
_path.runVoidMethod ("InitializeOval:",(Object)(_can.runMethod(false,"TargetRect")));
 BA.debugLineNum = 357;BA.debugLine="Dim xx As Float = Can.TargetRect.CenterX";
Debug.ShouldStop(16);
_xx = _can.runMethod(false,"TargetRect").runMethod(true,"CenterX");Debug.locals.put("xx", _xx);Debug.locals.put("xx", _xx);
 BA.debugLineNum = 358;BA.debugLine="Dim yy As Float = Can.TargetRect.CenterY";
Debug.ShouldStop(32);
_yy = _can.runMethod(false,"TargetRect").runMethod(true,"CenterY");Debug.locals.put("yy", _yy);Debug.locals.put("yy", _yy);
 BA.debugLineNum = 359;BA.debugLine="Dim Ray As Float = Min(Can.TargetRect.Width,Can.T";
Debug.ShouldStop(64);
_ray = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, _can.runMethod(false,"TargetRect").runMethod(true,"Width"))),(Object)(BA.numberCast(double.class, _can.runMethod(false,"TargetRect").runMethod(true,"Height")))),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Ray", _ray);Debug.locals.put("Ray", _ray);
 BA.debugLineNum = 360;BA.debugLine="For i=0 To 9";
Debug.ShouldStop(128);
{
final int step10 = 1;
final int limit10 = 9;
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 361;BA.debugLine="If i=0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 362;BA.debugLine="path.Initialize(xx+Ray*CosD(-90+i*36),yy+Ray*Si";
Debug.ShouldStop(512);
_path.runVoidMethod ("Initialize::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_xx,_ray,b4i_main.__c.runMethod(true,"CosD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_yy,_ray,b4i_main.__c.runMethod(true,"SinD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36))))}, "+*",1, 0))));
 }else 
{ BA.debugLineNum = 363;BA.debugLine="else If i/2=Floor(i/2) Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "/",0, 0),b4i_main.__c.runMethod(true,"Floor:",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "/",0, 0))))) { 
 BA.debugLineNum = 364;BA.debugLine="path.LineTo(xx+Ray*CosD(-90+i*36),yy+Ray*SinD(-";
Debug.ShouldStop(2048);
_path.runVoidMethod ("LineTo::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_xx,_ray,b4i_main.__c.runMethod(true,"CosD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_yy,_ray,b4i_main.__c.runMethod(true,"SinD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36))))}, "+*",1, 0))));
 }else {
 BA.debugLineNum = 366;BA.debugLine="path.LineTo(xx+Ray*CosD(-90+i*36)/2,yy+Ray*SinD";
Debug.ShouldStop(8192);
_path.runVoidMethod ("LineTo::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_xx,_ray,b4i_main.__c.runMethod(true,"CosD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36)))),RemoteObject.createImmutable(2)}, "+*/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_yy,_ray,b4i_main.__c.runMethod(true,"SinD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36)))),RemoteObject.createImmutable(2)}, "+*/",1, 0))));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 370;BA.debugLine="Can.ClipPath(path)";
Debug.ShouldStop(131072);
_can.runVoidMethod ("ClipPath:",(Object)(_path));
 BA.debugLineNum = 371;BA.debugLine="Can.DrawBitmap(Image, Can.TargetRect)";
Debug.ShouldStop(262144);
_can.runVoidMethod ("DrawBitmap::",(Object)(((_image).getObject())),(Object)(_can.runMethod(false,"TargetRect")));
 BA.debugLineNum = 372;BA.debugLine="Can.RemoveClip";
Debug.ShouldStop(524288);
_can.runVoidMethod ("RemoveClip");
 BA.debugLineNum = 373;BA.debugLine="Can.Invalidate";
Debug.ShouldStop(1048576);
_can.runVoidMethod ("Invalidate");
 BA.debugLineNum = 374;BA.debugLine="Dim res As B4XBitmap = Can.CreateBitmap";
Debug.ShouldStop(2097152);
_res = RemoteObject.createNew ("B4XBitmapWrapper");
_res = _can.runMethod(false,"CreateBitmap");Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 375;BA.debugLine="Can.Release";
Debug.ShouldStop(4194304);
_can.runVoidMethod ("Release");
 BA.debugLineNum = 377;BA.debugLine="Return res";
Debug.ShouldStop(16777216);
if (true) return _res;
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createstarbitmapcreator(RemoteObject __ref,RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("CreateStarBitmapCreator (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,295);
if (RapidSub.canDelegate("createstarbitmapcreator")) { return __ref.runUserSub(false, "imageviewcrop","createstarbitmapcreator", __ref, _image);}
RemoteObject _can = RemoteObject.declareNull("B4XCanvas");
RemoteObject _xview = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _path = RemoteObject.declareNull("B4XPath");
RemoteObject _xx = RemoteObject.createImmutable(0.0f);
RemoteObject _yy = RemoteObject.createImmutable(0.0f);
RemoteObject _ray = RemoteObject.createImmutable(0.0f);
int _i = 0;
RemoteObject _bm = RemoteObject.declareNull("B4XBitmapWrapper");
RemoteObject _res = RemoteObject.declareNull("B4XBitmapWrapper");
RemoteObject _bc = RemoteObject.declareNull("b4i_bitmapcreator");
Debug.locals.put("Image", _image);
 BA.debugLineNum = 295;BA.debugLine="Private Sub CreateStarBitmapCreator(Image As Bitma";
Debug.ShouldStop(64);
 BA.debugLineNum = 296;BA.debugLine="Dim Can As B4XCanvas";
Debug.ShouldStop(128);
_can = RemoteObject.createNew ("B4XCanvas");Debug.locals.put("Can", _can);
 BA.debugLineNum = 297;BA.debugLine="Dim xview As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(256);
_xview = RemoteObject.createNew ("B4XViewWrapper");
_xview = __ref.getField(false,"_xui").runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xview", _xview);Debug.locals.put("xview", _xview);
 BA.debugLineNum = 298;BA.debugLine="xview.SetLayoutAnimated(0, 0, 0, SelectionRect.Wi";
Debug.ShouldStop(512);
_xview.runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_selectionrect").runMethod(true,"Width")),(Object)(__ref.getField(false,"_selectionrect").runMethod(true,"Height")));
 BA.debugLineNum = 299;BA.debugLine="Can.Initialize(xview)";
Debug.ShouldStop(1024);
_can.runVoidMethod ("Initialize:",(Object)(((_xview).getObject())));
 BA.debugLineNum = 300;BA.debugLine="Dim path As B4XPath";
Debug.ShouldStop(2048);
_path = RemoteObject.createNew ("B4XPath");Debug.locals.put("path", _path);
 BA.debugLineNum = 303;BA.debugLine="Dim xx As Float = SelectionRect.CenterX-Selection";
Debug.ShouldStop(16384);
_xx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"CenterX"),__ref.getField(false,"_selectionrect").runMethod(true,"Left")}, "-",1, 0));Debug.locals.put("xx", _xx);Debug.locals.put("xx", _xx);
 BA.debugLineNum = 304;BA.debugLine="Dim yy As Float = SelectionRect.CenterY-Selection";
Debug.ShouldStop(32768);
_yy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"CenterY"),__ref.getField(false,"_selectionrect").runMethod(true,"Top")}, "-",1, 0));Debug.locals.put("yy", _yy);Debug.locals.put("yy", _yy);
 BA.debugLineNum = 305;BA.debugLine="Dim Ray As Float = Min(SelectionRect.Width,Select";
Debug.ShouldStop(65536);
_ray = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, __ref.getField(false,"_selectionrect").runMethod(true,"Width"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_selectionrect").runMethod(true,"Height")))),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Ray", _ray);Debug.locals.put("Ray", _ray);
 BA.debugLineNum = 306;BA.debugLine="For i=0 To 9";
Debug.ShouldStop(131072);
{
final int step9 = 1;
final int limit9 = 9;
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 307;BA.debugLine="If i=0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 308;BA.debugLine="path.Initialize(xx+Ray*CosD(-90+i*36),yy+Ray*Si";
Debug.ShouldStop(524288);
_path.runVoidMethod ("Initialize::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_xx,_ray,b4i_main.__c.runMethod(true,"CosD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_yy,_ray,b4i_main.__c.runMethod(true,"SinD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36))))}, "+*",1, 0))));
 }else 
{ BA.debugLineNum = 309;BA.debugLine="else If i/2=Floor(i/2) Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "/",0, 0),b4i_main.__c.runMethod(true,"Floor:",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "/",0, 0))))) { 
 BA.debugLineNum = 310;BA.debugLine="path.LineTo(xx+Ray*CosD(-90+i*36),yy+Ray*SinD(-";
Debug.ShouldStop(2097152);
_path.runVoidMethod ("LineTo::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_xx,_ray,b4i_main.__c.runMethod(true,"CosD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_yy,_ray,b4i_main.__c.runMethod(true,"SinD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36))))}, "+*",1, 0))));
 }else {
 BA.debugLineNum = 312;BA.debugLine="path.LineTo(xx+Ray*CosD(-90+i*36)/2,yy+Ray*SinD";
Debug.ShouldStop(8388608);
_path.runVoidMethod ("LineTo::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_xx,_ray,b4i_main.__c.runMethod(true,"CosD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36)))),RemoteObject.createImmutable(2)}, "+*/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_yy,_ray,b4i_main.__c.runMethod(true,"SinD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36)))),RemoteObject.createImmutable(2)}, "+*/",1, 0))));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 316;BA.debugLine="Can.ClipPath(path)";
Debug.ShouldStop(134217728);
_can.runVoidMethod ("ClipPath:",(Object)(_path));
 BA.debugLineNum = 317;BA.debugLine="Dim Bm As B4XBitmap = Image.Bitmap";
Debug.ShouldStop(268435456);
_bm = RemoteObject.createNew ("B4XBitmapWrapper");
_bm = _image.runMethod(false,"_getbitmap");Debug.locals.put("Bm", _bm);Debug.locals.put("Bm", _bm);
 BA.debugLineNum = 318;BA.debugLine="Bm=Bm.Resize(SelectionRect.Width, SelectionRect.H";
Debug.ShouldStop(536870912);
_bm = _bm.runMethod(false,"Resize:::",(Object)(__ref.getField(false,"_selectionrect").runMethod(true,"Width")),(Object)(__ref.getField(false,"_selectionrect").runMethod(true,"Height")),(Object)(b4i_main.__c.runMethod(true,"False")));Debug.locals.put("Bm", _bm);
 BA.debugLineNum = 319;BA.debugLine="Can.DrawBitmap(Bm, Can.TargetRect)";
Debug.ShouldStop(1073741824);
_can.runVoidMethod ("DrawBitmap::",(Object)(((_bm).getObject())),(Object)(_can.runMethod(false,"TargetRect")));
 BA.debugLineNum = 320;BA.debugLine="Can.RemoveClip";
Debug.ShouldStop(-2147483648);
_can.runVoidMethod ("RemoveClip");
 BA.debugLineNum = 321;BA.debugLine="Can.Invalidate";
Debug.ShouldStop(1);
_can.runVoidMethod ("Invalidate");
 BA.debugLineNum = 322;BA.debugLine="Dim res As B4XBitmap = Can.CreateBitmap";
Debug.ShouldStop(2);
_res = RemoteObject.createNew ("B4XBitmapWrapper");
_res = _can.runMethod(false,"CreateBitmap");Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 323;BA.debugLine="Can.Release";
Debug.ShouldStop(4);
_can.runVoidMethod ("Release");
 BA.debugLineNum = 325;BA.debugLine="Dim BC As BitmapCreator";
Debug.ShouldStop(16);
_bc = RemoteObject.createNew ("b4i_bitmapcreator");Debug.locals.put("BC", _bc);
 BA.debugLineNum = 326;BA.debugLine="BC.Initialize(res.Width,res.Height)";
Debug.ShouldStop(32);
_bc.runVoidMethod ("_initialize:::",__ref.getField(false, "bi"),(Object)(BA.numberCast(int.class, _res.runMethod(true,"Width"))),(Object)(BA.numberCast(int.class, _res.runMethod(true,"Height"))));
 BA.debugLineNum = 327;BA.debugLine="BC.DrawBitmap(res,BC.TargetRect,True)";
Debug.ShouldStop(64);
_bc.runVoidMethod ("_drawbitmap:::",(Object)(_res),(Object)(_bc.getField(false,"_targetrect")),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 328;BA.debugLine="Return BC";
Debug.ShouldStop(128);
if (true) return _bc;
 BA.debugLineNum = 329;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,58);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "imageviewcrop","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _dl = RemoteObject.declareNull("B4ILabelWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 58;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="mBase = Base";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase").setObject (_base);
 BA.debugLineNum = 60;BA.debugLine="CropMode = Props.Get(\"Crop\")";
Debug.ShouldStop(134217728);
__ref.setField ("_cropmode",BA.ObjectToString(_props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("Crop"))))));
 BA.debugLineNum = 62;BA.debugLine="mBase.AddView(ImageView1, 0, 0, 0, 0)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mbase").runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_imageview1")).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 63;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase").runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_pnl")).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 64;BA.debugLine="mBase.AddView(GhieraRotate,0,0,0,0)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase").runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_ghierarotate")).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 65;BA.debugLine="mBase.AddView(GhieraZoom,0,0,0,0)";
Debug.ShouldStop(1);
__ref.getField(false,"_mbase").runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_ghierazoom")).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 66;BA.debugLine="GhieraRotate.Visible=False";
Debug.ShouldStop(2);
__ref.getField(false,"_ghierarotate").runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 67;BA.debugLine="GhieraZoom.Visible=False";
Debug.ShouldStop(4);
__ref.getField(false,"_ghierazoom").runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 68;BA.debugLine="If Demo Then";
Debug.ShouldStop(8);
if (__ref.getField(true,"_demo").getBoolean()) { 
 BA.debugLineNum = 69;BA.debugLine="Dim DL As Label";
Debug.ShouldStop(16);
_dl = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("DL", _dl);
 BA.debugLineNum = 70;BA.debugLine="DL.Initialize(\"\")";
Debug.ShouldStop(32);
_dl.runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 71;BA.debugLine="DemoLabel=DL";
Debug.ShouldStop(64);
__ref.getField(false,"_demolabel").setObject ((_dl).getObject());
 BA.debugLineNum = 72;BA.debugLine="DemoLabel.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.ShouldStop(128);
__ref.getField(false,"_demolabel").runVoidMethod ("SetTextAlignment::",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 73;BA.debugLine="mBase.AddView(DemoLabel, 0, mBase.Height/2, mBas";
Debug.ShouldStop(256);
__ref.getField(false,"_mbase").runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_demolabel")).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"Height"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(false,"_mbase").runMethod(true,"Width")),(Object)(BA.numberCast(float.class, 20)));
 BA.debugLineNum = 74;BA.debugLine="DL.Text=\"DEMO VERSION\"";
Debug.ShouldStop(512);
_dl.runMethod(true,"setText:",BA.ObjectToString("DEMO VERSION"));
 BA.debugLineNum = 75;BA.debugLine="DL.Color=Colors.Gray";
Debug.ShouldStop(1024);
_dl.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray"));
 BA.debugLineNum = 76;BA.debugLine="DL.TextColor=Colors.Black";
Debug.ShouldStop(2048);
_dl.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Black"));
 };
 BA.debugLineNum = 79;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4i_imageviewcrop.class, "_base_resize::",(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase").runMethod(true,"Width"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase").runMethod(true,"Height"))));
 BA.debugLineNum = 82;BA.debugLine="fingers.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_fingers").runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="NativeMe = Me";
Debug.ShouldStop(1048576);
__ref.getField(false,"_nativeme").setObject (__ref);
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawcircle(RemoteObject __ref,RemoteObject _bc,RemoteObject _x,RemoteObject _y,RemoteObject _radialx,RemoteObject _radialy,RemoteObject _bordercolor) throws Exception{
try {
		Debug.PushSubsStack("DrawCircle (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,460);
if (RapidSub.canDelegate("drawcircle")) { return __ref.runUserSub(false, "imageviewcrop","drawcircle", __ref, _bc, _x, _y, _radialx, _radialy, _bordercolor);}
RemoteObject _x1 = RemoteObject.createImmutable(0.0);
RemoteObject _y1 = RemoteObject.createImmutable(0.0);
int _i = 0;
RemoteObject _x2 = RemoteObject.createImmutable(0.0);
RemoteObject _y2 = RemoteObject.createImmutable(0.0);
Debug.locals.put("BC", _bc);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("RadialX", _radialx);
Debug.locals.put("RadialY", _radialy);
Debug.locals.put("BorderColor", _bordercolor);
 BA.debugLineNum = 460;BA.debugLine="Private Sub DrawCircle(BC As BitmapCreator, x As I";
Debug.ShouldStop(2048);
 BA.debugLineNum = 461;BA.debugLine="Dim X1 As Double = X + RadialX * CosD(0)";
Debug.ShouldStop(4096);
_x1 = RemoteObject.solve(new RemoteObject[] {_x,_radialx,b4i_main.__c.runMethod(true,"CosD:",(Object)(BA.numberCast(double.class, 0)))}, "+*",1, 0);Debug.locals.put("X1", _x1);Debug.locals.put("X1", _x1);
 BA.debugLineNum = 462;BA.debugLine="Dim Y1 As Double = Y + RadialY * SinD(0)";
Debug.ShouldStop(8192);
_y1 = RemoteObject.solve(new RemoteObject[] {_y,_radialy,b4i_main.__c.runMethod(true,"SinD:",(Object)(BA.numberCast(double.class, 0)))}, "+*",1, 0);Debug.locals.put("Y1", _y1);Debug.locals.put("Y1", _y1);
 BA.debugLineNum = 464;BA.debugLine="For i=1 To 720";
Debug.ShouldStop(32768);
{
final int step3 = 1;
final int limit3 = 720;
_i = 1 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 465;BA.debugLine="Dim X2 As Double = X + RadialX * CosD(i/2)";
Debug.ShouldStop(65536);
_x2 = RemoteObject.solve(new RemoteObject[] {_x,_radialx,b4i_main.__c.runMethod(true,"CosD:",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "/",0, 0)))}, "+*",1, 0);Debug.locals.put("X2", _x2);Debug.locals.put("X2", _x2);
 BA.debugLineNum = 466;BA.debugLine="Dim Y2 As Double = Y + RadialY * SinD(i/2)";
Debug.ShouldStop(131072);
_y2 = RemoteObject.solve(new RemoteObject[] {_y,_radialy,b4i_main.__c.runMethod(true,"SinD:",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "/",0, 0)))}, "+*",1, 0);Debug.locals.put("Y2", _y2);Debug.locals.put("Y2", _y2);
 BA.debugLineNum = 467;BA.debugLine="Drawline(BC,X1,Y1,X2,Y2,BorderColor)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(_bc),(Object)(BA.numberCast(int.class, _x1)),(Object)(BA.numberCast(int.class, _y1)),(Object)(BA.numberCast(int.class, _x2)),(Object)(BA.numberCast(int.class, _y2)),(Object)(_bordercolor));
 BA.debugLineNum = 468;BA.debugLine="X1 = X2";
Debug.ShouldStop(524288);
_x1 = _x2;Debug.locals.put("X1", _x1);
 BA.debugLineNum = 469;BA.debugLine="Y1 = Y2";
Debug.ShouldStop(1048576);
_y1 = _y2;Debug.locals.put("Y1", _y1);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 471;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawghierarotate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawGhieraRotate (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,548);
if (RapidSub.canDelegate("drawghierarotate")) { return __ref.runUserSub(false, "imageviewcrop","drawghierarotate", __ref);}
RemoteObject _sp = RemoteObject.createImmutable(0.0f);
RemoteObject _can = RemoteObject.declareNull("B4XCanvas");
int _i = 0;
 BA.debugLineNum = 548;BA.debugLine="Private Sub DrawGhieraRotate";
Debug.ShouldStop(8);
 BA.debugLineNum = 549;BA.debugLine="Dim Sp As Float = GhieraRotate.Width/24";
Debug.ShouldStop(16);
_sp = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierarotate").runMethod(true,"Width"),RemoteObject.createImmutable(24)}, "/",0, 0));Debug.locals.put("Sp", _sp);Debug.locals.put("Sp", _sp);
 BA.debugLineNum = 550;BA.debugLine="Dim Can As B4XCanvas";
Debug.ShouldStop(32);
_can = RemoteObject.createNew ("B4XCanvas");Debug.locals.put("Can", _can);
 BA.debugLineNum = 552;BA.debugLine="Can.Initialize(GhieraRotate)";
Debug.ShouldStop(128);
_can.runVoidMethod ("Initialize:",(Object)(((__ref.getField(false,"_ghierarotate")).getObject())));
 BA.debugLineNum = 553;BA.debugLine="Can.ClearRect(Can.TargetRect)";
Debug.ShouldStop(256);
_can.runVoidMethod ("ClearRect:",(Object)(_can.runMethod(false,"TargetRect")));
 BA.debugLineNum = 554;BA.debugLine="Can.DrawRect(Can.TargetRect,xui.Color_ARGB(150,15";
Debug.ShouldStop(512);
_can.runVoidMethod ("DrawRect::::",(Object)(_can.runMethod(false,"TargetRect")),(Object)(__ref.getField(false,"_xui").runMethod(true,"Color_ARGB::::",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 150)))),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 556;BA.debugLine="For i=1 To 23";
Debug.ShouldStop(2048);
{
final int step6 = 1;
final int limit6 = 23;
_i = 1 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 557;BA.debugLine="If i=12 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 12))) { 
 BA.debugLineNum = 558;BA.debugLine="Can.DrawLine(i*Sp-1,5,i*Sp,GhieraRotate.Height,";
Debug.ShouldStop(8192);
_can.runVoidMethod ("DrawLine::::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp,RemoteObject.createImmutable(1)}, "*-",1, 0))),(Object)(BA.numberCast(float.class, 5)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp}, "*",0, 0))),(Object)(__ref.getField(false,"_ghierarotate").runMethod(true,"Height")),(Object)(__ref.getField(false,"_xui").runMethod(true,"Color_Yellow")),(Object)(BA.numberCast(float.class, 2)));
 BA.debugLineNum = 559;BA.debugLine="Can.DrawLine(i*Sp+1,5,i*Sp+1,GhieraRotate.Heigh";
Debug.ShouldStop(16384);
_can.runVoidMethod ("DrawLine::::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp,RemoteObject.createImmutable(1)}, "*+",1, 0))),(Object)(BA.numberCast(float.class, 5)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp,RemoteObject.createImmutable(1)}, "*+",1, 0))),(Object)(__ref.getField(false,"_ghierarotate").runMethod(true,"Height")),(Object)(__ref.getField(false,"_xui").runMethod(true,"Color_White")),(Object)(BA.numberCast(float.class, 1)));
 }else {
 BA.debugLineNum = 561;BA.debugLine="Can.DrawLine(i*Sp,GhieraRotate.Height*0.25,i*Sp";
Debug.ShouldStop(65536);
_can.runVoidMethod ("DrawLine::::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierarotate").runMethod(true,"Height"),RemoteObject.createImmutable(0.25)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierarotate").runMethod(true,"Height"),RemoteObject.createImmutable(0.75)}, "*",0, 0))),(Object)(__ref.getField(false,"_xui").runMethod(true,"Color_DarkGray")),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 562;BA.debugLine="Can.DrawLine(i*Sp+1,GhieraRotate.Height*0.25,i*";
Debug.ShouldStop(131072);
_can.runVoidMethod ("DrawLine::::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp,RemoteObject.createImmutable(1)}, "*+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierarotate").runMethod(true,"Height"),RemoteObject.createImmutable(0.25)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp,RemoteObject.createImmutable(1)}, "*+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierarotate").runMethod(true,"Height"),RemoteObject.createImmutable(0.75)}, "*",0, 0))),(Object)(__ref.getField(false,"_xui").runMethod(true,"Color_White")),(Object)(BA.numberCast(float.class, 1)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 565;BA.debugLine="Can.DrawCircle((Bit.FMod(Degree+180,360)/360)*Ghi";
Debug.ShouldStop(1048576);
_can.runVoidMethod ("DrawCircle::::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(false,"Bit").runMethod(true,"FMod::",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_degree"),RemoteObject.createImmutable(180)}, "+",1, 0)),(Object)(BA.numberCast(double.class, 360))),RemoteObject.createImmutable(360)}, "/",0, 0)),__ref.getField(false,"_ghierarotate").runMethod(true,"Width")}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierarotate").runMethod(true,"Height"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierarotate").runMethod(true,"Height"),RemoteObject.createImmutable(3)}, "/",0, 0))),(Object)(__ref.getField(false,"_xui").runMethod(true,"Color_ARGB::::",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 200)))),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 567;BA.debugLine="Can.Invalidate";
Debug.ShouldStop(4194304);
_can.runVoidMethod ("Invalidate");
 BA.debugLineNum = 568;BA.debugLine="Can.Release";
Debug.ShouldStop(8388608);
_can.runVoidMethod ("Release");
 BA.debugLineNum = 569;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawghierazoom(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawGhieraZoom (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,524);
if (RapidSub.canDelegate("drawghierazoom")) { return __ref.runUserSub(false, "imageviewcrop","drawghierazoom", __ref);}
RemoteObject _sp = RemoteObject.createImmutable(0.0f);
RemoteObject _can = RemoteObject.declareNull("B4XCanvas");
int _i = 0;
 BA.debugLineNum = 524;BA.debugLine="Private Sub DrawGhieraZoom";
Debug.ShouldStop(2048);
 BA.debugLineNum = 525;BA.debugLine="Dim Sp As Float = GhieraZoom.Width/12";
Debug.ShouldStop(4096);
_sp = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierazoom").runMethod(true,"Width"),RemoteObject.createImmutable(12)}, "/",0, 0));Debug.locals.put("Sp", _sp);Debug.locals.put("Sp", _sp);
 BA.debugLineNum = 526;BA.debugLine="Dim Can As B4XCanvas";
Debug.ShouldStop(8192);
_can = RemoteObject.createNew ("B4XCanvas");Debug.locals.put("Can", _can);
 BA.debugLineNum = 528;BA.debugLine="Can.Initialize(GhieraZoom)";
Debug.ShouldStop(32768);
_can.runVoidMethod ("Initialize:",(Object)(((__ref.getField(false,"_ghierazoom")).getObject())));
 BA.debugLineNum = 529;BA.debugLine="Can.ClearRect(Can.TargetRect)";
Debug.ShouldStop(65536);
_can.runVoidMethod ("ClearRect:",(Object)(_can.runMethod(false,"TargetRect")));
 BA.debugLineNum = 530;BA.debugLine="Can.DrawRect(Can.TargetRect,xui.Color_ARGB(200,25";
Debug.ShouldStop(131072);
_can.runVoidMethod ("DrawRect::::",(Object)(_can.runMethod(false,"TargetRect")),(Object)(__ref.getField(false,"_xui").runMethod(true,"Color_ARGB::::",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 532;BA.debugLine="For i=1 To 11";
Debug.ShouldStop(524288);
{
final int step6 = 1;
final int limit6 = 11;
_i = 1 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 533;BA.debugLine="If i=6 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 534;BA.debugLine="Can.DrawLine(i*Sp,0,i*Sp,GhieraZoom.Height,xui.";
Debug.ShouldStop(2097152);
_can.runVoidMethod ("DrawLine::::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp}, "*",0, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp}, "*",0, 0))),(Object)(__ref.getField(false,"_ghierazoom").runMethod(true,"Height")),(Object)(__ref.getField(false,"_xui").runMethod(true,"Color_Blue")),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 535;BA.debugLine="Can.DrawLine(i*Sp+1,0,i*Sp+1,GhieraZoom.Height,";
Debug.ShouldStop(4194304);
_can.runVoidMethod ("DrawLine::::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp,RemoteObject.createImmutable(1)}, "*+",1, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp,RemoteObject.createImmutable(1)}, "*+",1, 0))),(Object)(__ref.getField(false,"_ghierazoom").runMethod(true,"Height")),(Object)(__ref.getField(false,"_xui").runMethod(true,"Color_LightGray")),(Object)(BA.numberCast(float.class, 2)));
 }else {
 BA.debugLineNum = 537;BA.debugLine="Can.DrawLine(i*Sp,0,i*Sp,GhieraZoom.Height/2,xu";
Debug.ShouldStop(16777216);
_can.runVoidMethod ("DrawLine::::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp}, "*",0, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierazoom").runMethod(true,"Height"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(false,"_xui").runMethod(true,"Color_DarkGray")),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 538;BA.debugLine="Can.DrawLine(i*Sp+1,0,i*Sp+1,GhieraZoom.Height/";
Debug.ShouldStop(33554432);
_can.runVoidMethod ("DrawLine::::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp,RemoteObject.createImmutable(1)}, "*+",1, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_sp,RemoteObject.createImmutable(1)}, "*+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierazoom").runMethod(true,"Height"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(false,"_xui").runMethod(true,"Color_LightGray")),(Object)(BA.numberCast(float.class, 1)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 542;BA.debugLine="Can.DrawCircle(ZoomPosition*GhieraZoom.Width,Ghie";
Debug.ShouldStop(536870912);
_can.runVoidMethod ("DrawCircle::::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_zoomposition"),__ref.getField(false,"_ghierazoom").runMethod(true,"Width")}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierazoom").runMethod(true,"Height"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierazoom").runMethod(true,"Height"),RemoteObject.createImmutable(3)}, "/",0, 0))),(Object)(__ref.getField(false,"_xui").runMethod(true,"Color_ARGB::::",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 100)))),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 544;BA.debugLine="Can.Invalidate";
Debug.ShouldStop(-2147483648);
_can.runVoidMethod ("Invalidate");
 BA.debugLineNum = 545;BA.debugLine="Can.Release";
Debug.ShouldStop(1);
_can.runVoidMethod ("Release");
 BA.debugLineNum = 546;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawlimit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawLimit (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,404);
if (RapidSub.canDelegate("drawlimit")) { return __ref.runUserSub(false, "imageviewcrop","drawlimit", __ref);}
RemoteObject _xxi = RemoteObject.createImmutable(0.0f);
RemoteObject _yyi = RemoteObject.createImmutable(0.0f);
RemoteObject _xxf = RemoteObject.createImmutable(0.0f);
RemoteObject _yyf = RemoteObject.createImmutable(0.0f);
RemoteObject _ray = RemoteObject.createImmutable(0.0f);
RemoteObject _l = RemoteObject.declareNull("B4IList");
RemoteObject _xx = RemoteObject.createImmutable(0.0f);
RemoteObject _yy = RemoteObject.createImmutable(0.0f);
int _i = 0;
 BA.debugLineNum = 404;BA.debugLine="Private Sub DrawLimit";
Debug.ShouldStop(524288);
 BA.debugLineNum = 405;BA.debugLine="Dim Xxi As Float = Min(Xi,Xf)";
Debug.ShouldStop(1048576);
_xxi = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, __ref.getField(true,"_xi"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_xf")))));Debug.locals.put("Xxi", _xxi);Debug.locals.put("Xxi", _xxi);
 BA.debugLineNum = 406;BA.debugLine="Dim Yyi As Float = Min(Yi,Yf)";
Debug.ShouldStop(2097152);
_yyi = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, __ref.getField(true,"_yi"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_yf")))));Debug.locals.put("Yyi", _yyi);Debug.locals.put("Yyi", _yyi);
 BA.debugLineNum = 407;BA.debugLine="Dim Xxf As Float = Max(Xi,Xf)";
Debug.ShouldStop(4194304);
_xxf = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, __ref.getField(true,"_xi"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_xf")))));Debug.locals.put("Xxf", _xxf);Debug.locals.put("Xxf", _xxf);
 BA.debugLineNum = 408;BA.debugLine="Dim Yyf As Float = Max(Yi,Yf)";
Debug.ShouldStop(8388608);
_yyf = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, __ref.getField(true,"_yi"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_yf")))));Debug.locals.put("Yyf", _yyf);Debug.locals.put("Yyf", _yyf);
 BA.debugLineNum = 412;BA.debugLine="TargetBC.DrawCircle(sx,sy,SizeCircle/Zoom,0xFFFFF";
Debug.ShouldStop(134217728);
__ref.getField(false,"_targetbc").runVoidMethod ("_drawcircle::::::",(Object)(BA.numberCast(int.class, __ref.getField(true,"_sx"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_sy"))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_sizecircle"),__ref.getField(true,"_zoom")}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0xffffffff)),(Object)(b4i_main.__c.runMethod(true,"False")),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 414;BA.debugLine="Select CropMode";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(__ref.getField(true,"_cropmode"),BA.ObjectToString("Square"),BA.ObjectToString("Ellipse"),BA.ObjectToString("Circle"),BA.ObjectToString("Star"))) {
case 0: {
 BA.debugLineNum = 416;BA.debugLine="DrawRhombus(TargetBC,Xi,Yi,Xf,Yf,0xFFCCCCCC)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawrhombus::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_xi"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_yi"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_xf"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_yf"))),(Object)(BA.numberCast(int.class, 0xffcccccc)));
 break; }
case 1: {
 BA.debugLineNum = 418;BA.debugLine="DrawRhombus(TargetBC,Xi,Yi,Xf,Yf,0xFFCCCCCC)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawrhombus::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_xi"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_yi"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_xf"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_yf"))),(Object)(BA.numberCast(int.class, 0xffcccccc)));
 BA.debugLineNum = 419;BA.debugLine="DrawCircle(TargetBC,(Xi+Xf)/2,(Yi+Yf)/2,Abs(Xf-";
Debug.ShouldStop(4);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawcircle::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_xi"),__ref.getField(true,"_xf")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_yi"),__ref.getField(true,"_yf")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Abs:",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_xf"),__ref.getField(true,"_xi")}, "-",1, 0))),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Abs:",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_yf"),__ref.getField(true,"_yi")}, "-",1, 0))),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0xffffffff)));
 break; }
case 2: {
 BA.debugLineNum = 421;BA.debugLine="DrawRhombus(TargetBC,Xi,Yi,Xf,Yf,0xFFCCCCCC)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawrhombus::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_xi"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_yi"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_xf"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_yf"))),(Object)(BA.numberCast(int.class, 0xffcccccc)));
 BA.debugLineNum = 422;BA.debugLine="Dim Ray As Float = Min(Abs(Xf-Xi)/2,Abs(Yf-Yi)/";
Debug.ShouldStop(32);
_ray = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Abs:",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_xf"),__ref.getField(true,"_xi")}, "-",1, 0))),RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Abs:",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_yf"),__ref.getField(true,"_yi")}, "-",1, 0))),RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("Ray", _ray);Debug.locals.put("Ray", _ray);
 BA.debugLineNum = 423;BA.debugLine="DrawCircle(TargetBC,(Xi+Xf)/2,(Yi+Yf)/2,Ray,Ray";
Debug.ShouldStop(64);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawcircle::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_xi"),__ref.getField(true,"_xf")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_yi"),__ref.getField(true,"_yf")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, _ray)),(Object)(BA.numberCast(int.class, _ray)),(Object)(BA.numberCast(int.class, 0xffffffff)));
 break; }
case 3: {
 BA.debugLineNum = 425;BA.debugLine="Dim L As List";
Debug.ShouldStop(256);
_l = RemoteObject.createNew ("B4IList");Debug.locals.put("L", _l);
 BA.debugLineNum = 426;BA.debugLine="L.Initialize";
Debug.ShouldStop(512);
_l.runVoidMethod ("Initialize");
 BA.debugLineNum = 428;BA.debugLine="Dim xx As Float = (Xf+Xi)/2";
Debug.ShouldStop(2048);
_xx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_xf"),__ref.getField(true,"_xi")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("xx", _xx);Debug.locals.put("xx", _xx);
 BA.debugLineNum = 429;BA.debugLine="Dim yy As Float = (Yf+Yi)/2";
Debug.ShouldStop(4096);
_yy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_yf"),__ref.getField(true,"_yi")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("yy", _yy);Debug.locals.put("yy", _yy);
 BA.debugLineNum = 430;BA.debugLine="Dim Ray As Float = Min(Abs(Xf-Xi),Abs(Yf-Yi))/2";
Debug.ShouldStop(8192);
_ray = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Min::",(Object)(b4i_main.__c.runMethod(true,"Abs:",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_xf"),__ref.getField(true,"_xi")}, "-",1, 0)))),(Object)(b4i_main.__c.runMethod(true,"Abs:",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_yf"),__ref.getField(true,"_yi")}, "-",1, 0))))),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Ray", _ray);Debug.locals.put("Ray", _ray);
 BA.debugLineNum = 431;BA.debugLine="For i=0 To 9";
Debug.ShouldStop(16384);
{
final int step22 = 1;
final int limit22 = 9;
_i = 0 ;
for (;(step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22) ;_i = ((int)(0 + _i + step22))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 432;BA.debugLine="If i/2=Floor(i/2) Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "/",0, 0),b4i_main.__c.runMethod(true,"Floor:",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "/",0, 0))))) { 
 BA.debugLineNum = 433;BA.debugLine="L.Add(xx+Ray*CosD(-90+i*36))";
Debug.ShouldStop(65536);
_l.runVoidMethod ("Add:",(Object)((RemoteObject.solve(new RemoteObject[] {_xx,_ray,b4i_main.__c.runMethod(true,"CosD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36))))}, "+*",1, 0))));
 BA.debugLineNum = 434;BA.debugLine="L.Add(yy+Ray*SinD(-90+i*36))";
Debug.ShouldStop(131072);
_l.runVoidMethod ("Add:",(Object)((RemoteObject.solve(new RemoteObject[] {_yy,_ray,b4i_main.__c.runMethod(true,"SinD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36))))}, "+*",1, 0))));
 }else {
 BA.debugLineNum = 436;BA.debugLine="L.Add(xx+Ray*CosD(-90+i*36)/2)";
Debug.ShouldStop(524288);
_l.runVoidMethod ("Add:",(Object)((RemoteObject.solve(new RemoteObject[] {_xx,_ray,b4i_main.__c.runMethod(true,"CosD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36)))),RemoteObject.createImmutable(2)}, "+*/",1, 0))));
 BA.debugLineNum = 437;BA.debugLine="L.Add(yy+Ray*SinD(-90+i*36)/2)";
Debug.ShouldStop(1048576);
_l.runVoidMethod ("Add:",(Object)((RemoteObject.solve(new RemoteObject[] {_yy,_ray,b4i_main.__c.runMethod(true,"SinD:",(Object)(BA.numberCast(double.class, -(double) (0 + 90)+(double) (0 + _i)*(double) (0 + 36)))),RemoteObject.createImmutable(2)}, "+*/",1, 0))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 441;BA.debugLine="DrawRhombus(TargetBC,Xi,Yi,Xf,Yf,0xFFCCCCCC)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawrhombus::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_xi"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_yi"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_xf"))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_yf"))),(Object)(BA.numberCast(int.class, 0xffcccccc)));
 BA.debugLineNum = 442;BA.debugLine="DrawPath(TargetBC,L,0xFFFFFFFF)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawpath:::",(Object)(__ref.getField(false,"_targetbc")),(Object)(_l),(Object)(BA.numberCast(int.class, 0xffffffff)));
 break; }
}
;
 BA.debugLineNum = 446;BA.debugLine="Drawline(TargetBC,Xxi,Yyi+1,Xxi+SizePoint,Yyi+1,0";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, _xxi)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_yyi,RemoteObject.createImmutable(1)}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xxi,__ref.getField(true,"_sizepoint")}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_yyi,RemoteObject.createImmutable(1)}, "+",1, 0))),(Object)(BA.numberCast(int.class, 0xffffffff)));
 BA.debugLineNum = 447;BA.debugLine="Drawline(TargetBC,Xxi,Yyi+2,Xxi+SizePoint,Yyi+2,0";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, _xxi)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_yyi,RemoteObject.createImmutable(2)}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xxi,__ref.getField(true,"_sizepoint")}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_yyi,RemoteObject.createImmutable(2)}, "+",1, 0))),(Object)(BA.numberCast(int.class, 0xffffffff)));
 BA.debugLineNum = 449;BA.debugLine="Drawline(TargetBC,Xxi+1,Yyi,Xxi+1,Yyi+SizePoint,0";
Debug.ShouldStop(1);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xxi,RemoteObject.createImmutable(1)}, "+",1, 0))),(Object)(BA.numberCast(int.class, _yyi)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xxi,RemoteObject.createImmutable(1)}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_yyi,__ref.getField(true,"_sizepoint")}, "+",1, 0))),(Object)(BA.numberCast(int.class, 0xffffffff)));
 BA.debugLineNum = 450;BA.debugLine="Drawline(TargetBC,Xxi+2,Yyi,Xxi+2,Yyi+SizePoint,0";
Debug.ShouldStop(2);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xxi,RemoteObject.createImmutable(2)}, "+",1, 0))),(Object)(BA.numberCast(int.class, _yyi)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xxi,RemoteObject.createImmutable(2)}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_yyi,__ref.getField(true,"_sizepoint")}, "+",1, 0))),(Object)(BA.numberCast(int.class, 0xffffffff)));
 BA.debugLineNum = 453;BA.debugLine="Drawline(TargetBC,Xxf,Yyf-1,Xxf-SizePoint,Yyf-1,0";
Debug.ShouldStop(16);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, _xxf)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_yyf,RemoteObject.createImmutable(1)}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xxf,__ref.getField(true,"_sizepoint")}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_yyf,RemoteObject.createImmutable(1)}, "-",1, 0))),(Object)(BA.numberCast(int.class, 0xffffffff)));
 BA.debugLineNum = 454;BA.debugLine="Drawline(TargetBC,Xxf,Yyf-2,Xxf-SizePoint,Yyf-2,0";
Debug.ShouldStop(32);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, _xxf)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_yyf,RemoteObject.createImmutable(2)}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xxf,__ref.getField(true,"_sizepoint")}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_yyf,RemoteObject.createImmutable(2)}, "-",1, 0))),(Object)(BA.numberCast(int.class, 0xffffffff)));
 BA.debugLineNum = 456;BA.debugLine="Drawline(TargetBC,Xxf-1,Yyf,Xxf-1,Yyf-SizePoint,0";
Debug.ShouldStop(128);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xxf,RemoteObject.createImmutable(1)}, "-",1, 0))),(Object)(BA.numberCast(int.class, _yyf)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xxf,RemoteObject.createImmutable(1)}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_yyf,__ref.getField(true,"_sizepoint")}, "-",1, 0))),(Object)(BA.numberCast(int.class, 0xffffffff)));
 BA.debugLineNum = 457;BA.debugLine="Drawline(TargetBC,Xxf-2,Yyf,Xxf-2,Yyf-SizePoint,0";
Debug.ShouldStop(256);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(__ref.getField(false,"_targetbc")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xxf,RemoteObject.createImmutable(2)}, "-",1, 0))),(Object)(BA.numberCast(int.class, _yyf)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xxf,RemoteObject.createImmutable(2)}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_yyf,__ref.getField(true,"_sizepoint")}, "-",1, 0))),(Object)(BA.numberCast(int.class, 0xffffffff)));
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawline(RemoteObject __ref,RemoteObject _bc,RemoteObject _x1,RemoteObject _y1,RemoteObject _x2,RemoteObject _y2,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("Drawline (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,510);
if (RapidSub.canDelegate("drawline")) { return __ref.runUserSub(false, "imageviewcrop","drawline", __ref, _bc, _x1, _y1, _x2, _y2, _color);}
RemoteObject _dx = RemoteObject.createImmutable(0);
RemoteObject _dy = RemoteObject.createImmutable(0);
RemoteObject _diff = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.createImmutable(0.0f);
RemoteObject _y = RemoteObject.createImmutable(0.0f);
int _d = 0;
Debug.locals.put("BC", _bc);
Debug.locals.put("x1", _x1);
Debug.locals.put("y1", _y1);
Debug.locals.put("x2", _x2);
Debug.locals.put("y2", _y2);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 510;BA.debugLine="Private Sub Drawline(BC As BitmapCreator, x1 As In";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 511;BA.debugLine="Dim Dx,Dy,Diff As Int";
Debug.ShouldStop(1073741824);
_dx = RemoteObject.createImmutable(0);Debug.locals.put("Dx", _dx);
_dy = RemoteObject.createImmutable(0);Debug.locals.put("Dy", _dy);
_diff = RemoteObject.createImmutable(0);Debug.locals.put("Diff", _diff);
 BA.debugLineNum = 512;BA.debugLine="Dim x,y As Float";
Debug.ShouldStop(-2147483648);
_x = RemoteObject.createImmutable(0.0f);Debug.locals.put("x", _x);
_y = RemoteObject.createImmutable(0.0f);Debug.locals.put("y", _y);
 BA.debugLineNum = 514;BA.debugLine="Dx = x2 - x1";
Debug.ShouldStop(2);
_dx = RemoteObject.solve(new RemoteObject[] {_x2,_x1}, "-",1, 1);Debug.locals.put("Dx", _dx);
 BA.debugLineNum = 515;BA.debugLine="Dy = y2 - y1";
Debug.ShouldStop(4);
_dy = RemoteObject.solve(new RemoteObject[] {_y2,_y1}, "-",1, 1);Debug.locals.put("Dy", _dy);
 BA.debugLineNum = 516;BA.debugLine="Diff=Max(Abs(Dx),Abs(Dy))";
Debug.ShouldStop(8);
_diff = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"Max::",(Object)(b4i_main.__c.runMethod(true,"Abs:",(Object)(BA.numberCast(double.class, _dx)))),(Object)(b4i_main.__c.runMethod(true,"Abs:",(Object)(BA.numberCast(double.class, _dy))))));Debug.locals.put("Diff", _diff);
 BA.debugLineNum = 517;BA.debugLine="For D=0 To Diff";
Debug.ShouldStop(16);
{
final int step6 = 1;
final int limit6 = _diff.<Number>get().intValue();
_d = 0 ;
for (;(step6 > 0 && _d <= limit6) || (step6 < 0 && _d >= limit6) ;_d = ((int)(0 + _d + step6))  ) {
Debug.locals.put("D", _d);
 BA.debugLineNum = 518;BA.debugLine="x= x1 + Dx*D/Diff";
Debug.ShouldStop(32);
_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x1,_dx,RemoteObject.createImmutable(_d),_diff}, "+*/",1, 0));Debug.locals.put("x", _x);
 BA.debugLineNum = 519;BA.debugLine="y = y1 + Dy*D/Diff";
Debug.ShouldStop(64);
_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y1,_dy,RemoteObject.createImmutable(_d),_diff}, "+*/",1, 0));Debug.locals.put("y", _y);
 BA.debugLineNum = 520;BA.debugLine="If (x>=0 And x<BC.mWidth) And (y>=0 And y<BC.mHe";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_x,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_x,BA.numberCast(double.class, _bc.getField(true,"_mwidth")))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_y,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_y,BA.numberCast(double.class, _bc.getField(true,"_mheight"))))))) { 
_bc.runVoidMethod ("_setcolor:::",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_color));};
 }
}Debug.locals.put("D", _d);
;
 BA.debugLineNum = 522;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawpath(RemoteObject __ref,RemoteObject _bc,RemoteObject _listpoint,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("DrawPath (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,480);
if (RapidSub.canDelegate("drawpath")) { return __ref.runUserSub(false, "imageviewcrop","drawpath", __ref, _bc, _listpoint, _color);}
RemoteObject _px = null;
RemoteObject _py = null;
int _i = 0;
Debug.locals.put("BC", _bc);
Debug.locals.put("ListPoint", _listpoint);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 480;BA.debugLine="Private Sub DrawPath(BC As BitmapCreator, ListPoin";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 481;BA.debugLine="Dim Px(ListPoint.Size/2) As Float";
Debug.ShouldStop(1);
_px = RemoteObject.createNew("B4IArray").runMethod(false, "initObjects:::", (Object)new RemoteObject[] {BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_listpoint.runMethod(true,"Size"),RemoteObject.createImmutable(2)}, "/",0, 0))}, 0, null);Debug.locals.put("Px", _px);
 BA.debugLineNum = 482;BA.debugLine="Dim Py(ListPoint.Size/2) As Float";
Debug.ShouldStop(2);
_py = RemoteObject.createNew("B4IArray").runMethod(false, "initObjects:::", (Object)new RemoteObject[] {BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_listpoint.runMethod(true,"Size"),RemoteObject.createImmutable(2)}, "/",0, 0))}, 0, null);Debug.locals.put("Py", _py);
 BA.debugLineNum = 484;BA.debugLine="For i=0 To ListPoint.Size-1 Step 2";
Debug.ShouldStop(8);
{
final int step3 = 2;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_listpoint.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 485;BA.debugLine="Px(i/2)=ListPoint.Get(i)";
Debug.ShouldStop(16);
_px.runVoidMethod ("setObjectFastN::", BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(float.class, _listpoint.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 486;BA.debugLine="Py(i/2)=ListPoint.Get(i+1)";
Debug.ShouldStop(32);
_py.runVoidMethod ("setObjectFastN::", BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(float.class, _listpoint.runMethod(false,"Get:",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 489;BA.debugLine="For i=0 To (ListPoint.Size/2)-1";
Debug.ShouldStop(256);
{
final int step7 = 1;
final int limit7 = (int) (0 + RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_listpoint.runMethod(true,"Size"),RemoteObject.createImmutable(2)}, "/",0, 0)),RemoteObject.createImmutable(1)}, "-",1, 0).<Number>get().doubleValue());
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 490;BA.debugLine="If i=(ListPoint.Size/2)-1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_listpoint.runMethod(true,"Size"),RemoteObject.createImmutable(2)}, "/",0, 0)),RemoteObject.createImmutable(1)}, "-",1, 0))) { 
 BA.debugLineNum = 491;BA.debugLine="Drawline(BC,Px(i),Py(i),Px(0),Py(0), Color)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(_bc),(Object)(BA.numberCast(int.class, _px.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, _i)))),(Object)(BA.numberCast(int.class, _py.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, _i)))),(Object)(BA.numberCast(int.class, _px.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(int.class, _py.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, 0)))),(Object)(_color));
 }else {
 BA.debugLineNum = 493;BA.debugLine="Drawline(BC,Px(i),Py(i),Px(i+1),Py(i+1), Color)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(_bc),(Object)(BA.numberCast(int.class, _px.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, _i)))),(Object)(BA.numberCast(int.class, _py.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, _i)))),(Object)(BA.numberCast(int.class, _px.runMethod(true,"getObjectFastN:", RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(BA.numberCast(int.class, _py.runMethod(true,"getObjectFastN:", RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(_color));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 496;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawrec(RemoteObject __ref,RemoteObject _bc,RemoteObject _xin,RemoteObject _yin,RemoteObject _xfin,RemoteObject _yfin,RemoteObject _color,RemoteObject _colorbackgroud,RemoteObject _fill) throws Exception{
try {
		Debug.PushSubsStack("DrawRec (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,498);
if (RapidSub.canDelegate("drawrec")) { return __ref.runUserSub(false, "imageviewcrop","drawrec", __ref, _bc, _xin, _yin, _xfin, _yfin, _color, _colorbackgroud, _fill);}
int _i = 0;
Debug.locals.put("BC", _bc);
Debug.locals.put("Xin", _xin);
Debug.locals.put("Yin", _yin);
Debug.locals.put("Xfin", _xfin);
Debug.locals.put("Yfin", _yfin);
Debug.locals.put("Color", _color);
Debug.locals.put("ColorBackgroud", _colorbackgroud);
Debug.locals.put("Fill", _fill);
 BA.debugLineNum = 498;BA.debugLine="Private Sub DrawRec(BC As BitmapCreator, Xin As In";
Debug.ShouldStop(131072);
 BA.debugLineNum = 499;BA.debugLine="If Fill Then";
Debug.ShouldStop(262144);
if (_fill.getBoolean()) { 
 BA.debugLineNum = 500;BA.debugLine="For i=Yin To Yfin";
Debug.ShouldStop(524288);
{
final int step2 = 1;
final int limit2 = _yfin.<Number>get().intValue();
_i = _yin.<Number>get().intValue() ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 501;BA.debugLine="Drawline(BC,Xin,i,Xfin,i, ColorBackgroud)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(_bc),(Object)(_xin),(Object)(BA.numberCast(int.class, _i)),(Object)(_xfin),(Object)(BA.numberCast(int.class, _i)),(Object)(_colorbackgroud));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 504;BA.debugLine="Drawline(BC,Xin,Yin,Xfin,Yin, Color)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(_bc),(Object)(_xin),(Object)(_yin),(Object)(_xfin),(Object)(_yin),(Object)(_color));
 BA.debugLineNum = 505;BA.debugLine="Drawline(BC,Xin,Yfin,Xfin,Yfin, Color)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(_bc),(Object)(_xin),(Object)(_yfin),(Object)(_xfin),(Object)(_yfin),(Object)(_color));
 BA.debugLineNum = 506;BA.debugLine="Drawline(BC,Xin,Yin,Xin,Yfin,Color)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(_bc),(Object)(_xin),(Object)(_yin),(Object)(_xin),(Object)(_yfin),(Object)(_color));
 BA.debugLineNum = 507;BA.debugLine="Drawline(BC,Xfin,Yin,Xfin,Yfin,Color)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(_bc),(Object)(_xfin),(Object)(_yin),(Object)(_xfin),(Object)(_yfin),(Object)(_color));
 BA.debugLineNum = 508;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawrhombus(RemoteObject __ref,RemoteObject _bc,RemoteObject _xin,RemoteObject _yin,RemoteObject _xfin,RemoteObject _yfin,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("DrawRhombus (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,473);
if (RapidSub.canDelegate("drawrhombus")) { return __ref.runUserSub(false, "imageviewcrop","drawrhombus", __ref, _bc, _xin, _yin, _xfin, _yfin, _color);}
Debug.locals.put("BC", _bc);
Debug.locals.put("Xin", _xin);
Debug.locals.put("Yin", _yin);
Debug.locals.put("Xfin", _xfin);
Debug.locals.put("Yfin", _yfin);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 473;BA.debugLine="Private Sub DrawRhombus(BC As BitmapCreator, Xin A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 474;BA.debugLine="Drawline(BC,Xin,Yin,Xfin,Yin, Color)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(_bc),(Object)(_xin),(Object)(_yin),(Object)(_xfin),(Object)(_yin),(Object)(_color));
 BA.debugLineNum = 475;BA.debugLine="Drawline(BC,Xin,Yfin,Xfin,Yfin, Color)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(_bc),(Object)(_xin),(Object)(_yfin),(Object)(_xfin),(Object)(_yfin),(Object)(_color));
 BA.debugLineNum = 476;BA.debugLine="Drawline(BC,Xin,Yin,Xin,Yfin,Color)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(_bc),(Object)(_xin),(Object)(_yin),(Object)(_xin),(Object)(_yfin),(Object)(_color));
 BA.debugLineNum = 477;BA.debugLine="Drawline(BC,Xfin,Yin,Xfin,Yfin,Color)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawline::::::",(Object)(_bc),(Object)(_xfin),(Object)(_yin),(Object)(_xfin),(Object)(_yfin),(Object)(_color));
 BA.debugLineNum = 478;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fillimagetoview(RemoteObject __ref,RemoteObject _bmp,RemoteObject _imagevw) throws Exception{
try {
		Debug.PushSubsStack("FillImageToView (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,208);
if (RapidSub.canDelegate("fillimagetoview")) { return __ref.runUserSub(false, "imageviewcrop","fillimagetoview", __ref, _bmp, _imagevw);}
RemoteObject _bmpratio = RemoteObject.createImmutable(0.0f);
RemoteObject _viewratio = RemoteObject.createImmutable(0.0f);
RemoteObject _newheight = RemoteObject.createImmutable(0);
RemoteObject _newwidth = RemoteObject.createImmutable(0);
Debug.locals.put("bmp", _bmp);
Debug.locals.put("ImageVw", _imagevw);
 BA.debugLineNum = 208;BA.debugLine="public Sub FillImageToView(bmp As B4XBitmap, Image";
Debug.ShouldStop(32768);
 BA.debugLineNum = 209;BA.debugLine="Dim bmpRatio As Float = bmp.Width / bmp.Height";
Debug.ShouldStop(65536);
_bmpratio = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"Width"),_bmp.runMethod(true,"Height")}, "/",0, 0));Debug.locals.put("bmpRatio", _bmpratio);Debug.locals.put("bmpRatio", _bmpratio);
 BA.debugLineNum = 210;BA.debugLine="Dim viewRatio As Float = ImageView1.Width / Image";
Debug.ShouldStop(131072);
_viewratio = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imageview1").runMethod(true,"Width"),__ref.getField(false,"_imageview1").runMethod(true,"Height")}, "/",0, 0));Debug.locals.put("viewRatio", _viewratio);Debug.locals.put("viewRatio", _viewratio);
 BA.debugLineNum = 211;BA.debugLine="If viewRatio > bmpRatio Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_viewratio,BA.numberCast(double.class, _bmpratio))) { 
 BA.debugLineNum = 212;BA.debugLine="Dim NewHeight As Int = bmp.Width / viewRatio";
Debug.ShouldStop(524288);
_newheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"Width"),_viewratio}, "/",0, 0));Debug.locals.put("NewHeight", _newheight);Debug.locals.put("NewHeight", _newheight);
 BA.debugLineNum = 213;BA.debugLine="bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight / 2";
Debug.ShouldStop(1048576);
_bmp = _bmp.runMethod(false,"Crop::::",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"Height"),RemoteObject.createImmutable(2),_newheight,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(_bmp.runMethod(true,"Width")),(Object)(BA.numberCast(float.class, _newheight)));Debug.locals.put("bmp", _bmp);
 }else 
{ BA.debugLineNum = 214;BA.debugLine="Else if viewRatio < bmpRatio Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",_viewratio,BA.numberCast(double.class, _bmpratio))) { 
 BA.debugLineNum = 215;BA.debugLine="Dim NewWidth As Int = bmp.Height * viewRatio";
Debug.ShouldStop(4194304);
_newwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"Height"),_viewratio}, "*",0, 0));Debug.locals.put("NewWidth", _newwidth);Debug.locals.put("NewWidth", _newwidth);
 BA.debugLineNum = 216;BA.debugLine="bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2, 0,";
Debug.ShouldStop(8388608);
_bmp = _bmp.runMethod(false,"Crop::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"Width"),RemoteObject.createImmutable(2),_newwidth,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _newwidth)),(Object)(_bmp.runMethod(true,"Height")));Debug.locals.put("bmp", _bmp);
 }}
;
 BA.debugLineNum = 218;BA.debugLine="ImageVw.SetBitmap(bmp.Resize(ImageView1.Width, Im";
Debug.ShouldStop(33554432);
_imagevw.runVoidMethod ("SetBitmap:",(Object)(((_bmp.runMethod(false,"Resize:::",(Object)(__ref.getField(false,"_imageview1").runMethod(true,"Width")),(Object)(__ref.getField(false,"_imageview1").runMethod(true,"Height")),(Object)(b4i_main.__c.runMethod(true,"True")))).getObject())));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generatecropimage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("generateCropImage (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,245);
if (RapidSub.canDelegate("generatecropimage")) { return __ref.runUserSub(false, "imageviewcrop","generatecropimage", __ref);}
RemoteObject _image = RemoteObject.declareNull("b4i_bitmapcreator");
RemoteObject _ray = RemoteObject.createImmutable(0.0f);
 BA.debugLineNum = 245;BA.debugLine="Private Sub generateCropImage As BitmapCreator";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 246;BA.debugLine="Dim Image As BitmapCreator";
Debug.ShouldStop(2097152);
_image = RemoteObject.createNew ("b4i_bitmapcreator");Debug.locals.put("Image", _image);
 BA.debugLineNum = 247;BA.debugLine="If CropMode=\"Square\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cropmode"),BA.ObjectToString("Square"))) { 
 BA.debugLineNum = 248;BA.debugLine="Image.Initialize(SelectionRect.Width,SelectionRe";
Debug.ShouldStop(8388608);
_image.runVoidMethod ("_initialize:::",__ref.getField(false, "bi"),(Object)(BA.numberCast(int.class, __ref.getField(false,"_selectionrect").runMethod(true,"Width"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_selectionrect").runMethod(true,"Height"))));
 BA.debugLineNum = 249;BA.debugLine="Image.DrawBitmapCreator(ColorBC,SelectionRect,0,";
Debug.ShouldStop(16777216);
_image.runVoidMethod ("_drawbitmapcreator:::::",(Object)(__ref.getField(false,"_colorbc")),(Object)(__ref.getField(false,"_selectionrect")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4i_main.__c.runMethod(true,"True")));
 }else 
{ BA.debugLineNum = 250;BA.debugLine="else If CropMode=\"Ellipse\" And (SelectionRect.Wid";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cropmode"),BA.ObjectToString("Ellipse")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(false,"_selectionrect").runMethod(true,"Width"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean(">",__ref.getField(false,"_selectionrect").runMethod(true,"Height"),BA.numberCast(double.class, 1)))))) { 
 BA.debugLineNum = 251;BA.debugLine="Image.Initialize(SelectionRect.Width,SelectionRe";
Debug.ShouldStop(67108864);
_image.runVoidMethod ("_initialize:::",__ref.getField(false, "bi"),(Object)(BA.numberCast(int.class, __ref.getField(false,"_selectionrect").runMethod(true,"Width"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_selectionrect").runMethod(true,"Height"))));
 BA.debugLineNum = 252;BA.debugLine="Image.DrawBitmapCreator(ColorBC,SelectionRect,0,";
Debug.ShouldStop(134217728);
_image.runVoidMethod ("_drawbitmapcreator:::::",(Object)(__ref.getField(false,"_colorbc")),(Object)(__ref.getField(false,"_selectionrect")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 253;BA.debugLine="Image=CreateRoundBitmapCreator(Image)";
Debug.ShouldStop(268435456);
_image = __ref.runClassMethod (b4i_imageviewcrop.class, "_createroundbitmapcreator:",(Object)(_image));Debug.locals.put("Image", _image);
 }else 
{ BA.debugLineNum = 254;BA.debugLine="else If CropMode=\"Circle\" And (SelectionRect.Widt";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cropmode"),BA.ObjectToString("Circle")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(false,"_selectionrect").runMethod(true,"Width"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean(">",__ref.getField(false,"_selectionrect").runMethod(true,"Height"),BA.numberCast(double.class, 1)))))) { 
 BA.debugLineNum = 255;BA.debugLine="Dim Ray As Float = Min(Abs(SelectionRect.Right-S";
Debug.ShouldStop(1073741824);
_ray = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(b4i_main.__c.runMethod(true,"Abs:",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Right"),__ref.getField(false,"_selectionrect").runMethod(true,"Left")}, "-",1, 0)))),(Object)(b4i_main.__c.runMethod(true,"Abs:",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Bottom"),__ref.getField(false,"_selectionrect").runMethod(true,"Top")}, "-",1, 0))))));Debug.locals.put("Ray", _ray);Debug.locals.put("Ray", _ray);
 BA.debugLineNum = 257;BA.debugLine="SelectionRect.left = SelectionRect.CenterX - Ray";
Debug.ShouldStop(1);
__ref.getField(false,"_selectionrect").runMethod(true,"setLeft:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"CenterX"),_ray,RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 258;BA.debugLine="SelectionRect.Width=Ray";
Debug.ShouldStop(2);
__ref.getField(false,"_selectionrect").runMethod(true,"setWidth:",_ray);
 BA.debugLineNum = 259;BA.debugLine="SelectionRect.Top = SelectionRect.CenterY - Ray/";
Debug.ShouldStop(4);
__ref.getField(false,"_selectionrect").runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"CenterY"),_ray,RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 260;BA.debugLine="SelectionRect.Height=Ray";
Debug.ShouldStop(8);
__ref.getField(false,"_selectionrect").runMethod(true,"setHeight:",_ray);
 BA.debugLineNum = 262;BA.debugLine="Image.Initialize(Ray,Ray)";
Debug.ShouldStop(32);
_image.runVoidMethod ("_initialize:::",__ref.getField(false, "bi"),(Object)(BA.numberCast(int.class, _ray)),(Object)(BA.numberCast(int.class, _ray)));
 BA.debugLineNum = 263;BA.debugLine="Image.DrawBitmapCreator(ColorBC,SelectionRect,0,";
Debug.ShouldStop(64);
_image.runVoidMethod ("_drawbitmapcreator:::::",(Object)(__ref.getField(false,"_colorbc")),(Object)(__ref.getField(false,"_selectionrect")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 264;BA.debugLine="Image=CreateRoundBitmapCreator(Image)";
Debug.ShouldStop(128);
_image = __ref.runClassMethod (b4i_imageviewcrop.class, "_createroundbitmapcreator:",(Object)(_image));Debug.locals.put("Image", _image);
 }else 
{ BA.debugLineNum = 265;BA.debugLine="else if CropMode=\"Star\"  And (SelectionRect.Width";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cropmode"),BA.ObjectToString("Star")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(false,"_selectionrect").runMethod(true,"Width"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean(">",__ref.getField(false,"_selectionrect").runMethod(true,"Height"),BA.numberCast(double.class, 1)))))) { 
 BA.debugLineNum = 266;BA.debugLine="Image.Initialize(SelectionRect.Width,SelectionRe";
Debug.ShouldStop(512);
_image.runVoidMethod ("_initialize:::",__ref.getField(false, "bi"),(Object)(BA.numberCast(int.class, __ref.getField(false,"_selectionrect").runMethod(true,"Width"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_selectionrect").runMethod(true,"Height"))));
 BA.debugLineNum = 267;BA.debugLine="Image=CreateStarBitmapCreator(ColorBC)";
Debug.ShouldStop(1024);
_image = __ref.runClassMethod (b4i_imageviewcrop.class, "_createstarbitmapcreator:",(Object)(__ref.getField(false,"_colorbc")));Debug.locals.put("Image", _image);
 }}}}
;
 BA.debugLineNum = 270;BA.debugLine="Return Image";
Debug.ShouldStop(8192);
if (true) return _image;
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generategreyimage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("generateGreyImage (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,225);
if (RapidSub.canDelegate("generategreyimage")) { return __ref.runUserSub(false, "imageviewcrop","generategreyimage", __ref);}
RemoteObject _image = RemoteObject.declareNull("b4i_bitmapcreator");
RemoteObject _argb = RemoteObject.declareNull("_argbcolor");
int _x = 0;
int _y = 0;
RemoteObject _c = RemoteObject.createImmutable(0);
 BA.debugLineNum = 225;BA.debugLine="Private Sub generateGreyImage As BitmapCreator";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="Dim Image As BitmapCreator";
Debug.ShouldStop(2);
_image = RemoteObject.createNew ("b4i_bitmapcreator");Debug.locals.put("Image", _image);
 BA.debugLineNum = 227;BA.debugLine="Image.Initialize(ColorBC.mWidth, ColorBC.mHeight)";
Debug.ShouldStop(4);
_image.runVoidMethod ("_initialize:::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_colorbc").getField(true,"_mwidth")),(Object)(__ref.getField(false,"_colorbc").getField(true,"_mheight")));
 BA.debugLineNum = 230;BA.debugLine="Dim argb As ARGBColor";
Debug.ShouldStop(32);
_argb = RemoteObject.createNew ("_argbcolor");Debug.locals.put("argb", _argb);
 BA.debugLineNum = 231;BA.debugLine="For x = 0 To ColorBC.mWidth - 1";
Debug.ShouldStop(64);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorbc").getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_x = 0 ;
for (;(step4 > 0 && _x <= limit4) || (step4 < 0 && _x >= limit4) ;_x = ((int)(0 + _x + step4))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 232;BA.debugLine="For y = 0 To ColorBC.mHeight - 1";
Debug.ShouldStop(128);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorbc").getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_y = 0 ;
for (;(step5 > 0 && _y <= limit5) || (step5 < 0 && _y >= limit5) ;_y = ((int)(0 + _y + step5))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 233;BA.debugLine="ColorBC.GetARGB(x, y, argb)";
Debug.ShouldStop(256);
__ref.getField(false,"_colorbc").runVoidMethod ("_getargb:::",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_argb));
 BA.debugLineNum = 234;BA.debugLine="Dim c As Int = argb.r * 0.21 + argb.g * 0.72 +";
Debug.ShouldStop(512);
_c = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_argb.getField(true,"r"),RemoteObject.createImmutable(0.21),_argb.getField(true,"g"),RemoteObject.createImmutable(0.72),RemoteObject.createImmutable(0.07),_argb.getField(true,"b")}, "*+*+*",2, 0));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 235;BA.debugLine="argb.r = c";
Debug.ShouldStop(1024);
_argb.setField ("r",_c);
 BA.debugLineNum = 236;BA.debugLine="argb.g = c";
Debug.ShouldStop(2048);
_argb.setField ("g",_c);
 BA.debugLineNum = 237;BA.debugLine="argb.b = c";
Debug.ShouldStop(4096);
_argb.setField ("b",_c);
 BA.debugLineNum = 238;BA.debugLine="argb.a=160";
Debug.ShouldStop(8192);
_argb.setField ("a",BA.numberCast(int.class, 160));
 BA.debugLineNum = 239;BA.debugLine="Image.SetARGB(x, y, argb)";
Debug.ShouldStop(16384);
_image.runVoidMethod ("_setargb:::",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_argb));
 }
}Debug.locals.put("y", _y);
;
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 242;BA.debugLine="Return Image";
Debug.ShouldStop(131072);
if (true) return _image;
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcrop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCrop (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,157);
if (RapidSub.canDelegate("getcrop")) { return __ref.runUserSub(false, "imageviewcrop","getcrop", __ref);}
 BA.debugLineNum = 157;BA.debugLine="Public Sub getCrop As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Return CropMode";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(true,"_cropmode");
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcroppedbitmap(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCroppedBitmap (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,190);
if (RapidSub.canDelegate("getcroppedbitmap")) { return __ref.runUserSub(false, "imageviewcrop","getcroppedbitmap", __ref);}
RemoteObject _fx = RemoteObject.createImmutable(0.0f);
RemoteObject _fy = RemoteObject.createImmutable(0.0f);
 BA.debugLineNum = 190;BA.debugLine="Public Sub getCroppedBitmap As Bitmap";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="Dim Fx As Float = RotateBmp.Width / TargetBC.mWid";
Debug.ShouldStop(1073741824);
_fx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_rotatebmp").runMethod(true,"Width"),__ref.getField(false,"_targetbc").getField(true,"_mwidth")}, "/",0, 0));Debug.locals.put("Fx", _fx);Debug.locals.put("Fx", _fx);
 BA.debugLineNum = 192;BA.debugLine="Dim Fy As Float = RotateBmp.Height / TargetBC.mHe";
Debug.ShouldStop(-2147483648);
_fy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_rotatebmp").runMethod(true,"Height"),__ref.getField(false,"_targetbc").getField(true,"_mheight")}, "/",0, 0));Debug.locals.put("Fy", _fy);Debug.locals.put("Fy", _fy);
 BA.debugLineNum = 194;BA.debugLine="Select CropMode";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(__ref.getField(true,"_cropmode"),BA.ObjectToString("Square"),BA.ObjectToString("Ellipse"),BA.ObjectToString("Circle"),BA.ObjectToString("Star"))) {
case 0: {
 BA.debugLineNum = 196;BA.debugLine="Return RotateBmp.Crop(SelectionRect.Left * Fx,";
Debug.ShouldStop(8);
if (true) return BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IBitmap"), (__ref.getField(false,"_rotatebmp").runMethod(false,"Crop::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Left"),_fx}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Top"),_fy}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Width"),_fx}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Height"),_fy}, "*",0, 0))))).getObject());
 break; }
case 1: {
 BA.debugLineNum = 198;BA.debugLine="Return CreateRoundBitmap(RotateBmp.Crop(Selecti";
Debug.ShouldStop(32);
if (true) return BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IBitmap"), (__ref.runClassMethod (b4i_imageviewcrop.class, "_createroundbitmap:",(Object)(__ref.getField(false,"_rotatebmp").runMethod(false,"Crop::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Left"),_fx}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Top"),_fy}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Width"),_fx}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Height"),_fy}, "*",0, 0))))))).getObject());
 break; }
case 2: {
 BA.debugLineNum = 200;BA.debugLine="Return CreateRoundBitmap(RotateBmp.Crop(Selecti";
Debug.ShouldStop(128);
if (true) return BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IBitmap"), (__ref.runClassMethod (b4i_imageviewcrop.class, "_createroundbitmap:",(Object)(__ref.getField(false,"_rotatebmp").runMethod(false,"Crop::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Left"),_fx}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Top"),_fy}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Width"),_fx}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Height"),_fy}, "*",0, 0))))))).getObject());
 break; }
case 3: {
 BA.debugLineNum = 202;BA.debugLine="Return CreateStarBitmap(RotateBmp.Crop(Selectio";
Debug.ShouldStop(512);
if (true) return BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IBitmap"), (__ref.runClassMethod (b4i_imageviewcrop.class, "_createstarbitmap:",(Object)(__ref.getField(false,"_rotatebmp").runMethod(false,"Crop::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Left"),_fx}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Top"),_fy}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Width"),_fx}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Height"),_fy}, "*",0, 0))))))).getObject());
 break; }
default: {
 BA.debugLineNum = 204;BA.debugLine="Return RotateBmp.Crop(SelectionRect.Left * Fx,";
Debug.ShouldStop(2048);
if (true) return BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IBitmap"), (__ref.getField(false,"_rotatebmp").runMethod(false,"Crop::::",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Left"),_fx}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Top"),_fy}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Width"),_fx}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectionrect").runMethod(true,"Height"),_fy}, "*",0, 0))))).getObject());
 break; }
}
;
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrotation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRotation (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,174);
if (RapidSub.canDelegate("getrotation")) { return __ref.runUserSub(false, "imageviewcrop","getrotation", __ref);}
 BA.debugLineNum = 174;BA.debugLine="Public Sub getRotation As Float";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="Return Degree";
Debug.ShouldStop(16384);
if (true) return __ref.getField(true,"_degree");
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0.0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ghierarotate_multitouchended(RemoteObject __ref,RemoteObject _touches) throws Exception{
try {
		Debug.PushSubsStack("GhieraRotate_MultiTouchEnded (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,806);
if (RapidSub.canDelegate("ghierarotate_multitouchended")) { return __ref.runUserSub(false, "imageviewcrop","ghierarotate_multitouchended", __ref, _touches);}
Debug.locals.put("touches", _touches);
 BA.debugLineNum = 806;BA.debugLine="Private Sub GhieraRotate_MultiTouchEnded(touches A";
Debug.ShouldStop(32);
 BA.debugLineNum = 807;BA.debugLine="DrawGhieraRotate";
Debug.ShouldStop(64);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawghierarotate");
 BA.debugLineNum = 808;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 809;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ghierarotate_multitouchmoved(RemoteObject __ref,RemoteObject _touches) throws Exception{
try {
		Debug.PushSubsStack("GhieraRotate_MultiTouchMoved (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,789);
if (RapidSub.canDelegate("ghierarotate_multitouchmoved")) { return __ref.runUserSub(false, "imageviewcrop","ghierarotate_multitouchmoved", __ref, _touches);}
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _x = RemoteObject.createImmutable(0.0f);
RemoteObject _y = RemoteObject.createImmutable(0.0f);
RemoteObject _t = RemoteObject.declareNull("B4INativeObject");
RemoteObject _point = RemoteObject.declareNull("B4IList");
RemoteObject _d = RemoteObject.createImmutable(0.0f);
Debug.locals.put("touches", _touches);
 BA.debugLineNum = 789;BA.debugLine="Private Sub GhieraRotate_MultiTouchMoved(touches A";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 790;BA.debugLine="Dim list As List = touches";
Debug.ShouldStop(2097152);
_list = RemoteObject.createNew ("B4IList");
_list.setObject(_touches);Debug.locals.put("list", _list);
 BA.debugLineNum = 791;BA.debugLine="Dim X,Y As Float 'ignore";
Debug.ShouldStop(4194304);
_x = RemoteObject.createImmutable(0.0f);Debug.locals.put("X", _x);
_y = RemoteObject.createImmutable(0.0f);Debug.locals.put("Y", _y);
 BA.debugLineNum = 793;BA.debugLine="For Each t As NativeObject In list";
Debug.ShouldStop(16777216);
_t = RemoteObject.createNew ("B4INativeObject");
{
final RemoteObject group3 = _list;
final int groupLen3 = group3.runMethod(true,"Size").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_t.setObject(group3.runMethod(false,"Get:",index3));
Debug.locals.put("t", _t);
 BA.debugLineNum = 794;BA.debugLine="Dim point As List = NativeMe.RunMethod(\"UITouchT";
Debug.ShouldStop(33554432);
_point = RemoteObject.createNew ("B4IList");
_point.setObject((__ref.getField(false,"_nativeme").runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("UITouchToPoint::")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {((_t).getObject()),b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi"))})))).getObject());Debug.locals.put("point", _point);
 BA.debugLineNum = 795;BA.debugLine="X= point.Get(0)";
Debug.ShouldStop(67108864);
_x = BA.numberCast(float.class, _point.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("X", _x);
 BA.debugLineNum = 796;BA.debugLine="Y= point.Get(1)";
Debug.ShouldStop(134217728);
_y = BA.numberCast(float.class, _point.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Y", _y);
 BA.debugLineNum = 798;BA.debugLine="Dim D As Float=Bit.FMod(((x/GhieraRotate.Width)+";
Debug.ShouldStop(536870912);
_d = BA.numberCast(float.class, b4i_main.__c.runMethod(false,"Bit").runMethod(true,"FMod::",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(false,"_ghierarotate").runMethod(true,"Width")}, "/",0, 0)),RemoteObject.createImmutable(0.5)}, "+",1, 0)),RemoteObject.createImmutable(360)}, "*",0, 0)),(Object)(BA.numberCast(double.class, 360))));Debug.locals.put("D", _d);Debug.locals.put("D", _d);
 BA.debugLineNum = 799;BA.debugLine="setRotation(D)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4i_imageviewcrop.class, "_setrotation:",(Object)(_d));
 }
}Debug.locals.put("t", _t);
;
 BA.debugLineNum = 803;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) return b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 804;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ghierazoom_multitouchmoved(RemoteObject __ref,RemoteObject _touches) throws Exception{
try {
		Debug.PushSubsStack("GhieraZoom_MultiTouchMoved (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,811);
if (RapidSub.canDelegate("ghierazoom_multitouchmoved")) { return __ref.runUserSub(false, "imageviewcrop","ghierazoom_multitouchmoved", __ref, _touches);}
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _x = RemoteObject.createImmutable(0.0f);
RemoteObject _y = RemoteObject.createImmutable(0.0f);
RemoteObject _t = RemoteObject.declareNull("B4INativeObject");
RemoteObject _point = RemoteObject.declareNull("B4IList");
RemoteObject _newleft = RemoteObject.createImmutable(0);
RemoteObject _newtop = RemoteObject.createImmutable(0);
RemoteObject _newwidth = RemoteObject.createImmutable(0);
RemoteObject _newheight = RemoteObject.createImmutable(0);
Debug.locals.put("touches", _touches);
 BA.debugLineNum = 811;BA.debugLine="Private Sub GhieraZoom_MultiTouchMoved(touches As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 812;BA.debugLine="Dim list As List = touches";
Debug.ShouldStop(2048);
_list = RemoteObject.createNew ("B4IList");
_list.setObject(_touches);Debug.locals.put("list", _list);
 BA.debugLineNum = 813;BA.debugLine="Dim X,Y As Float 'ignore";
Debug.ShouldStop(4096);
_x = RemoteObject.createImmutable(0.0f);Debug.locals.put("X", _x);
_y = RemoteObject.createImmutable(0.0f);Debug.locals.put("Y", _y);
 BA.debugLineNum = 815;BA.debugLine="For Each t As NativeObject In list";
Debug.ShouldStop(16384);
_t = RemoteObject.createNew ("B4INativeObject");
{
final RemoteObject group3 = _list;
final int groupLen3 = group3.runMethod(true,"Size").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_t.setObject(group3.runMethod(false,"Get:",index3));
Debug.locals.put("t", _t);
 BA.debugLineNum = 816;BA.debugLine="Dim point As List = NativeMe.RunMethod(\"UITouchT";
Debug.ShouldStop(32768);
_point = RemoteObject.createNew ("B4IList");
_point.setObject((__ref.getField(false,"_nativeme").runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("UITouchToPoint::")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {((_t).getObject()),b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi"))})))).getObject());Debug.locals.put("point", _point);
 BA.debugLineNum = 817;BA.debugLine="X= point.Get(0)";
Debug.ShouldStop(65536);
_x = BA.numberCast(float.class, _point.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("X", _x);
 BA.debugLineNum = 818;BA.debugLine="Y= point.Get(1)";
Debug.ShouldStop(131072);
_y = BA.numberCast(float.class, _point.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Y", _y);
 BA.debugLineNum = 819;BA.debugLine="ZoomPosition=X/GhieraZoom.Width";
Debug.ShouldStop(262144);
__ref.setField ("_zoomposition",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(false,"_ghierazoom").runMethod(true,"Width")}, "/",0, 0)));
 BA.debugLineNum = 820;BA.debugLine="If X<GhieraZoom.Width/2 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("<",_x,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierazoom").runMethod(true,"Width"),RemoteObject.createImmutable(2)}, "/",0, 0))) { 
 BA.debugLineNum = 821;BA.debugLine="Zoom=Max((x/(GhieraZoom.Width/2)),0.1)";
Debug.ShouldStop(1048576);
__ref.setField ("_zoom",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)((RemoteObject.solve(new RemoteObject[] {_x,(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierazoom").runMethod(true,"Width"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "/",0, 0))),(Object)(BA.numberCast(double.class, 0.1)))));
 }else {
 BA.debugLineNum = 823;BA.debugLine="Zoom=1+(4*(X-GhieraZoom.Width/2)/(GhieraZoom.Wi";
Debug.ShouldStop(4194304);
__ref.setField ("_zoom",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(4),(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(false,"_ghierazoom").runMethod(true,"Width"),RemoteObject.createImmutable(2)}, "-/",1, 0)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ghierazoom").runMethod(true,"Width"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "*/",0, 0))}, "+",1, 0)));
 };
 BA.debugLineNum = 825;BA.debugLine="Dim newLeft As Int = OffsetX+(1-Zoom)*OriginalX/";
Debug.ShouldStop(16777216);
_newleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_offsetx"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),__ref.getField(true,"_zoom")}, "-",1, 0)),__ref.getField(true,"_originalx"),RemoteObject.createImmutable(2)}, "+*/",1, 0));Debug.locals.put("newLeft", _newleft);Debug.locals.put("newLeft", _newleft);
 BA.debugLineNum = 826;BA.debugLine="Dim newTop As Int = OffsetY+(1-Zoom)*OriginalY/2";
Debug.ShouldStop(33554432);
_newtop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_offsety"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),__ref.getField(true,"_zoom")}, "-",1, 0)),__ref.getField(true,"_originaly"),RemoteObject.createImmutable(2)}, "+*/",1, 0));Debug.locals.put("newTop", _newtop);Debug.locals.put("newTop", _newtop);
 BA.debugLineNum = 827;BA.debugLine="Dim newWidth As Int = OriginalX*Zoom";
Debug.ShouldStop(67108864);
_newwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_originalx"),__ref.getField(true,"_zoom")}, "*",0, 0));Debug.locals.put("newWidth", _newwidth);Debug.locals.put("newWidth", _newwidth);
 BA.debugLineNum = 828;BA.debugLine="Dim newHeight As Int = OriginalY*Zoom";
Debug.ShouldStop(134217728);
_newheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_originaly"),__ref.getField(true,"_zoom")}, "*",0, 0));Debug.locals.put("newHeight", _newheight);Debug.locals.put("newHeight", _newheight);
 BA.debugLineNum = 829;BA.debugLine="ImageView1.SetLayoutAnimated(0,0,newLeft,newTop,";
Debug.ShouldStop(268435456);
__ref.getField(false,"_imageview1").runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _newleft)),(Object)(BA.numberCast(float.class, _newtop)),(Object)(BA.numberCast(float.class, _newwidth)),(Object)(BA.numberCast(float.class, _newheight)));
 BA.debugLineNum = 830;BA.debugLine="DrawGhieraZoom";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawghierazoom");
 }
}Debug.locals.put("t", _t);
;
 BA.debugLineNum = 833;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) return b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 834;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,41);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "imageviewcrop","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 41;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(512);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 43;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(1024);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 44;BA.debugLine="ImageView1.Initialize(\"ImageView1\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_imageview1").runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("ImageView1")));
 BA.debugLineNum = 45;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
Debug.ShouldStop(4096);
__ref.setField ("_pnl",__ref.getField(false,"_xui").runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("pnl"))));
 BA.debugLineNum = 46;BA.debugLine="GhieraRotate = xui.CreatePanel(\"GhieraRotate\")";
Debug.ShouldStop(8192);
__ref.setField ("_ghierarotate",__ref.getField(false,"_xui").runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("GhieraRotate"))));
 BA.debugLineNum = 47;BA.debugLine="GhieraZoom = xui.CreatePanel(\"GhieraZoom\")";
Debug.ShouldStop(16384);
__ref.setField ("_ghierazoom",__ref.getField(false,"_xui").runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("GhieraZoom"))));
 BA.debugLineNum = 49;BA.debugLine="SelectionRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(65536);
__ref.getField(false,"_selectionrect").runVoidMethod ("Initialize::::",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 50;BA.debugLine="fingersList.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_fingerslist").runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="Xi=-50";
Debug.ShouldStop(262144);
__ref.setField ("_xi",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 52;BA.debugLine="Yi=-50";
Debug.ShouldStop(524288);
__ref.setField ("_yi",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 53;BA.debugLine="Xf=-50";
Debug.ShouldStop(1048576);
__ref.setField ("_xf",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 54;BA.debugLine="Yf=-50";
Debug.ShouldStop(2097152);
__ref.setField ("_yf",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_multitouchbegan(RemoteObject __ref,RemoteObject _touches) throws Exception{
try {
		Debug.PushSubsStack("pnl_MultiTouchBegan (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,617);
if (RapidSub.canDelegate("pnl_multitouchbegan")) { return __ref.runUserSub(false, "imageviewcrop","pnl_multitouchbegan", __ref, _touches);}
RemoteObject _x = RemoteObject.createImmutable(0.0f);
RemoteObject _y = RemoteObject.createImmutable(0.0f);
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _t = RemoteObject.declareNull("B4INativeObject");
RemoteObject _point = RemoteObject.declareNull("B4IList");
RemoteObject _fd = RemoteObject.declareNull("_c_type");
RemoteObject _d1 = RemoteObject.createImmutable(0.0f);
RemoteObject _d2 = RemoteObject.createImmutable(0.0f);
Debug.locals.put("touches", _touches);
 BA.debugLineNum = 617;BA.debugLine="Private Sub pnl_MultiTouchBegan(touches As Object)";
Debug.ShouldStop(256);
 BA.debugLineNum = 618;BA.debugLine="Dim X,Y As Float";
Debug.ShouldStop(512);
_x = RemoteObject.createImmutable(0.0f);Debug.locals.put("X", _x);
_y = RemoteObject.createImmutable(0.0f);Debug.locals.put("Y", _y);
 BA.debugLineNum = 619;BA.debugLine="Dim list As List = touches";
Debug.ShouldStop(1024);
_list = RemoteObject.createNew ("B4IList");
_list.setObject(_touches);Debug.locals.put("list", _list);
 BA.debugLineNum = 621;BA.debugLine="For Each t As NativeObject In list";
Debug.ShouldStop(4096);
_t = RemoteObject.createNew ("B4INativeObject");
{
final RemoteObject group3 = _list;
final int groupLen3 = group3.runMethod(true,"Size").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_t.setObject(group3.runMethod(false,"Get:",index3));
Debug.locals.put("t", _t);
 BA.debugLineNum = 622;BA.debugLine="Dim point As List = NativeMe.RunMethod(\"UITouchT";
Debug.ShouldStop(8192);
_point = RemoteObject.createNew ("B4IList");
_point.setObject((__ref.getField(false,"_nativeme").runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("UITouchToPoint::")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {((_t).getObject()),b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi"))})))).getObject());Debug.locals.put("point", _point);
 BA.debugLineNum = 623;BA.debugLine="Dim fd As C_Type";
Debug.ShouldStop(16384);
_fd = RemoteObject.createNew ("_c_type");Debug.locals.put("fd", _fd);
 BA.debugLineNum = 624;BA.debugLine="fd.X = point.Get(0)";
Debug.ShouldStop(32768);
_fd.setField ("X",BA.numberCast(int.class, _point.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 625;BA.debugLine="fd.Y = point.Get(1)";
Debug.ShouldStop(65536);
_fd.setField ("Y",BA.numberCast(int.class, _point.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 626;BA.debugLine="fingers.Put(t, fd)";
Debug.ShouldStop(131072);
__ref.getField(false,"_fingers").runVoidMethod ("Put::",(Object)(((_t).getObject())),(Object)((_fd)));
 BA.debugLineNum = 627;BA.debugLine="fingersList.Add(t)";
Debug.ShouldStop(262144);
__ref.getField(false,"_fingerslist").runVoidMethod ("Add:",(Object)(((_t).getObject())));
 }
}Debug.locals.put("t", _t);
;
 BA.debugLineNum = 631;BA.debugLine="Dim fd As C_Type = fingers.Get(fingersList.Get(0)";
Debug.ShouldStop(4194304);
_fd = (__ref.getField(false,"_fingers").runMethod(false,"Get:",(Object)(__ref.getField(false,"_fingerslist").runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 0))))));Debug.locals.put("fd", _fd);Debug.locals.put("fd", _fd);
 BA.debugLineNum = 633;BA.debugLine="Select Operation";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(__ref.getField(true,"_operation"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 635;BA.debugLine="X = fd.X";
Debug.ShouldStop(67108864);
_x = BA.numberCast(float.class, _fd.getField(true,"X"));Debug.locals.put("X", _x);
 BA.debugLineNum = 636;BA.debugLine="Y = fd.y";
Debug.ShouldStop(134217728);
_y = BA.numberCast(float.class, _fd.getField(true,"Y"));Debug.locals.put("Y", _y);
 BA.debugLineNum = 643;BA.debugLine="Dim D1 As Float = Sqrt(Power(Xi-X,2)+Power(Yi-Y";
Debug.ShouldStop(4);
_d1 = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Sqrt:",(Object)(RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Power::",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_xi"),_x}, "-",1, 0)),(Object)(BA.numberCast(double.class, 2))),b4i_main.__c.runMethod(true,"Power::",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_yi"),_y}, "-",1, 0)),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))));Debug.locals.put("D1", _d1);Debug.locals.put("D1", _d1);
 BA.debugLineNum = 644;BA.debugLine="Dim D2 As Float = Sqrt(Power(Xf-X,2)+Power(Yf-Y";
Debug.ShouldStop(8);
_d2 = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Sqrt:",(Object)(RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Power::",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_xf"),_x}, "-",1, 0)),(Object)(BA.numberCast(double.class, 2))),b4i_main.__c.runMethod(true,"Power::",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_yf"),_y}, "-",1, 0)),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))));Debug.locals.put("D2", _d2);Debug.locals.put("D2", _d2);
 BA.debugLineNum = 646;BA.debugLine="If D1<20dip Or D2<20dip Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",_d1,BA.numberCast(double.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 20))))) || RemoteObject.solveBoolean("<",_d2,BA.numberCast(double.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 20)))))) { 
 BA.debugLineNum = 647;BA.debugLine="If D1<D2 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",_d1,BA.numberCast(double.class, _d2))) { 
 BA.debugLineNum = 648;BA.debugLine="Xi=X";
Debug.ShouldStop(128);
__ref.setField ("_xi",_x);
 BA.debugLineNum = 649;BA.debugLine="Yi=y";
Debug.ShouldStop(256);
__ref.setField ("_yi",_y);
 }else {
 BA.debugLineNum = 651;BA.debugLine="Xf=X";
Debug.ShouldStop(1024);
__ref.setField ("_xf",_x);
 BA.debugLineNum = 652;BA.debugLine="Yf=y";
Debug.ShouldStop(2048);
__ref.setField ("_yf",_y);
 };
 }else {
 BA.debugLineNum = 655;BA.debugLine="Xi=X";
Debug.ShouldStop(16384);
__ref.setField ("_xi",_x);
 BA.debugLineNum = 656;BA.debugLine="Yi=Y";
Debug.ShouldStop(32768);
__ref.setField ("_yi",_y);
 BA.debugLineNum = 657;BA.debugLine="Xf=X";
Debug.ShouldStop(65536);
__ref.setField ("_xf",_x);
 BA.debugLineNum = 658;BA.debugLine="Yf=y";
Debug.ShouldStop(131072);
__ref.setField ("_yf",_y);
 BA.debugLineNum = 659;BA.debugLine="SelectionRect.Initialize(0,0,0,0)";
Debug.ShouldStop(262144);
__ref.getField(false,"_selectionrect").runVoidMethod ("Initialize::::",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 };
 break; }
case 1: {
 BA.debugLineNum = 662;BA.debugLine="sx = fd.X";
Debug.ShouldStop(2097152);
__ref.setField ("_sx",BA.numberCast(float.class, _fd.getField(true,"X")));
 BA.debugLineNum = 663;BA.debugLine="sy = fd.y";
Debug.ShouldStop(4194304);
__ref.setField ("_sy",BA.numberCast(float.class, _fd.getField(true,"Y")));
 break; }
}
;
 BA.debugLineNum = 667;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) return b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 668;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_multitouchended(RemoteObject __ref,RemoteObject _touches) throws Exception{
try {
		Debug.PushSubsStack("pnl_MultiTouchEnded (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,752);
if (RapidSub.canDelegate("pnl_multitouchended")) { return __ref.runUserSub(false, "imageviewcrop","pnl_multitouchended", __ref, _touches);}
RemoteObject _x = RemoteObject.createImmutable(0.0f);
RemoteObject _y = RemoteObject.createImmutable(0.0f);
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _t = RemoteObject.declareNull("B4INativeObject");
RemoteObject _point = RemoteObject.declareNull("B4IList");
int _i = 0;
RemoteObject _t1 = RemoteObject.declareNull("B4INativeObject");
Debug.locals.put("touches", _touches);
 BA.debugLineNum = 752;BA.debugLine="Private Sub pnl_MultiTouchEnded(touches As Object)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 753;BA.debugLine="Dim X,Y As Float";
Debug.ShouldStop(65536);
_x = RemoteObject.createImmutable(0.0f);Debug.locals.put("X", _x);
_y = RemoteObject.createImmutable(0.0f);Debug.locals.put("Y", _y);
 BA.debugLineNum = 754;BA.debugLine="Dim list As List = touches";
Debug.ShouldStop(131072);
_list = RemoteObject.createNew ("B4IList");
_list.setObject(_touches);Debug.locals.put("list", _list);
 BA.debugLineNum = 756;BA.debugLine="sx=-SizeCircle";
Debug.ShouldStop(524288);
__ref.setField ("_sx",BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_sizecircle").<Number>get().intValue())));
 BA.debugLineNum = 757;BA.debugLine="sy=-SizeCircle";
Debug.ShouldStop(1048576);
__ref.setField ("_sy",BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_sizecircle").<Number>get().intValue())));
 BA.debugLineNum = 758;BA.debugLine="If list.Size=1 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 759;BA.debugLine="Dim t As NativeObject = list.Get(0)";
Debug.ShouldStop(4194304);
_t = RemoteObject.createNew ("B4INativeObject");
_t.setObject(_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("t", _t);
 BA.debugLineNum = 760;BA.debugLine="Dim point As List = NativeMe.RunMethod(\"UITouchT";
Debug.ShouldStop(8388608);
_point = RemoteObject.createNew ("B4IList");
_point.setObject((__ref.getField(false,"_nativeme").runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("UITouchToPoint::")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {((_t).getObject()),b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi"))})))).getObject());Debug.locals.put("point", _point);
 BA.debugLineNum = 761;BA.debugLine="X = point.Get(0)";
Debug.ShouldStop(16777216);
_x = BA.numberCast(float.class, _point.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("X", _x);
 BA.debugLineNum = 762;BA.debugLine="Y = point.Get(1)";
Debug.ShouldStop(33554432);
_y = BA.numberCast(float.class, _point.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Y", _y);
 BA.debugLineNum = 764;BA.debugLine="x = (x - OffsetX)/ xui.Scale";
Debug.ShouldStop(134217728);
_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_offsetx")}, "-",1, 0)),__ref.getField(false,"_xui").runMethod(true,"Scale")}, "/",0, 0));Debug.locals.put("X", _x);
 BA.debugLineNum = 765;BA.debugLine="y = (y - OffsetY) / xui.Scale";
Debug.ShouldStop(268435456);
_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_offsety")}, "-",1, 0)),__ref.getField(false,"_xui").runMethod(true,"Scale")}, "/",0, 0));Debug.locals.put("Y", _y);
 BA.debugLineNum = 766;BA.debugLine="x = Max(0, Min(ColorBC.mWidth - 1, X))";
Debug.ShouldStop(536870912);
_x = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, 0)),(Object)(b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorbc").getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, _x))))));Debug.locals.put("X", _x);
 BA.debugLineNum = 767;BA.debugLine="y = Max(0, Min(ColorBC.mHeight - 1, Y))";
Debug.ShouldStop(1073741824);
_y = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, 0)),(Object)(b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorbc").getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, _y))))));Debug.locals.put("Y", _y);
 BA.debugLineNum = 769;BA.debugLine="If SelectionRect.Width > 5 And SelectionRect.Hei";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_selectionrect").runMethod(true,"Width"),BA.numberCast(double.class, 5)) && RemoteObject.solveBoolean(">",__ref.getField(false,"_selectionrect").runMethod(true,"Height"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 770;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Croppe";
Debug.ShouldStop(2);
b4i_main.__c.runVoidMethod ("CallSubDelayed:::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Cropped"))));
 };
 }else 
{ BA.debugLineNum = 772;BA.debugLine="Else if list.size=2 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 2))) { 
 }}
;
 BA.debugLineNum = 776;BA.debugLine="For Each t As NativeObject In list";
Debug.ShouldStop(128);
_t = RemoteObject.createNew ("B4INativeObject");
{
final RemoteObject group19 = _list;
final int groupLen19 = group19.runMethod(true,"Size").<Integer>get()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_t.setObject(group19.runMethod(false,"Get:",index19));
Debug.locals.put("t", _t);
 BA.debugLineNum = 777;BA.debugLine="fingers.Remove(t)";
Debug.ShouldStop(256);
__ref.getField(false,"_fingers").runVoidMethod ("Remove:",(Object)(((_t).getObject())));
 BA.debugLineNum = 778;BA.debugLine="For i=fingersList.Size-1 To 0 Step -1";
Debug.ShouldStop(512);
{
final int step21 = -1;
final int limit21 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fingerslist").runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue() ;
for (;(step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21) ;_i = ((int)(0 + _i + step21))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 779;BA.debugLine="Dim t1 As NativeObject = fingersList.Get(i)";
Debug.ShouldStop(1024);
_t1 = RemoteObject.createNew ("B4INativeObject");
_t1.setObject(__ref.getField(false,"_fingerslist").runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("t1", _t1);
 BA.debugLineNum = 780;BA.debugLine="If t1=t Then fingersList.RemoveAt(i)";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_t1,_t)) { 
__ref.getField(false,"_fingerslist").runVoidMethod ("RemoveAt:",(Object)(BA.numberCast(int.class, _i)));};
 }
}Debug.locals.put("i", _i);
;
 }
}Debug.locals.put("t", _t);
;
 BA.debugLineNum = 784;BA.debugLine="UpdateTarget";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4i_imageviewcrop.class, "_updatetarget");
 BA.debugLineNum = 786;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) return b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 787;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_multitouchmoved(RemoteObject __ref,RemoteObject _touches) throws Exception{
try {
		Debug.PushSubsStack("pnl_MultiTouchMoved (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,670);
if (RapidSub.canDelegate("pnl_multitouchmoved")) { return __ref.runUserSub(false, "imageviewcrop","pnl_multitouchmoved", __ref, _touches);}
RemoteObject _x = RemoteObject.createImmutable(0.0f);
RemoteObject _y = RemoteObject.createImmutable(0.0f);
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _t = RemoteObject.declareNull("B4INativeObject");
RemoteObject _point = RemoteObject.declareNull("B4IList");
RemoteObject _fd = RemoteObject.declareNull("_c_type");
RemoteObject _d1 = RemoteObject.createImmutable(0.0f);
RemoteObject _d2 = RemoteObject.createImmutable(0.0f);
RemoteObject _ray = RemoteObject.createImmutable(0.0f);
RemoteObject _diffx = RemoteObject.createImmutable(0);
RemoteObject _diffy = RemoteObject.createImmutable(0);
Debug.locals.put("touches", _touches);
 BA.debugLineNum = 670;BA.debugLine="Private Sub pnl_MultiTouchMoved(touches As Object)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 671;BA.debugLine="Dim X,Y As Float";
Debug.ShouldStop(1073741824);
_x = RemoteObject.createImmutable(0.0f);Debug.locals.put("X", _x);
_y = RemoteObject.createImmutable(0.0f);Debug.locals.put("Y", _y);
 BA.debugLineNum = 672;BA.debugLine="Dim list As List = touches";
Debug.ShouldStop(-2147483648);
_list = RemoteObject.createNew ("B4IList");
_list.setObject(_touches);Debug.locals.put("list", _list);
 BA.debugLineNum = 674;BA.debugLine="For Each t As NativeObject In list";
Debug.ShouldStop(2);
_t = RemoteObject.createNew ("B4INativeObject");
{
final RemoteObject group3 = _list;
final int groupLen3 = group3.runMethod(true,"Size").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_t.setObject(group3.runMethod(false,"Get:",index3));
Debug.locals.put("t", _t);
 BA.debugLineNum = 675;BA.debugLine="Dim point As List = NativeMe.RunMethod(\"UITouchT";
Debug.ShouldStop(4);
_point = RemoteObject.createNew ("B4IList");
_point.setObject((__ref.getField(false,"_nativeme").runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("UITouchToPoint::")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {((_t).getObject()),b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi"))})))).getObject());Debug.locals.put("point", _point);
 BA.debugLineNum = 676;BA.debugLine="If fingers.ContainsKey(t) Then";
Debug.ShouldStop(8);
if (__ref.getField(false,"_fingers").runMethod(true,"ContainsKey:",(Object)(((_t).getObject()))).getBoolean()) { 
 BA.debugLineNum = 677;BA.debugLine="Dim fd As C_Type = fingers.Get(t)";
Debug.ShouldStop(16);
_fd = (__ref.getField(false,"_fingers").runMethod(false,"Get:",(Object)(((_t).getObject()))));Debug.locals.put("fd", _fd);Debug.locals.put("fd", _fd);
 BA.debugLineNum = 678;BA.debugLine="fd.x = point.Get(0)";
Debug.ShouldStop(32);
_fd.setField ("X",BA.numberCast(int.class, _point.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 679;BA.debugLine="fd.y = point.Get(1)";
Debug.ShouldStop(64);
_fd.setField ("Y",BA.numberCast(int.class, _point.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 680;BA.debugLine="fingers.Put(t,fd)";
Debug.ShouldStop(128);
__ref.getField(false,"_fingers").runVoidMethod ("Put::",(Object)(((_t).getObject())),(Object)((_fd)));
 };
 }
}Debug.locals.put("t", _t);
;
 BA.debugLineNum = 685;BA.debugLine="If fingersList.Size>1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_fingerslist").runMethod(true,"Size"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 686;BA.debugLine="Dim fd As C_Type = fingers.Get(fingersList.Get(0";
Debug.ShouldStop(8192);
_fd = (__ref.getField(false,"_fingers").runMethod(false,"Get:",(Object)(__ref.getField(false,"_fingerslist").runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 0))))));Debug.locals.put("fd", _fd);Debug.locals.put("fd", _fd);
 BA.debugLineNum = 687;BA.debugLine="X = fd.X";
Debug.ShouldStop(16384);
_x = BA.numberCast(float.class, _fd.getField(true,"X"));Debug.locals.put("X", _x);
 BA.debugLineNum = 688;BA.debugLine="Y = fd.y";
Debug.ShouldStop(32768);
_y = BA.numberCast(float.class, _fd.getField(true,"Y"));Debug.locals.put("Y", _y);
 BA.debugLineNum = 689;BA.debugLine="Dim fd As C_Type = fingers.Get(fingersList.Get(1";
Debug.ShouldStop(65536);
_fd = (__ref.getField(false,"_fingers").runMethod(false,"Get:",(Object)(__ref.getField(false,"_fingerslist").runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 1))))));Debug.locals.put("fd", _fd);Debug.locals.put("fd", _fd);
 BA.debugLineNum = 690;BA.debugLine="sx = fd.X";
Debug.ShouldStop(131072);
__ref.setField ("_sx",BA.numberCast(float.class, _fd.getField(true,"X")));
 BA.debugLineNum = 691;BA.debugLine="sy = fd.y";
Debug.ShouldStop(262144);
__ref.setField ("_sy",BA.numberCast(float.class, _fd.getField(true,"Y")));
 }else {
 BA.debugLineNum = 693;BA.debugLine="Dim fd As C_Type = fingers.Get(fingersList.Get(0)";
Debug.ShouldStop(1048576);
_fd = (__ref.getField(false,"_fingers").runMethod(false,"Get:",(Object)(__ref.getField(false,"_fingerslist").runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 0))))));Debug.locals.put("fd", _fd);Debug.locals.put("fd", _fd);
 BA.debugLineNum = 694;BA.debugLine="X = fd.X";
Debug.ShouldStop(2097152);
_x = BA.numberCast(float.class, _fd.getField(true,"X"));Debug.locals.put("X", _x);
 BA.debugLineNum = 695;BA.debugLine="Y = fd.y";
Debug.ShouldStop(4194304);
_y = BA.numberCast(float.class, _fd.getField(true,"Y"));Debug.locals.put("Y", _y);
 };
 BA.debugLineNum = 698;BA.debugLine="Select Operation";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(__ref.getField(true,"_operation"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 704;BA.debugLine="Log(\"X:\" & X & \"    Y:\" & Y)";
Debug.ShouldStop(-2147483648);
b4i_main.__c.runVoidMethod ("Log:",(Object)(RemoteObject.concat(RemoteObject.createImmutable("X:"),_x,RemoteObject.createImmutable("    Y:"),_y)));
 BA.debugLineNum = 706;BA.debugLine="x = Max(0, Min(ColorBC.mWidth - 1, X))";
Debug.ShouldStop(2);
_x = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, 0)),(Object)(b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorbc").getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, _x))))));Debug.locals.put("X", _x);
 BA.debugLineNum = 707;BA.debugLine="y = Max(0, Min(ColorBC.mHeight - 1, Y))";
Debug.ShouldStop(4);
_y = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, 0)),(Object)(b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorbc").getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, _y))))));Debug.locals.put("Y", _y);
 BA.debugLineNum = 709;BA.debugLine="Dim D1 As Float = Sqrt(Power(Xi-X,2)+Power(Yi-Y";
Debug.ShouldStop(16);
_d1 = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Sqrt:",(Object)(RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Power::",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_xi"),_x}, "-",1, 0)),(Object)(BA.numberCast(double.class, 2))),b4i_main.__c.runMethod(true,"Power::",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_yi"),_y}, "-",1, 0)),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))));Debug.locals.put("D1", _d1);Debug.locals.put("D1", _d1);
 BA.debugLineNum = 710;BA.debugLine="Dim D2 As Float = Sqrt(Power(Xf-X,2)+Power(Yf-Y";
Debug.ShouldStop(32);
_d2 = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Sqrt:",(Object)(RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Power::",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_xf"),_x}, "-",1, 0)),(Object)(BA.numberCast(double.class, 2))),b4i_main.__c.runMethod(true,"Power::",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_yf"),_y}, "-",1, 0)),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))));Debug.locals.put("D2", _d2);Debug.locals.put("D2", _d2);
 BA.debugLineNum = 712;BA.debugLine="If D1<D2 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("<",_d1,BA.numberCast(double.class, _d2))) { 
 BA.debugLineNum = 713;BA.debugLine="Xi=X";
Debug.ShouldStop(256);
__ref.setField ("_xi",_x);
 BA.debugLineNum = 714;BA.debugLine="Yi=y";
Debug.ShouldStop(512);
__ref.setField ("_yi",_y);
 }else {
 BA.debugLineNum = 718;BA.debugLine="Xf=X";
Debug.ShouldStop(8192);
__ref.setField ("_xf",_x);
 BA.debugLineNum = 719;BA.debugLine="Yf=y";
Debug.ShouldStop(16384);
__ref.setField ("_yf",_y);
 };
 BA.debugLineNum = 724;BA.debugLine="If CropMode=\"Circle\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_cropmode"),BA.ObjectToString("Circle"))) { 
 BA.debugLineNum = 725;BA.debugLine="Dim Ray As Float = Min(Abs(Xf-Xi),Abs(Yf-Yi))";
Debug.ShouldStop(1048576);
_ray = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(b4i_main.__c.runMethod(true,"Abs:",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_xf"),__ref.getField(true,"_xi")}, "-",1, 0)))),(Object)(b4i_main.__c.runMethod(true,"Abs:",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_yf"),__ref.getField(true,"_yi")}, "-",1, 0))))));Debug.locals.put("Ray", _ray);Debug.locals.put("Ray", _ray);
 BA.debugLineNum = 726;BA.debugLine="SelectionRect.Left = (Xi+Xf-Ray)/2";
Debug.ShouldStop(2097152);
__ref.getField(false,"_selectionrect").runMethod(true,"setLeft:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_xi"),__ref.getField(true,"_xf"),_ray}, "+-",2, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 727;BA.debugLine="SelectionRect.Width=Ray";
Debug.ShouldStop(4194304);
__ref.getField(false,"_selectionrect").runMethod(true,"setWidth:",_ray);
 BA.debugLineNum = 728;BA.debugLine="SelectionRect.Top= (Yi+Yf-Ray)/2";
Debug.ShouldStop(8388608);
__ref.getField(false,"_selectionrect").runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_yi"),__ref.getField(true,"_yf"),_ray}, "+-",2, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 729;BA.debugLine="SelectionRect.Height=Ray";
Debug.ShouldStop(16777216);
__ref.getField(false,"_selectionrect").runMethod(true,"setHeight:",_ray);
 }else {
 BA.debugLineNum = 731;BA.debugLine="SelectionRect.Left = Min(Xi, Xf)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_selectionrect").runMethod(true,"setLeft:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, __ref.getField(true,"_xi"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_xf"))))));
 BA.debugLineNum = 732;BA.debugLine="SelectionRect.Top = Min(Yi,Yf)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_selectionrect").runMethod(true,"setTop:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, __ref.getField(true,"_yi"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_yf"))))));
 BA.debugLineNum = 733;BA.debugLine="SelectionRect.Right = Max(Xi, Xf)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_selectionrect").runMethod(true,"setRight:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, __ref.getField(true,"_xi"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_xf"))))));
 BA.debugLineNum = 734;BA.debugLine="SelectionRect.Bottom = Max(Yi,Yf)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_selectionrect").runMethod(true,"setBottom:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, __ref.getField(true,"_yi"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_yf"))))));
 };
 break; }
case 1: {
 BA.debugLineNum = 737;BA.debugLine="Dim Diffx As Int = x-sx";
Debug.ShouldStop(1);
_diffx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_sx")}, "-",1, 0));Debug.locals.put("Diffx", _diffx);Debug.locals.put("Diffx", _diffx);
 BA.debugLineNum = 738;BA.debugLine="Dim Diffy As Int = y-sy";
Debug.ShouldStop(2);
_diffy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_sy")}, "-",1, 0));Debug.locals.put("Diffy", _diffy);Debug.locals.put("Diffy", _diffy);
 BA.debugLineNum = 739;BA.debugLine="sx=X";
Debug.ShouldStop(4);
__ref.setField ("_sx",_x);
 BA.debugLineNum = 740;BA.debugLine="sy=y";
Debug.ShouldStop(8);
__ref.setField ("_sy",_y);
 BA.debugLineNum = 742;BA.debugLine="ImageView1.Left=ImageView1.Left+Diffx";
Debug.ShouldStop(32);
__ref.getField(false,"_imageview1").runMethod(true,"setLeft:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imageview1").runMethod(true,"Left"),_diffx}, "+",1, 0)));
 BA.debugLineNum = 743;BA.debugLine="ImageView1.Top=ImageView1.Top+Diffy";
Debug.ShouldStop(64);
__ref.getField(false,"_imageview1").runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imageview1").runMethod(true,"Top"),_diffy}, "+",1, 0)));
 break; }
}
;
 BA.debugLineNum = 746;BA.debugLine="CropBC=generateCropImage";
Debug.ShouldStop(512);
__ref.setField ("_cropbc",__ref.runClassMethod (b4i_imageviewcrop.class, "_generatecropimage"));
 BA.debugLineNum = 747;BA.debugLine="UpdateTarget";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4i_imageviewcrop.class, "_updatetarget");
 BA.debugLineNum = 749;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) return b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 750;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _redraw(RemoteObject __ref,RemoteObject _resetcrop) throws Exception{
try {
		Debug.PushSubsStack("ReDraw (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,575);
if (RapidSub.canDelegate("redraw")) { return __ref.runUserSub(false, "imageviewcrop","redraw", __ref, _resetcrop);}
RemoteObject _fitbitmap = RemoteObject.declareNull("B4XBitmapWrapper");
RemoteObject _wz = RemoteObject.createImmutable(0);
RemoteObject _hz = RemoteObject.createImmutable(0);
Debug.locals.put("ResetCrop", _resetcrop);
 BA.debugLineNum = 575;BA.debugLine="Private Sub ReDraw(ResetCrop As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 576;BA.debugLine="RotateBmp=OriginalBmp.Rotate(Degree)";
Debug.ShouldStop(-2147483648);
__ref.setField ("_rotatebmp",__ref.getField(false,"_originalbmp").runMethod(false,"Rotate:",(Object)(BA.numberCast(int.class, __ref.getField(true,"_degree")))));
 BA.debugLineNum = 577;BA.debugLine="Dim FitBitmap As B4XBitmap = OriginalBmp.Resize(p";
Debug.ShouldStop(1);
_fitbitmap = RemoteObject.createNew ("B4XBitmapWrapper");
_fitbitmap = __ref.getField(false,"_originalbmp").runMethod(false,"Resize:::",(Object)(__ref.getField(false,"_pnl").runMethod(true,"Width")),(Object)(__ref.getField(false,"_pnl").runMethod(true,"Height")),(Object)(b4i_main.__c.runMethod(true,"True")));Debug.locals.put("FitBitmap", _fitbitmap);Debug.locals.put("FitBitmap", _fitbitmap);
 BA.debugLineNum = 578;BA.debugLine="Dim Wz As Int = FitBitmap.Width * Zoom";
Debug.ShouldStop(2);
_wz = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_fitbitmap.runMethod(true,"Width"),__ref.getField(true,"_zoom")}, "*",0, 0));Debug.locals.put("Wz", _wz);Debug.locals.put("Wz", _wz);
 BA.debugLineNum = 579;BA.debugLine="Dim Hz As Int = FitBitmap.Height * Zoom";
Debug.ShouldStop(4);
_hz = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_fitbitmap.runMethod(true,"Height"),__ref.getField(true,"_zoom")}, "*",0, 0));Debug.locals.put("Hz", _hz);Debug.locals.put("Hz", _hz);
 BA.debugLineNum = 581;BA.debugLine="pnl.SetLayoutAnimated(0, (mBase.Width-Wz)/2,(mBas";
Debug.ShouldStop(16);
__ref.getField(false,"_pnl").runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"Width"),_wz}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"Height"),_hz}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, _wz)),(Object)(BA.numberCast(float.class, _hz)));
 BA.debugLineNum = 582;BA.debugLine="ImageView1.SetLayoutAnimated(0,1, (mBase.Width-Wz";
Debug.ShouldStop(32);
__ref.getField(false,"_imageview1").runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"Width"),_wz}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"Height"),_hz}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, _wz)),(Object)(BA.numberCast(float.class, _hz)));
 BA.debugLineNum = 583;BA.debugLine="OffsetX = (mBase.Width-Wz)/2";
Debug.ShouldStop(64);
__ref.setField ("_offsetx",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"Width"),_wz}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 584;BA.debugLine="OffsetY = (mBase.Height-Hz)/2";
Debug.ShouldStop(128);
__ref.setField ("_offsety",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"Height"),_hz}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 585;BA.debugLine="OriginalX=FitBitmap.Width";
Debug.ShouldStop(256);
__ref.setField ("_originalx",BA.numberCast(int.class, _fitbitmap.runMethod(true,"Width")));
 BA.debugLineNum = 586;BA.debugLine="OriginalY=FitBitmap.Height";
Debug.ShouldStop(512);
__ref.setField ("_originaly",BA.numberCast(int.class, _fitbitmap.runMethod(true,"Height")));
 BA.debugLineNum = 594;BA.debugLine="ColorBC.Initialize(FitBitmap.Width / FitBitmap.Sc";
Debug.ShouldStop(131072);
__ref.getField(false,"_colorbc").runVoidMethod ("_initialize:::",__ref.getField(false, "bi"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_fitbitmap.runMethod(true,"Width"),_fitbitmap.runMethod(true,"Scale")}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_fitbitmap.runMethod(true,"Height"),_fitbitmap.runMethod(true,"Scale")}, "/",0, 0))));
 BA.debugLineNum = 595;BA.debugLine="ColorBC.CopyPixelsFromBitmap(FitBitmap)";
Debug.ShouldStop(262144);
__ref.getField(false,"_colorbc").runVoidMethod ("_copypixelsfrombitmap:",(Object)(_fitbitmap));
 BA.debugLineNum = 597;BA.debugLine="SelectionRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_selectionrect").runVoidMethod ("Initialize::::",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 598;BA.debugLine="TargetBC.Initialize(ColorBC.mWidth, ColorBC.mHeig";
Debug.ShouldStop(2097152);
__ref.getField(false,"_targetbc").runVoidMethod ("_initialize:::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_colorbc").getField(true,"_mwidth")),(Object)(__ref.getField(false,"_colorbc").getField(true,"_mheight")));
 BA.debugLineNum = 599;BA.debugLine="GreyBC=generateGreyImage";
Debug.ShouldStop(4194304);
__ref.setField ("_greybc",__ref.runClassMethod (b4i_imageviewcrop.class, "_generategreyimage"));
 BA.debugLineNum = 600;BA.debugLine="CropBC=generateCropImage";
Debug.ShouldStop(8388608);
__ref.setField ("_cropbc",__ref.runClassMethod (b4i_imageviewcrop.class, "_generatecropimage"));
 BA.debugLineNum = 602;BA.debugLine="If ResetCrop Then";
Debug.ShouldStop(33554432);
if (_resetcrop.getBoolean()) { 
 BA.debugLineNum = 603;BA.debugLine="Xi=-50";
Debug.ShouldStop(67108864);
__ref.setField ("_xi",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 604;BA.debugLine="Yi=-50";
Debug.ShouldStop(134217728);
__ref.setField ("_yi",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 605;BA.debugLine="Xf=-50";
Debug.ShouldStop(268435456);
__ref.setField ("_xf",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 606;BA.debugLine="Yf=-50";
Debug.ShouldStop(536870912);
__ref.setField ("_yf",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 607;BA.debugLine="sx=-SizeCircle";
Debug.ShouldStop(1073741824);
__ref.setField ("_sx",BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_sizecircle").<Number>get().intValue())));
 BA.debugLineNum = 608;BA.debugLine="sy=-SizeCircle";
Debug.ShouldStop(-2147483648);
__ref.setField ("_sy",BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_sizecircle").<Number>get().intValue())));
 };
 BA.debugLineNum = 610;BA.debugLine="UpdateTarget";
Debug.ShouldStop(2);
__ref.runClassMethod (b4i_imageviewcrop.class, "_updatetarget");
 BA.debugLineNum = 611;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetzoom(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetZoom (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,179);
if (RapidSub.canDelegate("resetzoom")) { return __ref.runUserSub(false, "imageviewcrop","resetzoom", __ref);}
 BA.debugLineNum = 179;BA.debugLine="Public Sub ResetZoom";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="Zoom=1";
Debug.ShouldStop(524288);
__ref.setField ("_zoom",BA.numberCast(float.class, 1));
 BA.debugLineNum = 181;BA.debugLine="ReDraw(True)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4i_imageviewcrop.class, "_redraw:",(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbitmap(RemoteObject __ref,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("setBitmap (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,162);
if (RapidSub.canDelegate("setbitmap")) { return __ref.runUserSub(false, "imageviewcrop","setbitmap", __ref, _bmp);}
Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 162;BA.debugLine="Public Sub setBitmap (bmp As B4XBitmap)";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="OriginalBmp = bmp";
Debug.ShouldStop(4);
__ref.setField ("_originalbmp",_bmp);
 BA.debugLineNum = 164;BA.debugLine="Degree=0";
Debug.ShouldStop(8);
__ref.setField ("_degree",BA.numberCast(float.class, 0));
 BA.debugLineNum = 165;BA.debugLine="ReDraw(True)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4i_imageviewcrop.class, "_redraw:",(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcrop(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("setCrop (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,102);
if (RapidSub.canDelegate("setcrop")) { return __ref.runUserSub(false, "imageviewcrop","setcrop", __ref, _mode);}
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 102;BA.debugLine="Public Sub setCrop (Mode As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Mode=Mode.SubString2(0,1).ToUpperCase & Mode.SubS";
Debug.ShouldStop(64);
_mode = RemoteObject.concat(_mode.runMethod(true,"SubString2::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1))).runMethod(true,"ToUpperCase"),_mode.runMethod(true,"SubString:",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"ToLowerCase"));Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 104;BA.debugLine="If Mode=\"Square\" Or Mode=\"Circle\" Or Mode=\"Ellips";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("Square")) || RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("Circle")) || RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("Ellipse")) || RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("Star"))) { 
 BA.debugLineNum = 105;BA.debugLine="CropMode=Mode";
Debug.ShouldStop(256);
__ref.setField ("_cropmode",_mode);
 BA.debugLineNum = 107;BA.debugLine="If ColorBC.IsInitialized Then";
Debug.ShouldStop(1024);
if (__ref.getField(false,"_colorbc").runMethod(true,"IsInitialized").getBoolean()) { 
 BA.debugLineNum = 108;BA.debugLine="SelectionRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(2048);
__ref.getField(false,"_selectionrect").runVoidMethod ("Initialize::::",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 109;BA.debugLine="CropBC=GreyBC";
Debug.ShouldStop(4096);
__ref.setField ("_cropbc",__ref.getField(false,"_greybc"));
 BA.debugLineNum = 111;BA.debugLine="Xi=-50";
Debug.ShouldStop(16384);
__ref.setField ("_xi",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 112;BA.debugLine="Yi=-50";
Debug.ShouldStop(32768);
__ref.setField ("_yi",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 113;BA.debugLine="Xf=-50";
Debug.ShouldStop(65536);
__ref.setField ("_xf",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 114;BA.debugLine="Yf=-50";
Debug.ShouldStop(131072);
__ref.setField ("_yf",BA.numberCast(float.class, -(double) (0 + 50)));
 BA.debugLineNum = 115;BA.debugLine="sx=-SizeCircle";
Debug.ShouldStop(262144);
__ref.setField ("_sx",BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_sizecircle").<Number>get().intValue())));
 BA.debugLineNum = 116;BA.debugLine="sy=-SizeCircle";
Debug.ShouldStop(524288);
__ref.setField ("_sy",BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_sizecircle").<Number>get().intValue())));
 BA.debugLineNum = 117;BA.debugLine="UpdateTarget";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4i_imageviewcrop.class, "_updatetarget");
 };
 };
 BA.debugLineNum = 120;BA.debugLine="Operation=0";
Debug.ShouldStop(8388608);
__ref.setField ("_operation",BA.numberCast(int.class, 0));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrotation(RemoteObject __ref,RemoteObject _degreevalue) throws Exception{
try {
		Debug.PushSubsStack("setRotation (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,169);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "imageviewcrop","setrotation", __ref, _degreevalue);}
Debug.locals.put("DegreeValue", _degreevalue);
 BA.debugLineNum = 169;BA.debugLine="Public Sub setRotation(DegreeValue As Float)";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="Degree=DegreeValue";
Debug.ShouldStop(512);
__ref.setField ("_degree",_degreevalue);
 BA.debugLineNum = 171;BA.debugLine="ReDraw(True)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4i_imageviewcrop.class, "_redraw:",(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setzoom(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetZoom (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,185);
if (RapidSub.canDelegate("setzoom")) { return __ref.runUserSub(false, "imageviewcrop","setzoom", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 185;BA.debugLine="Public Sub SetZoom(Value As Float)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="Zoom=Value";
Debug.ShouldStop(33554432);
__ref.setField ("_zoom",_value);
 BA.debugLineNum = 187;BA.debugLine="ReDraw(True)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4i_imageviewcrop.class, "_redraw:",(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatetarget(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateTarget (imageviewcrop) ","imageviewcrop",1,__ref.getField(false, "bi"),__ref,380);
if (RapidSub.canDelegate("updatetarget")) { return __ref.runUserSub(false, "imageviewcrop","updatetarget", __ref);}
 BA.debugLineNum = 380;BA.debugLine="Private Sub UpdateTarget";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 382;BA.debugLine="ImageView1.Left=Min(ImageView1.Left,OffsetX)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_imageview1").runMethod(true,"setLeft:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, __ref.getField(false,"_imageview1").runMethod(true,"Left"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_offsetx"))))));
 BA.debugLineNum = 383;BA.debugLine="ImageView1.top=Min(ImageView1.top,OffsetY)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_imageview1").runMethod(true,"setTop:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, __ref.getField(false,"_imageview1").runMethod(true,"Top"))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_offsety"))))));
 BA.debugLineNum = 384;BA.debugLine="If mBase.Width<=ImageView1.Width Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("k",__ref.getField(false,"_mbase").runMethod(true,"Width"),BA.numberCast(double.class, __ref.getField(false,"_imageview1").runMethod(true,"Width")))) { 
 BA.debugLineNum = 385;BA.debugLine="ImageView1.Left=Max(ImageView1.Left,mBase.Width-";
Debug.ShouldStop(1);
__ref.getField(false,"_imageview1").runMethod(true,"setLeft:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, __ref.getField(false,"_imageview1").runMethod(true,"Left"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"Width"),__ref.getField(false,"_imageview1").runMethod(true,"Width")}, "-",1, 0)))));
 }else {
 BA.debugLineNum = 387;BA.debugLine="ImageView1.Left=Max(ImageView1.Left,(mBase.Width";
Debug.ShouldStop(4);
__ref.getField(false,"_imageview1").runMethod(true,"setLeft:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, __ref.getField(false,"_imageview1").runMethod(true,"Left"))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"Width"),__ref.getField(false,"_imageview1").runMethod(true,"Width")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)))));
 };
 BA.debugLineNum = 389;BA.debugLine="If mBase.Width<=ImageView1.Width Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("k",__ref.getField(false,"_mbase").runMethod(true,"Width"),BA.numberCast(double.class, __ref.getField(false,"_imageview1").runMethod(true,"Width")))) { 
 BA.debugLineNum = 390;BA.debugLine="ImageView1.Top=Max(ImageView1.Top,mBase.Height-I";
Debug.ShouldStop(32);
__ref.getField(false,"_imageview1").runMethod(true,"setTop:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, __ref.getField(false,"_imageview1").runMethod(true,"Top"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"Height"),__ref.getField(false,"_imageview1").runMethod(true,"Height")}, "-",1, 0)))));
 }else {
 BA.debugLineNum = 392;BA.debugLine="ImageView1.Top=Max(ImageView1.Top,(mBase.Height-";
Debug.ShouldStop(128);
__ref.getField(false,"_imageview1").runMethod(true,"setTop:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, __ref.getField(false,"_imageview1").runMethod(true,"Top"))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"Height"),__ref.getField(false,"_imageview1").runMethod(true,"Height")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)))));
 };
 BA.debugLineNum = 396;BA.debugLine="TargetBC.DrawBitmapCreator(GreyBC, GreyBC.TargetR";
Debug.ShouldStop(2048);
__ref.getField(false,"_targetbc").runVoidMethod ("_drawbitmapcreator:::::",(Object)(__ref.getField(false,"_greybc")),(Object)(__ref.getField(false,"_greybc").getField(false,"_targetrect")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 397;BA.debugLine="If SelectionRect.Width>0 And SelectionRect.Height";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_selectionrect").runMethod(true,"Width"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",__ref.getField(false,"_selectionrect").runMethod(true,"Height"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 398;BA.debugLine="TargetBC.DrawBitmapCreator(CropBC,  CropBC.Targe";
Debug.ShouldStop(8192);
__ref.getField(false,"_targetbc").runVoidMethod ("_drawbitmapcreator:::::",(Object)(__ref.getField(false,"_cropbc")),(Object)(__ref.getField(false,"_cropbc").getField(false,"_targetrect")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_selectionrect").runMethod(true,"Left"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_selectionrect").runMethod(true,"Top"))),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 399;BA.debugLine="DrawLimit";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4i_imageviewcrop.class, "_drawlimit");
 };
 BA.debugLineNum = 401;BA.debugLine="ImageView1.Bitmap=TargetBC.Bitmap";
Debug.ShouldStop(65536);
__ref.getField(false,"_imageview1").runMethod(false,"setBitmap:",BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IBitmap"), (__ref.getField(false,"_targetbc").runMethod(false,"_getbitmap")).getObject()));
 BA.debugLineNum = 402;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}