
#import "iCore.h"
@interface LS_layout1:NSObject
@end

@implementation LS_layout1

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Layout1/General script]
[B4ILayoutBuilder scaleAll:views :width :height];

}
@end