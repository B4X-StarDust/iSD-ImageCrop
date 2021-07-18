B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=6.3
@EndOfDesignText@
#DesignerProperty: Key: Crop, DisplayName: CROP form, FieldType: String, List: Square|Circle|Ellipse|Star,DefaultValue: Square, Descriptio: Squared or Circled Crop
#Event: Cropped
Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Private Demo As Boolean = True
	Private Const SizePoint As Int = 10dip
	Private Const SizeCircle As Int = 20dip
	
	Private CropMode As String = "Square"
	Private ImageView1 As ImageView
	Private ColorBC, GreyBC, CropBC, TargetBC As BitmapCreator
	Private OriginalBmp, RotateBmp As B4XBitmap
	Private SelectionRect As B4XRect
	Private pnl,GhieraZoom,GhieraRotate As B4XView
	Private OriginalX,OriginalY As Int
	Private OffsetX, OffsetY As Int
	Private Operation As Int = 0 ' 0-Cut 1-Move 
	Private fingers As Map
	Private fingersList As List
	Private Xi,Yi,Xf,Yf,sx,sy As Float
	Private Zoom As Float = 1
	Private ZoomPosition As Float = 0.5
	Private Degree As Float = 0
	
	Private DemoLabel As B4XView
	#IF B4i
		Type C_Type(X As Int,Y As Int,Xf As Int, Yf As Int)
		Private fingers As Map
		Private NativeMe As NativeObject
	#Else IF B4A
	
	#Else IF B4J
	
	#End If
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	ImageView1.Initialize("ImageView1")
	pnl = xui.CreatePanel("pnl")
	GhieraRotate = xui.CreatePanel("GhieraRotate")
	GhieraZoom = xui.CreatePanel("GhieraZoom")
	
	SelectionRect.Initialize(0, 0, 0, 0)
	fingersList.Initialize
	Xi=-50
	Yi=-50
	Xf=-50
	Yf=-50
End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
	CropMode = Props.Get("Crop")
	
	mBase.AddView(ImageView1, 0, 0, 0, 0)
	mBase.AddView(pnl, 0, 0, 0, 0)
	mBase.AddView(GhieraRotate,0,0,0,0)
	mBase.AddView(GhieraZoom,0,0,0,0)
	GhieraRotate.Visible=False
	GhieraZoom.Visible=False
	If Demo Then 
		Dim DL As Label
		DL.Initialize("")
		DemoLabel=DL
		DemoLabel.SetTextAlignment("CENTER","CENTER")
		mBase.AddView(DemoLabel, 0, mBase.Height/2, mBase.Width, 20)
		DL.Text="DEMO VERSION"
		DL.Color=Colors.Gray
		DL.TextColor=Colors.Black
	End If
	
	Base_Resize(mBase.Width, mBase.Height)
	
	#IF B4i
		fingers.Initialize
		'Dim no As NativeObject = pnl
		'no.SetField("multipleTouchEnabled", True)
		NativeMe = Me
	#End If
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	pnl.SetLayoutAnimated(0, 0, 0, Width, Height)
	GhieraZoom.SetLayoutAnimated(0, 0, Height-30, Width, 30)
	GhieraRotate.SetLayoutAnimated(0, 0, 0, Width, 30)
	If Demo Then DemoLabel.SetLayoutAnimated(0, 0,Height/2, Width, 20)
	
	DrawGhieraRotate
	DrawGhieraZoom
End Sub

#Region Public

' Square, Circle, Ellipse,Star cut
Public Sub setCrop (Mode As String)
	Mode=Mode.SubString2(0,1).ToUpperCase & Mode.SubString(1).ToLowerCase
	If Mode="Square" Or Mode="Circle" Or Mode="Ellipse" Or Mode="Star" Then 
		CropMode=Mode
		
		If ColorBC.IsInitialized Then 
			SelectionRect.Initialize(0, 0, 0, 0)
			CropBC=GreyBC
			
			Xi=-50
			Yi=-50
			Xf=-50
			Yf=-50
			sx=-SizeCircle
			sy=-SizeCircle
			UpdateTarget
		End If
	End If
	Operation=0
End Sub

' Set Cut Operation
Public Sub ActiveCutImage
	Operation=0
End Sub

' Set Move Operation
Public Sub ActiveMoveImage
	Operation=1
End Sub

