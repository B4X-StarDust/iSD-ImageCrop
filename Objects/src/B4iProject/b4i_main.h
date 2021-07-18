#import "iCore.h"
#import "iXUI.h"
#import "iBitmapCreator.h"
#import "iDebug2.h"
@class _c_type;
@class b4i_imageviewcrop;
@interface b4i_main : B4IStaticModule
{
@public B4IApplicationWrapper* __app;
@public B4INavigationControllerWrapper* __navcontrol;
@public B4IPage* __page1;
@public b4i_imageviewcrop* __imageviewcrop1;
@public B4IImageViewWrapper* __imageview1;

}- (NSString*)  _application_background;
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav;
- (NSString*)  _buttoncircled_click;
- (NSString*)  _buttonellipse_click;
- (NSString*)  _buttonmove_click;
- (NSString*)  _buttonreset_click;
- (NSString*)  _buttonrotation_click;
- (NSString*)  _buttonsquared_click;
- (NSString*)  _buttonstar_click;
- (NSString*)  _buttonzoom100_click;
- (NSString*)  _imageviewcrop1_cropped;
- (NSString*)  _page1_resize:(int) _width :(int) _height;
- (NSString*)  _process_globals;
@property (nonatomic)B4IApplicationWrapper* _app;
@property (nonatomic)B4INavigationControllerWrapper* _navcontrol;
@property (nonatomic)B4IPage* _page1;
@property (nonatomic)b4i_imageviewcrop* _imageviewcrop1;
@property (nonatomic)B4IImageViewWrapper* _imageview1;
@end
