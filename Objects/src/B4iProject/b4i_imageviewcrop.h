#import "iCore.h"
#import "iXUI.h"
#import "iBitmapCreator.h"
#import "iDebug2.h"
@class b4i_main;
@class _c_type;
@interface b4i_imageviewcrop : B4IClass
{
@public NSString* __meventname;
@public NSObject* __mcallback;
@public B4XViewWrapper* __mbase;
@public B4IXUI* __xui;
@public BOOL __demo;
@public int __sizepoint;
@public int __sizecircle;
@public NSString* __cropmode;
@public B4IImageViewWrapper* __imageview1;
@public b4i_bitmapcreator* __colorbc;
@public b4i_bitmapcreator* __greybc;
@public b4i_bitmapcreator* __cropbc;
@public b4i_bitmapcreator* __targetbc;
@public B4XBitmapWrapper* __originalbmp;
@public B4XBitmapWrapper* __rotatebmp;
@public B4XRect* __selectionrect;
@public B4XViewWrapper* __pnl;
@public B4XViewWrapper* __ghierazoom;
@public B4XViewWrapper* __ghierarotate;
@public int __originalx;
@public int __originaly;
@public int __offsetx;
@public int __offsety;
@public int __operation;
@public B4IMap* __fingers;
@public B4IList* __fingerslist;
@public float __xi;
@public float __yi;
@public float __xf;
@public float __yf;
@public float __sx;
@public float __sy;
@public float __zoom;
@public float __zoomposition;
@public float __degree;
@public B4XViewWrapper* __demolabel;
@public B4INativeObject* __nativeme;
@public b4i_main* __main;

}- (NSString*)  _activecutimage:(b4i_imageviewcrop*) __ref;
- (NSString*)  _activemoveimage:(b4i_imageviewcrop*) __ref;
- (NSString*)  _activerotateimage:(b4i_imageviewcrop*) __ref;
- (NSString*)  _activezoomimage:(b4i_imageviewcrop*) __ref;
- (NSString*)  _base_resize:(b4i_imageviewcrop*) __ref :(double) _width :(double) _height;
- (NSString*)  _class_globals:(b4i_imageviewcrop*) __ref;
@property (nonatomic)NSString* _meventname;
@property (nonatomic)NSObject* _mcallback;
@property (nonatomic)B4XViewWrapper* _mbase;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)BOOL _demo;
@property (nonatomic)int _sizepoint;
@property (nonatomic)int _sizecircle;
@property (nonatomic)NSString* _cropmode;
@property (nonatomic)B4IImageViewWrapper* _imageview1;
@property (nonatomic)b4i_bitmapcreator* _colorbc;
@property (nonatomic)b4i_bitmapcreator* _greybc;
@property (nonatomic)b4i_bitmapcreator* _cropbc;
@property (nonatomic)b4i_bitmapcreator* _targetbc;
@property (nonatomic)B4XBitmapWrapper* _originalbmp;
@property (nonatomic)B4XBitmapWrapper* _rotatebmp;
@property (nonatomic)B4XRect* _selectionrect;
@property (nonatomic)B4XViewWrapper* _pnl;
@property (nonatomic)B4XViewWrapper* _ghierazoom;
@property (nonatomic)B4XViewWrapper* _ghierarotate;
@property (nonatomic)int _originalx;
@property (nonatomic)int _originaly;
@property (nonatomic)int _offsetx;
@property (nonatomic)int _offsety;
@property (nonatomic)int _operation;
@property (nonatomic)B4IMap* _fingers;
@property (nonatomic)B4IList* _fingerslist;
@property (nonatomic)float _xi;
@property (nonatomic)float _yi;
@property (nonatomic)float _xf;
@property (nonatomic)float _yf;
@property (nonatomic)float _sx;
@property (nonatomic)float _sy;
@property (nonatomic)float _zoom;
@property (nonatomic)float _zoomposition;
@property (nonatomic)float _degree;
@property (nonatomic)B4XViewWrapper* _demolabel;
@property (nonatomic)B4INativeObject* _nativeme;
@property (nonatomic)b4i_main* _main;
- (B4XBitmapWrapper*)  _createroundbitmap:(b4i_imageviewcrop*) __ref :(B4XBitmapWrapper*) _image;
- (b4i_bitmapcreator*)  _createroundbitmapcreator:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _image;
- (B4XBitmapWrapper*)  _createstarbitmap:(b4i_imageviewcrop*) __ref :(B4XBitmapWrapper*) _image;
- (b4i_bitmapcreator*)  _createstarbitmapcreator:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _image;
- (NSString*)  _designercreateview:(b4i_imageviewcrop*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props;
- (NSString*)  _drawcircle:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _bc :(int) _x :(int) _y :(int) _radialx :(int) _radialy :(int) _bordercolor;
- (NSString*)  _drawghierarotate:(b4i_imageviewcrop*) __ref;
- (NSString*)  _drawghierazoom:(b4i_imageviewcrop*) __ref;
- (NSString*)  _drawlimit:(b4i_imageviewcrop*) __ref;
- (NSString*)  _drawline:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _bc :(int) _x1 :(int) _y1 :(int) _x2 :(int) _y2 :(int) _color;
- (NSString*)  _drawpath:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _bc :(B4IList*) _listpoint :(int) _color;
- (NSString*)  _drawrec:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _bc :(int) _xin :(int) _yin :(int) _xfin :(int) _yfin :(int) _color :(int) _colorbackgroud :(BOOL) _fill;
- (NSString*)  _drawrhombus:(b4i_imageviewcrop*) __ref :(b4i_bitmapcreator*) _bc :(int) _xin :(int) _yin :(int) _xfin :(int) _yfin :(int) _color;
- (NSString*)  _fillimagetoview:(b4i_imageviewcrop*) __ref :(B4XBitmapWrapper*) _bmp :(B4XViewWrapper*) _imagevw;
- (b4i_bitmapcreator*)  _generatecropimage:(b4i_imageviewcrop*) __ref;
- (b4i_bitmapcreator*)  _generategreyimage:(b4i_imageviewcrop*) __ref;
- (NSString*)  _getcrop:(b4i_imageviewcrop*) __ref;
- (B4IBitmap*)  _getcroppedbitmap:(b4i_imageviewcrop*) __ref;
- (float)  _getrotation:(b4i_imageviewcrop*) __ref;
- (BOOL)  _ghierarotate_multitouchended:(b4i_imageviewcrop*) __ref :(NSObject*) _touches;
- (BOOL)  _ghierarotate_multitouchmoved:(b4i_imageviewcrop*) __ref :(NSObject*) _touches;
- (BOOL)  _ghierazoom_multitouchmoved:(b4i_imageviewcrop*) __ref :(NSObject*) _touches;
- (NSString*)  _initialize:(b4i_imageviewcrop*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname;
- (BOOL)  _pnl_multitouchbegan:(b4i_imageviewcrop*) __ref :(NSObject*) _touches;
- (BOOL)  _pnl_multitouchended:(b4i_imageviewcrop*) __ref :(NSObject*) _touches;
- (BOOL)  _pnl_multitouchmoved:(b4i_imageviewcrop*) __ref :(NSObject*) _touches;
- (NSString*)  _redraw:(b4i_imageviewcrop*) __ref :(BOOL) _resetcrop;
- (NSString*)  _resetzoom:(b4i_imageviewcrop*) __ref;
- (NSString*)  _setbitmap:(b4i_imageviewcrop*) __ref :(B4XBitmapWrapper*) _bmp;
- (NSString*)  _setcrop:(b4i_imageviewcrop*) __ref :(NSString*) _mode;
- (NSString*)  _setrotation:(b4i_imageviewcrop*) __ref :(float) _degreevalue;
- (NSString*)  _setzoom:(b4i_imageviewcrop*) __ref :(float) _value;
- (NSString*)  _updatetarget:(b4i_imageviewcrop*) __ref;
@end
@interface _c_type:NSObject
{
@public BOOL _IsInitialized;
@public int _X;
@public int _Y;
@public int _Xf;
@public int _Yf;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)int X;
@property (nonatomic)int Y;
@property (nonatomic)int Xf;
@property (nonatomic)int Yf;
-(void)Initialize;
@end
