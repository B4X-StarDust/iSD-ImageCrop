package it.tecnomedia.cropview;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_main_subs_0 {


public static RemoteObject  _application_background() throws Exception{
try {
		Debug.PushSubsStack("Application_Background (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,51);
if (RapidSub.canDelegate("application_background")) { return b4i_main.remoteMe.runUserSub(false, "main","application_background");}
 BA.debugLineNum = 51;BA.debugLine="Private Sub Application_Background";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_start(RemoteObject _nav) throws Exception{
try {
		Debug.PushSubsStack("Application_Start (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,36);
if (RapidSub.canDelegate("application_start")) { return b4i_main.remoteMe.runUserSub(false, "main","application_start", _nav);}
Debug.locals.put("Nav", _nav);
 BA.debugLineNum = 36;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="NavControl = Nav";
Debug.ShouldStop(32);
b4i_main._navcontrol = _nav;
 BA.debugLineNum = 39;BA.debugLine="Page1.Initialize(\"Page1\")";
Debug.ShouldStop(64);
b4i_main._page1.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("Page1")));
 BA.debugLineNum = 40;BA.debugLine="Page1.Title = \"Page 1\"";
Debug.ShouldStop(128);
b4i_main._page1.runMethod(true,"setTitle:",BA.ObjectToString("Page 1"));
 BA.debugLineNum = 41;BA.debugLine="Page1.RootPanel.Color = Colors.White";
Debug.ShouldStop(256);
b4i_main._page1.runMethod(false,"RootPanel").runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"White"));
 BA.debugLineNum = 42;BA.debugLine="NavControl.ShowPage(Page1)";
Debug.ShouldStop(512);
b4i_main._navcontrol.runVoidMethod ("ShowPage:",(Object)(((b4i_main._page1).getObject())));
 BA.debugLineNum = 43;BA.debugLine="Page1.RootPanel.LoadLayout(\"Layout1\")";
Debug.ShouldStop(1024);
b4i_main._page1.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("Layout1")),b4i_main.ba);
 BA.debugLineNum = 44;BA.debugLine="ImageViewCrop1.Bitmap=LoadBitmap(File.DirAssets,";
Debug.ShouldStop(2048);
b4i_main._imageviewcrop1.runClassMethod (b4i_imageviewcrop.class, "_setbitmap:",BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XBitmapWrapper"), (b4i_main.__c.runMethod(false,"LoadBitmap::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("image0.jpg")))).getObject()));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttoncircled_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonCircled_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,62);
if (RapidSub.canDelegate("buttoncircled_click")) { return b4i_main.remoteMe.runUserSub(false, "main","buttoncircled_click");}
 BA.debugLineNum = 62;BA.debugLine="Sub ButtonCircled_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="ImageViewCrop1.Crop=\"Circle\"";
Debug.ShouldStop(1073741824);
b4i_main._imageviewcrop1.runClassMethod (b4i_imageviewcrop.class, "_setcrop:",BA.ObjectToString("Circle"));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonellipse_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonEllipse_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,70);
if (RapidSub.canDelegate("buttonellipse_click")) { return b4i_main.remoteMe.runUserSub(false, "main","buttonellipse_click");}
 BA.debugLineNum = 70;BA.debugLine="Sub ButtonEllipse_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="ImageViewCrop1.Crop=\"Ellipse\"";
Debug.ShouldStop(64);
b4i_main._imageviewcrop1.runClassMethod (b4i_imageviewcrop.class, "_setcrop:",BA.ObjectToString("Ellipse"));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonmove_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonMove_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,82);
if (RapidSub.canDelegate("buttonmove_click")) { return b4i_main.remoteMe.runUserSub(false, "main","buttonmove_click");}
 BA.debugLineNum = 82;BA.debugLine="Sub ButtonMove_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="ImageViewCrop1.activeMoveImage";
Debug.ShouldStop(262144);
b4i_main._imageviewcrop1.runClassMethod (b4i_imageviewcrop.class, "_activemoveimage");
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonreset_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonReset_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,90);
if (RapidSub.canDelegate("buttonreset_click")) { return b4i_main.remoteMe.runUserSub(false, "main","buttonreset_click");}
 BA.debugLineNum = 90;BA.debugLine="Sub ButtonReset_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="ImageViewCrop1.Rotation=0";
Debug.ShouldStop(67108864);
b4i_main._imageviewcrop1.runClassMethod (b4i_imageviewcrop.class, "_setrotation:",BA.numberCast(float.class, 0));
 BA.debugLineNum = 92;BA.debugLine="ImageViewCrop1.ResetZoom";
