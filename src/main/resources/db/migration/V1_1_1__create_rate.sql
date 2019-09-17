CREATE TABLE rate
(
    rate_key        VARCHAR NOT NULL PRIMARY KEY,
    remaining       BIGINT default 0,
    remaining_quota BIGINT default 0,
    reset           BIGINT default 0,
    expiration      timestamptz
);