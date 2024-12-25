-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 25, 2024 lúc 05:47 AM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlhocvien`
--
CREATE DATABASE IF NOT EXISTS `qlhocvien` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `qlhocvien`;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hocvien`
--

CREATE TABLE `hocvien` (
  `mahv` varchar(20) NOT NULL,
  `tenhv` varchar(30) NOT NULL,
  `gioitinh` varchar(10) DEFAULT NULL,
  `tuoi` int(11) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `quequan` varchar(30) DEFAULT NULL,
  `diemtb` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hocvien`
--

INSERT INTO `hocvien` (`mahv`, `tenhv`, `gioitinh`, `tuoi`, `email`, `quequan`, `diemtb`) VALUES
('HV001', 'Nguyen Van A', 'Nam', 20, 'nguyenvana@example.com', 'Ha Noi', 8.5),
('HV002', 'Nguyen Van B', 'Nam', 20, 'nguyenvanb@example.com', 'Ha Noi', 8.5),
('HV003', 'Nguyen Van C', 'Nam', 19, 'nguyenvanc@example.com', 'Bắc Giang', 8.7),
('HV004', 'Nguyen Van D', 'Nữ', 30, 'nguyenvand@example.com', 'Quảng Ninh', 8),
('HV005', 'Nguyen Van F', 'Nữ', 25, 'nguyenvanf@gmail.com', 'Hà Nam', 7.6);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `id` int(20) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `email`) VALUES
(1, 'Nguyen Van A', 'nguyenvana', 'nguyenvana@gmail.com'),
(2, 'Nguyen Van B', 'nguyenvanb', 'nguyenvanb@gmail.com'),
(3, 'Nguyen Van C', 'nguyenvanc', 'nguyenvanc@gmail.com'),
(4, 'Nguyen Van D', 'nguyenvand', 'nguyenvand@gmail.com'),
(5, 'Nguyen Van F', 'nguyenvanf', 'nguyenvanf@gmail.com'),
(8, 'nguyen van g', 'nguyenvang', 'nguyenvang@gmail.com'),
(9, 'Nguyen Van H', 'nguyenvanh', 'nguyenvanh@gmail.com'),
(10, 'nguyen minh duc', 'nguyenminhduc', 'nguyenminhduc@gmail.com');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `hocvien`
--
ALTER TABLE `hocvien`
  ADD PRIMARY KEY (`mahv`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
