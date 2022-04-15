CREATE DATABASE QLBanSach;
USE QLBanSach;

CREATE TABLE KhachHang (
  MaKH VARCHAR(45),
  TaiKhoan VARCHAR(45),
  MatKhau VARCHAR(45),
  Email VARCHAR(45),
  DiaChi VARCHAR(45),
  HoTen VARCHAR(45),
  NgaySinh DATE,
  GioiTinh ENUM('Nam', 'Nu', 'Khac'),
  DienThoai VARCHAR(10),
  PRIMARY KEY (MaKH));

CREATE TABLE DonHang (
  MaDonHang VARCHAR(45),
  DaThanhToan BOOLEAN,
  TinhTrangGH VARCHAR(45),
  NgayDat DATE,
  NgayGiao DATE,
  MaKH VARCHAR(45),
  PRIMARY KEY (MaDonHang),
  CONSTRAINT fk_MaKH FOREIGN KEY (MaKH) REFERENCES KhachHang (MaKH));

CREATE TABLE TacGia (
  MaTacGia VARCHAR(45),
  TenTacGia VARCHAR(45),
  DiaChi VARCHAR(45),
  TieuSu VARCHAR(45),
  DienThoai VARCHAR(10),
  PRIMARY KEY (MaTacGia));

CREATE TABLE ChuDe (
  MaChuDe VARCHAR(45),
  TenChuDe VARCHAR(45),
  PRIMARY KEY (MaChuDe));

CREATE TABLE NhaXuatBan (
  MaNSX VARCHAR(45),
  TenNXB VARCHAR(45),
  DiaChi VARCHAR(45),
  DienThoai VARCHAR(10),
  PRIMARY KEY (MaNSX));

CREATE TABLE Sach (
  MaSach VARCHAR(45),
  TenSach VARCHAR(45),
  GiaBan DOUBLE,
  MoTa VARCHAR(45),
  AnhBia BLOB,
  NgayCapNhat DATE,
  SoLuongTon INT,
  MaNSX VARCHAR(45) NOT NULL,
  MaChuDe VARCHAR(45) NOT NULL,
  PRIMARY KEY (MaSach),
  CONSTRAINT fk_MaNSX FOREIGN KEY (MaNSX) REFERENCES NhaXuatBan (MaNSX),
  CONSTRAINT fk_MaChuDe FOREIGN KEY (MaChuDe) REFERENCES ChuDe (MaChuDe));
  
CREATE TABLE Gom (
  MaDonHang VARCHAR(45),
  MaSach VARCHAR(45),
  SoLuong INT,
  DonGia DOUBLE,
  PRIMARY KEY (MaDonHang, MaSach),
  CONSTRAINT fk_MaDonHang FOREIGN KEY (MaDonHang) REFERENCES DonHang (MaDonHang),
  CONSTRAINT fk_MaSach FOREIGN KEY (MaSach) REFERENCES Sach (MaSach));

CREATE TABLE ThamGia (
  MaSach VARCHAR(45),
  MaTacGia VARCHAR(45),
  VaiTro VARCHAR(45),
  ViTri VARCHAR(45),
  PRIMARY KEY (MaSach, MaTacGia),
  CONSTRAINT fk_MaSach1 FOREIGN KEY (MaSach) REFERENCES Sach (MaSach),
  CONSTRAINT fk_MaTacGia FOREIGN KEY (MaTacGia) REFERENCES TacGia (MaTacGia));