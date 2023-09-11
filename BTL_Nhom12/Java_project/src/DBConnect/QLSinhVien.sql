create database	QLSinhVien
go
use QLSinhVien
go

create table Account(
	username nchar(20),
	password nchar(20)
)
create table MonHoc(
	MaMH nchar(20) ,
	TenMH	nvarchar(50) primary key,
	SoTC int

)

insert into MonHoc values	('MH01','Java',3),
							('MH02','C++',3),
							('MH03','ASP.NET',3)

drop table MonHoc
create table LopHocPhan(
	MaLopHp	nchar(20) primary key,
	TenMH	nvarchar(50) foreign key references MonHoc(TenMH) on update cascade on delete cascade,
	Khoa	nchar(10),
	SiSo int
)

insert into LopHocPhan values	('LopHP01','Java','K15',65),
								('LopHP02','C++','K15',65),
								('LopHP03','ASP.NET','K15',65)
drop table LopHocPhan
insert into Account values ('admin','admin')
create table SinhVien(
	MaSV	nchar(20) primary key,
	HoTenSV nvarchar(50),
	NgaySinh nchar(20),
	GioiTinh nvarchar(20),
	DiaChi	nvarchar(50),
	Sdt nvarchar(15),
	MaLopHp	nchar(20),
	foreign key(MaLopHp) references LopHocPhan(MaLopHp) on update cascade on delete cascade
)

select * from SinhVien
insert into SinhVien values	('SV01',N'Lê Quang Huy','02/11/2002',N'Nam',N'Minh Khai-Hà Nội','0123456789','LopHP01'),
							('SV02',N'Lê Tuấn Kiệt','07/10/2002',N'Nam',N'Minh Khai-Hà Nội','0123456789','LopHP01'),
							('SV03',N'Lê Văn Phúc','07/10/2002',N'Nam',N'Minh Khai-Hà Nội','0123456789','LopHP02'),
							('SV04',N'Nguyễn Duy Hùng','07/10/2002',N'Nam',N'Minh Khai-Hà Nội','0123456789','LopHP02'),
							('SV05',N'Vũ Văn Mạnh','07/10/2002',N'Nam',N'Minh Khai-Hà Nội','0123456789','LopHP02')
drop table SinhVien

create table Diem(
	MaSV	nchar(20),
	HoTenSV nvarchar(50),
	DiemTX1 float,
	DiemTX2 float,
	DiemCuoiKy	float
	foreign key(MaSV) references SinhVien(MaSV) on update cascade on delete cascade
)
insert into Diem values ('SV01',N'Lê Quang Huy',7,7,6),
						('SV02',N'Lê Tuấn Kiệt',7,7,7),
						('SV03',N'Lê Văn Phúc',6,7,6)
drop table Diem
create table GiangVien(
	MaGV nchar(20) not null primary key,
	HoTenGV	nvarchar(50) not null,
	Sdt	nchar(15),
	TrinhDo	nvarchar(20)
)
insert into GiangVien values ('GV01',N'Lê Thị Thảo','0123456789',N'Thạc sĩ')
insert into GiangVien values ('GV02',N'Lê Thanh Bình','0123456789',N'Tiến sĩ')
insert into GiangVien values ('GV03',N'Trần Thị Nhàn','0123456789',N'Tiến sĩ')
drop table GiangVien
		






drop database QLSinhVien