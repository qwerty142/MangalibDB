BEGIN;

ALTER TABLE manga RENAME TO manga_old;

CREATE TABLE IF NOT EXISTS manga_up (
    manga_id BIGINT,
    middle_review NUMERIC(10, 3),
    author_id BIGINT REFERENCES author(author_id),
    translator_id BIGINT REFERENCES translator(translator_id),
    PRIMARY KEY (manga_id, author_id)
) PARTITION BY RANGE(author_id);

CREATE TABLE manga_up_part_for_1_50000 PARTITION OF manga_up
    FOR VALUES FROM (1) TO (50000);
CREATE TABLE manga_up_part_for_50000_100000 PARTITION OF manga_up
    FOR VALUES FROM (50000) TO (100000);
CREATE TABLE manga_up_part_for_100000_150000 PARTITION OF manga_up
    FOR VALUES FROM (100000) TO (150000);
CREATE TABLE manga_up_part_for_150000_200000 PARTITION OF manga_up
    FOR VALUES FROM (150000) TO (200000);
CREATE TABLE manga_up_part_for_200000_250000 PARTITION OF manga_up
    FOR VALUES FROM (200000) TO (250000);
CREATE TABLE manga_up_part_for_250000_300000 PARTITION OF manga_up
    FOR VALUES FROM (250000) TO (300000);
CREATE TABLE manga_up_part_for_300000_350000 PARTITION OF manga_up
    FOR VALUES FROM (300000) TO (350000);
CREATE TABLE manga_up_part_for_350000_400000 PARTITION OF manga_up
    FOR VALUES FROM (350000) TO (400000);
CREATE TABLE manga_up_part_for_400000_450000 PARTITION OF manga_up
    FOR VALUES FROM (400000) TO (450000);
CREATE TABLE manga_up_part_for_450000_500000 PARTITION OF manga_up
    FOR VALUES FROM (450000) TO (500000);
CREATE TABLE manga_up_part_for_500000_550000 PARTITION OF manga_up
    FOR VALUES FROM (500000) TO (550000);
CREATE TABLE manga_up_part_for_550000_600000 PARTITION OF manga_up
    FOR VALUES FROM (550000) TO (600000);


CREATE OR REPLACE VIEW manga AS SELECT * FROM manga_up;

INSERT INTO manga SELECT * FROM manga_old;

COMMIT;