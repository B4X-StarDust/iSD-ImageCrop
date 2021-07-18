
#import "b4i_imageviewcrop.h"
#import "b4i_main.h"

@implementation _c_type
-(void)Initialize{
self.IsInitialized = true;
self->_X = 0;
self->_Y = 0;
self->_Xf = 0;
self->_Yf = 0;
}
- (NSString*)description {
return [B4I TypeToString:self :false];}
@end

@implementation b4i_imageviewcrop 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_imageviewcrop) instance released.");
}

- (NSString*)  _setbitmap:(b4i_imageviewcrop*) __ref :(B4XBitmapWrapper*) _bmp{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"setbitmap"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setbitmap:" :@[[B4I nilToNSNull:_bmp]]]);}
B4IRDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub setBitmap (bmp As B4XBitmap)";
B4IRDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="OriginalBmp = bmp";
__ref->__originalbmp = _bmp;
B4IRDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Degree=0";
__ref->__degree = (float) (0);
B4IRDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="ReDraw(True)";
[__ref _redraw:nil :true];
B4IRDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setcrop:(b4i_imageviewcrop*) __ref :(NSString*) _mode{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"setcrop"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setcrop:" :@[[B4I nilToNSNull:_mode]]]);}
B4IRDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub setCrop (Mode As String)";
B4IRDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Mode=Mode.SubString2(0,1).ToUpperCase & Mode.SubS";
_mode = [@[[[_mode SubString2:(int) (0) :(int) (1)] ToUpperCase],[[_mode SubString:(int) (1)] ToLowerCase]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If Mode=\"Square\" Or Mode=\"Circle\" Or Mode=\"Ellips";
if ([_mode isEqual:@"Square"] || [_mode isEqual:@"Circle"] || [_mode isEqual:@"Ellipse"] || [_mode isEqual:@"Star"]) { 
B4IRDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="CropMode=Mode";
__ref->__cropmode = _mode;
B4IRDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="If ColorBC.IsInitialized Then";
if ([__ref->__colorbc IsInitialized]) { 
B4IRDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="SelectionRect.Initialize(0, 0, 0, 0)";
[__ref->__selectionrect Initialize:(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="CropBC=GreyBC";
__ref->__cropbc = __ref->__greybc;
B4IRDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Xi=-50";
__ref->__xi = (float) (-50);
B4IRDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Yi=-50";
__ref->__yi = (float) (-50);
B4IRDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="Xf=-50";
__ref->__xf = (float) (-50);
B4IRDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="Yf=-50";
__ref->__yf = (float) (-50);
B4IRDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="sx=-SizeCircle";
__ref->__sx = (float) (-__ref->__sizecircle);
B4IRDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="sy=-SizeCircle";
__ref->__sy = (float) (-__ref->__sizecircle);
B4IRDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="UpdateTarget";
[__ref _updatetarget:nil];
 };
 };
B4IRDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="Operation=0";
__ref->__operation = (int) (0);
B4IRDebugUtils.currentLine=1114131;
 //BA.debugLineNum = 1114131;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _activemoveimage:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"activemoveimage"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"activemoveimage" :nil]);}
B4IRDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub ActiveMoveImage";
B4IRDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Operation=1";
__ref->__operation = (int) (1);
B4IRDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setrotation:(b4i_imageviewcrop*) __ref :(float) _degreevalue{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"setrotation"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setrotation:" :@[@(_degreevalue)]]);}
B4IRDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub setRotation(DegreeValue As Float)";
B4IRDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Degree=DegreeValue";
__ref->__degree = _degreevalue;
B4IRDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="ReDraw(True)";
[__ref _redraw:nil :true];
B4IRDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _resetzoom:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"resetzoom"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"resetzoom" :nil]);}
B4IRDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub ResetZoom";
B4IRDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Zoom=1";
__ref->__zoom = (float) (1);
B4IRDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="ReDraw(True)";
[__ref _redraw:nil :true];
B4IRDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _activerotateimage:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"activerotateimage"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"activerotateimage" :nil]);}
B4IRDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub ActiveRotateImage";
B4IRDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="GhieraRotate.Visible=Not(GhieraRotate.visible)";
[__ref->__ghierarotate setVisible:(!([__ref->__ghierarotate Visible]))];
B4IRDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _activezoomimage:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"activezoomimage"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"activezoomimage" :nil]);}
B4IRDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub ActiveZoomImage";
B4IRDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If GhieraZoom.Visible Then";
if ([__ref->__ghierazoom Visible]) { 
B4IRDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="GhieraZoom.Visible=False";
[__ref->__ghierazoom setVisible:false];
 }else {
B4IRDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="SelectionRect.Initialize(0, 0, 0, 0)";
[__ref->__selectionrect Initialize:(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="CropBC=GreyBC";
__ref->__cropbc = __ref->__greybc;
B4IRDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="Yi=-50";
__ref->__yi = (float) (-50);
B4IRDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="Xf=-50";
__ref->__xf = (float) (-50);
B4IRDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Yf=-50";
__ref->__yf = (float) (-50);
B4IRDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="sx=-SizeCircle";
__ref->__sx = (float) (-__ref->__sizecircle);
B4IRDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="sy=-SizeCircle";
__ref->__sy = (float) (-__ref->__sizecircle);
B4IRDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="GhieraZoom.Visible=True";
[__ref->__ghierazoom setVisible:true];
 };
B4IRDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="UpdateTarget";
[__ref _updatetarget:nil];
B4IRDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="End Sub";
return @"";
}
- (B4IBitmap*)  _getcroppedbitmap:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"getcroppedbitmap"])
	 {return ((B4IBitmap*) [B4IDebug delegate:self.bi :@"getcroppedbitmap" :nil]);}
float _fx = 0.0f;
float _fy = 0.0f;
B4IRDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub getCroppedBitmap As Bitmap";
B4IRDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim Fx As Float = RotateBmp.Width / TargetBC.mWid";
_fx = (float) ([__ref->__rotatebmp Width]/(double)__ref->__targetbc->__mwidth);
B4IRDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim Fy As Float = RotateBmp.Height / TargetBC.mHe";
_fy = (float) ([__ref->__rotatebmp Height]/(double)__ref->__targetbc->__mheight);
B4IRDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Select CropMode";
switch ([self.bi switchObjectToInt:__ref->__cropmode :@[@"Square",@"Ellipse",@"Circle",@"Star"]]) {
case 0: {
B4IRDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Return RotateBmp.Crop(SelectionRect.Left * Fx,";
if (true) return (B4IBitmap*) [B4IObjectWrapper createWrapper:[B4IBitmap new] object:(UIImage*)(([__ref->__rotatebmp Crop:(float) ([__ref->__selectionrect Left]*_fx) :(float) ([__ref->__selectionrect Top]*_fy) :(float) ([__ref->__selectionrect Width]*_fx) :(float) ([__ref->__selectionrect Height]*_fy)]).object)];
 break; }
case 1: {
B4IRDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="Return CreateRoundBitmap(RotateBmp.Crop(Selecti";
if (true) return (B4IBitmap*) [B4IObjectWrapper createWrapper:[B4IBitmap new] object:(UIImage*)(([__ref _createroundbitmap:nil :[__ref->__rotatebmp Crop:(float) ([__ref->__selectionrect Left]*_fx) :(float) ([__ref->__selectionrect Top]*_fy) :(float) ([__ref->__selectionrect Width]*_fx) :(float) ([__ref->__selectionrect Height]*_fy)]]).object)];
 break; }
case 2: {
B4IRDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="Return CreateRoundBitmap(RotateBmp.Crop(Selecti";
if (true) return (B4IBitmap*) [B4IObjectWrapper createWrapper:[B4IBitmap new] object:(UIImage*)(([__ref _createroundbitmap:nil :[__ref->__rotatebmp Crop:(float) ([__ref->__selectionrect Left]*_fx) :(float) ([__ref->__selectionrect Top]*_fy) :(float) ([__ref->__selectionrect Width]*_fx) :(float) ([__ref->__selectionrect Height]*_fy)]]).object)];
 break; }
case 3: {
B4IRDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="Return CreateStarBitmap(RotateBmp.Crop(Selectio";
if (true) return (B4IBitmap*) [B4IObjectWrapper createWrapper:[B4IBitmap new] object:(UIImage*)(([__ref _createstarbitmap:nil :[__ref->__rotatebmp Crop:(float) ([__ref->__selectionrect Left]*_fx) :(float) ([__ref->__selectionrect Top]*_fy) :(float) ([__ref->__selectionrect Width]*_fx) :(float) ([__ref->__selectionrect Height]*_fy)]]).object)];
 break; }
default: {
B4IRDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="Return RotateBmp.Crop(SelectionRect.Left * Fx,";
if (true) return (B4IBitmap*) [B4IObjectWrapper createWrapper:[B4IBitmap new] object:(UIImage*)(([__ref->__rotatebmp Crop:(float) ([__ref->__selectionrect Left]*_fx) :(float) ([__ref->__selectionrect Top]*_fy) :(float) ([__ref->__selectionrect Width]*_fx) :(float) ([__ref->__selectionrect Height]*_fy)]).object)];
 break; }
}
;
B4IRDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _activecutimage:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"activecutimage"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"activecutimage" :nil]);}
B4IRDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub ActiveCutImage";
B4IRDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Operation=0";
__ref->__operation = (int) (0);
B4IRDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _updatetarget:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"updatetarget"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"updatetarget" :nil]);}
B4IRDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub UpdateTarget";
B4IRDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="ImageView1.Left=Min(ImageView1.Left,OffsetX)";
[__ref->__imageview1 setLeft:(float) (fmin([__ref->__imageview1 Left],__ref->__offsetx))];
B4IRDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="ImageView1.top=Min(ImageView1.top,OffsetY)";
[__ref->__imageview1 setTop:(float) (fmin([__ref->__imageview1 Top],__ref->__offsety))];
B4IRDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="If mBase.Width<=ImageView1.Width Then";
if ([__ref->__mbase Width]<=[__ref->__imageview1 Width]) { 
B4IRDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="ImageView1.Left=Max(ImageView1.Left,mBase.Width-";
[__ref->__imageview1 setLeft:(float) (fmax([__ref->__imageview1 Left],[__ref->__mbase Width]-[__ref->__imageview1 Width]))];
 }else {
B4IRDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="ImageView1.Left=Max(ImageView1.Left,(mBase.Width";
[__ref->__imageview1 setLeft:(float) (fmax([__ref->__imageview1 Left],([__ref->__mbase Width]-[__ref->__imageview1 Width])/(double)2))];
 };
B4IRDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="If mBase.Width<=ImageView1.Width Then";
if ([__ref->__mbase Width]<=[__ref->__imageview1 Width]) { 
B4IRDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="ImageView1.Top=Max(ImageView1.Top,mBase.Height-I";
[__ref->__imageview1 setTop:(float) (fmax([__ref->__imageview1 Top],[__ref->__mbase Height]-[__ref->__imageview1 Height]))];
 }else {
B4IRDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="ImageView1.Top=Max(ImageView1.Top,(mBase.Height-";
[__ref->__imageview1 setTop:(float) (fmax([__ref->__imageview1 Top],([__ref->__mbase Height]-[__ref->__imageview1 Height])/(double)2))];
 };
B4IRDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="TargetBC.DrawBitmapCreator(GreyBC, GreyBC.TargetR";
[__ref->__targetbc _drawbitmapcreator:__ref->__greybc :__ref->__greybc->__targetrect :(int) (0) :(int) (0) :true];
B4IRDebugUtils.currentLine=2359313;
 //BA.debugLineNum = 2359313;BA.debugLine="If SelectionRect.Width>0 And SelectionRect.Height";
if ([__ref->__selectionrect Width]>0 && [__ref->__selectionrect Height]>0) { 
B4IRDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="TargetBC.DrawBitmapCreator(CropBC,  CropBC.Targe";
[__ref->__targetbc _drawbitmapcreator:__ref->__cropbc :__ref->__cropbc->__targetrect :(int) ([__ref->__selectionrect Left]) :(int) ([__ref->__selectionrect Top]) :false];
B4IRDebugUtils.currentLine=2359315;
 //BA.debugLineNum = 2359315;BA.debugLine="DrawLimit";
[__ref _drawlimit:nil];
 };
B4IRDebugUtils.currentLine=2359317;
 //BA.debugLineNum = 2359317;BA.debugLine="ImageView1.Bitmap=TargetBC.Bitmap";
[__ref->__imageview1 setBitmap:(B4IBitmap*) [B4IObjectWrapper createWrapper:[B4IBitmap new] object:(UIImage*)(([__ref->__targetbc _getbitmap]).object)]];
B4IRDebugUtils.currentLine=2359318;
 //BA.debugLineNum = 2359318;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _base_resize:(b4i_imageviewcrop*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, Height)";