' Set Rotation Operation
Public Sub ActiveRotateImage
	GhieraRotate.Visible=Not(GhieraRotate.visible)
End Sub

' Sett Zoom Operation
Public Sub ActiveZoomImage
	If GhieraZoom.Visible Then
		GhieraZoom.Visible=False
	Else
		SelectionRect.Initialize(0, 0, 0, 0)
		CropBC=GreyBC
		Yi=-50
		Xf=-50
		Yf=-50
		sx=-SizeCircle
		sy=-SizeCircle
		GhieraZoom.Visible=True
	End If

	UpdateTarget
End Sub

' Square, Circle or Ellipse
Public Sub getCrop As String
	Return CropMode
End Sub

' Set Imag
Public Sub setBitmap (bmp As B4XBitmap)
	OriginalBmp = bmp
	Degree=0
	ReDraw(True)
End Sub

' Set Degree rotation
Public Sub setRotation(DegreeValue As Float)
	Degree=DegreeValue
	ReDraw(True)
End Sub

Public Sub getRotation As Float
	Return Degree
End Sub

' Set Zoom 100% - Fill display
Public Sub ResetZoom
	Zoom=1
	ReDraw(True)
End Sub

' Value 0.5=50% 1=100% 2=200%
Public Sub SetZoom(Value As Float)
	Zoom=Value
	ReDraw(True)
End Sub

Public Sub getCroppedBitmap As Bitmap
	Dim Fx As Float = RotateBmp.Width / TargetBC.mWidth
	Dim Fy As Float = RotateBmp.Height / TargetBC.mHeight
	
	Select CropMode
		Case "Square"
			Return RotateBmp.Crop(SelectionRect.Left * Fx, SelectionRect.Top * Fy, SelectionRect.Width * Fx, SelectionRect.Height * Fy)
		Case "Ellipse"
			Return CreateRoundBitmap(RotateBmp.Crop(SelectionRect.Left * Fx, SelectionRect.Top * Fy, SelectionRect.Width * Fx, SelectionRect.Height * Fy))
		Case "Circle"
			Return CreateRoundBitmap(RotateBmp.Crop(SelectionRect.Left * Fx, SelectionRect.Top * Fy, SelectionRect.Width * Fx, SelectionRect.Height * Fy))
		Case "Star"
			Return CreateStarBitmap(RotateBmp.Crop(SelectionRect.Left * Fx, SelectionRect.Top * Fy, SelectionRect.Width * Fx, SelectionRect.Height * Fy))
		Case Else
			Return RotateBmp.Crop(SelectionRect.Left * Fx, SelectionRect.Top * Fy, SelectionRect.Width * Fx, SelectionRect.Height * Fy)
	End Select
End Sub

public Sub FillImageToView(bmp As B4XBitmap, ImageVw As B4XView)
	Dim bmpRatio As Float = bmp.Width / bmp.Height
	Dim viewRatio As Float = ImageView1.Width / ImageView1.Height
	If viewRatio > bmpRatio Then
		Dim NewHeight As Int = bmp.Width / viewRatio
		bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight / 2, bmp.Width, NewHeight)
	Else if viewRatio < bmpRatio Then
		Dim NewWidth As Int = bmp.Height * viewRatio
		bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2, 0, NewWidth, bmp.Height)
	End If
	ImageVw.SetBitmap(bmp.Resize(ImageView1.Width, ImageView1.Height, True))
End Sub

#End Region

#Region Private

Private Sub generateGreyImage As BitmapCreator
	Dim Image As BitmapCreator
	Image.Initialize(ColorBC.mWidth, ColorBC.mHeight)
	
	'greyscale
	Dim argb As ARGBColor
	For x = 0 To ColorBC.mWidth - 1
		For y = 0 To ColorBC.mHeight - 1
			ColorBC.GetARGB(x, y, argb)
			Dim c As Int = argb.r * 0.21 + argb.g * 0.72 + 0.07 * argb.b
			argb.r = c
			argb.g = c
			argb.b = c
			argb.a=160
			Image.SetARGB(x, y, argb)
		Next
	Next
	Return Image
End Sub

