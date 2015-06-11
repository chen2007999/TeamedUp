# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table comment (
  id                        bigint auto_increment not null,
  ownerName                 varchar(255),
  ownerEmail                varchar(255),
  content                   varchar(255),
  taskName                  varchar(255),
  constraint pk_comment primary key (id))
;

create table daily_schedule (
  id                        bigint auto_increment not null,
  ownerName                 varchar(255),
  date                      bigint,
  eventId                   bigint,
  constraint pk_daily_schedule primary key (id))
;

create table event (
  id                        bigint auto_increment not null,
  eventName                 varchar(255),
  ownerName                 varchar(255),
  involvedEmail             varchar(255),
  startTime                 datetime,
  endTime                   datetime,
  slotChosenStart           varchar(255),
  slotChosenEnd             varchar(255),
  location                  varchar(255),
  content                   varchar(255),
  constraint pk_event primary key (id))
;

create table post (
  post_id                   bigint auto_increment not null,
  postName                  varchar(255),
  teamName                  varchar(255),
  content                   varchar(255),
  involvedEmail             varchar(255),
  constraint pk_post primary key (post_id))
;

create table task (
  task_id                   bigint auto_increment not null,
  taskName                  varchar(255),
  teamName                  varchar(255),
  content                   varchar(255),
  involvedEmail             varchar(255),
  status                    varchar(255),
  constraint pk_task primary key (task_id))
;

create table team (
  id                        bigint auto_increment not null,
  teamName                  varchar(255),
  memberEmail               varchar(255),
  constraint pk_team primary key (id))
;

create table unread (
  id                        bigint auto_increment not null,
  userEmail                 varchar(255),
  commentID                 bigint,
  taskId                    bigint,
  eventId                   bigint,
  constraint pk_unread primary key (id))
;

create table user (
  email                     varchar(255) not null,
  password                  varchar(255),
  password2                 varchar(255),
  name                      varchar(255),
  image                     varchar(255),
  constraint pk_user primary key (email))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table comment;

drop table daily_schedule;

drop table event;

drop table post;

drop table task;

drop table team;

drop table unread;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