[__ref->__pnl SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="GhieraZoom.SetLayoutAnimated(0, 0, Height-30, Wid";
[__ref->__ghierazoom SetLayoutAnimated:(int) (0) :(float) (0) :(float) (_height-30) :(float) (_width) :(float) (30)];
B4IRDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="GhieraRotate.SetLayoutAnimated(0, 0, 0, Width, 30";
[__ref->__ghierarotate SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (30)];
B4IRDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="If Demo Then DemoLabel.SetLayoutAnimated(0, 0,Hei";
if (__ref->__demo) { 
[__ref->__demolabel SetLayoutAnimated:(int) (0) :(float) (0) :(float) (_height/(double)2) :(float) (_width) :(float) (20)];};
B4IRDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="DrawGhieraRotate";
[__ref _drawghierarotate:nil];
B4IRDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="DrawGhieraZoom";
[__ref _drawghierazoom:nil];
B4IRDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawghierarotate:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"drawghierarotate"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawghierarotate" :nil]);}
float _sp = 0.0f;
B4XCanvas* _can = nil;
int _i = 0;
B4IRDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub DrawGhieraRotate";
B4IRDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim Sp As Float = GhieraRotate.Width/24";
_sp = (float) ([__ref->__ghierarotate Width]/(double)24);
B4IRDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Dim Can As B4XCanvas";
_can = [B4XCanvas new];
B4IRDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Can.Initialize(GhieraRotate)";
[_can Initialize:(UIView*)((__ref->__ghierarotate).object)];
B4IRDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Can.ClearRect(Can.TargetRect)";
[_can ClearRect:[_can TargetRect]];
B4IRDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Can.DrawRect(Can.TargetRect,xui.Color_ARGB(150,15";
[_can DrawRect:[_can TargetRect] :[__ref->__xui Color_ARGB:(int) (150) :(int) (150) :(int) (150) :(int) (150)] :true :(float) (1)];
B4IRDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="For i=1 To 23";
{
const int step6 = 1;
const int limit6 = (int) (23);
_i = (int) (1) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
B4IRDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="If i=12 Then";
if (_i==12) { 
B4IRDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="Can.DrawLine(i*Sp-1,5,i*Sp,GhieraRotate.Height,";
[_can DrawLine:(float) (_i*_sp-1) :(float) (5) :(float) (_i*_sp) :[__ref->__ghierarotate Height] :[__ref->__xui Color_Yellow] :(float) (2)];
B4IRDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="Can.DrawLine(i*Sp+1,5,i*Sp+1,GhieraRotate.Heigh";
[_can DrawLine:(float) (_i*_sp+1) :(float) (5) :(float) (_i*_sp+1) :[__ref->__ghierarotate Height] :[__ref->__xui Color_White] :(float) (1)];
 }else {
B4IRDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="Can.DrawLine(i*Sp,GhieraRotate.Height*0.25,i*Sp";
[_can DrawLine:(float) (_i*_sp) :(float) ([__ref->__ghierarotate Height]*0.25) :(float) (_i*_sp) :(float) ([__ref->__ghierarotate Height]*0.75) :[__ref->__xui Color_DarkGray] :(float) (1)];
B4IRDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="Can.DrawLine(i*Sp+1,GhieraRotate.Height*0.25,i*";
[_can DrawLine:(float) (_i*_sp+1) :(float) ([__ref->__ghierarotate Height]*0.25) :(float) (_i*_sp+1) :(float) ([__ref->__ghierarotate Height]*0.75) :[__ref->__xui Color_White] :(float) (1)];
 };
 }
};
B4IRDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="Can.DrawCircle((Bit.FMod(Degree+180,360)/360)*Ghi";
[_can DrawCircle:(float) ((fmod(__ref->__degree+180,360)/(double)360)*[__ref->__ghierarotate Width]) :(float) ([__ref->__ghierarotate Height]/(double)2) :(float) ([__ref->__ghierarotate Height]/(double)3) :[__ref->__xui Color_ARGB:(int) (150) :(int) (0) :(int) (200) :(int) (200)] :true :(float) (1)];
B4IRDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="Can.Invalidate";
[_can Invalidate];
B4IRDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="Can.Release";
[_can Release];
B4IRDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawghierazoom:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"drawghierazoom"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawghierazoom" :nil]);}
float _sp = 0.0f;
B4XCanvas* _can = nil;
int _i = 0;
B4IRDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub DrawGhieraZoom";
B4IRDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim Sp As Float = GhieraZoom.Width/12";
_sp = (float) ([__ref->__ghierazoom Width]/(double)12);
B4IRDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim Can As B4XCanvas";
_can = [B4XCanvas new];
B4IRDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Can.Initialize(GhieraZoom)";
[_can Initialize:(UIView*)((__ref->__ghierazoom).object)];
B4IRDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Can.ClearRect(Can.TargetRect)";
[_can ClearRect:[_can TargetRect]];
B4IRDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="Can.DrawRect(Can.TargetRect,xui.Color_ARGB(200,25";
[_can DrawRect:[_can TargetRect] :[__ref->__xui Color_ARGB:(int) (200) :(int) (255) :(int) (255) :(int) (255)] :true :(float) (1)];
B4IRDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="For i=1 To 11";
{
const int step6 = 1;
const int limit6 = (int) (11);
_i = (int) (1) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
B4IRDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="If i=6 Then";
if (_i==6) { 
B4IRDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="Can.DrawLine(i*Sp,0,i*Sp,GhieraZoom.Height,xui.";
[_can DrawLine:(float) (_i*_sp) :(float) (0) :(float) (_i*_sp) :[__ref->__ghierazoom Height] :[__ref->__xui Color_Blue] :(float) (1)];
B4IRDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="Can.DrawLine(i*Sp+1,0,i*Sp+1,GhieraZoom.Height,";
[_can DrawLine:(float) (_i*_sp+1) :(float) (0) :(float) (_i*_sp+1) :[__ref->__ghierazoom Height] :[__ref->__xui Color_LightGray] :(float) (2)];
 }else {
B4IRDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="Can.DrawLine(i*Sp,0,i*Sp,GhieraZoom.Height/2,xu";
[_can DrawLine:(float) (_i*_sp) :(float) (0) :(float) (_i*_sp) :(float) ([__ref->__ghierazoom Height]/(double)2) :[__ref->__xui Color_DarkGray] :(float) (1)];
B4IRDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="Can.DrawLine(i*Sp+1,0,i*Sp+1,GhieraZoom.Height/";
[_can DrawLine:(float) (_i*_sp+1) :(float) (0) :(float) (_i*_sp+1) :(float) ([__ref->__ghierazoom Height]/(double)2) :[__ref->__xui Color_LightGray] :(float) (1)];
 };
 }
};
B4IRDebugUtils.currentLine=2818066;
 //BA.debugLineNum = 2818066;BA.debugLine="Can.DrawCircle(ZoomPosition*GhieraZoom.Width,Ghie";
[_can DrawCircle:(float) (__ref->__zoomposition*[__ref->__ghierazoom Width]) :(float) ([__ref->__ghierazoom Height]/(double)2) :(float) ([__ref->__ghierazoom Height]/(double)3) :[__ref->__xui Color_ARGB:(int) (100) :(int) (50) :(int) (50) :(int) (100)] :true :(float) (1)];
B4IRDebugUtils.currentLine=2818068;
 //BA.debugLineNum = 2818068;BA.debugLine="Can.Invalidate";
[_can Invalidate];
B4IRDebugUtils.currentLine=2818069;
 //BA.debugLineNum = 2818069;BA.debugLine="Can.Release";
[_can Release];
B4IRDebugUtils.currentLine=2818070;
 //BA.debugLineNum = 2818070;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_imageviewcrop*) __ref{
__ref = self;
self->__main=[b4i_main new];
B4IRDebugUtils.currentModule=@"imageviewcrop";
B4IRDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Private mBase As B4XView 'ignore";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Private Demo As Boolean = True";
self->__demo = true;
B4IRDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Private Const SizePoint As Int = 10dip";
self->__sizepoint = ((int) (10));
B4IRDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Private Const SizeCircle As Int = 20dip";
self->__sizecircle = ((int) (20));
B4IRDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Private CropMode As String = \"Square\"";
self->__cropmode = @"Square";
B4IRDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Private ImageView1 As ImageView";
self->__imageview1 = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Private ColorBC, GreyBC, CropBC, TargetBC As Bitm";
self->__colorbc = [b4i_bitmapcreator new];
self->__greybc = [b4i_bitmapcreator new];
self->__cropbc = [b4i_bitmapcreator new];
self->__targetbc = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Private OriginalBmp, RotateBmp As B4XBitmap";
self->__originalbmp = [B4XBitmapWrapper new];
self->__rotatebmp = [B4XBitmapWrapper new];
B4IRDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="Private SelectionRect As B4XRect";
self->__selectionrect = [B4XRect new];
B4IRDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="Private pnl,GhieraZoom,GhieraRotate As B4XView";
self->__pnl = [B4XViewWrapper new];
self->__ghierazoom = [B4XViewWrapper new];
self->__ghierarotate = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="Private OriginalX,OriginalY As Int";
self->__originalx = 0;
self->__originaly = 0;
B4IRDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="Private OffsetX, OffsetY As Int";
self->__offsetx = 0;
self->__offsety = 0;
B4IRDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="Private Operation As Int = 0 ' 0-Cut 1-Move";
self->__operation = (int) (0);
B4IRDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="Private fingers As Map";
self->__fingers = [B4IMap new];
B4IRDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="Private fingersList As List";
self->__fingerslist = [B4IList new];
B4IRDebugUtils.currentLine=851989;
 //BA.debugLineNum = 851989;BA.debugLine="Private Xi,Yi,Xf,Yf,sx,sy As Float";
self->__xi = 0.0f;
self->__yi = 0.0f;
self->__xf = 0.0f;
self->__yf = 0.0f;
self->__sx = 0.0f;
self->__sy = 0.0f;
B4IRDebugUtils.currentLine=851990;
 //BA.debugLineNum = 851990;BA.debugLine="Private Zoom As Float = 1";
self->__zoom = (float) (1);
B4IRDebugUtils.currentLine=851991;
 //BA.debugLineNum = 851991;BA.debugLine="Private ZoomPosition As Float = 0.5";
self->__zoomposition = (float) (0.5);
B4IRDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="Private Degree As Float = 0";
self->__degree = (float) (0);
B4IRDebugUtils.currentLine=851994;
 //BA.debugLineNum = 851994;BA.debugLine="Private DemoLabel As B4XView";
self->__demolabel = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=851996;
 //BA.debugLineNum = 851996;BA.debugLine="Type C_Type(X As Int,Y As Int,Xf As Int, Yf As I";
;
B4IRDebugUtils.currentLine=851997;
 //BA.debugLineNum = 851997;BA.debugLine="Private fingers As Map";
self->__fingers = [B4IMap new];
B4IRDebugUtils.currentLine=851998;
 //BA.debugLineNum = 851998;BA.debugLine="Private NativeMe As NativeObject";
self->__nativeme = [B4INativeObject new];
B4IRDebugUtils.currentLine=852004;
 //BA.debugLineNum = 852004;BA.debugLine="End Sub";
return @"";
}
- (B4XBitmapWrapper*)  _createroundbitmap:(b4i_imageviewcrop*) __ref :(B4XBitmapWrapper*) _image{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"createroundbitmap"])
	 {return ((B4XBitmapWrapper*) [B4IDebug delegate:self.bi :@"createroundbitmap:" :@[[B4I nilToNSNull:_image]]]);}
B4XCanvas* _can = nil;
B4XViewWrapper* _xview = nil;
B4XPath* _path = nil;
B4XBitmapWrapper* _res = nil;
B4IRDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub CreateRoundBitmap(Image As B4XBitmap)";
B4IRDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim Can As B4XCanvas";
_can = [B4XCanvas new];
B4IRDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Dim xview As B4XView = xui.CreatePanel(\"\")";
_xview = [B4XViewWrapper new];
_xview = [__ref->__xui CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="xview.SetLayoutAnimated(0, 0, 0, Image.Width, Ima";
[_xview SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[_image Width] :[_image Height]];
B4IRDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="Can.Initialize(xview)";
[_can Initialize:(UIView*)((_xview).object)];
B4IRDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Dim path As B4XPath";
_path = [B4XPath new];
B4IRDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="path.InitializeOval(Can.TargetRect)";
[_path InitializeOval:[_can TargetRect]];
B4IRDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="Can.ClipPath(path)";
[_can ClipPath:_path];
B4IRDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="Can.DrawBitmap(Image, Can.TargetRect)";
[_can DrawBitmap:(UIImage*)((_image).object) :[_can TargetRect]];
B4IRDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="Can.RemoveClip";
[_can RemoveClip];
B4IRDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="Can.Invalidate";
[_can Invalidate];
B4IRDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="Dim res As B4XBitmap = Can.CreateBitmap";
_res = [B4XBitmapWrapper new];
_res = [_can CreateBitmap];
B4IRDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="Can.Release";
[_can Release];
B4IRDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="Return res";
if (true) return _res;
B4IRDebugUtils.currentLine=2228239;
 //BA.debugLineNum = 2228239;BA.debugLine="End Sub";
return nil;
}
- (b4i_bitmapcreator*)  _createroundbitmapcreator:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _image{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"createroundbitmapcreator"])
	 {return ((b4i_bitmapcreator*) [B4IDebug delegate:self.bi :@"createroundbitmapcreator:" :@[[B4I nilToNSNull:_image]]]);}
