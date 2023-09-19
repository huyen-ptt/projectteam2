CREATE DATABASE IF NOT EXISTS khutro;

USE khutro;

-- Tạo bảng User nếu nó chưa tồn tại
CREATE TABLE IF NOT EXISTS User (
  id INT PRIMARY KEY,
  username NVARCHAR(255) NOT NULL,
  password NVARCHAR(255) NOT NULL,
  name VARCHAR(255),
  phone INT,
  created_time INT
);

-- Tạo bảng Room nếu nó chưa tồn tại
CREATE TABLE IF NOT EXISTS Room (
  id INT PRIMARY KEY,
  room_name NVARCHAR(255),
  room_description TEXT,
  price FLOAT,
  max_occupancy INT,
  status BOOLEAN,
  room_area DECIMAL(10, 2),
  type VARCHAR(255),
  created_time INT
);

-- Tạo bảng RoomImages nếu nó chưa tồn tại
CREATE TABLE IF NOT EXISTS RoomImages (
  id INT PRIMARY KEY AUTO_INCREMENT,
  image_url VARCHAR(255),
  room_id INT,
  created_time INT,
  FOREIGN KEY (room_id) REFERENCES Room(id)
);

-- Tạo bảng HoaDon nếu nó chưa tồn tại
CREATE TABLE IF NOT EXISTS HoaDon (
  id INT PRIMARY KEY,
  tien_dien INT,
  tien_nuoc INT,
  tien_dich_vu INT,
  FOREIGN KEY (id) REFERENCES Room(id)
);

-- Tạo bảng Customers nếu nó chưa tồn tại
CREATE TABLE IF NOT EXISTS Customers (
  id INT PRIMARY KEY,
  name NVARCHAR(255),
  room_id INT,
  phone INT,
  FOREIGN KEY (room_id) REFERENCES Room(id)
);