Private Sub generateCropImage As BitmapCreator
	Dim Image As BitmapCreator
	If CropMode="Square" Then 
		Image.Initialize(SelectionRect.Width,SelectionRect.Height)
		Image.DrawBitmapCreator(ColorBC,SelectionRect,0,0,True)
	else If CropMode="Ellipse" And (SelectionRect.Width > 1 And SelectionRect.Height > 1) Then
		Image.Initialize(SelectionRect.Width,SelectionRect.Height)
		Image.DrawBitmapCreator(ColorBC,SelectionRect,0,0,True)
		Image=CreateRoundBitmapCreator(Image)
	else If CropMode="Circle" And (SelectionRect.Width > 1 And SelectionRect.Height > 1) Then
		Dim Ray As Float = Min(Abs(SelectionRect.Right-SelectionRect.Left),Abs(SelectionRect.Bottom-SelectionRect.Top))

		SelectionRect.left = SelectionRect.CenterX - Ray/2
		SelectionRect.Width=Ray
		SelectionRect.Top = SelectionRect.CenterY - Ray/2
		SelectionRect.Height=Ray
		
		Image.Initialize(Ray,Ray)
		Image.DrawBitmapCreator(ColorBC,SelectionRect,0,0,True)
		Image=CreateRoundBitmapCreator(Image)
	else if CropMode="Star"  And (SelectionRect.Width > 1 And SelectionRect.Height > 1) Then
		Image.Initialize(SelectionRect.Width,SelectionRect.Height)
		Image=CreateStarBitmapCreator(ColorBC)
	End If 
	
	Return Image
End Sub

Private Sub CreateRoundBitmapCreator(Image As BitmapCreator) As BitmapCreator
	Dim Can As B4XCanvas
	Dim xview As B4XView = xui.CreatePanel("")
	xview.SetLayoutAnimated(0, 0, 0, SelectionRect.Width, SelectionRect.Height)
	Can.Initialize(xview)
	Dim path As B4XPath
	path.InitializeOval(Can.TargetRect)
	Can.ClipPath(path)
	Dim Bm As B4XBitmap = Image.Bitmap
	Bm=Bm.Resize(SelectionRect.Width, SelectionRect.Height, False)
	Can.DrawBitmap(Bm, Can.TargetRect)
	Can.RemoveClip
	Can.Invalidate
	Dim res As B4XBitmap = Can.CreateBitmap
	Can.Release
	
	Dim BC As BitmapCreator
	BC.Initialize(res.Width,res.Height)
	BC.DrawBitmap(res,BC.TargetRect,True)
	Return BC
End Sub

Private Sub CreateStarBitmapCreator(Image As BitmapCreator) As BitmapCreator
	Dim Can As B4XCanvas
	Dim xview As B4XView = xui.CreatePanel("")
	xview.SetLayoutAnimated(0, 0, 0, SelectionRect.Width, SelectionRect.Height)
	Can.Initialize(xview)
	Dim path As B4XPath

	' Create Path	
	Dim xx As Float = SelectionRect.CenterX-SelectionRect.Left
	Dim yy As Float = SelectionRect.CenterY-SelectionRect.Top
	Dim Ray As Float = Min(SelectionRect.Width,SelectionRect.Height)/2
	For i=0 To 9
		If i=0 Then 
			path.Initialize(xx+Ray*CosD(-90+i*36),yy+Ray*SinD(-90+i*36))
		else If i/2=Floor(i/2) Then
			path.LineTo(xx+Ray*CosD(-90+i*36),yy+Ray*SinD(-90+i*36))
		Else
			path.LineTo(xx+Ray*CosD(-90+i*36)/2,yy+Ray*SinD(-90+i*36)/2)
		End If
	Next

	Can.ClipPath(path)
	Dim Bm As B4XBitmap = Image.Bitmap
	Bm=Bm.Resize(SelectionRect.Width, SelectionRect.Height, False)
	Can.DrawBitmap(Bm, Can.TargetRect)
	Can.RemoveClip
	Can.Invalidate
	Dim res As B4XBitmap = Can.CreateBitmap
	Can.Release
	
	Dim BC As BitmapCreator
	BC.Initialize(res.Width,res.Height)
	BC.DrawBitmap(res,BC.TargetRect,True)
	Return BC
End Sub

Private Sub CreateRoundBitmap(Image As B4XBitmap) As B4XBitmap
	Dim Can As B4XCanvas
	Dim xview As B4XView = xui.CreatePanel("")
	xview.SetLayoutAnimated(0, 0, 0, Image.Width, Image.Height)
	Can.Initialize(xview)
	Dim path As B4XPath
	path.InitializeOval(Can.TargetRect)
	Can.ClipPath(path)
	Can.DrawBitmap(Image, Can.TargetRect)
	Can.RemoveClip
	Can.Invalidate
	Dim res As B4XBitmap = Can.CreateBitmap
	Can.Release
	
	Return res
