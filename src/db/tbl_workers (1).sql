-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 08, 2023 at 07:54 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tbl_workers`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_applicant`
--

CREATE TABLE `tbl_applicant` (
  `app_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `file_id` int(11) NOT NULL,
  `app_status` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_applicant`
--

INSERT INTO `tbl_applicant` (`app_id`, `user_id`, `file_id`, `app_status`) VALUES
(1, 2, 2, 'approve'),
(2, 1, 1, 'approve');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_file`
--

CREATE TABLE `tbl_file` (
  `file_id` int(11) NOT NULL,
  `file_name` varchar(60) NOT NULL,
  `file_position` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_file`
--

INSERT INTO `tbl_file` (`file_id`, `file_name`, `file_position`) VALUES
(1, 'sample', 'Tanod'),
(2, 'as', 'Health Worker');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `user_id` int(11) NOT NULL,
  `user_Firstname` varchar(60) NOT NULL,
  `user_Lastname` varchar(60) NOT NULL,
  `user_email` varchar(60) NOT NULL,
  `username` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `user_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`user_id`, `user_Firstname`, `user_Lastname`, `user_email`, `username`, `password`, `user_status`) VALUES
(1, 'sample', 'sample', 'emailsample@gmail.com', 'user', 'password', 'Pending'),
(2, 'as', 'sa', 'gmail@gmail.com', 'sa', 'saaa', 'Pending'),
(3, 'samplename', 'samplelastname', 'sampleeamaiL@email.com', 'sampleuser', 'jGl25bVBBBW96Qi9Te4V37Fnqchz/Eu4qB9vKrRIqRg=', 'Pending'),
(4, 'josh', 'sample', 'email@email.com', 'joshh', 'jGl25bVBBBW96Qi9Te4V37Fnqchz/Eu4qB9vKrRIqRg=', 'Pending'),
(5, 'Test', 'test', 'test@test.test', 'Mike', 'vZ+DzN+M1/B7V52wYfgi9LlHHhp0SGdyWy3ft6Olz9g=', 'Pending'),
(6, 't', 't', 't', 't', '47mKTaMaEn1L3m5DAz9muidMqw636xxw7EFAK/YnPdg=', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_worker`
--

CREATE TABLE `tbl_worker` (
  `s_id` int(11) NOT NULL,
  `s_Firstname` varchar(60) NOT NULL,
  `s_Lastname` varchar(60) NOT NULL,
  `s_gender` varchar(60) NOT NULL,
  `s_status` varchar(60) NOT NULL,
  `s_position` varchar(60) NOT NULL,
  `s_address` varchar(50) NOT NULL,
  `s_contact` int(50) NOT NULL,
  `s_image` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_worker`
--

INSERT INTO `tbl_worker` (`s_id`, `s_Firstname`, `s_Lastname`, `s_gender`, `s_status`, `s_position`, `s_address`, `s_contact`, `s_image`) VALUES
(1, 'sample', 'sample', 'Male', 'Married', 'GARBAGE COLLECTOR', 'sample address', 98123125, 'src/images/1.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_applicant`
--
ALTER TABLE `tbl_applicant`
  ADD PRIMARY KEY (`app_id`),
  ADD KEY `app_user` (`user_id`),
  ADD KEY `app_file` (`file_id`);

--
-- Indexes for table `tbl_file`
--
ALTER TABLE `tbl_file`
  ADD PRIMARY KEY (`file_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `tbl_worker`
--
ALTER TABLE `tbl_worker`
  ADD PRIMARY KEY (`s_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_applicant`
--
ALTER TABLE `tbl_applicant`
  MODIFY `app_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_file`
--
ALTER TABLE `tbl_file`
  MODIFY `file_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_worker`
--
ALTER TABLE `tbl_worker`
  MODIFY `s_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_applicant`
--
ALTER TABLE `tbl_applicant`
  ADD CONSTRAINT `app_file` FOREIGN KEY (`file_id`) REFERENCES `tbl_file` (`file_id`),
  ADD CONSTRAINT `app_user` FOREIGN KEY (`user_id`) REFERENCES `tbl_user` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