B4XCanvas* _can = nil;
B4XViewWrapper* _xview = nil;
B4XPath* _path = nil;
B4XBitmapWrapper* _bm = nil;
B4XBitmapWrapper* _res = nil;
b4i_bitmapcreator* _bc = nil;
B4IRDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub CreateRoundBitmapCreator(Image As Bitm";
B4IRDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim Can As B4XCanvas";
_can = [B4XCanvas new];
B4IRDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim xview As B4XView = xui.CreatePanel(\"\")";
_xview = [B4XViewWrapper new];
_xview = [__ref->__xui CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="xview.SetLayoutAnimated(0, 0, 0, SelectionRect.Wi";
[_xview SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[__ref->__selectionrect Width] :[__ref->__selectionrect Height]];
B4IRDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Can.Initialize(xview)";
[_can Initialize:(UIView*)((_xview).object)];
B4IRDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Dim path As B4XPath";
_path = [B4XPath new];
B4IRDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="path.InitializeOval(Can.TargetRect)";
[_path InitializeOval:[_can TargetRect]];
B4IRDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Can.ClipPath(path)";
[_can ClipPath:_path];
B4IRDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Dim Bm As B4XBitmap = Image.Bitmap";
_bm = [B4XBitmapWrapper new];
_bm = [_image _getbitmap];
B4IRDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="Bm=Bm.Resize(SelectionRect.Width, SelectionRect.H";
_bm = [_bm Resize:[__ref->__selectionrect Width] :[__ref->__selectionrect Height] :false];
B4IRDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="Can.DrawBitmap(Bm, Can.TargetRect)";
[_can DrawBitmap:(UIImage*)((_bm).object) :[_can TargetRect]];
B4IRDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="Can.RemoveClip";
[_can RemoveClip];
B4IRDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="Can.Invalidate";
[_can Invalidate];
B4IRDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="Dim res As B4XBitmap = Can.CreateBitmap";
_res = [B4XBitmapWrapper new];
_res = [_can CreateBitmap];
B4IRDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="Can.Release";
[_can Release];
B4IRDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="Dim BC As BitmapCreator";
_bc = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="BC.Initialize(res.Width,res.Height)";
[_bc _initialize:self.bi :(int) ([_res Width]) :(int) ([_res Height])];
B4IRDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="BC.DrawBitmap(res,BC.TargetRect,True)";
[_bc _drawbitmap:_res :_bc->__targetrect :true];
B4IRDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="Return BC";
if (true) return _bc;
B4IRDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="End Sub";
return nil;
}
- (B4XBitmapWrapper*)  _createstarbitmap:(b4i_imageviewcrop*) __ref :(B4XBitmapWrapper*) _image{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"createstarbitmap"])
	 {return ((B4XBitmapWrapper*) [B4IDebug delegate:self.bi :@"createstarbitmap:" :@[[B4I nilToNSNull:_image]]]);}
B4XCanvas* _can = nil;
B4XViewWrapper* _xview = nil;
B4XPath* _path = nil;
float _xx = 0.0f;
float _yy = 0.0f;
float _ray = 0.0f;
int _i = 0;
B4XBitmapWrapper* _res = nil;
B4IRDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub CreateStarBitmap(Image As B4XBitmap) A";
B4IRDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim Can As B4XCanvas";
_can = [B4XCanvas new];
B4IRDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Dim xview As B4XView = xui.CreatePanel(\"\")";
_xview = [B4XViewWrapper new];
_xview = [__ref->__xui CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="xview.SetLayoutAnimated(0, 0, 0, Image.Width, Ima";
[_xview SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[_image Width] :[_image Height]];
B4IRDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Can.Initialize(xview)";
[_can Initialize:(UIView*)((_xview).object)];
B4IRDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Dim path As B4XPath";
_path = [B4XPath new];
B4IRDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="path.InitializeOval(Can.TargetRect)";
[_path InitializeOval:[_can TargetRect]];
B4IRDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="Dim xx As Float = Can.TargetRect.CenterX";
_xx = [[_can TargetRect] CenterX];
B4IRDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="Dim yy As Float = Can.TargetRect.CenterY";
_yy = [[_can TargetRect] CenterY];
B4IRDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="Dim Ray As Float = Min(Can.TargetRect.Width,Can.T";
_ray = (float) (fmin([[_can TargetRect] Width],[[_can TargetRect] Height])/(double)2);
B4IRDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="For i=0 To 9";
{
const int step10 = 1;
const int limit10 = (int) (9);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
B4IRDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="If i=0 Then";
if (_i==0) { 
B4IRDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="path.Initialize(xx+Ray*CosD(-90+i*36),yy+Ray*Si";
[_path Initialize:(float) (_xx+_ray*cos((-90+_i*36)/ 180.0 * M_PI)) :(float) (_yy+_ray*sin((-90+_i*36)/ 180.0 * M_PI))];
 }else if(_i/(double)2==floor(_i/(double)2)) { 
B4IRDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="path.LineTo(xx+Ray*CosD(-90+i*36),yy+Ray*SinD(-";
[_path LineTo:(float) (_xx+_ray*cos((-90+_i*36)/ 180.0 * M_PI)) :(float) (_yy+_ray*sin((-90+_i*36)/ 180.0 * M_PI))];
 }else {
B4IRDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="path.LineTo(xx+Ray*CosD(-90+i*36)/2,yy+Ray*SinD";
[_path LineTo:(float) (_xx+_ray*cos((-90+_i*36)/ 180.0 * M_PI)/(double)2) :(float) (_yy+_ray*sin((-90+_i*36)/ 180.0 * M_PI)/(double)2)];
 };
 }
};
B4IRDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="Can.ClipPath(path)";
[_can ClipPath:_path];
B4IRDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="Can.DrawBitmap(Image, Can.TargetRect)";
[_can DrawBitmap:(UIImage*)((_image).object) :[_can TargetRect]];
B4IRDebugUtils.currentLine=2293784;
 //BA.debugLineNum = 2293784;BA.debugLine="Can.RemoveClip";
[_can RemoveClip];
B4IRDebugUtils.currentLine=2293785;
 //BA.debugLineNum = 2293785;BA.debugLine="Can.Invalidate";
[_can Invalidate];
B4IRDebugUtils.currentLine=2293786;
 //BA.debugLineNum = 2293786;BA.debugLine="Dim res As B4XBitmap = Can.CreateBitmap";
_res = [B4XBitmapWrapper new];
_res = [_can CreateBitmap];
B4IRDebugUtils.currentLine=2293787;
 //BA.debugLineNum = 2293787;BA.debugLine="Can.Release";
[_can Release];
B4IRDebugUtils.currentLine=2293789;
 //BA.debugLineNum = 2293789;BA.debugLine="Return res";
if (true) return _res;
B4IRDebugUtils.currentLine=2293790;
 //BA.debugLineNum = 2293790;BA.debugLine="End Sub";
return nil;
}
- (b4i_bitmapcreator*)  _createstarbitmapcreator:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _image{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"createstarbitmapcreator"])
	 {return ((b4i_bitmapcreator*) [B4IDebug delegate:self.bi :@"createstarbitmapcreator:" :@[[B4I nilToNSNull:_image]]]);}