End Sub

Private Sub CreateStarBitmap(Image As B4XBitmap) As B4XBitmap
	Dim Can As B4XCanvas
	Dim xview As B4XView = xui.CreatePanel("")
	xview.SetLayoutAnimated(0, 0, 0, Image.Width, Image.Height)
	Can.Initialize(xview)
	Dim path As B4XPath
	path.InitializeOval(Can.TargetRect)
	
	'Create Path
	Dim xx As Float = Can.TargetRect.CenterX
	Dim yy As Float = Can.TargetRect.CenterY
	Dim Ray As Float = Min(Can.TargetRect.Width,Can.TargetRect.Height)/2
	For i=0 To 9
		If i=0 Then
			path.Initialize(xx+Ray*CosD(-90+i*36),yy+Ray*SinD(-90+i*36))
		else If i/2=Floor(i/2) Then
			path.LineTo(xx+Ray*CosD(-90+i*36),yy+Ray*SinD(-90+i*36))
		Else
			path.LineTo(xx+Ray*CosD(-90+i*36)/2,yy+Ray*SinD(-90+i*36)/2)
		End If
	Next
	
	Can.ClipPath(path)
	Can.DrawBitmap(Image, Can.TargetRect)
	Can.RemoveClip
	Can.Invalidate
	Dim res As B4XBitmap = Can.CreateBitmap
	Can.Release
	
	Return res
End Sub

Private Sub UpdateTarget
	'control Imageview movement
	ImageView1.Left=Min(ImageView1.Left,OffsetX)
	ImageView1.top=Min(ImageView1.top,OffsetY)
	If mBase.Width<=ImageView1.Width Then
		ImageView1.Left=Max(ImageView1.Left,mBase.Width-ImageView1.Width)
	Else
		ImageView1.Left=Max(ImageView1.Left,(mBase.Width-ImageView1.Width)/2)
	End If
	If mBase.Width<=ImageView1.Width Then
		ImageView1.Top=Max(ImageView1.Top,mBase.Height-ImageView1.Height)
	Else
		ImageView1.Top=Max(ImageView1.Top,(mBase.Height-ImageView1.Height)/2)
	End If
	
	' Draw
	TargetBC.DrawBitmapCreator(GreyBC, GreyBC.TargetRect, 0, 0, True)
	If SelectionRect.Width>0 And SelectionRect.Height>0 Then 
		TargetBC.DrawBitmapCreator(CropBC,  CropBC.TargetRect, SelectionRect.Left, SelectionRect.Top, False)
		DrawLimit
	End If
	ImageView1.Bitmap=TargetBC.Bitmap
End Sub

