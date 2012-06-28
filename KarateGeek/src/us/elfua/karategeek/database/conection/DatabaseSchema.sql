-- 
--                        karate geek
-- 
--         
--     Copyright (C) 2012  michael theodorides <mc.theodorides@gmail.com>
-- 
--     This program is free software: you can redistribute it and/or modify
--     it under the terms of the GNU General Public License as published by
--     the Free Software Foundation, either version 3 of the License, or
--     (at your option) any later version.
-- 
--     This program is distributed in the hope that it will be useful,
--     but WITHOUT ANY WARRANTY; without even the implied warranty of
--     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
--     GNU General Public License for more details.
-- 
--     You should have received a copy of the GNU General Public License
--     along with this program.  If not, see <http://www.gnu.org/licenses/>.
--     
-- 

drop table `karategeekdb`.`Atheletes`;
drop table `karategeekdb`.`Teams`;
drop table `karategeekdb`.`judges`;
drop table `karategeekdb`.`events`;
drop table `karategeekdb`.``;
drop table `karategeekdb`.``;
drop table `karategeekdb`.``;
-- drop table `karategeekdb`.``;


create table `karategeekdb`.`Atheletes` (
`athlete_id`  int,
`last_name` nvarchar(50),
`first_name` nvarchar(50),
`sex` nvarchar(15),
`date_of_birth` date,
`belt_level` nvarchar(15),
`phone_number` nvarchar(15),
`email` nvarchar(50),
`team_id` int,
primary key (athlete_id)
);


create table `karategeekdb`.`Teams`(
team_id int,
team_name nvarchar(50),
Phone_Number nvarchar(15),
primary key (`team_id`)
);




create table `karategeekdb`.`judges` (
`judge_id`  int,
`last_name` nvarchar(50),
`first_name` nvarchar(50),
`sex` nvarchar(15),
`phone_number` nvarchar(15),
`email` nvarchar(50),
`address`  nvarchar(50),
primary key (judge_id)
);




create table `karategeekdb`.`events` (
`event_id` int,
`event_name` nvarchar(50),
`event_date` date,
`event_location` nvarchar(50),
`event_catecory` nvarchar(50),
`event_level` nvarchar(50),
`event_type` nvarchar(50),
`event_scoring_System` nvarchar(50),
primary key (`event_id`)
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