B4XCanvas* _can = nil;
B4XViewWrapper* _xview = nil;
B4XPath* _path = nil;
float _xx = 0.0f;
float _yy = 0.0f;
float _ray = 0.0f;
int _i = 0;
B4XBitmapWrapper* _bm = nil;
B4XBitmapWrapper* _res = nil;
b4i_bitmapcreator* _bc = nil;
B4IRDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub CreateStarBitmapCreator(Image As Bitma";
B4IRDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim Can As B4XCanvas";
_can = [B4XCanvas new];
B4IRDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Dim xview As B4XView = xui.CreatePanel(\"\")";
_xview = [B4XViewWrapper new];
_xview = [__ref->__xui CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="xview.SetLayoutAnimated(0, 0, 0, SelectionRect.Wi";
[_xview SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[__ref->__selectionrect Width] :[__ref->__selectionrect Height]];
B4IRDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Can.Initialize(xview)";
[_can Initialize:(UIView*)((_xview).object)];
B4IRDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Dim path As B4XPath";
_path = [B4XPath new];
B4IRDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Dim xx As Float = SelectionRect.CenterX-Selection";
_xx = (float) ([__ref->__selectionrect CenterX]-[__ref->__selectionrect Left]);
B4IRDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="Dim yy As Float = SelectionRect.CenterY-Selection";
_yy = (float) ([__ref->__selectionrect CenterY]-[__ref->__selectionrect Top]);
B4IRDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="Dim Ray As Float = Min(SelectionRect.Width,Select";
_ray = (float) (fmin([__ref->__selectionrect Width],[__ref->__selectionrect Height])/(double)2);
B4IRDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="For i=0 To 9";
{
const int step9 = 1;
const int limit9 = (int) (9);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
B4IRDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="If i=0 Then";
if (_i==0) { 
B4IRDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="path.Initialize(xx+Ray*CosD(-90+i*36),yy+Ray*Si";
[_path Initialize:(float) (_xx+_ray*cos((-90+_i*36)/ 180.0 * M_PI)) :(float) (_yy+_ray*sin((-90+_i*36)/ 180.0 * M_PI))];
 }else if(_i/(double)2==floor(_i/(double)2)) { 
B4IRDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="path.LineTo(xx+Ray*CosD(-90+i*36),yy+Ray*SinD(-";
[_path LineTo:(float) (_xx+_ray*cos((-90+_i*36)/ 180.0 * M_PI)) :(float) (_yy+_ray*sin((-90+_i*36)/ 180.0 * M_PI))];
 }else {
B4IRDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="path.LineTo(xx+Ray*CosD(-90+i*36)/2,yy+Ray*SinD";
[_path LineTo:(float) (_xx+_ray*cos((-90+_i*36)/ 180.0 * M_PI)/(double)2) :(float) (_yy+_ray*sin((-90+_i*36)/ 180.0 * M_PI)/(double)2)];
 };
 }
};
B4IRDebugUtils.currentLine=2162709;
 //BA.debugLineNum = 2162709;BA.debugLine="Can.ClipPath(path)";
[_can ClipPath:_path];
B4IRDebugUtils.currentLine=2162710;
 //BA.debugLineNum = 2162710;BA.debugLine="Dim Bm As B4XBitmap = Image.Bitmap";
_bm = [B4XBitmapWrapper new];
_bm = [_image _getbitmap];
B4IRDebugUtils.currentLine=2162711;
 //BA.debugLineNum = 2162711;BA.debugLine="Bm=Bm.Resize(SelectionRect.Width, SelectionRect.H";
_bm = [_bm Resize:[__ref->__selectionrect Width] :[__ref->__selectionrect Height] :false];
B4IRDebugUtils.currentLine=2162712;
 //BA.debugLineNum = 2162712;BA.debugLine="Can.DrawBitmap(Bm, Can.TargetRect)";
[_can DrawBitmap:(UIImage*)((_bm).object) :[_can TargetRect]];
B4IRDebugUtils.currentLine=2162713;
 //BA.debugLineNum = 2162713;BA.debugLine="Can.RemoveClip";
[_can RemoveClip];
B4IRDebugUtils.currentLine=2162714;
 //BA.debugLineNum = 2162714;BA.debugLine="Can.Invalidate";
[_can Invalidate];
B4IRDebugUtils.currentLine=2162715;
 //BA.debugLineNum = 2162715;BA.debugLine="Dim res As B4XBitmap = Can.CreateBitmap";
_res = [B4XBitmapWrapper new];
_res = [_can CreateBitmap];
B4IRDebugUtils.currentLine=2162716;
 //BA.debugLineNum = 2162716;BA.debugLine="Can.Release";
[_can Release];
B4IRDebugUtils.currentLine=2162718;
 //BA.debugLineNum = 2162718;BA.debugLine="Dim BC As BitmapCreator";
_bc = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=2162719;
 //BA.debugLineNum = 2162719;BA.debugLine="BC.Initialize(res.Width,res.Height)";
[_bc _initialize:self.bi :(int) ([_res Width]) :(int) ([_res Height])];
B4IRDebugUtils.currentLine=2162720;
 //BA.debugLineNum = 2162720;BA.debugLine="BC.DrawBitmap(res,BC.TargetRect,True)";
[_bc _drawbitmap:_res :_bc->__targetrect :true];
B4IRDebugUtils.currentLine=2162721;
 //BA.debugLineNum = 2162721;BA.debugLine="Return BC";
if (true) return _bc;
B4IRDebugUtils.currentLine=2162722;
 //BA.debugLineNum = 2162722;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _designercreateview:(b4i_imageviewcrop*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4ILabelWrapper* _dl = nil;
B4IRDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
B4IRDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="mBase = Base";
__ref->__mbase.object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="CropMode = Props.Get(\"Crop\")";
__ref->__cropmode = [self.bi ObjectToString:[_props Get:(NSObject*)(@"Crop")]];
B4IRDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="mBase.AddView(ImageView1, 0, 0, 0, 0)";
[__ref->__mbase AddView:(UIView*)((__ref->__imageview1).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
[__ref->__mbase AddView:(UIView*)((__ref->__pnl).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="mBase.AddView(GhieraRotate,0,0,0,0)";
[__ref->__mbase AddView:(UIView*)((__ref->__ghierarotate).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="mBase.AddView(GhieraZoom,0,0,0,0)";
[__ref->__mbase AddView:(UIView*)((__ref->__ghierazoom).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="GhieraRotate.Visible=False";
[__ref->__ghierarotate setVisible:false];
B4IRDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="GhieraZoom.Visible=False";
[__ref->__ghierazoom setVisible:false];
B4IRDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="If Demo Then";
if (__ref->__demo) { 
B4IRDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Dim DL As Label";
_dl = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="DL.Initialize(\"\")";
[_dl Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="DemoLabel=DL";
__ref->__demolabel.object = (NSObject*)((_dl).object);
B4IRDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="DemoLabel.SetTextAlignment(\"CENTER\",\"CENTER\")";
[__ref->__demolabel SetTextAlignment:@"CENTER" :@"CENTER"];
B4IRDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="mBase.AddView(DemoLabel, 0, mBase.Height/2, mBas";
[__ref->__mbase AddView:(UIView*)((__ref->__demolabel).object) :(float) (0) :(float) ([__ref->__mbase Height]/(double)2) :[__ref->__mbase Width] :(float) (20)];
B4IRDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="DL.Text=\"DEMO VERSION\"";
[_dl setText:@"DEMO VERSION"];
B4IRDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="DL.Color=Colors.Gray";
[_dl setColor:[[self->___c Colors] Gray]];
B4IRDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="DL.TextColor=Colors.Black";
[_dl setTextColor:[[self->___c Colors] Black]];
 };
B4IRDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
[__ref _base_resize:nil :[__ref->__mbase Width] :[__ref->__mbase Height]];
B4IRDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="fingers.Initialize";
[__ref->__fingers Initialize];
B4IRDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="NativeMe = Me";
__ref->__nativeme.object = (NSObject*)(self);
B4IRDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawcircle:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _bc :(int) _x :(int) _y :(int) _radialx :(int) _radialy :(int) _bordercolor{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"drawcircle"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawcircle::::::" :@[[B4I nilToNSNull:_bc],@(_x),@(_y),@(_radialx),@(_radialy),@(_bordercolor)]]);}
double _x1 = 0.0;
double _y1 = 0.0;
int _i = 0;
double _x2 = 0.0;
double _y2 = 0.0;
B4IRDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub DrawCircle(BC As BitmapCreator, x As I";
B4IRDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim X1 As Double = X + RadialX * CosD(0)";
_x1 = _x+_radialx*cos((0)/ 180.0 * M_PI);
B4IRDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Dim Y1 As Double = Y + RadialY * SinD(0)";
_y1 = _y+_radialy*sin((0)/ 180.0 * M_PI);
B4IRDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="For i=1 To 720";
{
const int step3 = 1;
const int limit3 = (int) (720);
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
B4IRDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Dim X2 As Double = X + RadialX * CosD(i/2)";
_x2 = _x+_radialx*cos((_i/(double)2)/ 180.0 * M_PI);
B4IRDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Dim Y2 As Double = Y + RadialY * SinD(i/2)";
_y2 = _y+_radialy*sin((_i/(double)2)/ 180.0 * M_PI);
B4IRDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Drawline(BC,X1,Y1,X2,Y2,BorderColor)";
[__ref _drawline:nil :_bc :(int) (_x1) :(int) (_y1) :(int) (_x2) :(int) (_y2) :_bordercolor];
B4IRDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="X1 = X2";
_x1 = _x2;
B4IRDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="Y1 = Y2";
_y1 = _y2;
 }
};
B4IRDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawline:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _bc :(int) _x1 :(int) _y1 :(int) _x2 :(int) _y2 :(int) _color{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"drawline"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawline::::::" :@[[B4I nilToNSNull:_bc],@(_x1),@(_y1),@(_x2),@(_y2),@(_color)]]);}
int _dx = 0;
int _dy = 0;
int _diff = 0;
float _x = 0.0f;
float _y = 0.0f;
int _d = 0;
B4IRDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub Drawline(BC As BitmapCreator, x1 As In";
B4IRDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim Dx,Dy,Diff As Int";
_dx = 0;
_dy = 0;
_diff = 0;
B4IRDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim x,y As Float";
_x = 0.0f;
_y = 0.0f;
B4IRDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Dx = x2 - x1";
_dx = (int) (_x2-_x1);
B4IRDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Dy = y2 - y1";
_dy = (int) (_y2-_y1);
B4IRDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Diff=Max(Abs(Dx),Abs(Dy))";
_diff = (int) (fmax(fabs(_dx),fabs(_dy)));
B4IRDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="For D=0 To Diff";
{
const int step6 = 1;
const int limit6 = _diff;
_d = (int) (0) ;
for (;_d <= limit6 ;_d = _d + step6 ) {
B4IRDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="x= x1 + Dx*D/Diff";
_x = (float) (_x1+_dx*_d/(double)_diff);
B4IRDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="y = y1 + Dy*D/Diff";
_y = (float) (_y1+_dy*_d/(double)_diff);
B4IRDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="If (x>=0 And x<BC.mWidth) And (y>=0 And y<BC.mHe";
if ((_x>=0 && _x<_bc->__mwidth) && (_y>=0 && _y<_bc->__mheight)) { 
[_bc _setcolor:(int) (_x) :(int) (_y) :_color];};
 }
};
B4IRDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawlimit:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"drawlimit"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawlimit" :nil]);}
float _xxi = 0.0f;
float _yyi = 0.0f;
float _xxf = 0.0f;
float _yyf = 0.0f;
float _ray = 0.0f;
B4IList* _l = nil;
float _xx = 0.0f;
float _yy = 0.0f;
int _i = 0;
B4IRDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub DrawLimit";
B4IRDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim Xxi As Float = Min(Xi,Xf)";
_xxi = (float) (fmin(__ref->__xi,__ref->__xf));
B4IRDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Dim Yyi As Float = Min(Yi,Yf)";
_yyi = (float) (fmin(__ref->__yi,__ref->__yf));
B4IRDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Dim Xxf As Float = Max(Xi,Xf)";
_xxf = (float) (fmax(__ref->__xi,__ref->__xf));
B4IRDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Dim Yyf As Float = Max(Yi,Yf)";
_yyf = (float) (fmax(__ref->__yi,__ref->__yf));
B4IRDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="TargetBC.DrawCircle(sx,sy,SizeCircle/Zoom,0xFFFFF";
[__ref->__targetbc _drawcircle:(int) (__ref->__sx) :(int) (__ref->__sy) :(int) (__ref->__sizecircle/(double)__ref->__zoom) :(int) (0xffffffff) :false :(int) (1)];
B4IRDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="Select CropMode";
switch ([self.bi switchObjectToInt:__ref->__cropmode :@[@"Square",@"Ellipse",@"Circle",@"Star"]]) {
case 0: {
B4IRDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="DrawRhombus(TargetBC,Xi,Yi,Xf,Yf,0xFFCCCCCC)";
[__ref _drawrhombus:nil :__ref->__targetbc :(int) (__ref->__xi) :(int) (__ref->__yi) :(int) (__ref->__xf) :(int) (__ref->__yf) :(int) (0xffcccccc)];
 break; }
case 1: {
B4IRDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="DrawRhombus(TargetBC,Xi,Yi,Xf,Yf,0xFFCCCCCC)";
[__ref _drawrhombus:nil :__ref->__targetbc :(int) (__ref->__xi) :(int) (__ref->__yi) :(int) (__ref->__xf) :(int) (__ref->__yf) :(int) (0xffcccccc)];
B4IRDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="DrawCircle(TargetBC,(Xi+Xf)/2,(Yi+Yf)/2,Abs(Xf-";
[__ref _drawcircle:nil :__ref->__targetbc :(int) ((__ref->__xi+__ref->__xf)/(double)2) :(int) ((__ref->__yi+__ref->__yf)/(double)2) :(int) (fabs(__ref->__xf-__ref->__xi)/(double)2) :(int) (fabs(__ref->__yf-__ref->__yi)/(double)2) :(int) (0xffffffff)];
 break; }
case 2: {
B4IRDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="DrawRhombus(TargetBC,Xi,Yi,Xf,Yf,0xFFCCCCCC)";
[__ref _drawrhombus:nil :__ref->__targetbc :(int) (__ref->__xi) :(int) (__ref->__yi) :(int) (__ref->__xf) :(int) (__ref->__yf) :(int) (0xffcccccc)];
B4IRDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="Dim Ray As Float = Min(Abs(Xf-Xi)/2,Abs(Yf-Yi)/";
_ray = (float) (fmin(fabs(__ref->__xf-__ref->__xi)/(double)2,fabs(__ref->__yf-__ref->__yi)/(double)2));
B4IRDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="DrawCircle(TargetBC,(Xi+Xf)/2,(Yi+Yf)/2,Ray,Ray";
[__ref _drawcircle:nil :__ref->__targetbc :(int) ((__ref->__xi+__ref->__xf)/(double)2) :(int) ((__ref->__yi+__ref->__yf)/(double)2) :(int) (_ray) :(int) (_ray) :(int) (0xffffffff)];
 break; }
case 3: {
B4IRDebugUtils.currentLine=2424853;
 //BA.debugLineNum = 2424853;BA.debugLine="Dim L As List";
_l = [B4IList new];
B4IRDebugUtils.currentLine=2424854;
 //BA.debugLineNum = 2424854;BA.debugLine="L.Initialize";
[_l Initialize];
B4IRDebugUtils.currentLine=2424856;
 //BA.debugLineNum = 2424856;BA.debugLine="Dim xx As Float = (Xf+Xi)/2";
_xx = (float) ((__ref->__xf+__ref->__xi)/(double)2);
B4IRDebugUtils.currentLine=2424857;
 //BA.debugLineNum = 2424857;BA.debugLine="Dim yy As Float = (Yf+Yi)/2";
_yy = (float) ((__ref->__yf+__ref->__yi)/(double)2);
B4IRDebugUtils.currentLine=2424858;
 //BA.debugLineNum = 2424858;BA.debugLine="Dim Ray As Float = Min(Abs(Xf-Xi),Abs(Yf-Yi))/2";
_ray = (float) (fmin(fabs(__ref->__xf-__ref->__xi),fabs(__ref->__yf-__ref->__yi))/(double)2);
B4IRDebugUtils.currentLine=2424859;
 //BA.debugLineNum = 2424859;BA.debugLine="For i=0 To 9";
{
const int step22 = 1;
const int limit22 = (int) (9);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
B4IRDebugUtils.currentLine=2424860;
 //BA.debugLineNum = 2424860;BA.debugLine="If i/2=Floor(i/2) Then";
if (_i/(double)2==floor(_i/(double)2)) { 
B4IRDebugUtils.currentLine=2424861;
 //BA.debugLineNum = 2424861;BA.debugLine="L.Add(xx+Ray*CosD(-90+i*36))";
[_l Add:(NSObject*)(@(_xx+_ray*cos((-90+_i*36)/ 180.0 * M_PI)))];
B4IRDebugUtils.currentLine=2424862;
 //BA.debugLineNum = 2424862;BA.debugLine="L.Add(yy+Ray*SinD(-90+i*36))";
[_l Add:(NSObject*)(@(_yy+_ray*sin((-90+_i*36)/ 180.0 * M_PI)))];
 }else {
B4IRDebugUtils.currentLine=2424864;
 //BA.debugLineNum = 2424864;BA.debugLine="L.Add(xx+Ray*CosD(-90+i*36)/2)";
[_l Add:(NSObject*)(@(_xx+_ray*cos((-90+_i*36)/ 180.0 * M_PI)/(double)2))];
B4IRDebugUtils.currentLine=2424865;
 //BA.debugLineNum = 2424865;BA.debugLine="L.Add(yy+Ray*SinD(-90+i*36)/2)";
[_l Add:(NSObject*)(@(_yy+_ray*sin((-90+_i*36)/ 180.0 * M_PI)/(double)2))];
 };
 }
};
B4IRDebugUtils.currentLine=2424869;
 //BA.debugLineNum = 2424869;BA.debugLine="DrawRhombus(TargetBC,Xi,Yi,Xf,Yf,0xFFCCCCCC)";
[__ref _drawrhombus:nil :__ref->__targetbc :(int) (__ref->__xi) :(int) (__ref->__yi) :(int) (__ref->__xf) :(int) (__ref->__yf) :(int) (0xffcccccc)];
B4IRDebugUtils.currentLine=2424870;
 //BA.debugLineNum = 2424870;BA.debugLine="DrawPath(TargetBC,L,0xFFFFFFFF)";
[__ref _drawpath:nil :__ref->__targetbc :_l :(int) (0xffffffff)];
 break; }
}
;
B4IRDebugUtils.currentLine=2424874;
 //BA.debugLineNum = 2424874;BA.debugLine="Drawline(TargetBC,Xxi,Yyi+1,Xxi+SizePoint,Yyi+1,0";
[__ref _drawline:nil :__ref->__targetbc :(int) (_xxi) :(int) (_yyi+1) :(int) (_xxi+__ref->__sizepoint) :(int) (_yyi+1) :(int) (0xffffffff)];
B4IRDebugUtils.currentLine=2424875;
 //BA.debugLineNum = 2424875;BA.debugLine="Drawline(TargetBC,Xxi,Yyi+2,Xxi+SizePoint,Yyi+2,0";
[__ref _drawline:nil :__ref->__targetbc :(int) (_xxi) :(int) (_yyi+2) :(int) (_xxi+__ref->__sizepoint) :(int) (_yyi+2) :(int) (0xffffffff)];
B4IRDebugUtils.currentLine=2424877;
 //BA.debugLineNum = 2424877;BA.debugLine="Drawline(TargetBC,Xxi+1,Yyi,Xxi+1,Yyi+SizePoint,0";
[__ref _drawline:nil :__ref->__targetbc :(int) (_xxi+1) :(int) (_yyi) :(int) (_xxi+1) :(int) (_yyi+__ref->__sizepoint) :(int) (0xffffffff)];
B4IRDebugUtils.currentLine=2424878;
 //BA.debugLineNum = 2424878;BA.debugLine="Drawline(TargetBC,Xxi+2,Yyi,Xxi+2,Yyi+SizePoint,0";
[__ref _drawline:nil :__ref->__targetbc :(int) (_xxi+2) :(int) (_yyi) :(int) (_xxi+2) :(int) (_yyi+__ref->__sizepoint) :(int) (0xffffffff)];
B4IRDebugUtils.currentLine=2424881;
 //BA.debugLineNum = 2424881;BA.debugLine="Drawline(TargetBC,Xxf,Yyf-1,Xxf-SizePoint,Yyf-1,0";
[__ref _drawline:nil :__ref->__targetbc :(int) (_xxf) :(int) (_yyf-1) :(int) (_xxf-__ref->__sizepoint) :(int) (_yyf-1) :(int) (0xffffffff)];
B4IRDebugUtils.currentLine=2424882;
 //BA.debugLineNum = 2424882;BA.debugLine="Drawline(TargetBC,Xxf,Yyf-2,Xxf-SizePoint,Yyf-2,0";
[__ref _drawline:nil :__ref->__targetbc :(int) (_xxf) :(int) (_yyf-2) :(int) (_xxf-__ref->__sizepoint) :(int) (_yyf-2) :(int) (0xffffffff)];
B4IRDebugUtils.currentLine=2424884;
 //BA.debugLineNum = 2424884;BA.debugLine="Drawline(TargetBC,Xxf-1,Yyf,Xxf-1,Yyf-SizePoint,0";
[__ref _drawline:nil :__ref->__targetbc :(int) (_xxf-1) :(int) (_yyf) :(int) (_xxf-1) :(int) (_yyf-__ref->__sizepoint) :(int) (0xffffffff)];
B4IRDebugUtils.currentLine=2424885;
 //BA.debugLineNum = 2424885;BA.debugLine="Drawline(TargetBC,Xxf-2,Yyf,Xxf-2,Yyf-SizePoint,0";
[__ref _drawline:nil :__ref->__targetbc :(int) (_xxf-2) :(int) (_yyf) :(int) (_xxf-2) :(int) (_yyf-__ref->__sizepoint) :(int) (0xffffffff)];
B4IRDebugUtils.currentLine=2424886;
 //BA.debugLineNum = 2424886;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawrhombus:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _bc :(int) _xin :(int) _yin :(int) _xfin :(int) _yfin :(int) _color{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"drawrhombus"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawrhombus::::::" :@[[B4I nilToNSNull:_bc],@(_xin),@(_yin),@(_xfin),@(_yfin),@(_color)]]);}
B4IRDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub DrawRhombus(BC As BitmapCreator, Xin A";
B4IRDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Drawline(BC,Xin,Yin,Xfin,Yin, Color)";
[__ref _drawline:nil :_bc :_xin :_yin :_xfin :_yin :_color];
B4IRDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Drawline(BC,Xin,Yfin,Xfin,Yfin, Color)";
[__ref _drawline:nil :_bc :_xin :_yfin :_xfin :_yfin :_color];
B4IRDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Drawline(BC,Xin,Yin,Xin,Yfin,Color)";
[__ref _drawline:nil :_bc :_xin :_yin :_xin :_yfin :_color];
B4IRDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Drawline(BC,Xfin,Yin,Xfin,Yfin,Color)";
[__ref _drawline:nil :_bc :_xfin :_yin :_xfin :_yfin :_color];
B4IRDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawpath:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _bc :(B4IList*) _listpoint :(int) _color{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"drawpath"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawpath:::" :@[[B4I nilToNSNull:_bc],[B4I nilToNSNull:_listpoint],@(_color)]]);}
B4IArray* _px = nil;
B4IArray* _py = nil;
int _i = 0;
B4IRDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub DrawPath(BC As BitmapCreator, ListPoin";
B4IRDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim Px(ListPoint.Size/2) As Float";
_px = [[B4IArray alloc]initObjects:@[@((int) ([_listpoint Size]/(double)2))] :@0 :nil];
B4IRDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim Py(ListPoint.Size/2) As Float";
_py = [[B4IArray alloc]initObjects:@[@((int) ([_listpoint Size]/(double)2))] :@0 :nil];
B4IRDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="For i=0 To ListPoint.Size-1 Step 2";
{
const int step3 = 2;
const int limit3 = (int) ([_listpoint Size]-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
B4IRDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Px(i/2)=ListPoint.Get(i)";
[_px setObjectFastN:(int) (_i/(double)2):@([self.bi ObjectToNumber:[_listpoint Get:_i]].floatValue)];
B4IRDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Py(i/2)=ListPoint.Get(i+1)";
[_py setObjectFastN:(int) (_i/(double)2):@([self.bi ObjectToNumber:[_listpoint Get:(int) (_i+1)]].floatValue)];
 }
};
B4IRDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="For i=0 To (ListPoint.Size/2)-1";
{
const int step7 = 1;
const int limit7 = (int) (([_listpoint Size]/(double)2)-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
B4IRDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="If i=(ListPoint.Size/2)-1 Then";
if (_i==([_listpoint Size]/(double)2)-1) { 
B4IRDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="Drawline(BC,Px(i),Py(i),Px(0),Py(0), Color)";
[__ref _drawline:nil :_bc :(int) (((NSNumber*)[_px getObjectFastN:_i]).floatValue) :(int) (((NSNumber*)[_py getObjectFastN:_i]).floatValue) :(int) (((NSNumber*)[_px getObjectFastN:(int) (0)]).floatValue) :(int) (((NSNumber*)[_py getObjectFastN:(int) (0)]).floatValue) :_color];
 }else {
B4IRDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="Drawline(BC,Px(i),Py(i),Px(i+1),Py(i+1), Color)";
[__ref _drawline:nil :_bc :(int) (((NSNumber*)[_px getObjectFastN:_i]).floatValue) :(int) (((NSNumber*)[_py getObjectFastN:_i]).floatValue) :(int) (((NSNumber*)[_px getObjectFastN:(int) (_i+1)]).floatValue) :(int) (((NSNumber*)[_py getObjectFastN:(int) (_i+1)]).floatValue) :_color];
 };
 }
};
B4IRDebugUtils.currentLine=2621456;
 //BA.debugLineNum = 2621456;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawrec:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _bc :(int) _xin :(int) _yin :(int) _xfin :(int) _yfin :(int) _color :(int) _colorbackgroud :(BOOL) _fill{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"drawrec"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawrec::::::::" :@[[B4I nilToNSNull:_bc],@(_xin),@(_yin),@(_xfin),@(_yfin),@(_color),@(_colorbackgroud),@(_fill)]]);}
int _i = 0;
B4IRDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub DrawRec(BC As BitmapCreator, Xin As In";
B4IRDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="If Fill Then";
if (_fill) { 
B4IRDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="For i=Yin To Yfin";
{
const int step2 = 1;
const int limit2 = _yfin;
_i = _yin ;
for (;_i <= limit2 ;_i = _i + step2 ) {
B4IRDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Drawline(BC,Xin,i,Xfin,i, ColorBackgroud)";
[__ref _drawline:nil :_bc :_xin :_i :_xfin :_i :_colorbackgroud];
 }
};
 };
B4IRDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Drawline(BC,Xin,Yin,Xfin,Yin, Color)";
[__ref _drawline:nil :_bc :_xin :_yin :_xfin :_yin :_color];
B4IRDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="Drawline(BC,Xin,Yfin,Xfin,Yfin, Color)";
[__ref _drawline:nil :_bc :_xin :_yfin :_xfin :_yfin :_color];
B4IRDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Drawline(BC,Xin,Yin,Xin,Yfin,Color)";
[__ref _drawline:nil :_bc :_xin :_yin :_xin :_yfin :_color];
B4IRDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="Drawline(BC,Xfin,Yin,Xfin,Yfin,Color)";
[__ref _drawline:nil :_bc :_xfin :_yin :_xfin :_yfin :_color];
B4IRDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _fillimagetoview:(b4i_imageviewcrop*) __ref :(B4XBitmapWrapper*) _bmp :(B4XViewWrapper*) _imagevw{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"fillimagetoview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"fillimagetoview::" :@[[B4I nilToNSNull:_bmp],[B4I nilToNSNull:_imagevw]]]);}
float _bmpratio = 0.0f;
float _viewratio = 0.0f;
int _newheight = 0;
int _newwidth = 0;
B4IRDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="public Sub FillImageToView(bmp As B4XBitmap, Image";
B4IRDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim bmpRatio As Float = bmp.Width / bmp.Height";
_bmpratio = (float) ([_bmp Width]/(double)[_bmp Height]);
B4IRDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim viewRatio As Float = ImageView1.Width / Image";
_viewratio = (float) ([__ref->__imageview1 Width]/(double)[__ref->__imageview1 Height]);
B4IRDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="If viewRatio > bmpRatio Then";
if (_viewratio>_bmpratio) { 
B4IRDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Dim NewHeight As Int = bmp.Width / viewRatio";
_newheight = (int) ([_bmp Width]/(double)_viewratio);
B4IRDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight / 2";
_bmp = [_bmp Crop:(float) (0) :(float) ([_bmp Height]/(double)2-_newheight/(double)2) :[_bmp Width] :(float) (_newheight)];
 }else if(_viewratio<_bmpratio) { 
B4IRDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Dim NewWidth As Int = bmp.Height * viewRatio";
_newwidth = (int) ([_bmp Height]*_viewratio);
B4IRDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2, 0,";
_bmp = [_bmp Crop:(float) ([_bmp Width]/(double)2-_newwidth/(double)2) :(float) (0) :(float) (_newwidth) :[_bmp Height]];
 };
B4IRDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="ImageVw.SetBitmap(bmp.Resize(ImageView1.Width, Im";
[_imagevw SetBitmap:(UIImage*)(([_bmp Resize:[__ref->__imageview1 Width] :[__ref->__imageview1 Height] :true]).object)];
B4IRDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="End Sub";
return @"";
}
- (b4i_bitmapcreator*)  _generatecropimage:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"generatecropimage"])
	 {return ((b4i_bitmapcreator*) [B4IDebug delegate:self.bi :@"generatecropimage" :nil]);}
b4i_bitmapcreator* _image = nil;
float _ray = 0.0f;
B4IRDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub generateCropImage As BitmapCreator";
B4IRDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim Image As BitmapCreator";
_image = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="If CropMode=\"Square\" Then";
if ([__ref->__cropmode isEqual:@"Square"]) { 
B4IRDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Image.Initialize(SelectionRect.Width,SelectionRe";
[_image _initialize:self.bi :(int) ([__ref->__selectionrect Width]) :(int) ([__ref->__selectionrect Height])];
B4IRDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Image.DrawBitmapCreator(ColorBC,SelectionRect,0,";
[_image _drawbitmapcreator:__ref->__colorbc :__ref->__selectionrect :(int) (0) :(int) (0) :true];
 }else if([__ref->__cropmode isEqual:@"Ellipse"] && ([__ref->__selectionrect Width]>1 && [__ref->__selectionrect Height]>1)) { 
B4IRDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Image.Initialize(SelectionRect.Width,SelectionRe";
[_image _initialize:self.bi :(int) ([__ref->__selectionrect Width]) :(int) ([__ref->__selectionrect Height])];
B4IRDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Image.DrawBitmapCreator(ColorBC,SelectionRect,0,";
[_image _drawbitmapcreator:__ref->__colorbc :__ref->__selectionrect :(int) (0) :(int) (0) :true];
B4IRDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="Image=CreateRoundBitmapCreator(Image)";
_image = [__ref _createroundbitmapcreator:nil :_image];
 }else if([__ref->__cropmode isEqual:@"Circle"] && ([__ref->__selectionrect Width]>1 && [__ref->__selectionrect Height]>1)) { 
B4IRDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="Dim Ray As Float = Min(Abs(SelectionRect.Right-S";
_ray = (float) (fmin(fabs([__ref->__selectionrect Right]-[__ref->__selectionrect Left]),fabs([__ref->__selectionrect Bottom]-[__ref->__selectionrect Top])));
B4IRDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="SelectionRect.left = SelectionRect.CenterX - Ray";
[__ref->__selectionrect setLeft:(float) ([__ref->__selectionrect CenterX]-_ray/(double)2)];
B4IRDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="SelectionRect.Width=Ray";
[__ref->__selectionrect setWidth:_ray];
B4IRDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="SelectionRect.Top = SelectionRect.CenterY - Ray/";
[__ref->__selectionrect setTop:(float) ([__ref->__selectionrect CenterY]-_ray/(double)2)];
B4IRDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="SelectionRect.Height=Ray";
[__ref->__selectionrect setHeight:_ray];
B4IRDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="Image.Initialize(Ray,Ray)";
[_image _initialize:self.bi :(int) (_ray) :(int) (_ray)];
B4IRDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="Image.DrawBitmapCreator(ColorBC,SelectionRect,0,";
[_image _drawbitmapcreator:__ref->__colorbc :__ref->__selectionrect :(int) (0) :(int) (0) :true];
B4IRDebugUtils.currentLine=2031635;
 //BA.debugLineNum = 2031635;BA.debugLine="Image=CreateRoundBitmapCreator(Image)";
_image = [__ref _createroundbitmapcreator:nil :_image];
 }else if([__ref->__cropmode isEqual:@"Star"] && ([__ref->__selectionrect Width]>1 && [__ref->__selectionrect Height]>1)) { 
B4IRDebugUtils.currentLine=2031637;
 //BA.debugLineNum = 2031637;BA.debugLine="Image.Initialize(SelectionRect.Width,SelectionRe";
[_image _initialize:self.bi :(int) ([__ref->__selectionrect Width]) :(int) ([__ref->__selectionrect Height])];
B4IRDebugUtils.currentLine=2031638;
 //BA.debugLineNum = 2031638;BA.debugLine="Image=CreateStarBitmapCreator(ColorBC)";
_image = [__ref _createstarbitmapcreator:nil :__ref->__colorbc];
 };
B4IRDebugUtils.currentLine=2031641;
 //BA.debugLineNum = 2031641;BA.debugLine="Return Image";
if (true) return _image;
B4IRDebugUtils.currentLine=2031642;
 //BA.debugLineNum = 2031642;BA.debugLine="End Sub";
return nil;
}
- (b4i_bitmapcreator*)  _generategreyimage:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"generategreyimage"])
	 {return ((b4i_bitmapcreator*) [B4IDebug delegate:self.bi :@"generategreyimage" :nil]);}
b4i_bitmapcreator* _image = nil;
_argbcolor* _argb = nil;
int _x = 0;
int _y = 0;
int _c = 0;
B4IRDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub generateGreyImage As BitmapCreator";
B4IRDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim Image As BitmapCreator";
_image = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Image.Initialize(ColorBC.mWidth, ColorBC.mHeight)";
[_image _initialize:self.bi :__ref->__colorbc->__mwidth :__ref->__colorbc->__mheight];
B4IRDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Dim argb As ARGBColor";
_argb = [_argbcolor new];
B4IRDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="For x = 0 To ColorBC.mWidth - 1";
{
const int step4 = 1;
const int limit4 = (int) (__ref->__colorbc->__mwidth-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
B4IRDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="For y = 0 To ColorBC.mHeight - 1";
{
const int step5 = 1;
const int limit5 = (int) (__ref->__colorbc->__mheight-1);
_y = (int) (0) ;
for (;_y <= limit5 ;_y = _y + step5 ) {
B4IRDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="ColorBC.GetARGB(x, y, argb)";
[__ref->__colorbc _getargb:_x :_y :_argb];
B4IRDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="Dim c As Int = argb.r * 0.21 + argb.g * 0.72 +";
_c = (int) (_argb->_r*0.21+_argb->_g*0.72+0.07*_argb->_b);
B4IRDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="argb.r = c";
_argb->_r = _c;
B4IRDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="argb.g = c";
_argb->_g = _c;
B4IRDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="argb.b = c";
_argb->_b = _c;
B4IRDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="argb.a=160";
_argb->_a = (int) (160);
B4IRDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="Image.SetARGB(x, y, argb)";
[_image _setargb:_x :_y :_argb];
 }
};
 }
};
B4IRDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="Return Image";
if (true) return _image;
B4IRDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _getcrop:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"getcrop"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"getcrop" :nil]);}
B4IRDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub getCrop As String";
B4IRDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Return CropMode";
if (true) return __ref->__cropmode;
B4IRDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return @"";
}
- (float)  _getrotation:(b4i_imageviewcrop*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"getrotation"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getrotation" :nil]).floatValue;}
B4IRDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub getRotation As Float";
B4IRDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Return Degree";
if (true) return __ref->__degree;
B4IRDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return 0.0f;
}
- (BOOL)  _ghierarotate_multitouchended:(b4i_imageviewcrop*) __ref :(NSObject*) _touches{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"ghierarotate_multitouchended"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"ghierarotate_multitouchended:" :@[[B4I nilToNSNull:_touches]]]).boolValue;}
B4IRDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub GhieraRotate_MultiTouchEnded(touches A";
B4IRDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="DrawGhieraRotate";
[__ref _drawghierarotate:nil];
B4IRDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Return True";
if (true) return true;
B4IRDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
return false;
}
- (BOOL)  _ghierarotate_multitouchmoved:(b4i_imageviewcrop*) __ref :(NSObject*) _touches{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"ghierarotate_multitouchmoved"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"ghierarotate_multitouchmoved:" :@[[B4I nilToNSNull:_touches]]]).boolValue;}
B4IList* _list = nil;
float _x = 0.0f;
float _y = 0.0f;
B4INativeObject* _t = nil;
B4IList* _point = nil;
float _d = 0.0f;
B4IRDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub GhieraRotate_MultiTouchMoved(touches A";
B4IRDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim list As List = touches";
_list = [B4IList new];
_list.object = (NSArray*)(_touches);
B4IRDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim X,Y As Float 'ignore";
_x = 0.0f;
_y = 0.0f;
B4IRDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="For Each t As NativeObject In list";
_t = [B4INativeObject new];
{
const id<B4IIterable> group3 = _list;
const int groupLen3 = group3.Size
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_t.object = (NSObject*)([group3 Get:index3]);
B4IRDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="Dim point As List = NativeMe.RunMethod(\"UITouchT";
_point = [B4IList new];
_point.object = (NSArray*)(([__ref->__nativeme RunMethod:@"UITouchToPoint::" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((_t).object)],[B4I nilToNSNull:[self->___c Sender:self.bi]]]]]).object);
B4IRDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="X= point.Get(0)";
_x = [self.bi ObjectToNumber:[_point Get:(int) (0)]].floatValue;
B4IRDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="Y= point.Get(1)";
_y = [self.bi ObjectToNumber:[_point Get:(int) (1)]].floatValue;
B4IRDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="Dim D As Float=Bit.FMod(((x/GhieraRotate.Width)+";
_d = (float) (fmod(((_x/(double)[__ref->__ghierarotate Width])+0.5)*360,360));
B4IRDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="setRotation(D)";
[__ref _setrotation:nil :_d];
 }
};
B4IRDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="Return True";
if (true) return true;
B4IRDebugUtils.currentLine=3211279;
 //BA.debugLineNum = 3211279;BA.debugLine="End Sub";
return false;
}
- (BOOL)  _ghierazoom_multitouchmoved:(b4i_imageviewcrop*) __ref :(NSObject*) _touches{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"ghierazoom_multitouchmoved"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"ghierazoom_multitouchmoved:" :@[[B4I nilToNSNull:_touches]]]).boolValue;}
B4IList* _list = nil;
float _x = 0.0f;
float _y = 0.0f;
B4INativeObject* _t = nil;
B4IList* _point = nil;
int _newleft = 0;
int _newtop = 0;
int _newwidth = 0;
int _newheight = 0;
B4IRDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub GhieraZoom_MultiTouchMoved(touches As";
B4IRDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Dim list As List = touches";
_list = [B4IList new];
_list.object = (NSArray*)(_touches);
B4IRDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Dim X,Y As Float 'ignore";
_x = 0.0f;
_y = 0.0f;
B4IRDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="For Each t As NativeObject In list";
_t = [B4INativeObject new];
{
const id<B4IIterable> group3 = _list;
const int groupLen3 = group3.Size
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_t.object = (NSObject*)([group3 Get:index3]);
B4IRDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Dim point As List = NativeMe.RunMethod(\"UITouchT";
_point = [B4IList new];
_point.object = (NSArray*)(([__ref->__nativeme RunMethod:@"UITouchToPoint::" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((_t).object)],[B4I nilToNSNull:[self->___c Sender:self.bi]]]]]).object);
B4IRDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="X= point.Get(0)";
_x = [self.bi ObjectToNumber:[_point Get:(int) (0)]].floatValue;
B4IRDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="Y= point.Get(1)";
_y = [self.bi ObjectToNumber:[_point Get:(int) (1)]].floatValue;
B4IRDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="ZoomPosition=X/GhieraZoom.Width";
__ref->__zoomposition = (float) (_x/(double)[__ref->__ghierazoom Width]);
B4IRDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="If X<GhieraZoom.Width/2 Then";
if (_x<[__ref->__ghierazoom Width]/(double)2) { 
B4IRDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="Zoom=Max((x/(GhieraZoom.Width/2)),0.1)";
__ref->__zoom = (float) (fmax((_x/(double)([__ref->__ghierazoom Width]/(double)2)),0.1));
 }else {
B4IRDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="Zoom=1+(4*(X-GhieraZoom.Width/2)/(GhieraZoom.Wi";
__ref->__zoom = (float) (1+(4*(_x-[__ref->__ghierazoom Width]/(double)2)/(double)([__ref->__ghierazoom Width]/(double)2)));
 };
B4IRDebugUtils.currentLine=3342350;
 //BA.debugLineNum = 3342350;BA.debugLine="Dim newLeft As Int = OffsetX+(1-Zoom)*OriginalX/";
_newleft = (int) (__ref->__offsetx+(1-__ref->__zoom)*__ref->__originalx/(double)2);
B4IRDebugUtils.currentLine=3342351;
 //BA.debugLineNum = 3342351;BA.debugLine="Dim newTop As Int = OffsetY+(1-Zoom)*OriginalY/2";
_newtop = (int) (__ref->__offsety+(1-__ref->__zoom)*__ref->__originaly/(double)2);
B4IRDebugUtils.currentLine=3342352;
 //BA.debugLineNum = 3342352;BA.debugLine="Dim newWidth As Int = OriginalX*Zoom";
_newwidth = (int) (__ref->__originalx*__ref->__zoom);
B4IRDebugUtils.currentLine=3342353;
 //BA.debugLineNum = 3342353;BA.debugLine="Dim newHeight As Int = OriginalY*Zoom";
_newheight = (int) (__ref->__originaly*__ref->__zoom);
B4IRDebugUtils.currentLine=3342354;
 //BA.debugLineNum = 3342354;BA.debugLine="ImageView1.SetLayoutAnimated(0,0,newLeft,newTop,";
[__ref->__imageview1 SetLayoutAnimated:(int) (0) :(float) (0) :(float) (_newleft) :(float) (_newtop) :(float) (_newwidth) :(float) (_newheight)];
B4IRDebugUtils.currentLine=3342355;
 //BA.debugLineNum = 3342355;BA.debugLine="DrawGhieraZoom";
[__ref _drawghierazoom:nil];
 }
};
B4IRDebugUtils.currentLine=3342358;
 //BA.debugLineNum = 3342358;BA.debugLine="Return True";