Private Sub DrawLimit
	Dim Xxi As Float = Min(Xi,Xf)
	Dim Yyi As Float = Min(Yi,Yf)
	Dim Xxf As Float = Max(Xi,Xf)
	Dim Yyf As Float = Max(Yi,Yf)
	
	' Finger trace
	'DrawCircle(TargetBC,sx,sy,SizeCircle/Zoom,SizeCircle/Zoom,0xFFFFFFFF)
	TargetBC.DrawCircle(sx,sy,SizeCircle/Zoom,0xFFFFFFFF,False,1)
	
	Select CropMode
		Case "Square"
			DrawRhombus(TargetBC,Xi,Yi,Xf,Yf,0xFFCCCCCC)
		Case "Ellipse"
			DrawRhombus(TargetBC,Xi,Yi,Xf,Yf,0xFFCCCCCC)
			DrawCircle(TargetBC,(Xi+Xf)/2,(Yi+Yf)/2,Abs(Xf-Xi)/2,Abs(Yf-Yi)/2,0xFFFFFFFF)
		Case "Circle"
			DrawRhombus(TargetBC,Xi,Yi,Xf,Yf,0xFFCCCCCC)
			Dim Ray As Float = Min(Abs(Xf-Xi)/2,Abs(Yf-Yi)/2)
			DrawCircle(TargetBC,(Xi+Xf)/2,(Yi+Yf)/2,Ray,Ray,0xFFFFFFFF)
		Case "Star"
			Dim L As List
			L.Initialize
			
			Dim xx As Float = (Xf+Xi)/2
			Dim yy As Float = (Yf+Yi)/2
			Dim Ray As Float = Min(Abs(Xf-Xi),Abs(Yf-Yi))/2
			For i=0 To 9
				If i/2=Floor(i/2) Then 
					L.Add(xx+Ray*CosD(-90+i*36))
					L.Add(yy+Ray*SinD(-90+i*36))
				Else
					L.Add(xx+Ray*CosD(-90+i*36)/2)
					L.Add(yy+Ray*SinD(-90+i*36)/2)
				End If
			Next
			
			DrawRhombus(TargetBC,Xi,Yi,Xf,Yf,0xFFCCCCCC)
			DrawPath(TargetBC,L,0xFFFFFFFF)
	End Select
	
	' Border
	Drawline(TargetBC,Xxi,Yyi+1,Xxi+SizePoint,Yyi+1,0xFFFFFFFF)
	Drawline(TargetBC,Xxi,Yyi+2,Xxi+SizePoint,Yyi+2,0xFFFFFFFF)
	
	Drawline(TargetBC,Xxi+1,Yyi,Xxi+1,Yyi+SizePoint,0xFFFFFFFF)
	Drawline(TargetBC,Xxi+2,Yyi,Xxi+2,Yyi+SizePoint,0xFFFFFFFF)
	
	
	Drawline(TargetBC,Xxf,Yyf-1,Xxf-SizePoint,Yyf-1,0xFFFFFFFF)
	Drawline(TargetBC,Xxf,Yyf-2,Xxf-SizePoint,Yyf-2,0xFFFFFFFF)
	
	Drawline(TargetBC,Xxf-1,Yyf,Xxf-1,Yyf-SizePoint,0xFFFFFFFF)
	Drawline(TargetBC,Xxf-2,Yyf,Xxf-2,Yyf-SizePoint,0xFFFFFFFF)
End Sub

Private Sub DrawCircle(BC As BitmapCreator, x As Int, y As Int, RadialX As Int, RadialY As Int , BorderColor As Int)
	Dim X1 As Double = X + RadialX * CosD(0)
	Dim Y1 As Double = Y + RadialY * SinD(0)
  
	For i=1 To 720
		Dim X2 As Double = X + RadialX * CosD(i/2)
		Dim Y2 As Double = Y + RadialY * SinD(i/2)
		Drawline(BC,X1,Y1,X2,Y2,BorderColor)
		X1 = X2
		Y1 = Y2
	Next
End Sub

Private Sub DrawRhombus(BC As BitmapCreator, Xin As Int, Yin As Int , Xfin As Int, Yfin As Int, Color As Int)
	Drawline(BC,Xin,Yin,Xfin,Yin, Color)
	Drawline(BC,Xin,Yfin,Xfin,Yfin, Color)
	Drawline(BC,Xin,Yin,Xin,Yfin,Color)
	Drawline(BC,Xfin,Yin,Xfin,Yfin,Color)
End Sub

Private Sub DrawPath(BC As BitmapCreator, ListPoint As List, Color As Int)
	Dim Px(ListPoint.Size/2) As Float
	Dim Py(ListPoint.Size/2) As Float
	
	For i=0 To ListPoint.Size-1 Step 2
		Px(i/2)=ListPoint.Get(i)
		Py(i/2)=ListPoint.Get(i+1)
	Next
	
	For i=0 To (ListPoint.Size/2)-1
		If i=(ListPoint.Size/2)-1 Then 
			Drawline(BC,Px(i),Py(i),Px(0),Py(0), Color)
		Else
			Drawline(BC,Px(i),Py(i),Px(i+1),Py(i+1), Color)
		End If
	Next
End Sub

Private Sub DrawRec(BC As BitmapCreator, Xin As Int, Yin As Int , Xfin As Int, Yfin As Int, Color As Int, ColorBackgroud As Int, Fill As Boolean) 'ignore
	If Fill Then 
		For i=Yin To Yfin
			Drawline(BC,Xin,i,Xfin,i, ColorBackgroud)
		Next
	End If
	Drawline(BC,Xin,Yin,Xfin,Yin, Color)
	Drawline(BC,Xin,Yfin,Xfin,Yfin, Color)
	Drawline(BC,Xin,Yin,Xin,Yfin,Color)
	Drawline(BC,Xfin,Yin,Xfin,Yfin,Color)
