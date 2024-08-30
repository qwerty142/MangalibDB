--changeset qwerty142:1
CREATE TABLE IF NOT EXISTS translator (
                            translator_id BIGSERIAL PRIMARY KEY,
                            translator_name TEXT
);
CREATE TABLE IF NOT EXISTS author (
                        author_id BIGSERIAL PRIMARY KEY,
                        Author_Name TEXT
);
CREATE TABLE IF NOT EXISTS manga (
                       manga_id BIGSERIAL PRIMARY KEY,
                       middle_review NUMERIC(10,3),
                       author_id BIGINT REFERENCES author(author_id),
                       translator_id BIGINT REFERENCES translator(translator_id)
);
CREATE TABLE IF NOT EXISTS mangaReader (
                      user_id BIGSERIAL PRIMARY KEY,
                      password VARCHAR(255),
                      email VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS reviews (
                         manga_id BIGINT REFERENCES manga(manga_id),
                         user_id BIGINT REFERENCES mangaReader(user_id),
                         review_rate INT,
                         PRIMARY KEY (manga_id, user_id)
);

CREATE TABLE IF NOT EXISTS in_current_reading (
                                    manga_id BIGINT REFERENCES manga(manga_id),
                                    user_id BIGINT REFERENCES mangaReader(user_id),
                                    PRIMARY KEY (manga_id, user_id)
);

CREATE TABLE IF NOT EXISTS to_read (
                         manga_id BIGINT REFERENCES manga(manga_id),
                         user_id BIGINT REFERENCES mangaReader(user_id),
                         PRIMARY KEY (manga_id, user_id)
);

CREATE TABLE IF NOT EXISTS commentary (
                            commentary_id BIGSERIAL PRIMARY KEY,
                            commentary VARCHAR(255),
                            manga_id BIGINT REFERENCES manga(manga_id),
                            user_id BIGINT REFERENCES mangaReader(user_id)
);

CREATE TABLE IF NOT EXISTS manga_type_tag (
                                tag TEXT,
                                _type TEXT,
                                manga_id BIGINT REFERENCES manga(manga_id),
                            PRIMARY KEY (manga_id)
);

CREATE TABLE IF NOT EXISTS chapter (
                         chapter_id BIGSERIAL PRIMARY KEY,
                         init_picture_link VARCHAR(255),
                         manga_id BIGINT REFERENCES manga(manga_id)
);
CREATE TABLE IF NOT EXISTS Ban (
                     ban_id BIGSERIAL PRIMARY KEY,
                     ban_enum VARCHAR(255),
                     user_id BIGINT REFERENCES mangaReader(user_id)
);
CREATE TABLE IF NOT EXISTS Recommendation (
                                recommendate_id BIGSERIAL PRIMARY KEY,
                                manga_id BIGINT REFERENCES manga(manga_id),
                                user_id BIGINT REFERENCES mangaReader(user_id)
);
CREATE TABLE IF NOT EXISTS Page (
                      chapter_id BIGINT REFERENCES chapter(chapter_id),
                      page_place BIGINT,
                      PRIMARY KEY (chapter_id, page_place),
                      init_picture_link VARCHAR(255)
);