if (true) return true;
B4IRDebugUtils.currentLine=3342359;
 //BA.debugLineNum = 3342359;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _initialize:(b4i_imageviewcrop*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="mEventName = EventName";
__ref->__meventname = _eventname;
B4IRDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="mCallBack = Callback";
__ref->__mcallback = _callback;
B4IRDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="ImageView1.Initialize(\"ImageView1\")";
[__ref->__imageview1 Initialize:self.bi :@"ImageView1"];
B4IRDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
__ref->__pnl = [__ref->__xui CreatePanel:self.bi :@"pnl"];
B4IRDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="GhieraRotate = xui.CreatePanel(\"GhieraRotate\")";
__ref->__ghierarotate = [__ref->__xui CreatePanel:self.bi :@"GhieraRotate"];
B4IRDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="GhieraZoom = xui.CreatePanel(\"GhieraZoom\")";
__ref->__ghierazoom = [__ref->__xui CreatePanel:self.bi :@"GhieraZoom"];
B4IRDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="SelectionRect.Initialize(0, 0, 0, 0)";
[__ref->__selectionrect Initialize:(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="fingersList.Initialize";
[__ref->__fingerslist Initialize];
B4IRDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Xi=-50";
__ref->__xi = (float) (-50);
B4IRDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Yi=-50";
__ref->__yi = (float) (-50);
B4IRDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Xf=-50";
__ref->__xf = (float) (-50);
B4IRDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Yf=-50";
__ref->__yf = (float) (-50);
B4IRDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _pnl_multitouchbegan:(b4i_imageviewcrop*) __ref :(NSObject*) _touches{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"pnl_multitouchbegan"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"pnl_multitouchbegan:" :@[[B4I nilToNSNull:_touches]]]).boolValue;}
float _x = 0.0f;
float _y = 0.0f;
B4IList* _list = nil;
B4INativeObject* _t = nil;
B4IList* _point = nil;
_c_type* _fd = nil;
float _d1 = 0.0f;
float _d2 = 0.0f;
B4IRDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub pnl_MultiTouchBegan(touches As Object)";
B4IRDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim X,Y As Float";
_x = 0.0f;
_y = 0.0f;
B4IRDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Dim list As List = touches";
_list = [B4IList new];
_list.object = (NSArray*)(_touches);
B4IRDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="For Each t As NativeObject In list";
_t = [B4INativeObject new];
{
const id<B4IIterable> group3 = _list;
const int groupLen3 = group3.Size
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_t.object = (NSObject*)([group3 Get:index3]);
B4IRDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Dim point As List = NativeMe.RunMethod(\"UITouchT";
_point = [B4IList new];
_point.object = (NSArray*)(([__ref->__nativeme RunMethod:@"UITouchToPoint::" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((_t).object)],[B4I nilToNSNull:[self->___c Sender:self.bi]]]]]).object);
B4IRDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="Dim fd As C_Type";
_fd = [_c_type new];
B4IRDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="fd.X = point.Get(0)";
_fd->_X = [self.bi ObjectToNumber:[_point Get:(int) (0)]].intValue;
B4IRDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="fd.Y = point.Get(1)";
_fd->_Y = [self.bi ObjectToNumber:[_point Get:(int) (1)]].intValue;
B4IRDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="fingers.Put(t, fd)";
[__ref->__fingers Put:(NSObject*)((_t).object) :(NSObject*)(_fd)];
B4IRDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="fingersList.Add(t)";
[__ref->__fingerslist Add:(NSObject*)((_t).object)];
 }
};
B4IRDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="Dim fd As C_Type = fingers.Get(fingersList.Get(0)";
_fd = (_c_type*)([__ref->__fingers Get:[__ref->__fingerslist Get:(int) (0)]]);
B4IRDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="Select Operation";
switch ([self.bi switchObjectToInt:@(__ref->__operation) :@[@((int) (0)),@((int) (1))]]) {
case 0: {
B4IRDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="X = fd.X";
_x = (float) (_fd->_X);
B4IRDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="Y = fd.y";
_y = (float) (_fd->_Y);
B4IRDebugUtils.currentLine=3014682;
 //BA.debugLineNum = 3014682;BA.debugLine="Dim D1 As Float = Sqrt(Power(Xi-X,2)+Power(Yi-Y";
_d1 = (float) (sqrt(pow(__ref->__xi-_x,2)+pow(__ref->__yi-_y,2)));
B4IRDebugUtils.currentLine=3014683;
 //BA.debugLineNum = 3014683;BA.debugLine="Dim D2 As Float = Sqrt(Power(Xf-X,2)+Power(Yf-Y";
_d2 = (float) (sqrt(pow(__ref->__xf-_x,2)+pow(__ref->__yf-_y,2)));
B4IRDebugUtils.currentLine=3014685;
 //BA.debugLineNum = 3014685;BA.debugLine="If D1<20dip Or D2<20dip Then";
if (_d1<((int) (20)) || _d2<((int) (20))) { 
B4IRDebugUtils.currentLine=3014686;
 //BA.debugLineNum = 3014686;BA.debugLine="If D1<D2 Then";
if (_d1<_d2) { 
B4IRDebugUtils.currentLine=3014687;
 //BA.debugLineNum = 3014687;BA.debugLine="Xi=X";
__ref->__xi = _x;
B4IRDebugUtils.currentLine=3014688;
 //BA.debugLineNum = 3014688;BA.debugLine="Yi=y";
__ref->__yi = _y;
 }else {
B4IRDebugUtils.currentLine=3014690;
 //BA.debugLineNum = 3014690;BA.debugLine="Xf=X";
__ref->__xf = _x;
B4IRDebugUtils.currentLine=3014691;
 //BA.debugLineNum = 3014691;BA.debugLine="Yf=y";
__ref->__yf = _y;
 };
 }else {
B4IRDebugUtils.currentLine=3014694;
 //BA.debugLineNum = 3014694;BA.debugLine="Xi=X";
__ref->__xi = _x;
B4IRDebugUtils.currentLine=3014695;
 //BA.debugLineNum = 3014695;BA.debugLine="Yi=Y";
__ref->__yi = _y;
B4IRDebugUtils.currentLine=3014696;
 //BA.debugLineNum = 3014696;BA.debugLine="Xf=X";
__ref->__xf = _x;
B4IRDebugUtils.currentLine=3014697;
 //BA.debugLineNum = 3014697;BA.debugLine="Yf=y";
__ref->__yf = _y;
B4IRDebugUtils.currentLine=3014698;
 //BA.debugLineNum = 3014698;BA.debugLine="SelectionRect.Initialize(0,0,0,0)";
[__ref->__selectionrect Initialize:(float) (0) :(float) (0) :(float) (0) :(float) (0)];
 };
 break; }
case 1: {
B4IRDebugUtils.currentLine=3014701;
 //BA.debugLineNum = 3014701;BA.debugLine="sx = fd.X";
__ref->__sx = (float) (_fd->_X);
B4IRDebugUtils.currentLine=3014702;
 //BA.debugLineNum = 3014702;BA.debugLine="sy = fd.y";
__ref->__sy = (float) (_fd->_Y);
 break; }
}
;
B4IRDebugUtils.currentLine=3014706;
 //BA.debugLineNum = 3014706;BA.debugLine="Return True";
