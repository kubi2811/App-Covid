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

create table SanPham(
	maSP nchar(20) primary key not null,
	tenSP nvarchar(40),
	donGia float,
	soLuong int
)

create table KhachHang(
	maKH nchar(20) primary key not null,
	tenKH nvarchar(30),
	diaChi nvarchar(50)
)
create table HoaDon(
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
)

create table ThongKe(
	ngayLap date,
	tongDoanhThu float
)

create table LichSuDangNhap(
	maNV nvarchar(20) primary key not null,
	thoiGian nvarchar(30),
	role nvarchar(10)
)

