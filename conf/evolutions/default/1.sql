# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table client (
  email                     varchar(255) not null,
  password                  varchar(255),
  password2                 varchar(255),
  name                      varchar(255),
  image                     varchar(255),
  constraint pk_client primary key (email))
;

create table comment (
  id                        bigint not null,
  ownerName                 varchar(255),
  ownerEmail                varchar(255),
  content                   varchar(255),
  taskName                  varchar(255),
  constraint pk_comment primary key (id))
;

create table daily_schedule (
  id                        bigint not null,
  ownerName                 varchar(255),
  date                      bigint,
  eventId                   bigint,
  constraint pk_daily_schedule primary key (id))
;

create table event (
  id                        bigint not null,
  eventName                 varchar(255),
  ownerName                 varchar(255),
  involvedEmail             varchar(255),
  startTime                 timestamp,
  endTime                   timestamp,
  slotChosenStart           varchar(255),
  slotChosenEnd             varchar(255),
  location                  varchar(255),
  content                   varchar(255),
  constraint pk_event primary key (id))
;

create table post (
  post_id                   bigint not null,
  postName                  varchar(255),
  teamName                  varchar(255),
  content                   varchar(255),
  involvedEmail             varchar(255),
  constraint pk_post primary key (post_id))
;

create table task (
  task_id                   bigint not null,
  taskName                  varchar(255),
  teamName                  varchar(255),
  content                   varchar(255),
  involvedEmail             varchar(255),
  status                    varchar(255),
  constraint pk_task primary key (task_id))
;

create table team (
  id                        bigint not null,
  teamName                  varchar(255),
  memberEmail               varchar(255),
  constraint pk_team primary key (id))
;

create table unread (
  id                        bigint not null,
  userEmail                 varchar(255),
  commentID                 bigint,
  taskId                    bigint,
  eventId                   bigint,
  constraint pk_unread primary key (id))
;

create sequence client_seq;

create sequence comment_seq;

create sequence daily_schedule_seq;

create sequence event_seq;

create sequence post_seq;

create sequence task_seq;

create sequence team_seq;

create sequence unread_seq;




# --- !Downs

drop table if exists client cascade;

drop table if exists comment cascade;

drop table if exists daily_schedule cascade;

drop table if exists event cascade;

drop table if exists post cascade;

drop table if exists task cascade;

drop table if exists team cascade;

drop table if exists unread cascade;

drop sequence if exists client_seq;

drop sequence if exists comment_seq;

drop sequence if exists daily_schedule_seq;

drop sequence if exists event_seq;

drop sequence if exists post_seq;

drop sequence if exists task_seq;

drop sequence if exists team_seq;

drop sequence if exists unread_seq;

