create table Athelets 
(
primary key Athlet_ID  int,
Last_Name nvarchar(50),
First_Name nvarchar(50),
Sex nvarchar(15),
Date_of_Birth date,
Belt_Level nvarchar(15),
Phone_Number nvarchar(15),
Email nvarchar(50),
Team_ID int references teams(Team_ID)

);


create Teams
(
Team_ID int,
Team_Name nvarchar(50),
Phone_Number nvarchar(15)

);




create table Judges
(
primary key Judge_ID  int,
Last_Name nvarchar(50),
First_Name nvarchar(50),
Sex nvarchar(15),
Phone_Number nvarchar(15),
Email nvarchar(50),
Address  nvarchar(50)

);



create table Events
(

);




create table games
(

);


