
#import "b4i_main.h"
#import "b4i_imageviewcrop.h"


@implementation b4i_main 


+ (instancetype)new {
    static b4i_main* shared = nil;
    if (shared == nil) {
        shared = [self alloc];
        shared.bi = [[B4IShellBI alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}
- (int)debugAppId {
    return 42;
}


- (NSString*)  _application_background{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_background"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"application_background" :nil]);}
B4IRDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub Application_Background";
B4IRDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_start"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"application_start:" :@[[B4I nilToNSNull:_nav]]]);}
B4IRDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
B4IRDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="NavControl = Nav";
self->__navcontrol = _nav;
B4IRDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="Page1.Initialize(\"Page1\")";
[self->__page1 Initialize:self.bi :@"Page1"];
B4IRDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="Page1.Title = \"Page 1\"";
[self->__page1 setTitle:@"Page 1"];
B4IRDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="Page1.RootPanel.Color = Colors.White";
[[self->__page1 RootPanel] setColor:[[self->___c Colors] White]];
B4IRDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="NavControl.ShowPage(Page1)";
[self->__navcontrol ShowPage:(UIViewController*)((self->__page1).object)];
B4IRDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="Page1.RootPanel.LoadLayout(\"Layout1\")";
[[self->__page1 RootPanel] LoadLayout:@"Layout1" :self.bi];
B4IRDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="ImageViewCrop1.Bitmap=LoadBitmap(File.DirAssets,";
[self->__imageviewcrop1 _setbitmap:nil :(B4XBitmapWrapper*) [B4IObjectWrapper createWrapper:[B4XBitmapWrapper new] object:(UIImage*)(([self->___c LoadBitmap:[[self->___c File] DirAssets] :@"image0.jpg"]).object)]];
B4IRDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buttoncircled_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"buttoncircled_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buttoncircled_click" :nil]);}
B4IRDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub ButtonCircled_Click";
B4IRDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="ImageViewCrop1.Crop=\"Circle\"";
[self->__imageviewcrop1 _setcrop:nil :@"Circle"];
B4IRDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buttonellipse_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"buttonellipse_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buttonellipse_click" :nil]);}
B4IRDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub ButtonEllipse_Click";
B4IRDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="ImageViewCrop1.Crop=\"Ellipse\"";
[self->__imageviewcrop1 _setcrop:nil :@"Ellipse"];
B4IRDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buttonmove_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"buttonmove_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buttonmove_click" :nil]);}
B4IRDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub ButtonMove_Click";
B4IRDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="ImageViewCrop1.activeMoveImage";
[self->__imageviewcrop1 _activemoveimage:nil];
B4IRDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buttonreset_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"buttonreset_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buttonreset_click" :nil]);}
B4IRDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub ButtonReset_Click";
B4IRDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="ImageViewCrop1.Rotation=0";
[self->__imageviewcrop1 _setrotation:nil :(float) (0)];
B4IRDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="ImageViewCrop1.ResetZoom";
[self->__imageviewcrop1 _resetzoom:nil];
B4IRDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buttonrotation_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"buttonrotation_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buttonrotation_click" :nil]);}
B4IRDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub ButtonRotation_Click";
B4IRDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="ImageViewCrop1.activeRotateImage";
[self->__imageviewcrop1 _activerotateimage:nil];
B4IRDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buttonsquared_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"buttonsquared_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buttonsquared_click" :nil]);}
B4IRDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub ButtonSquared_Click";
B4IRDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="ImageViewCrop1.Crop=\"Square\"";
[self->__imageviewcrop1 _setcrop:nil :@"Square"];
B4IRDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buttonstar_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"buttonstar_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buttonstar_click" :nil]);}
B4IRDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub ButtonStar_Click";
B4IRDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="ImageViewCrop1.Crop=\"Star\"";
[self->__imageviewcrop1 _setcrop:nil :@"Star"];
B4IRDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buttonzoom100_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"buttonzoom100_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buttonzoom100_click" :nil]);}
B4IRDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub ButtonZoom100_Click";
B4IRDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="ImageViewCrop1.activeZoomImage";
[self->__imageviewcrop1 _activezoomimage:nil];
B4IRDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _imageviewcrop1_cropped{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"imageviewcrop1_cropped"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"imageviewcrop1_cropped" :nil]);}
B4IBitmap* _bm = nil;
B4IRDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub ImageViewCrop1_Cropped";
B4IRDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Dim Bm As Bitmap = ImageViewCrop1.GetCroppedBitma";
_bm = [B4IBitmap new];
_bm = [self->__imageviewcrop1 _getcroppedbitmap:nil];
B4IRDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="ImageView1.Bitmap=Bm";
[self->__imageview1 setBitmap:_bm];
B4IRDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="ImageView1.Width=Bm.Width / 2";
[self->__imageview1 setWidth:(float) ([_bm Width]/(double)2)];
B4IRDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="ImageView1.Height=Bm.Height / 2";
[self->__imageview1 setHeight:(float) ([_bm Height]/(double)2)];
B4IRDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _page1_resize:(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"page1_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"page1_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
B4IRDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
return @"";
}

- (void)initializeStaticModules {
    [[b4i_main new]initializeModule];

}
- (NSString*)  _process_globals{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=0;
 //BA.debugLineNum = 0;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=3;
 //BA.debugLineNum = 3;BA.debugLine="Public App As Application";
self->__app = [B4IApplicationWrapper new];
B4IRDebugUtils.currentLine=4;
 //BA.debugLineNum = 4;BA.debugLine="Public NavControl As NavigationController";
self->__navcontrol = [B4INavigationControllerWrapper new];
B4IRDebugUtils.currentLine=5;
 //BA.debugLineNum = 5;BA.debugLine="Private Page1 As Page";
self->__page1 = [B4IPage new];
B4IRDebugUtils.currentLine=7;
 //BA.debugLineNum = 7;BA.debugLine="Private ImageViewCrop1 As ImageViewCrop";
self->__imageviewcrop1 = [b4i_imageviewcrop new];
B4IRDebugUtils.currentLine=8;
 //BA.debugLineNum = 8;BA.debugLine="Private ImageView1 As ImageView";
self->__imageview1 = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=9;
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return @"";
}
@end