use `qlhocvien`;
CREATE TABLE `hocvien` (
  `mahv` varchar(20) NOT NULL,
  `tenhv` varchar(30) NOT NULL,
  `gioitinh` varchar(10),
  `tuoi` int  DEFAULT NULL,
  `email` varchar(30)  DEFAULT NULL,
  `quequan` varchar(30) DEFAULT NULL,
  `diemtb` float DEFAULT NULL,
  PRIMARY KEY (`mahv`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `hocvien` (`mahv`, `tenhv`,`gioitinh`, `tuoi`, `email`, `quequan`, `diemtb`) VALUES
('HV001', 'Nguyen Van A','Nam', 20, 'nguyenvana@example.com', 'Ha Noi', 8.5),
('HV002', 'Tran Thi B','Nữ',22, 'tranthib@example.com', 'Hai Phong', 7.8),
('HV003', 'Le Van C','Nam', 19, 'levanc@example.com', 'Da Nang', 6.9),
('HV004', 'Pham Thi D', 'Nữ',21, 'phamthid@example.com', 'Ho Chi Minh', 9.2),
('HV005', 'Do Van E','Nữ',23, 'dovane@example.com', 'Can Tho', 7.0);