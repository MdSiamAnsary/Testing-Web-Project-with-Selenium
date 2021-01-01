-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 26, 2020 at 01:33 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sportscornerdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `userstable`
--

CREATE TABLE `userstable` (
  `id` int(20) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `username` varchar(50) NOT NULL,
  `email` varchar(400) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `userstable`
--

INSERT INTO `userstable` (`id`, `gender`, `username`, `email`, `password`) VALUES
(1, 'Male', 'us0022', 'us0022@gmail.com', 'q00004'),
(2, 'Female', 'us0023', 'us0023@gmail.com', 'q00005'),
(3, 'Other', 'us0024', 'us0024@gmail.com', 'q00006'),
(4, 'Male', 'us0031', 'us0031@gmail.com', 'r010004'),
(5, 'Female', 'us0032', 'us0032@gmail.com', 'r010005'),
(6, 'Other', 'us0033', 'us0033@gmail.com', 'r010006'),
(7, 'Male', 'us0040', 'us0040@gmail.com', 's0123454'),
(8, 'Female', 'us0041', 'us0041@gmail.com', 's0123455'),
(9, 'Other', 'us0042', 'us0042@gmail.com', 's0123456'),
(10, 'Male', 'us0049', 'us0049@gmail.com', 't01222334'),
(11, 'Female', 'us0050', 'us0050@gmail.com', 't01222335'),
(12, 'Other', 'us0051', 'us0051@gmail.com', 't01222336'),
(13, 'Male', 'us0058', 'us0058@gmail.com', 'u011222234'),
(14, 'Female', 'us0059', 'us0059@gmail.com', 'u011222235'),
(15, 'Other', 'us0060', 'us0060@gmail.com', 'u011222236'),
(16, 'Male', 'usr1022', 'usr1022@gmail.com', 'q10004'),
(17, 'Female', 'usr1023', 'usr1023@gmail.com', 'q10005'),
(18, 'Other', 'usr1024', 'usr1024@gmail.com', 'q10006'),
(19, 'Male', 'usr1031', 'usr1031@gmail.com', 'r110004'),
(20, 'Female', 'usr1032', 'usr1032@gmail.com', 'r110005'),
(21, 'Other', 'usr1033', 'usr1033@gmail.com', 'r110006'),
(22, 'Male', 'usr1040', 'usr1040@gmail.com', 's1123454'),
(23, 'Female', 'usr1041', 'usr1041@gmail.com', 's1123455'),
(24, 'Other', 'usr1042', 'usr1042@gmail.com', 's1123456'),
(25, 'Male', 'usr1049', 'usr1049@gmail.com', 't11222334'),
(26, 'Female', 'usr1050', 'usr1050@gmail.com', 't11222335'),
(27, 'Other', 'usr1051', 'usr1051@gmail.com', 't11222336'),
(28, 'Male', 'usr1058', 'usr1058@gmail.com', 'u111222234'),
(29, 'Female', 'usr1059', 'usr1059@gmail.com', 'u111222235'),
(30, 'Other', 'usr1060', 'usr1060@gmail.com', 'u111222236'),
(31, 'Male', 'username00022', 'username00022@gmail.com', 'q20004'),
(32, 'Female', 'username00023', 'username00023@gmail.com', 'q20005'),
(33, 'Other', 'username00024', 'username00024@gmail.com', 'q20006'),
(34, 'Male', 'username00031', 'username00031@gmail.com', 'r210004'),
(35, 'Female', 'username00032', 'username00032@gmail.com', 'r210005'),
(36, 'Other', 'username00033', 'username00033@gmail.com', 'r210006'),
(37, 'Male', 'username00040', 'username00040@gmail.com', 's2123454'),
(38, 'Female', 'username00041', 'username00041@gmail.com', 's2123455'),
(39, 'Other', 'username00042', 'username00042@gmail.com', 's2123456'),
(40, 'Male', 'username00049', 'username00049@gmail.com', 't21222334'),
(41, 'Female', 'username00050', 'username00050@gmail.com', 't21222335'),
(42, 'Other', 'username00051', 'username00051@gmail.com', 't21222336'),
(43, 'Male', 'username00058', 'username00058@gmail.com', 'u211222234'),
(44, 'Female', 'username00059', 'username00059@gmail.com', 'u211222235'),
(45, 'Other', 'username00060', 'username00060@gmail.com', 'u211222236'),
(46, 'Male', 'username12345600022', 'username12345600022@gmail.com', 'q30004'),
(47, 'Female', 'username12345600023', 'username12345600023@gmail.com', 'q30005'),
(48, 'Other', 'username12345600024', 'username12345600024@gmail.com', 'q30006'),
(49, 'Male', 'username12345600031', 'username12345600031@gmail.com', 'r310004'),
(50, 'Female', 'username12345600032', 'username12345600032@gmail.com', 'r310005'),
(51, 'Other', 'username12345600033', 'username12345600033@gmail.com', 'r310006'),
(52, 'Male', 'username12345600040', 'username12345600040@gmail.com', 's3123454'),
(53, 'Female', 'username12345600041', 'username12345600041@gmail.com', 's3123455'),
(54, 'Other', 'username12345600042', 'username12345600042@gmail.com', 's3123456'),
(55, 'Male', 'username12345600049', 'username12345600049@gmail.com', 't31222334'),
(56, 'Female', 'username12345600050', 'username12345600050@gmail.com', 't31222335'),
(57, 'Other', 'username12345600051', 'username12345600051@gmail.com', 't31222336'),
(58, 'Male', 'username12345600058', 'username12345600058@gmail.com', 'u311222234'),
(59, 'Female', 'username12345600059', 'username12345600059@gmail.com', 'u311222235'),
(60, 'Other', 'username12345600060', 'username12345600060@gmail.com', 'u311222236'),
(61, 'Male', 'username123456700022', 'username123456700022@gmail.com', 'q40004'),
(62, 'Female', 'username123456700023', 'username123456700023@gmail.com', 'q40005'),
(63, 'Other', 'username123456700024', 'username123456700024@gmail.com', 'q40006'),
(64, 'Male', 'username123456700031', 'username123456700031@gmail.com', 'r410004'),
(65, 'Female', 'username123456700032', 'username123456700032@gmail.com', 'r410005'),
(66, 'Other', 'username123456700033', 'username123456700033@gmail.com', 'r410006'),
(67, 'Male', 'username123456700040', 'username123456700040@gmail.com', 's4123454'),
(68, 'Female', 'username123456700041', 'username123456700041@gmail.com', 's4123455'),
(69, 'Other', 'username123456700042', 'username123456700042@gmail.com', 's4123456'),
(70, 'Male', 'username123456700049', 'username123456700049@gmail.com', 't41222334'),
(71, 'Female', 'username123456700050', 'username123456700050@gmail.com', 't41222335'),
(72, 'Other', 'username123456700051', 'username123456700051@gmail.com', 't41222336'),
(73, 'Male', 'username123456700058', 'username123456700058@gmail.com', 'u411222234'),
(74, 'Female', 'username123456700059', 'username123456700059@gmail.com', 'u411222235'),
(75, 'Other', 'username123456700060', 'username123456700060@gmail.com', 'u411222236');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `userstable`
--
ALTER TABLE `userstable`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `userstable`
--
ALTER TABLE `userstable`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=76;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