End Sub

Private Sub Drawline(BC As BitmapCreator, x1 As Int, y1 As Int, x2 As Int, y2 As Int, Color As Int)
	Dim Dx,Dy,Diff As Int
	Dim x,y As Float
 
	Dx = x2 - x1
	Dy = y2 - y1
	Diff=Max(Abs(Dx),Abs(Dy))
	For D=0 To Diff
		x= x1 + Dx*D/Diff
		y = y1 + Dy*D/Diff
		If (x>=0 And x<BC.mWidth) And (y>=0 And y<BC.mHeight) Then BC.SetColor(x,y,Color)
	Next
End Sub

Private Sub DrawGhieraZoom
	Dim Sp As Float = GhieraZoom.Width/12
	Dim Can As B4XCanvas
	
	Can.Initialize(GhieraZoom)
	Can.ClearRect(Can.TargetRect)
	Can.DrawRect(Can.TargetRect,xui.Color_ARGB(200,255,255,255),True,1)
	
	For i=1 To 11
		If i=6 Then 
			Can.DrawLine(i*Sp,0,i*Sp,GhieraZoom.Height,xui.Color_Blue,1)
			Can.DrawLine(i*Sp+1,0,i*Sp+1,GhieraZoom.Height,xui.Color_LightGray,2)
		Else 
			Can.DrawLine(i*Sp,0,i*Sp,GhieraZoom.Height/2,xui.Color_DarkGray,1)
			Can.DrawLine(i*Sp+1,0,i*Sp+1,GhieraZoom.Height/2,xui.Color_LightGray,1)
		End If
	Next
	
	Can.DrawCircle(ZoomPosition*GhieraZoom.Width,GhieraZoom.Height/2,GhieraZoom.Height/3,xui.Color_ARGB(100,50,50,100),True,1)
	
	Can.Invalidate
	Can.Release
End Sub

Private Sub DrawGhieraRotate
	Dim Sp As Float = GhieraRotate.Width/24
	Dim Can As B4XCanvas
	
	Can.Initialize(GhieraRotate)
	Can.ClearRect(Can.TargetRect)
	Can.DrawRect(Can.TargetRect,xui.Color_ARGB(150,150,150,150),True,1)
	
	For i=1 To 23
		If i=12 Then 
			Can.DrawLine(i*Sp-1,5,i*Sp,GhieraRotate.Height,xui.Color_Yellow,2)
			Can.DrawLine(i*Sp+1,5,i*Sp+1,GhieraRotate.Height,xui.Color_White,1)
		Else 
			Can.DrawLine(i*Sp,GhieraRotate.Height*0.25,i*Sp,GhieraRotate.Height*0.75,xui.Color_DarkGray,1)
			Can.DrawLine(i*Sp+1,GhieraRotate.Height*0.25,i*Sp+1,GhieraRotate.Height*0.75,xui.Color_White,1)
		End If
	Next
	Can.DrawCircle((Bit.FMod(Degree+180,360)/360)*GhieraRotate.Width,GhieraRotate.Height/2,GhieraRotate.Height/3,xui.Color_ARGB(150,0,200,200),True,1)
	
	Can.Invalidate
	Can.Release
End Sub

#End Region									

#Region DrawCircle