Debug.ShouldStop(134217728);
b4i_main._imageviewcrop1.runClassMethod (b4i_imageviewcrop.class, "_resetzoom");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonrotation_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonRotation_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,86);
if (RapidSub.canDelegate("buttonrotation_click")) { return b4i_main.remoteMe.runUserSub(false, "main","buttonrotation_click");}
 BA.debugLineNum = 86;BA.debugLine="Sub ButtonRotation_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="ImageViewCrop1.activeRotateImage";
Debug.ShouldStop(4194304);
b4i_main._imageviewcrop1.runClassMethod (b4i_imageviewcrop.class, "_activerotateimage");
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonsquared_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSquared_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,66);
if (RapidSub.canDelegate("buttonsquared_click")) { return b4i_main.remoteMe.runUserSub(false, "main","buttonsquared_click");}
 BA.debugLineNum = 66;BA.debugLine="Sub ButtonSquared_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="ImageViewCrop1.Crop=\"Square\"";
Debug.ShouldStop(4);
b4i_main._imageviewcrop1.runClassMethod (b4i_imageviewcrop.class, "_setcrop:",BA.ObjectToString("Square"));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonstar_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonStar_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,74);
if (RapidSub.canDelegate("buttonstar_click")) { return b4i_main.remoteMe.runUserSub(false, "main","buttonstar_click");}
 BA.debugLineNum = 74;BA.debugLine="Sub ButtonStar_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="ImageViewCrop1.Crop=\"Star\"";
Debug.ShouldStop(1024);
b4i_main._imageviewcrop1.runClassMethod (b4i_imageviewcrop.class, "_setcrop:",BA.ObjectToString("Star"));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonzoom100_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonZoom100_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,78);
if (RapidSub.canDelegate("buttonzoom100_click")) { return b4i_main.remoteMe.runUserSub(false, "main","buttonzoom100_click");}
 BA.debugLineNum = 78;BA.debugLine="Sub ButtonZoom100_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="ImageViewCrop1.activeZoomImage";
Debug.ShouldStop(16384);
b4i_main._imageviewcrop1.runClassMethod (b4i_imageviewcrop.class, "_activezoomimage");
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imageviewcrop1_cropped() throws Exception{
try {
		Debug.PushSubsStack("ImageViewCrop1_Cropped (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,55);
if (RapidSub.canDelegate("imageviewcrop1_cropped")) { return b4i_main.remoteMe.runUserSub(false, "main","imageviewcrop1_cropped");}
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
 BA.debugLineNum = 55;BA.debugLine="Sub ImageViewCrop1_Cropped";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim Bm As Bitmap = ImageViewCrop1.GetCroppedBitma";
Debug.ShouldStop(8388608);
_bm = RemoteObject.createNew ("B4IBitmap");
_bm = b4i_main._imageviewcrop1.runClassMethod (b4i_imageviewcrop.class, "_getcroppedbitmap");Debug.locals.put("Bm", _bm);Debug.locals.put("Bm", _bm);
 BA.debugLineNum = 57;BA.debugLine="ImageView1.Bitmap=Bm";
Debug.ShouldStop(16777216);
b4i_main._imageview1.runMethod(false,"setBitmap:",_bm);
 BA.debugLineNum = 58;BA.debugLine="ImageView1.Width=Bm.Width / 2";
Debug.ShouldStop(33554432);
b4i_main._imageview1.runMethod(true,"setWidth:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bm.runMethod(true,"Width"),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 59;BA.debugLine="ImageView1.Height=Bm.Height / 2";
Debug.ShouldStop(67108864);
b4i_main._imageview1.runMethod(true,"setHeight:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bm.runMethod(true,"Height"),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _page1_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Page1_Resize (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,47);
if (RapidSub.canDelegate("page1_resize")) { return b4i_main.remoteMe.runUserSub(false, "main","page1_resize", _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 47;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 28;BA.debugLine="Public App As Application";
b4i_main._app = RemoteObject.createNew ("B4IApplicationWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Public NavControl As NavigationController";
b4i_main._navcontrol = RemoteObject.createNew ("B4INavigationControllerWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Page1 As Page";
b4i_main._page1 = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 32;BA.debugLine="Private ImageViewCrop1 As ImageViewCrop";
b4i_main._imageviewcrop1 = RemoteObject.createNew ("b4i_imageviewcrop");
 //BA.debugLineNum = 33;BA.debugLine="Private ImageView1 As ImageView";
b4i_main._imageview1 = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}