if (true) return true;
B4IRDebugUtils.currentLine=3014707;
 //BA.debugLineNum = 3014707;BA.debugLine="End Sub";
return false;
}
- (BOOL)  _pnl_multitouchended:(b4i_imageviewcrop*) __ref :(NSObject*) _touches{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"pnl_multitouchended"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"pnl_multitouchended:" :@[[B4I nilToNSNull:_touches]]]).boolValue;}
float _x = 0.0f;
float _y = 0.0f;
B4IList* _list = nil;
B4INativeObject* _t = nil;
B4IList* _point = nil;
int _i = 0;
B4INativeObject* _t1 = nil;
B4IRDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub pnl_MultiTouchEnded(touches As Object)";
B4IRDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim X,Y As Float";
_x = 0.0f;
_y = 0.0f;
B4IRDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Dim list As List = touches";
_list = [B4IList new];
_list.object = (NSArray*)(_touches);
B4IRDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="sx=-SizeCircle";
__ref->__sx = (float) (-__ref->__sizecircle);
B4IRDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="sy=-SizeCircle";
__ref->__sy = (float) (-__ref->__sizecircle);
B4IRDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="If list.Size=1 Then";
if ([_list Size]==1) { 
B4IRDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="Dim t As NativeObject = list.Get(0)";
_t = [B4INativeObject new];
_t.object = (NSObject*)([_list Get:(int) (0)]);
B4IRDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Dim point As List = NativeMe.RunMethod(\"UITouchT";
_point = [B4IList new];
_point.object = (NSArray*)(([__ref->__nativeme RunMethod:@"UITouchToPoint::" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((_t).object)],[B4I nilToNSNull:[self->___c Sender:self.bi]]]]]).object);
B4IRDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="X = point.Get(0)";
_x = [self.bi ObjectToNumber:[_point Get:(int) (0)]].floatValue;
B4IRDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="Y = point.Get(1)";
_y = [self.bi ObjectToNumber:[_point Get:(int) (1)]].floatValue;
B4IRDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="x = (x - OffsetX)/ xui.Scale";
_x = (float) ((_x-__ref->__offsetx)/(double)[__ref->__xui Scale]);
B4IRDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="y = (y - OffsetY) / xui.Scale";
_y = (float) ((_y-__ref->__offsety)/(double)[__ref->__xui Scale]);
B4IRDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="x = Max(0, Min(ColorBC.mWidth - 1, X))";
_x = (float) (fmax(0,fmin(__ref->__colorbc->__mwidth-1,_x)));
B4IRDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="y = Max(0, Min(ColorBC.mHeight - 1, Y))";
_y = (float) (fmax(0,fmin(__ref->__colorbc->__mheight-1,_y)));
B4IRDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="If SelectionRect.Width > 5 And SelectionRect.Hei";
if ([__ref->__selectionrect Width]>5 && [__ref->__selectionrect Height]>5) { 
B4IRDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Croppe";
[self->___c CallSubDelayed:self.bi :__ref->__mcallback :[@[__ref->__meventname,@"_Cropped"] componentsJoinedByString:@""]];
 };
 }else if([_list Size]==2) { 
 };