Private Sub ReDraw(ResetCrop As Boolean)
	RotateBmp=OriginalBmp.Rotate(Degree)
	Dim FitBitmap As B4XBitmap = OriginalBmp.Resize(pnl.Width, pnl.Height, True)
	Dim Wz As Int = FitBitmap.Width * Zoom
	Dim Hz As Int = FitBitmap.Height * Zoom
	
	pnl.SetLayoutAnimated(0, (mBase.Width-Wz)/2,(mBase.Height-Hz)/2,Wz,Hz)
	ImageView1.SetLayoutAnimated(0,1, (mBase.Width-Wz)/2,(mBase.Height-Hz)/2,Wz,Hz)
	OffsetX = (mBase.Width-Wz)/2
	OffsetY = (mBase.Height-Hz)/2
	OriginalX=FitBitmap.Width
	OriginalY=FitBitmap.Height
	'Dim newLeft As Int = OffsetX+(1-Zoom)*OriginalX/2
	'Dim newTop As Int = OffsetY+(1-Zoom)*OriginalY/2
	'Dim newWidth As Int = OriginalX*Zoom
	'Dim newHeight As Int = OriginalY*Zoom
	'ImageView1.SetLayoutAnimated(0, 1, newLeft,newTop,newWidth,newHeight)
	
	'ImageView1.SetLayoutAnimated(0, 1,OffsetX, OffsetY, OriginalX, OriginalY)
	ColorBC.Initialize(FitBitmap.Width / FitBitmap.Scale, FitBitmap.Height / FitBitmap.Scale)
	ColorBC.CopyPixelsFromBitmap(FitBitmap)
	
	SelectionRect.Initialize(0, 0, 0, 0)
	TargetBC.Initialize(ColorBC.mWidth, ColorBC.mHeight)
	GreyBC=generateGreyImage
	CropBC=generateCropImage
	
	If ResetCrop Then
		Xi=-50
		Yi=-50
		Xf=-50
		Yf=-50
		sx=-SizeCircle
		sy=-SizeCircle
	End If
	UpdateTarget
End Sub

#End Region

#Region Touch

Private Sub pnl_MultiTouchBegan(touches As Object) As Boolean
	Dim X,Y As Float
	Dim list As List = touches
		
	For Each t As NativeObject In list
		Dim point As List = NativeMe.RunMethod("UITouchToPoint::", Array(t, Sender))
		Dim fd As C_Type
		fd.X = point.Get(0)
		fd.Y = point.Get(1)
		fingers.Put(t, fd)
		fingersList.Add(t)
	Next
	
	' CROP & MOVE
	Dim fd As C_Type = fingers.Get(fingersList.Get(0))
	
	Select Operation
		Case 0 ' Cut
			X = fd.X
			Y = fd.y
	
			'x = (x - OffsetX)/ xui.Scale
			'y = (y - OffsetY) / xui.Scale
			'x = Max(0, Min(ColorBC.mWidth - 1, X))
			'y = Max(0, Min(ColorBC.mHeight - 1, Y))
		
			Dim D1 As Float = Sqrt(Power(Xi-X,2)+Power(Yi-Y,2))
			Dim D2 As Float = Sqrt(Power(Xf-X,2)+Power(Yf-Y,2))

			If D1<20dip Or D2<20dip Then
				If D1<D2 Then
					Xi=X
					Yi=y
				Else
					Xf=X
					Yf=y
				End If
			Else
				Xi=X
				Yi=Y
				Xf=X
				Yf=y
				SelectionRect.Initialize(0,0,0,0)
			End If
		Case 1 ' Move
			sx = fd.X
			sy = fd.y
	End Select


	Return True
End Sub

Private Sub pnl_MultiTouchMoved(touches As Object) As Boolean
	Dim X,Y As Float
	Dim list As List = touches
	
	For Each t As NativeObject In list
		Dim point As List = NativeMe.RunMethod("UITouchToPoint::", Array(t, Sender))
		If fingers.ContainsKey(t) Then
			Dim fd As C_Type = fingers.Get(t)
			fd.x = point.Get(0)
			fd.y = point.Get(1)
			fingers.Put(t,fd)
		End If
	Next

	' CROP & MOVE
	If fingersList.Size>1 Then
		Dim fd As C_Type = fingers.Get(fingersList.Get(0))
		X = fd.X
		Y = fd.y
		Dim fd As C_Type = fingers.Get(fingersList.Get(1))
		sx = fd.X
		sy = fd.y
	Else
	Dim fd As C_Type = fingers.Get(fingersList.Get(0))
	X = fd.X
	Y = fd.y
	End If
	
	Select Operation
		Case 0 ' Cut
			'x = (x - OffsetX)/ xui.Scale
			'y = (y - OffsetY) / xui.Scale
			'x=ColorBC.mWidth*X/pnl.Width
			'y=ColorBC.mWidth*y/pnl.Height
			Log("X:" & X & "    Y:" & Y)
			
			x = Max(0, Min(ColorBC.mWidth - 1, X))
			y = Max(0, Min(ColorBC.mHeight - 1, Y))
		
			Dim D1 As Float = Sqrt(Power(Xi-X,2)+Power(Yi-Y,2))
			Dim D2 As Float = Sqrt(Power(Xf-X,2)+Power(Yf-Y,2))

			If D1<D2 Then
				Xi=X
				Yi=y
