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

drop table `karategeekdb`.`atheletes`;
drop table `karategeekdb`.`teams`;
drop table `karategeekdb`.`judges`;
drop table `karategeekdb`.`events`;
drop table `karategeekdb`.`event_participations`;
drop table `karategeekdb`.`event_winners`;
drop table `karategeekdb`.`game_participations`;
drop table `karategeekdb`.`athlete_scores`;
-- drop table `karategeekdb`.``;


create table `karategeekdb`.`atheletes` (
`athlete_id`  int,
`last_name` nvarchar(50),
`first_name` nvarchar(50),
`sex` nvarchar(15),
`date_of_birth` date,
`belt_level` nvarchar(15),
`phone_number` nvarchar(15),
`email` nvarchar(50),
`team_id` int referenses `karategeekdb`.`teams`( `team_id` ),
primary key ( `athlete_id` )
);


create table `karategeekdb`.`teams`(
team_id int,
team_name nvarchar(50),
Phone_Number nvarchar(15),
primary key ( `team_id` )
);




create table `karategeekdb`.`judges` (
`judge_id`  int,
`last_name` nvarchar(50),
`first_name` nvarchar(50),
`sex` nvarchar(15),
`phone_number` nvarchar(15),
`email` nvarchar(50),
`address`  nvarchar(50),
primary key ( `judge_id` )
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
primary key ( `event_id` )
);




create table `karategeekdb`.`Event_Participations` (
`athlet_id` int references `karategeekdb`.`athletes`( `athlete_id` ) ,
`event_id` int references `karategeekdb`.`events`( `event_id` ) ,
`level_at_time` nvarchar(20) ,
`team` int,
primary key ( `athlet_id` , `event_id` )
);


create table `karategeekdb`.`event_winners`(
`athlet_id` int references `karategeekdb`.`athletes`( `athlete_id` ) ,
`event_id` int `karategeekdb`.`events`( `event_id` ) ,
`possition` int ,
primary key(`athlet_id`, `event_id` )
);



create table `karategeekdb`.`games` (
`game_id` int ,
`event_id` int `karategeekdb`.`events`( `event_id` ) ,
`game_phase` int ,
`game_position` int ,
primary key (`game_id`)
);




create table `karategeekdb`.`game_participations`(
`game_id` int references `karategeekdb`.`games`( `game_id` ) ,
`athlte_id` int references `karategeekdb`.`athletes`( `athlete_id` ) ,
primary key(`game_id` , `athlete_id` )
);





create table `karategeekdb`.`athlete_scores` (
`game_id` int ,
`athlete_id` int references `athletes` ( `athlete_id` ),
`judge_id` int references `judges` ( `judges_id` ) ,
`score` int,
`score_type` nvarchar(30)
primary key ( `game_id` , `athlete_id` )
);





