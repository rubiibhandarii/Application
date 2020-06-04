-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 12, 2020 at 12:21 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.3.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `examination`
--

-- --------------------------------------------------------

--
-- Table structure for table `computer_network_questions`
--

CREATE TABLE `computer_network_questions` (
  `Question_ID` int(11) NOT NULL,
  `Questions` varchar(300) NOT NULL,
  `Answer 1` varchar(300) NOT NULL,
  `Answer2` varchar(300) NOT NULL,
  `Answer3` varchar(300) NOT NULL,
  `Answer4` varchar(300) NOT NULL,
  `CorrectAnswer` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `computer_network_questions`
--

INSERT INTO `computer_network_questions` (`Question_ID`, `Questions`, `Answer 1`, `Answer2`, `Answer3`, `Answer4`, `CorrectAnswer`) VALUES
(1, 'Full form of VPN is;', 'Virtual Private Network', 'Viral Public Network', 'Virtual Public Network', 'Van Port Network', 'Virtual Private Network'),
(2, 'Full form of FTP is;', 'File Transfer Port', 'Files Transfer Ports', 'Format Transfer Port', 'File Transfer Protocol', 'File Transfer Protocol'),
(3, 'WWW is;', 'World Wide Web', 'Win Wide Web', 'Web Wide Web', 'Web Web Web', 'World Wide Web'),
(4, 'SMS strands for;', 'Short Message System', 'Short Message Service', 'Sweeet Message System', 'Sending Message System', 'Short Message Service'),
(5, 'Sending messages electronically;', 'Email', 'Text', 'Message', 'Internet', 'Email'),
(6, 'Extensible Markup Language;', 'XML', 'EML', 'EXML', 'EXTML', 'XML'),
(7, 'DNS stands for;', 'Domain Name System', 'Domain Need System', 'Domain Name Service', 'Define Name System', 'Domain Name System'),
(8, 'Point To Point Protocol is;', 'PTPP', 'POPOP', 'PPP', 'PPPT', 'PPP'),
(9, 'URL stands for;', 'Uniform Resource Locater', 'Uniform Reader Locater', 'Uniform Resource Loader', 'Uniform Rest Locater', 'Uniform Resource Locater'),
(10, 'Wireless Local Loop is;', 'WLL', 'WLLL', 'WRLL', 'Wireless LL', 'WLL');

-- --------------------------------------------------------

--
-- Table structure for table `computer_system_questions`
--

CREATE TABLE `computer_system_questions` (
  `Question_ID` int(11) NOT NULL,
  `Question` varchar(300) NOT NULL,
  `Answer1` varchar(300) NOT NULL,
  `Answer2` varchar(300) NOT NULL,
  `Answer3` varchar(300) NOT NULL,
  `Answer4` varchar(300) NOT NULL,
  `CorrectAnswer` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `computer_system_questions`
--

INSERT INTO `computer_system_questions` (`Question_ID`, `Question`, `Answer1`, `Answer2`, `Answer3`, `Answer4`, `CorrectAnswer`) VALUES
(1, 'Full form of USB is;', 'Universe Sans Bin', 'Untitled Serial Bin', 'Under Stable Bin', 'Universal Serial Bus', 'Universal Serial Bus'),
(2, 'CU stands for;', 'Control Unit', 'Computer Unit', 'Central Unit', 'Cache Unit', 'Control Unit'),
(3, 'Softcopy output is given by;', 'Monitor', 'Printer', 'Plotter', 'CPU', 'Monitor'),
(4, 'Hardcopy output is given by;', 'Mouse', 'Printer', 'Keyboard', 'CD', 'Printer'),
(5, '___ is an example of secondary storage device.', 'CD', 'Printer', 'Monitor', 'Mouse', 'CD'),
(6, 'Short form of Arithmetic and Logic Unit is;', 'ALU', 'ARLU', 'AMLU', 'ARLGU', 'ALU'),
(7, 'Multimedia Card is;', 'MMC', 'MCC', 'MMCD', 'MMM', 'MMC'),
(8, 'CAD stands for;', 'Computer Aided Design', 'Control Aided Design', 'Computer And Design', 'Computer Aided Designer', 'Computer Aided Design'),
(9, 'External memory is;', 'SDD', 'DDR1', 'SRAM', 'RAM', 'SDD'),
(10, 'Primary memory is;', 'RAM', 'SDD', 'HDD', 'DVD', 'RAM');

-- --------------------------------------------------------

--
-- Table structure for table `database_questions`
--

CREATE TABLE `database_questions` (
  `Question_ID` int(11) NOT NULL,
  `Question` varchar(300) NOT NULL,
  `Answer1` varchar(300) NOT NULL,
  `Answer2` varchar(300) NOT NULL,
  `Answer3` varchar(300) NOT NULL,
  `Answer4` varchar(300) NOT NULL,
  `CorrectAnswer` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `database_questions`
--

INSERT INTO `database_questions` (`Question_ID`, `Question`, `Answer1`, `Answer2`, `Answer3`, `Answer4`, `CorrectAnswer`) VALUES
(1, 'The DBMS acts as an interface between;', 'Database application and the database', 'Data and the SQL', 'Database and the data', 'User and data', 'Database application and the database'),
(2, 'The following are components of a database except ', 'user data', 'metadata', 'indexes', 'reports', 'reports'),
(3, 'First to implement relational algebra;', 'Oracle', 'Java', 'R:base', 'IDMS', 'R:base'),
(4, 'SQL stands for', 'Structured Query Language', 'Structured Question Language', 'SequenceQuery Language', 'Same Query Language', 'Structured Query Language'),
(5, 'database is considered to be ___', 'self-describing', 'described', 'metadata', 'program', 'self-describing'),
(6, 'The following are functions of a DBMS except _____', 'processing data', 'administrating DB', 'creating DB', 'creating forms', 'creating forms'),
(7, 'Tables consists of;', 'rows and columns', 'rows', 'columns', 'lines', 'rows and columns'),
(8, 'DBMS that is most difficult to use is ______', 'Oracle Corporation\'s Oracle', 'Oracle', 'Microsoft\'s Access', 'SQL', 'Oracle Corporation\'s Oracle'),
(9, 'Entities are also called;', 'tables', 'rows', 'columns', 'relationship', 'tables'),
(10, 'DB can be made using;', 'MySQL', 'Java ', 'JS ', 'CSS', 'MySQL');

-- --------------------------------------------------------

--
-- Table structure for table `examinee_signup`
--

CREATE TABLE `examinee_signup` (
  `Examinee_ID` int(11) NOT NULL,
  `Username` varchar(300) NOT NULL,
  `Email` varchar(300) NOT NULL,
  `Password` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `examinee_signup`
--

INSERT INTO `examinee_signup` (`Examinee_ID`, `Username`, `Email`, `Password`) VALUES
(1, 'rubi', 'rubi@', 'rXxx7h4eTT'),
(3, 'rubi', 'rubi', 'rubi'),
(4, 'harry', 'harry@', 'aPfLkIf740'),
(5, 'ram', 'ram@', 'hV8YOmgE6C'),
(6, 'Roen', 'roen@gmail.com', 'roen');

-- --------------------------------------------------------

--
-- Table structure for table `mordern_web_questions`
--

CREATE TABLE `mordern_web_questions` (
  `Question_ID` int(11) NOT NULL,
  `Question` varchar(300) NOT NULL,
  `Answer1` varchar(300) NOT NULL,
  `Answer2` varchar(300) NOT NULL,
  `Answer3` varchar(300) NOT NULL,
  `Answer4` varchar(300) NOT NULL,
  `CorrectAnswer` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mordern_web_questions`
--

INSERT INTO `mordern_web_questions` (`Question_ID`, `Question`, `Answer1`, `Answer2`, `Answer3`, `Answer4`, `CorrectAnswer`) VALUES
(1, 'What does CSS stand for?', 'Cascading Style Sheet', 'Catalog Sheet Style', 'Catalogue Style Sheet', 'Computerized Style Sample', 'Cascading Style Sheet'),
(2, 'What can be used to create form layout easily?', 'Bootstrap', 'Django', 'Java', 'CSS', 'Bootstrap'),
(3, 'Full form of HTML is;', 'HyperText ML', 'Hype Mark Lang', 'Hyps Marks Langs', 'Hypertext Markup Language', 'Hypertext Markup Language'),
(4, 'Full form of HTML is;', 'HyperText ML', 'Hype Mark Lang', 'Hyps Marks Langs', 'Hypertext Markup Language', 'Hypertext Markup Language'),
(5, 'What is the easiest way to make forms?', 'Bootstrap', 'Lite', 'jQuery', 'JavaScript', 'Bootstrap'),
(6, 'Who invented JS?', 'Dolog Cocfrod', 'Shreyl Night', 'Brendan Eich', 'Lowd May', 'Brendan Eich'),
(7, 'Which tool can you use to ensure code quality?', 'Angular', 'jQuery', 'JS', 'EDLint', 'EDLint'),
(8, 'Responsive website means;', 'Mobile-friendly websites', 'Professional websites', 'Colorful websites', 'Old websites', 'Mobile-friendly websites'),
(9, 'XAMPP is;', 'open-source', 'paid', 'expensive', '$99', 'open-source'),
(10, 'Which main color can be used for people with colorblindness?', 'Blue', 'Red', 'Green', 'Orange', 'Blue');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `computer_network_questions`
--
ALTER TABLE `computer_network_questions`
  ADD PRIMARY KEY (`Question_ID`);

--
-- Indexes for table `computer_system_questions`
--
ALTER TABLE `computer_system_questions`
  ADD PRIMARY KEY (`Question_ID`);

--
-- Indexes for table `database_questions`
--
ALTER TABLE `database_questions`
  ADD PRIMARY KEY (`Question_ID`);

--
-- Indexes for table `examinee_signup`
--
ALTER TABLE `examinee_signup`
  ADD PRIMARY KEY (`Examinee_ID`);

--
-- Indexes for table `mordern_web_questions`
--
ALTER TABLE `mordern_web_questions`
  ADD PRIMARY KEY (`Question_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `computer_network_questions`
--
ALTER TABLE `computer_network_questions`
  MODIFY `Question_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `computer_system_questions`
--
ALTER TABLE `computer_system_questions`
  MODIFY `Question_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `database_questions`
--
ALTER TABLE `database_questions`
  MODIFY `Question_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `examinee_signup`
--
ALTER TABLE `examinee_signup`
  MODIFY `Examinee_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `mordern_web_questions`
--
ALTER TABLE `mordern_web_questions`
  MODIFY `Question_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