'				sx=X-SizePoint/2
'				sy=y-SizePoint/2
			Else
				Xf=X
				Yf=y
'				sx=X+SizePoint/2
'				sy=y+SizePoint/2
			End If
		
			If CropMode="Circle" Then
				Dim Ray As Float = Min(Abs(Xf-Xi),Abs(Yf-Yi))
				SelectionRect.Left = (Xi+Xf-Ray)/2
				SelectionRect.Width=Ray
				SelectionRect.Top= (Yi+Yf-Ray)/2
				SelectionRect.Height=Ray
			Else
				SelectionRect.Left = Min(Xi, Xf)
				SelectionRect.Top = Min(Yi,Yf)
				SelectionRect.Right = Max(Xi, Xf)
				SelectionRect.Bottom = Max(Yi,Yf)
			End If
		Case 1 ' Move
			Dim Diffx As Int = x-sx
			Dim Diffy As Int = y-sy
			sx=X
			sy=y
		
			ImageView1.Left=ImageView1.Left+Diffx
			ImageView1.Top=ImageView1.Top+Diffy
	End Select
		
	CropBC=generateCropImage
	UpdateTarget
	
	Return True
End Sub

Private Sub pnl_MultiTouchEnded(touches As Object) As Boolean
	Dim X,Y As Float
	Dim list As List = touches
	
	sx=-SizeCircle
	sy=-SizeCircle
	If list.Size=1 Then
		Dim t As NativeObject = list.Get(0)
		Dim point As List = NativeMe.RunMethod("UITouchToPoint::", Array(t, Sender))
		X = point.Get(0)
		Y = point.Get(1)
			
		x = (x - OffsetX)/ xui.Scale
		y = (y - OffsetY) / xui.Scale
		x = Max(0, Min(ColorBC.mWidth - 1, X))
		y = Max(0, Min(ColorBC.mHeight - 1, Y))
		
		If SelectionRect.Width > 5 And SelectionRect.Height > 5 Then
			CallSubDelayed(mCallBack, mEventName & "_Cropped")
		End If
	Else if list.size=2 Then
		
	End If
	
	For Each t As NativeObject In list
		fingers.Remove(t)
		For i=fingersList.Size-1 To 0 Step -1
			Dim t1 As NativeObject = fingersList.Get(i)
			If t1=t Then fingersList.RemoveAt(i)
		Next
	Next
	
	UpdateTarget
	
	Return True
End Sub

Private Sub GhieraRotate_MultiTouchMoved(touches As Object) As Boolean
	Dim list As List = touches
	Dim X,Y As Float 'ignore
	
	For Each t As NativeObject In list
		Dim point As List = NativeMe.RunMethod("UITouchToPoint::", Array(t, Sender))
		X= point.Get(0)
		Y= point.Get(1)

		Dim D As Float=Bit.FMod(((x/GhieraRotate.Width)+0.5)*360,360)
		setRotation(D)
		'DrawGhieraRotate
	Next
	
	Return True
End Sub

Private Sub GhieraRotate_MultiTouchEnded(touches As Object) As Boolean
	DrawGhieraRotate
	Return True
End Sub

Private Sub GhieraZoom_MultiTouchMoved(touches As Object) As Boolean
	Dim list As List = touches
	Dim X,Y As Float 'ignore
	
	For Each t As NativeObject In list
		Dim point As List = NativeMe.RunMethod("UITouchToPoint::", Array(t, Sender))
		X= point.Get(0)
		Y= point.Get(1)
		ZoomPosition=X/GhieraZoom.Width
		If X<GhieraZoom.Width/2 Then 
			Zoom=Max((x/(GhieraZoom.Width/2)),0.1)
		Else
			Zoom=1+(4*(X-GhieraZoom.Width/2)/(GhieraZoom.Width/2))
		End If
		Dim newLeft As Int = OffsetX+(1-Zoom)*OriginalX/2
		Dim newTop As Int = OffsetY+(1-Zoom)*OriginalY/2
		Dim newWidth As Int = OriginalX*Zoom
		Dim newHeight As Int = OriginalY*Zoom
		ImageView1.SetLayoutAnimated(0,0,newLeft,newTop,newWidth,newHeight)
		DrawGhieraZoom
	Next

	Return True
End Sub

#End Region

#if OBJC
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

#End If