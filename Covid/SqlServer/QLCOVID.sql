create database BTL_QuanLyBanHang
go

use BTL_QuanLyBanHang
go

create table NhanVien(
	maNV nchar(20) primary key not null,
	tenNV nvarchar(30),
	--chucVu nvarchar(20),
	--luongCoBan float,
	--phuCap float
	namSinh nchar(20),
	diaChi nchar(100),
	thanhPho nchar(20),
	quan nchar(20),
	phuong nchar(20),
	trangThai nchar(20),
	noiDieuTri nchar(100),
	lienQuan nchar(100),
	lichSuCovid nchar(20)
)

create table TaiKhoan(
	maNV nchar(20) constraint FK_maNV foreign key (maNV) references NhanVien(maNV),
	username nchar(20) not null,
	pass nchar(30) not null,
	quyenTruyCap nvarchar(15) not null
)

drop table SanPham
create table SanPham(
	maSP nchar(20) primary key not null,
	tenSP nvarchar(40),
	donVi nvarchar(20),
	donGia int,
	soLuong int
)

create table KhachHang(
	maKH nchar(20) primary key not null,
	tenKH nvarchar(30),
	diaChi nvarchar(50)
)
/*create table HoaDon(
	maHD nchar(15) primary key not null,
	maNV nchar(20),
	soDT nchar(15),
	tenKH nvarchar(50),
	ngayLap date,
	diaChi nvarchar(30)
)

create table ChiTietHoaDon(
	maHD nchar(15) not null,
	maSP nchar(20) not null,
	soLuongBan int,
	primary key(maHD, maSP)
)*/

create table GoiHang(
	maGH nchar(15) primary key not null,
	tenGH nvarchar(20),
	gioiHanMua int,
	ngayHetHan date,
	giaGH int
)

create table ChiTietGoiHang(
	maGH nchar(15) not null,
	maSP nchar(20) not null,
	soLuongBan int,
	primary key(maGH, maSP)
)

create table ThongKe(
	ngayLap date,
	tongDoanhThu float
)

create table LichSuDangNhap(
	maNV nvarchar(20),
	suKien nvarchar(200),
	thoiGian nvarchar(30),
	quyenTruycap nvarchar(10)
)

drop table LichSuDuocQuanLy
drop table LichSuTieuThu
drop table LichSuThanhToan

create table LichSuDuocQuanLy(
	maNV nvarchar(20),
	suKien nvarchar(200),
	trangThai nvarchar(20),
	thoiGian nvarchar(30)
)

create table LichSuTieuThu(
	maNV nvarchar(20) ,
	thoiGian nvarchar(30),
	suKien nvarchar(200)
)

create table LichSuThanhToan(
	maNV nvarchar(20) ,
	soNo int,
	thoiGian nvarchar(30)
)

Drop table DiaDiemDieuTri

create table DiaDiemDieuTri(
	ten nvarchar(50)
	soLuongHienTai int,
	sucChua int
)

drop table MuaGoiHang
create table MuaGoiHang(
	maNV nchar(20),
	tenGH nvarchar(20),
	soLuong int,
	giaGH int,
	thoiGian nvarchar(30)
)

create table DuNo(
	maNV nchar(20) primary key not null,
	soNo int
)

