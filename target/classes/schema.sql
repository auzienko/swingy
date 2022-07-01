CREATE TABLE IF NOT EXISTS heroes
(
    id                  BIGSERIAL PRIMARY KEY,
    name                VARCHAR,
    class_id            INTEGER,
    level               INTEGER,
    experience          INTEGER,
    attack              INTEGER,
    defense             INTEGER,
    hit_points          INTEGER,
    attack_bonus        INTEGER,
    defense_bonus       INTEGER,
    hit_points_bonus    INTEGER
);