B4IRDebugUtils.currentLine=3145752;
 //BA.debugLineNum = 3145752;BA.debugLine="For Each t As NativeObject In list";
_t = [B4INativeObject new];
{
const id<B4IIterable> group19 = _list;
const int groupLen19 = group19.Size
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_t.object = (NSObject*)([group19 Get:index19]);
B4IRDebugUtils.currentLine=3145753;
 //BA.debugLineNum = 3145753;BA.debugLine="fingers.Remove(t)";
[__ref->__fingers Remove:(NSObject*)((_t).object)];
B4IRDebugUtils.currentLine=3145754;
 //BA.debugLineNum = 3145754;BA.debugLine="For i=fingersList.Size-1 To 0 Step -1";
{
const int step21 = -1;
const int limit21 = (int) (0);
_i = (int) ([__ref->__fingerslist Size]-1) ;
for (;_i >= limit21 ;_i = _i + step21 ) {
B4IRDebugUtils.currentLine=3145755;
 //BA.debugLineNum = 3145755;BA.debugLine="Dim t1 As NativeObject = fingersList.Get(i)";
_t1 = [B4INativeObject new];
_t1.object = (NSObject*)([__ref->__fingerslist Get:_i]);
B4IRDebugUtils.currentLine=3145756;
 //BA.debugLineNum = 3145756;BA.debugLine="If t1=t Then fingersList.RemoveAt(i)";
if ([_t1 isEqual:_t]) { 
[__ref->__fingerslist RemoveAt:_i];};
 }
};
 }
};
B4IRDebugUtils.currentLine=3145760;
 //BA.debugLineNum = 3145760;BA.debugLine="UpdateTarget";
[__ref _updatetarget:nil];
B4IRDebugUtils.currentLine=3145762;
 //BA.debugLineNum = 3145762;BA.debugLine="Return True";
if (true) return true;
B4IRDebugUtils.currentLine=3145763;
 //BA.debugLineNum = 3145763;BA.debugLine="End Sub";
return false;
}
- (BOOL)  _pnl_multitouchmoved:(b4i_imageviewcrop*) __ref :(NSObject*) _touches{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"pnl_multitouchmoved"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"pnl_multitouchmoved:" :@[[B4I nilToNSNull:_touches]]]).boolValue;}
float _x = 0.0f;
float _y = 0.0f;
B4IList* _list = nil;
B4INativeObject* _t = nil;
B4IList* _point = nil;
_c_type* _fd = nil;
float _d1 = 0.0f;
float _d2 = 0.0f;
float _ray = 0.0f;
int _diffx = 0;
int _diffy = 0;
B4IRDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub pnl_MultiTouchMoved(touches As Object)";
B4IRDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim X,Y As Float";
_x = 0.0f;
_y = 0.0f;
B4IRDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Dim list As List = touches";
_list = [B4IList new];
_list.object = (NSArray*)(_touches);
B4IRDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="For Each t As NativeObject In list";
_t = [B4INativeObject new];
{
const id<B4IIterable> group3 = _list;
const int groupLen3 = group3.Size
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_t.object = (NSObject*)([group3 Get:index3]);
B4IRDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Dim point As List = NativeMe.RunMethod(\"UITouchT";
_point = [B4IList new];
_point.object = (NSArray*)(([__ref->__nativeme RunMethod:@"UITouchToPoint::" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((_t).object)],[B4I nilToNSNull:[self->___c Sender:self.bi]]]]]).object);
B4IRDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="If fingers.ContainsKey(t) Then";
if ([__ref->__fingers ContainsKey:(NSObject*)((_t).object)]) { 
B4IRDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="Dim fd As C_Type = fingers.Get(t)";
_fd = (_c_type*)([__ref->__fingers Get:(NSObject*)((_t).object)]);
B4IRDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="fd.x = point.Get(0)";
_fd->_X = [self.bi ObjectToNumber:[_point Get:(int) (0)]].intValue;
B4IRDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="fd.y = point.Get(1)";
_fd->_Y = [self.bi ObjectToNumber:[_point Get:(int) (1)]].intValue;
B4IRDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="fingers.Put(t,fd)";
[__ref->__fingers Put:(NSObject*)((_t).object) :(NSObject*)(_fd)];
 };
 }
};
B4IRDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="If fingersList.Size>1 Then";
if ([__ref->__fingerslist Size]>1) { 
B4IRDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="Dim fd As C_Type = fingers.Get(fingersList.Get(0";
_fd = (_c_type*)([__ref->__fingers Get:[__ref->__fingerslist Get:(int) (0)]]);
B4IRDebugUtils.currentLine=3080209;
 //BA.debugLineNum = 3080209;BA.debugLine="X = fd.X";
_x = (float) (_fd->_X);
B4IRDebugUtils.currentLine=3080210;
 //BA.debugLineNum = 3080210;BA.debugLine="Y = fd.y";
_y = (float) (_fd->_Y);
B4IRDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="Dim fd As C_Type = fingers.Get(fingersList.Get(1";
_fd = (_c_type*)([__ref->__fingers Get:[__ref->__fingerslist Get:(int) (1)]]);
B4IRDebugUtils.currentLine=3080212;
 //BA.debugLineNum = 3080212;BA.debugLine="sx = fd.X";
__ref->__sx = (float) (_fd->_X);
B4IRDebugUtils.currentLine=3080213;
 //BA.debugLineNum = 3080213;BA.debugLine="sy = fd.y";
__ref->__sy = (float) (_fd->_Y);
 }else {
B4IRDebugUtils.currentLine=3080215;
 //BA.debugLineNum = 3080215;BA.debugLine="Dim fd As C_Type = fingers.Get(fingersList.Get(0)";
_fd = (_c_type*)([__ref->__fingers Get:[__ref->__fingerslist Get:(int) (0)]]);
B4IRDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="X = fd.X";
_x = (float) (_fd->_X);
B4IRDebugUtils.currentLine=3080217;
 //BA.debugLineNum = 3080217;BA.debugLine="Y = fd.y";
_y = (float) (_fd->_Y);
 };
B4IRDebugUtils.currentLine=3080220;
 //BA.debugLineNum = 3080220;BA.debugLine="Select Operation";
