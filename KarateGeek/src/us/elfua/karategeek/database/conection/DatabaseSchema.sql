create table Atheletes 
(
primary key Athlete_ID  int,
Last_Name nvarchar(50),
First_Name nvarchar(50),
Sex nvarchar(15),
Date_of_Birth date,
Belt_Level nvarchar(15),
Phone_Number nvarchar(15),
Email nvarchar(50),
Team_ID int references Teams(Team_ID)

);


create Teams
(
primary key Team_ID int,
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
primary key Event_ID int,
Event_Name nvarchar(50),
Event_date date,
Event_Location nvarchar(50),
Event_Catecory nvarchar(50),
Event_Level nvarchar(50),
Event_Type nvarchar(50),
Event_Scoring_System nvarchar(50)

);




create table Event_Participations
(
Athlet_ID int references Athletes(Athlete_ID),
Event_ID int references Events(Event_ID),
Level_At_Time nvarchar(15),
Team int,
primary key(Athlet_ID, Event_ID)

);


create table Event_Winners
(
Athlet_ID int references Athletes(Athlete_ID),
Event_ID int references Events(Event_ID),
Possition int,
primary key(Athlet_ID, Event_ID)
);



create table Games
(
primary key Game_ID int,
Event_ID int references Events(Event_ID),
Game_Phase int,
Game_Position int

);




create table Game_Participations
(
Game_ID int references Games(Game_ID),
Athlte_ID int references Athletes(Athlete_ID),
primary key(Game_ID, Athlete_ID)

);





create table Athlete_Scores
(
Game_ID int references Games(Game_ID),
Athlte_ID int references Athletes(Athlete_ID),
Judge_ID int references Judges(Judges_ID),
Score int,
Score_Type nvarchar(30)

);





