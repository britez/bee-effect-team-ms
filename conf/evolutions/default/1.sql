-- !Ups

CREATE TABLE "team" (
    "id" int generated by default as identity(start with 1) not null primary key,
    "name" VARCHAR NOT NULL
);

-- !Downs

DROP TABLE team;