switch ([self.bi switchObjectToInt:@(__ref->__operation) :@[@((int) (0)),@((int) (1))]]) {
case 0: {
B4IRDebugUtils.currentLine=3080226;
 //BA.debugLineNum = 3080226;BA.debugLine="Log(\"X:\" & X & \"    Y:\" & Y)";
[self->___c Log:[@[@"X:",[self.bi NumberToString:@(_x)],@"    Y:",[self.bi NumberToString:@(_y)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=3080228;
 //BA.debugLineNum = 3080228;BA.debugLine="x = Max(0, Min(ColorBC.mWidth - 1, X))";
_x = (float) (fmax(0,fmin(__ref->__colorbc->__mwidth-1,_x)));
B4IRDebugUtils.currentLine=3080229;
 //BA.debugLineNum = 3080229;BA.debugLine="y = Max(0, Min(ColorBC.mHeight - 1, Y))";
_y = (float) (fmax(0,fmin(__ref->__colorbc->__mheight-1,_y)));
B4IRDebugUtils.currentLine=3080231;
 //BA.debugLineNum = 3080231;BA.debugLine="Dim D1 As Float = Sqrt(Power(Xi-X,2)+Power(Yi-Y";
_d1 = (float) (sqrt(pow(__ref->__xi-_x,2)+pow(__ref->__yi-_y,2)));
B4IRDebugUtils.currentLine=3080232;
 //BA.debugLineNum = 3080232;BA.debugLine="Dim D2 As Float = Sqrt(Power(Xf-X,2)+Power(Yf-Y";
_d2 = (float) (sqrt(pow(__ref->__xf-_x,2)+pow(__ref->__yf-_y,2)));
B4IRDebugUtils.currentLine=3080234;
 //BA.debugLineNum = 3080234;BA.debugLine="If D1<D2 Then";
if (_d1<_d2) { 
B4IRDebugUtils.currentLine=3080235;
 //BA.debugLineNum = 3080235;BA.debugLine="Xi=X";
__ref->__xi = _x;
B4IRDebugUtils.currentLine=3080236;
 //BA.debugLineNum = 3080236;BA.debugLine="Yi=y";
__ref->__yi = _y;
 }else {
B4IRDebugUtils.currentLine=3080240;
 //BA.debugLineNum = 3080240;BA.debugLine="Xf=X";
__ref->__xf = _x;
B4IRDebugUtils.currentLine=3080241;
 //BA.debugLineNum = 3080241;BA.debugLine="Yf=y";
__ref->__yf = _y;
 };
B4IRDebugUtils.currentLine=3080246;
 //BA.debugLineNum = 3080246;BA.debugLine="If CropMode=\"Circle\" Then";
if ([__ref->__cropmode isEqual:@"Circle"]) { 
B4IRDebugUtils.currentLine=3080247;
 //BA.debugLineNum = 3080247;BA.debugLine="Dim Ray As Float = Min(Abs(Xf-Xi),Abs(Yf-Yi))";
_ray = (float) (fmin(fabs(__ref->__xf-__ref->__xi),fabs(__ref->__yf-__ref->__yi)));
B4IRDebugUtils.currentLine=3080248;
 //BA.debugLineNum = 3080248;BA.debugLine="SelectionRect.Left = (Xi+Xf-Ray)/2";
[__ref->__selectionrect setLeft:(float) ((__ref->__xi+__ref->__xf-_ray)/(double)2)];
B4IRDebugUtils.currentLine=3080249;
 //BA.debugLineNum = 3080249;BA.debugLine="SelectionRect.Width=Ray";
[__ref->__selectionrect setWidth:_ray];
B4IRDebugUtils.currentLine=3080250;
 //BA.debugLineNum = 3080250;BA.debugLine="SelectionRect.Top= (Yi+Yf-Ray)/2";
[__ref->__selectionrect setTop:(float) ((__ref->__yi+__ref->__yf-_ray)/(double)2)];
B4IRDebugUtils.currentLine=3080251;
 //BA.debugLineNum = 3080251;BA.debugLine="SelectionRect.Height=Ray";
[__ref->__selectionrect setHeight:_ray];
 }else {
B4IRDebugUtils.currentLine=3080253;
 //BA.debugLineNum = 3080253;BA.debugLine="SelectionRect.Left = Min(Xi, Xf)";
[__ref->__selectionrect setLeft:(float) (fmin(__ref->__xi,__ref->__xf))];
B4IRDebugUtils.currentLine=3080254;
 //BA.debugLineNum = 3080254;BA.debugLine="SelectionRect.Top = Min(Yi,Yf)";
[__ref->__selectionrect setTop:(float) (fmin(__ref->__yi,__ref->__yf))];
B4IRDebugUtils.currentLine=3080255;
 //BA.debugLineNum = 3080255;BA.debugLine="SelectionRect.Right = Max(Xi, Xf)";
[__ref->__selectionrect setRight:(float) (fmax(__ref->__xi,__ref->__xf))];
B4IRDebugUtils.currentLine=3080256;
 //BA.debugLineNum = 3080256;BA.debugLine="SelectionRect.Bottom = Max(Yi,Yf)";
[__ref->__selectionrect setBottom:(float) (fmax(__ref->__yi,__ref->__yf))];
 };
 break; }
case 1: {
B4IRDebugUtils.currentLine=3080259;
 //BA.debugLineNum = 3080259;BA.debugLine="Dim Diffx As Int = x-sx";
_diffx = (int) (_x-__ref->__sx);
B4IRDebugUtils.currentLine=3080260;
 //BA.debugLineNum = 3080260;BA.debugLine="Dim Diffy As Int = y-sy";
_diffy = (int) (_y-__ref->__sy);
B4IRDebugUtils.currentLine=3080261;
 //BA.debugLineNum = 3080261;BA.debugLine="sx=X";
__ref->__sx = _x;
B4IRDebugUtils.currentLine=3080262;
 //BA.debugLineNum = 3080262;BA.debugLine="sy=y";
__ref->__sy = _y;
B4IRDebugUtils.currentLine=3080264;
 //BA.debugLineNum = 3080264;BA.debugLine="ImageView1.Left=ImageView1.Left+Diffx";
[__ref->__imageview1 setLeft:(float) ([__ref->__imageview1 Left]+_diffx)];
B4IRDebugUtils.currentLine=3080265;
 //BA.debugLineNum = 3080265;BA.debugLine="ImageView1.Top=ImageView1.Top+Diffy";
[__ref->__imageview1 setTop:(float) ([__ref->__imageview1 Top]+_diffy)];
 break; }
}
;
B4IRDebugUtils.currentLine=3080268;
 //BA.debugLineNum = 3080268;BA.debugLine="CropBC=generateCropImage";
__ref->__cropbc = [__ref _generatecropimage:nil];
B4IRDebugUtils.currentLine=3080269;
 //BA.debugLineNum = 3080269;BA.debugLine="UpdateTarget";
[__ref _updatetarget:nil];
B4IRDebugUtils.currentLine=3080271;
 //BA.debugLineNum = 3080271;BA.debugLine="Return True";
if (true) return true;
B4IRDebugUtils.currentLine=3080272;
 //BA.debugLineNum = 3080272;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _redraw:(b4i_imageviewcrop*) __ref :(BOOL) _resetcrop{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"redraw"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"redraw:" :@[@(_resetcrop)]]);}
B4XBitmapWrapper* _fitbitmap = nil;
int _wz = 0;
int _hz = 0;
B4IRDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub ReDraw(ResetCrop As Boolean)";
B4IRDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="RotateBmp=OriginalBmp.Rotate(Degree)";
__ref->__rotatebmp = [__ref->__originalbmp Rotate:(int) (__ref->__degree)];
B4IRDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Dim FitBitmap As B4XBitmap = OriginalBmp.Resize(p";
_fitbitmap = [B4XBitmapWrapper new];
_fitbitmap = [__ref->__originalbmp Resize:[__ref->__pnl Width] :[__ref->__pnl Height] :true];
B4IRDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Dim Wz As Int = FitBitmap.Width * Zoom";
_wz = (int) ([_fitbitmap Width]*__ref->__zoom);
B4IRDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Dim Hz As Int = FitBitmap.Height * Zoom";
_hz = (int) ([_fitbitmap Height]*__ref->__zoom);
B4IRDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="pnl.SetLayoutAnimated(0, (mBase.Width-Wz)/2,(mBas";
[__ref->__pnl SetLayoutAnimated:(int) (0) :(float) (([__ref->__mbase Width]-_wz)/(double)2) :(float) (([__ref->__mbase Height]-_hz)/(double)2) :(float) (_wz) :(float) (_hz)];
B4IRDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="ImageView1.SetLayoutAnimated(0,1, (mBase.Width-Wz";
[__ref->__imageview1 SetLayoutAnimated:(int) (0) :(float) (1) :(float) (([__ref->__mbase Width]-_wz)/(double)2) :(float) (([__ref->__mbase Height]-_hz)/(double)2) :(float) (_wz) :(float) (_hz)];
B4IRDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="OffsetX = (mBase.Width-Wz)/2";
__ref->__offsetx = (int) (([__ref->__mbase Width]-_wz)/(double)2);
B4IRDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="OffsetY = (mBase.Height-Hz)/2";
__ref->__offsety = (int) (([__ref->__mbase Height]-_hz)/(double)2);
B4IRDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="OriginalX=FitBitmap.Width";
__ref->__originalx = (int) ([_fitbitmap Width]);
B4IRDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="OriginalY=FitBitmap.Height";
__ref->__originaly = (int) ([_fitbitmap Height]);
B4IRDebugUtils.currentLine=2949139;
 //BA.debugLineNum = 2949139;BA.debugLine="ColorBC.Initialize(FitBitmap.Width / FitBitmap.Sc";
[__ref->__colorbc _initialize:self.bi :(int) ([_fitbitmap Width]/(double)[_fitbitmap Scale]) :(int) ([_fitbitmap Height]/(double)[_fitbitmap Scale])];
B4IRDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="ColorBC.CopyPixelsFromBitmap(FitBitmap)";
[__ref->__colorbc _copypixelsfrombitmap:_fitbitmap];
B4IRDebugUtils.currentLine=2949142;
 //BA.debugLineNum = 2949142;BA.debugLine="SelectionRect.Initialize(0, 0, 0, 0)";
[__ref->__selectionrect Initialize:(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=2949143;
 //BA.debugLineNum = 2949143;BA.debugLine="TargetBC.Initialize(ColorBC.mWidth, ColorBC.mHeig";
[__ref->__targetbc _initialize:self.bi :__ref->__colorbc->__mwidth :__ref->__colorbc->__mheight];
B4IRDebugUtils.currentLine=2949144;
 //BA.debugLineNum = 2949144;BA.debugLine="GreyBC=generateGreyImage";
__ref->__greybc = [__ref _generategreyimage:nil];
B4IRDebugUtils.currentLine=2949145;
 //BA.debugLineNum = 2949145;BA.debugLine="CropBC=generateCropImage";
__ref->__cropbc = [__ref _generatecropimage:nil];
B4IRDebugUtils.currentLine=2949147;
 //BA.debugLineNum = 2949147;BA.debugLine="If ResetCrop Then";
if (_resetcrop) { 
B4IRDebugUtils.currentLine=2949148;
 //BA.debugLineNum = 2949148;BA.debugLine="Xi=-50";
__ref->__xi = (float) (-50);
B4IRDebugUtils.currentLine=2949149;
 //BA.debugLineNum = 2949149;BA.debugLine="Yi=-50";
__ref->__yi = (float) (-50);
B4IRDebugUtils.currentLine=2949150;
 //BA.debugLineNum = 2949150;BA.debugLine="Xf=-50";
__ref->__xf = (float) (-50);
B4IRDebugUtils.currentLine=2949151;
 //BA.debugLineNum = 2949151;BA.debugLine="Yf=-50";
__ref->__yf = (float) (-50);
B4IRDebugUtils.currentLine=2949152;
 //BA.debugLineNum = 2949152;BA.debugLine="sx=-SizeCircle";
__ref->__sx = (float) (-__ref->__sizecircle);
B4IRDebugUtils.currentLine=2949153;
 //BA.debugLineNum = 2949153;BA.debugLine="sy=-SizeCircle";
__ref->__sy = (float) (-__ref->__sizecircle);
 };
B4IRDebugUtils.currentLine=2949155;
 //BA.debugLineNum = 2949155;BA.debugLine="UpdateTarget";
[__ref _updatetarget:nil];
B4IRDebugUtils.currentLine=2949156;
 //BA.debugLineNum = 2949156;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setzoom:(b4i_imageviewcrop*) __ref :(float) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"imageviewcrop";
if ([B4IDebug shouldDelegate: @"setzoom"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setzoom:" :@[@(_value)]]);}
B4IRDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub SetZoom(Value As Float)";
B4IRDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Zoom=Value";
__ref->__zoom = _value;
B4IRDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="ReDraw(True)";
[__ref _redraw:nil :true];
B4IRDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="End Sub";
return @"";
}
- (NSArray*)UITouchToPoint:(UITouch*)t :(UIView*)view {
	CGPoint p = [t locationInView:view];
	return @[@(p.x), @(p.y)];
}
@end

@implementation B4IPanelView (override)

- (void)touchesBegan:(NSSet *)touches withEvent:(UIEvent *)event {
    if ([B4IObjectWrapper raiseEvent:self :@"_multitouchbegan:" :@[[touches allObjects]]] == false)
        [super touchesMoved:touches withEvent:event];
}

- (void)touchesMoved:(NSSet *)touches withEvent:(UIEvent *)event {
    if ([B4IObjectWrapper raiseEvent:self :@"_multitouchmoved:" :@[[touches allObjects]]] == false)
        [super touchesMoved:touches withEvent:event];
   
}

- (void)touchesEnded:(NSSet *)touches withEvent:(UIEvent *)event {
	if ([B4IObjectWrapper raiseEvent:self :@"_multitouchended:" :@[[touches allObjects]]] == false)
        [super touchesMoved:touches withEvent:event];
}

@end