USE [master]
GO
/****** Object:  Database [CSSMain]    Script Date: 17/06/2021 11:15:04 SA ******/
CREATE DATABASE [CSSMain]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'CSSMain', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\CSSMain.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'CSSMain_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\CSSMain_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CSSMain].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [CSSMain] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [CSSMain] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [CSSMain] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [CSSMain] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [CSSMain] SET ARITHABORT OFF 
GO
ALTER DATABASE [CSSMain] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [CSSMain] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [CSSMain] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [CSSMain] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [CSSMain] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [CSSMain] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [CSSMain] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [CSSMain] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [CSSMain] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [CSSMain] SET  DISABLE_BROKER 
GO
ALTER DATABASE [CSSMain] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [CSSMain] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [CSSMain] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [CSSMain] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [CSSMain] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [CSSMain] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [CSSMain] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [CSSMain] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [CSSMain] SET  MULTI_USER 
GO
ALTER DATABASE [CSSMain] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [CSSMain] SET DB_CHAINING OFF 
GO
ALTER DATABASE [CSSMain] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [CSSMain] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [CSSMain] SET DELAYED_DURABILITY = DISABLED 
GO
USE [CSSMain]
GO
/****** Object:  Table [dbo].[Bill]    Script Date: 17/06/2021 11:15:05 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Bill](
	[idBill] [int] NOT NULL,
	[Email] [nvarchar](100) NULL,
	[Total] [int] NULL,
	[ngayMua] [date] NULL,
	[tinhTrangGH] [bit] NULL,
 CONSTRAINT [PK_Bill] PRIMARY KEY CLUSTERED 
(
	[idBill] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[BillDetails]    Script Date: 17/06/2021 11:15:05 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BillDetails](
	[idBill] [int] NOT NULL,
	[id] [int] NOT NULL,
	[amount] [int] NULL,
 CONSTRAINT [PK_BillDetails] PRIMARY KEY CLUSTERED 
(
	[idBill] ASC,
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Categories]    Script Date: 17/06/2021 11:15:05 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[id] [int] NOT NULL,
	[name] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Categories] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 17/06/2021 11:15:05 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NOT NULL,
	[image] [nvarchar](max) NOT NULL,
	[descriptions] [nvarchar](max) NOT NULL,
	[categoryId] [int] NOT NULL,
	[price] [bigint] NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ShoppingCart]    Script Date: 17/06/2021 11:15:05 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ShoppingCart](
	[Email] [nvarchar](100) NOT NULL,
	[id] [int] NOT NULL,
	[Amount] [int] NULL,
 CONSTRAINT [PK_ShoppingCart] PRIMARY KEY CLUSTERED 
(
	[Email] ASC,
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 17/06/2021 11:15:05 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[Email] [nvarchar](100) NOT NULL,
	[Password] [nvarchar](50) NULL,
	[Name] [nvarchar](50) NULL,
	[Phone] [nvarchar](50) NULL,
	[Address] [nvarchar](400) NULL,
	[isAdmin] [bit] NULL,
	[birthday] [date] NULL,
	[gender] [bit] NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[Email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Bill] ([idBill], [Email], [Total], [ngayMua], [tinhTrangGH]) VALUES (396955, N'abe123@gmail.com', 190000, CAST(N'2021-05-31' AS Date), 1)
INSERT [dbo].[Bill] ([idBill], [Email], [Total], [ngayMua], [tinhTrangGH]) VALUES (406757, N'abe123@gmail.com', 790000, CAST(N'2021-05-31' AS Date), 0)
INSERT [dbo].[Bill] ([idBill], [Email], [Total], [ngayMua], [tinhTrangGH]) VALUES (424419, N'abe123@gmail.com', 6125000, CAST(N'2021-06-17' AS Date), 0)
INSERT [dbo].[Bill] ([idBill], [Email], [Total], [ngayMua], [tinhTrangGH]) VALUES (648640, N'abe1@gmail.com', 1200000, CAST(N'2021-06-02' AS Date), 0)
INSERT [dbo].[Bill] ([idBill], [Email], [Total], [ngayMua], [tinhTrangGH]) VALUES (857380, N'abe123@gmail.com', 800820000, CAST(N'2021-06-02' AS Date), 1)
INSERT [dbo].[Bill] ([idBill], [Email], [Total], [ngayMua], [tinhTrangGH]) VALUES (961235, N'abe123@gmail.com', 80000000, CAST(N'2021-06-04' AS Date), 0)
GO
INSERT [dbo].[BillDetails] ([idBill], [id], [amount]) VALUES (396955, 6, 1)
INSERT [dbo].[BillDetails] ([idBill], [id], [amount]) VALUES (396955, 7, 1)
INSERT [dbo].[BillDetails] ([idBill], [id], [amount]) VALUES (406757, 7, 6)
INSERT [dbo].[BillDetails] ([idBill], [id], [amount]) VALUES (406757, 9, 1)
INSERT [dbo].[BillDetails] ([idBill], [id], [amount]) VALUES (424419, 20, 1)
INSERT [dbo].[BillDetails] ([idBill], [id], [amount]) VALUES (424419, 31, 1)
INSERT [dbo].[BillDetails] ([idBill], [id], [amount]) VALUES (648640, 7, 10)
INSERT [dbo].[BillDetails] ([idBill], [id], [amount]) VALUES (857380, 6, 10)
INSERT [dbo].[BillDetails] ([idBill], [id], [amount]) VALUES (857380, 7, 1)
INSERT [dbo].[BillDetails] ([idBill], [id], [amount]) VALUES (857380, 21, 100)
INSERT [dbo].[BillDetails] ([idBill], [id], [amount]) VALUES (961235, 21, 10)
GO
INSERT [dbo].[Categories] ([id], [name]) VALUES (1, N'Coffee')
INSERT [dbo].[Categories] ([id], [name]) VALUES (2, N'Bánh kem')
INSERT [dbo].[Categories] ([id], [name]) VALUES (3, N'Bánh ngọt')
INSERT [dbo].[Categories] ([id], [name]) VALUES (4, N'Trà')
GO
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (5, N'Bfcake', N'/app/img/coffee/bfcake.jpg', N'Bánh ngọt (cake) định nghĩa theo wikipedia là dòng bánh gato có nguồn gốc từ tiếng Pháp "gâteux"

"Bánh ngọt hay bánh ga-tô (phương ngữ miền Bắc, bắt nguồn từ gâteux trong tiếng Pháp) là một loại thức ăn thường dưới hình thức món bánh dạng bánh mì từ bột nhào, được nướng lên dùng để tráng miệng. Bánh ngọt có nhiều loại, có thể phân loại dựa theo nguyên liệu và kỹ thuật chế biến như bánh ngọt làm từ lúa mì, bơ, bánh ngọt dạng bọt biển. Bánh ngọt có thể phục vụ những mục đính đặc biệt như bánh cưới, bánh sinh nhật, bánh Giáng sinh, bánh Halloween..."', 2, 80000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (6, N'Chessecake', N'/app/img/coffee/chessecake.jpeg', N'Cheesecake là một loại bánh có sự kết hợp hài hoà của phô mai tươi, kem, sữa và trứng. Chiếc bánh cheesecake chính là món tráng miệng được yêu thích bởi sự béo ngậy, thơm lừng và ngọt ngào của chúng.', 2, 70000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (7, N'Macchiato', N'/app/img/coffee/macchiato.jpg', N'Trong tiếng Ý, Macchiato hay caffe macchiato có nghĩa là “đánh dấu” hoặc “vệt lốm đốm” chỉ hình ảnh một tấm vải trắng điểm xuyến những chấm nhỏ li ti bên trên tương tự như ly macchiato có lớp bọt sữa trắng trên bề mặt và được rắc thêm các đốm nâu bột cà phê lên để trang trí. Cùng với Cappuccino và Latte, Macchiato cũng là loại thức uống được tạo thành từ 2 thành phần nguyên liệu chính là cà phê espresso và sữa.', 1, 120000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (8, N'Espresso', N'/app/img/coffee/espresso.jpg', N'Espresso là café được pha bằng máy, sử dụng nước nóng nén bởi áp suất cao qua lớp bột cà phê được xay mịn. Nước dùng để pha chế Espresso là nước tinh khiết, còn café dùng để pha chế theo phương pháp này cũng phải là café rang mộc, không tẩm ướp bất kỳ tạp chất nào.', 1, 240000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (9, N'Mocha', N'/app/img/coffee/mocha.jpg', N'Với các tín đồ ăn vặt nói chung và các bạn yêu thích bánh ngọt nói riêng thì bánh cuộn kem mocha chính là loại bánh được lựa chọn nhiều nhất. Từ lớp vỏ bánh mềm mịn như tan chảy trong miệng cộng với lớp kem béo ngậy và mùi thơm cà phê khiến tinh thần của bạn như được thư giãn. ', 1, 70000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (10, N'Tiramisu', N'/app/img/coffee/tiramisu.jpg', N'Là loại bánh cực kỳ nổi tiếng của người Ý, Tiramisu hội tụ đầy đủ những tinh hoa ẩm thực sẵn có trong hương vị thơm ngon và cách trình bày trang trọng của đất nước xinh đẹp này. Món bánh này dễ dàng chinh phục người thưởng thức ngay từ lần đầu tiên bởi vị ngon ấn tượng, độ mềm mịn, mát lạnh của từng miếng bánh tan ngay đầu lưỡi. ', 2, 150000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (11, N'Mochi', N'/app/img/coffee/mochi.jpg', N'Mochi là một loại bánh giầy nhân ngọt truyền thống của Nhật Bản làm từ bột gạo nếp hay gạo nếp giã nhuyễn không những được dùng để ăn trong cuộc sống hàng ngày mà còn là vật phẩm dâng lên thần linh và có ý nghĩa mang lại may mắn. Bánh Mochi là vật cúng không thể thiếu trong các gia đình Nhật Bản nhân dịp năm mới. Họ bày trí Mochi ở hốc tường Toko-noma trang trọng trong phòng khách hoặc trong nhà', 3, 200000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (17, N'Dorayaki', N'/app/img/coffee/Dorayaki.jpg', N'Dorayaki (tiếng Nhật: どら焼き, どらやき, 銅鑼焼き, ドラ焼き) là một thứ bánh cổ truyền trong ẩm thực Nhật Bản. Nó có hình dáng giống như bánh bao, bao gồm 2 lớp vỏ bánh tròn dẹt làm từ bột, phết mật ong, được nướng lên và bao lấy nhân thường làm từ bột nhão đậu đỏ. Ngày nay người ta có thể làm nhiều loại nhân (chocolate, chuối, đậu đen...) nhưng nhân đậu đỏ là loại đặc trưng nhất.[1][2] Ban đầu loại bánh này chỉ có một lớp, hình dạng như ngày nay là do Ueno Usagiya sáng tạo ra vào năm 1914.[3] Trong tiếng Nhật, Dora (銅鑼) có nghĩa là cồng, chiêng, và tên gọi của loại bánh này có lẽ cũng bởi nó giống với những nhạc cụ này. Truyền thuyết kể rằng một samurai có tên Benkei đã bỏ quên chiếc chiêng (dora) của mình khi rời khỏi nhà của một người nông dân, nơi anh ta ẩn náu. Người nông dân sau đó đã dùng chiếc chiêng bị bỏ lại chiên ra những chiếc bánh,', 3, 40000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (19, N'BK Valentina', N'/app/img/coffee/banhkemvalentin.jpg', N'Bạn đã chuẩn bị cho nửa kia của mình trong ngày Valentine sắp tới chưa? Hãy để Hunnie Cake giúp bạn tạo sự bất ngờ đáng nhớ nhé! Sẽ không còn là khó khăn khi bạn phải đau đầu suy nghĩ phải tặng gì cho người ấy để chiếm trọn cảm tình trong ngày Valentine vì Hunnie Cake đã chuẩn bị cho bạn một siêu tập những chiếc bánh tặng người thật độc đáo và dễ thương.', 2, 200000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (20, N'Trà phúc bồn tử', N'/app/img/coffee/phucbontu.jpg', N'Phúc bồn tử (quả mâm xôi) được xem là vua của các loại quả bởi giá trị dinh dưỡng cũng như hiệu quả trong việc điều trị bệnh. Cây phúc bồn tử thuộc loại cây bụi, cao khoảng trên 1m với lá hình răng cưa, hoa năm cánh. Cây thường mọc ở rìa rừng và sườn núi, nơi có đất ẩm và khả năng thoát nước tốt.

Nguồn : https://bloganchoi.com/phuc-bon-tu-la-gi-cong-dung-va-cach-dung-hieu-qua/ ', 4, 60000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (21, N'Givral Bakery', N'/app/img/coffee/kingBanh.jpg', N'Givral Bakery', 2, 8000000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (23, N'Trà chanh', N'/app/img/coffee/tra-chanh-hoa-hong.jpg', N'Với sự bù nổ ngoạn mục, trà chanh đã trở lại gây sốt cộng đồng giới trẻ tại Việt Nam. Bạn sẽ dễ dàng bắt gặp những người xếp hàng dài để chờ mua trà chanh. Hay những quán trà chanh đông chật kín chỗ ngồi. Rất nhiều khách hàng đều đã chuyển từ trà sữa sang trải nghiệm trà chanh như một xu hướng mới! Vậy bạn có biết?

Trà chanh là sự kết hợp hoàn hảo giữa vị trà ngon và chanh tươi. Mang đến một món uống giải khát và đem lại cảm giác sảng khoái khi thưởng thức. Trà chanh góp phần tăng thêm tinh thần tỉnh táo, thư giãn và sáng tạo khiến cho khách hàng yêu thích.

 Trà', 4, 15000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (24, N'Trà đá', N'/app/img/coffee/Tra-Da.jpg', N'Trà đá là một dạng đồ uống với nguyên liệu là nước trà nguội với nước đá đập vụn rất thịnh hành ở Việt Nam hiện nay, và có lẽ cũng phổ biến ở nhiều xứ nóng trên thế giới. Hầu hết các quán nước bình dân Việt Nam đều bán loại nước trà này với giá thành bằng hoặc cao hơn cốc nước chè nóng một chút. Trà đá phổ dụng vì tiện lợi, dễ làm, có hương vị thơm mát và dùng giải khát rất tốt. Trà', 4, 10000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (25, N'Bánh Donut đường', N'/app/img/coffee/donutduong.jpg', N'là một loại bánh ngọt rán hoặc nướng để ăn tráng miệng hoặc ăn vặt.Đây là loại bánh rất nổi tiếng và phổ biến ở nhiều nước phương Tây,có thể được mua trong cửa hàng hoặc tự làm ở nhà. Thường bánh có dạng hình vòng nhồi nhân hoặc không nhồi nhân bên trong. Bánh thường được phủ nhiều loại kem socola và trang trí bằng hạt đường, hạt cốm... Bánh ngọt', 3, 25000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (26, N'Hồng Trà Latte Macchiato', N'/app/img/coffee/hongtra.jpg', N'Đúng gu tinh tế, healthy với vị trà nhẹ nhàng, quyện cùng sữa tươi và macchiato thơm béo. 

Sự kết hợp hoàn hảo bởi hồng trà dịu nhẹ và sữa tươi, nhấn nhá thêm lớp macchiato trứ danh của Nhà, cho bạn từng ngụm thưởng thức tinh tế, dễ chịu. Coffee', 1, 50000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (27, N'Bạc Sỉu', N'/app/img/coffee/bs.jpg', N'Theo chân những người gốc Hoa đến định cư tại Sài Gòn, Bạc sỉu là cách gọi tắt của "Bạc tẩy sỉu phé" trong tiếng Quảng Đông, chính là: Ly sữa trắng kèm một chút cà phê. Coffee', 1, 40000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (28, N'Latte', N'/app/img/coffee/latte.jpg', N'Khi chuẩn bị Latte, cà phê Espresso và sữa nóng được trộn lẫn vào nhau, bên trên vẫn là lớp foam nhưng mỏng và nhẹ hơn Cappucinno. Coffee', 1, 65000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (29, N'Mochi Kem Chocolate', N'/app/img/coffee/mochiChoco.jpg', N'Cảm nhận hương vị Á Âu từ lớp vỏ nếp sô cô la ngọt dẻo, đến lớp kem lạnh và sốt sô cô la bên trong. Cắn 1 miếng là mê ngay. Bánh ngọt', 3, 25000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (30, N'Mousse Gấu Chocolate', N'/app/img/coffee/gau.jpg', N'Với vẻ ngoài đáng yêu và hương vị ngọt ngào, thơm béo nhất định bạn phải thử ít nhất 1 lần. Bánh ngọt', 3, 45000)
INSERT [dbo].[Product] ([id], [name], [image], [descriptions], [categoryId], [price]) VALUES (31, N'Okinawa Coffee Milk Tea', N'/app/img/coffee/gonchaonika.jpg', N'🎉Okinawa Coffee Milk Tea 🎉
🥳Trà Sữa Cà Phê Đường Nâu đi! 🥳
👉Trà Sữa Cà Phê vốn dĩ là món thức uống “gây nghiện” cho dân văn phòng khi vừa mê trà sữa thơm béo nhưng lại cần café cho thật tỉnh táo suốt ngày dài làm việc. Sản phẩm nay được sáng tạo hơn với sự kết hợp thêm nguyên liệu đường nâu Okinawa mang đến hương vị ngọt thanh dịu nhẹ, nâng vị cà phê và trà sữa thêm đậm đà hơn. Khởi động thứ 3 tấp nập công việc trong trạng thái sảng khoái cùng Gong Cha nhé!👌 Trà', 4, 65000)
SET IDENTITY_INSERT [dbo].[Product] OFF
GO
INSERT [dbo].[ShoppingCart] ([Email], [id], [Amount]) VALUES (N'bich@gmail.com', 5, 2)
INSERT [dbo].[ShoppingCart] ([Email], [id], [Amount]) VALUES (N'bich@gmail.com', 7, 1)
INSERT [dbo].[ShoppingCart] ([Email], [id], [Amount]) VALUES (N'bich@gmail.com', 11, 3)
GO
INSERT [dbo].[User] ([Email], [Password], [Name], [Phone], [Address], [isAdmin], [birthday], [gender]) VALUES (N'abe1@gmail.com', N'123', N'Abe dep trai', N'012321939123', N'Viet Nam HCM', 0, CAST(N'2004-06-16' AS Date), 1)
INSERT [dbo].[User] ([Email], [Password], [Name], [Phone], [Address], [isAdmin], [birthday], [gender]) VALUES (N'abe123@gmail.com', N'123', N'AbeĐẹpTrai', N'01212592798', N'Quan 12 , HCM', 1, CAST(N'2000-11-18' AS Date), 1)
INSERT [dbo].[User] ([Email], [Password], [Name], [Phone], [Address], [isAdmin], [birthday], [gender]) VALUES (N'bich@gmail.com', N'123', N'bich quang', N'0214214213213', N'Viet Nam BP', 0, CAST(N'2004-02-01' AS Date), 0)
INSERT [dbo].[User] ([Email], [Password], [Name], [Phone], [Address], [isAdmin], [birthday], [gender]) VALUES (N'bich02@gmail.com', N'123', N'Mocha', N'09090213213', N'Viet Nam', 1, CAST(N'2000-01-01' AS Date), 0)
INSERT [dbo].[User] ([Email], [Password], [Name], [Phone], [Address], [isAdmin], [birthday], [gender]) VALUES (N'huydevmods1811@gmail.com', N'123', N'Nguyễn Quang Huy', N'09090213213', N'Viet Nam', 0, CAST(N'2000-01-01' AS Date), 0)
GO
ALTER TABLE [dbo].[Bill]  WITH CHECK ADD  CONSTRAINT [FK_Bill_User] FOREIGN KEY([Email])
REFERENCES [dbo].[User] ([Email])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Bill] CHECK CONSTRAINT [FK_Bill_User]
GO
ALTER TABLE [dbo].[BillDetails]  WITH CHECK ADD  CONSTRAINT [FK_BillDetails_Bill] FOREIGN KEY([idBill])
REFERENCES [dbo].[Bill] ([idBill])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[BillDetails] CHECK CONSTRAINT [FK_BillDetails_Bill]
GO
ALTER TABLE [dbo].[BillDetails]  WITH CHECK ADD  CONSTRAINT [FK_BillDetails_Product] FOREIGN KEY([id])
REFERENCES [dbo].[Product] ([id])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[BillDetails] CHECK CONSTRAINT [FK_BillDetails_Product]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK_Product_Categories] FOREIGN KEY([categoryId])
REFERENCES [dbo].[Categories] ([id])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK_Product_Categories]
GO
ALTER TABLE [dbo].[ShoppingCart]  WITH CHECK ADD  CONSTRAINT [FK_ShoppingCart_Product] FOREIGN KEY([id])
REFERENCES [dbo].[Product] ([id])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[ShoppingCart] CHECK CONSTRAINT [FK_ShoppingCart_Product]
GO
ALTER TABLE [dbo].[ShoppingCart]  WITH CHECK ADD  CONSTRAINT [FK_ShoppingCart_User] FOREIGN KEY([Email])
REFERENCES [dbo].[User] ([Email])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[ShoppingCart] CHECK CONSTRAINT [FK_ShoppingCart_User]
GO
USE [master]
GO
ALTER DATABASE [CSSMain] SET  READ_WRITE 
GO
