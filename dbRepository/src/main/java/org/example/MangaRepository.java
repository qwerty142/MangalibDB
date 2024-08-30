package org.example;

import Repositories.jooqGenEntities.tables.Author;
import Repositories.jooqGenEntities.tables.Ban;
import Repositories.jooqGenEntities.tables.Chapter;
import Repositories.jooqGenEntities.tables.Mangareader;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.stereotype.Repository;

import static org.jooq.impl.DSL.field;

@Repository
@RequiredArgsConstructor
public class MangaRepository {
    public final DSLContext context;
    private final Mangareader mangareader =
            Mangareader.MANGAREADER;
    private final Repositories.jooqGenEntities.tables.Author author =
            Author.AUTHOR;
    private final Repositories.jooqGenEntities.tables.Ban ban =
            Ban.BAN;
    private final Repositories.jooqGenEntities.tables.Chapter chapter =
            Chapter.CHAPTER;
    private final Repositories.jooqGenEntities.tables.Commentary commentary =
            Repositories.jooqGenEntities.tables.Commentary.COMMENTARY;
    private final Repositories.jooqGenEntities.tables.InCurrentReading inCurrentReading =
            Repositories.jooqGenEntities.tables.InCurrentReading.IN_CURRENT_READING;
    private final Repositories.jooqGenEntities.tables.Manga manga =
            Repositories.jooqGenEntities.tables.Manga.MANGA;
    private final Repositories.jooqGenEntities.tables.MangaTypeTag mangaTypeTag =
            Repositories.jooqGenEntities.tables.MangaTypeTag.MANGA_TYPE_TAG;
    private final Repositories.jooqGenEntities.tables.Page page =
            Repositories.jooqGenEntities.tables.Page.PAGE;
    private final Repositories.jooqGenEntities.tables.Recommendation recommendation =
            Repositories.jooqGenEntities.tables.Recommendation.RECOMMENDATION;
    private final Repositories.jooqGenEntities.tables.Reviews reviews =
            Repositories.jooqGenEntities.tables.Reviews.REVIEWS;
    private final Repositories.jooqGenEntities.tables.ToRead toRead =
            Repositories.jooqGenEntities.tables.ToRead.TO_READ;
    private final Repositories.jooqGenEntities.tables.Translator translator =
            Repositories.jooqGenEntities.tables.Translator.TRANSLATOR;
    public Record addUser(Repositories.jooqGenEntities.tables.pojos.Mangareader mangareader1) {
        return context.insertInto(mangareader)
                .columns(mangareader.EMAIL, mangareader.PASSWORD)
                .values(mangareader1.getEmail(), mangareader1.getPassword())
                .returningResult(field("user_id")).fetchOne();
    }

    public Record addAuthor(Repositories.jooqGenEntities.tables.pojos.Author author1) {
        return context.insertInto(author)
                .columns(author.AUTHOR_NAME)
                .values(author1.getAuthorName())
                .onConflictDoNothing()
                .returningResult(field("author_id")).fetchOne();
    }

    public Record addBan(Repositories.jooqGenEntities.tables.pojos.Ban ban1) {
        return context.insertInto(ban)
                .columns(ban.BAN_ENUM, ban.USER_ID)
                .values(ban1.getBanEnum(), ban1.getUserId())
                .returningResult(field("ban_id")).fetchOne();
    }

    public Record addChapter(Repositories.jooqGenEntities.tables.pojos.Chapter chapter1) {
        return context.insertInto(chapter)
                .columns(chapter.MANGA_ID, chapter.INIT_PICTURE_LINK)
                .values(chapter1.getMangaId(), chapter1.getInitPictureLink())
                .returningResult(field("chapter_id")).fetchOne();
    }

    public Record addCommentary(Repositories.jooqGenEntities.tables.pojos.Commentary commentary1) {
        return context.insertInto(commentary)
                .columns(commentary.COMMENTARY_, commentary.MANGA_ID, commentary.USER_ID)
                .values(commentary1.getCommentary(), commentary1.getMangaId(), commentary1.getUserId())
                .returningResult(field("commentary_id")).fetchOne();
    }

    public void addInCurrentReading(Repositories.jooqGenEntities.tables.pojos.InCurrentReading inCurrentReading1) {
        context.insertInto(inCurrentReading)
                .columns(inCurrentReading.MANGA_ID, inCurrentReading.USER_ID)
                .values(inCurrentReading1.getMangaId(), inCurrentReading1.getUserId())
                .execute();
    }

    public Record addManga(Repositories.jooqGenEntities.tables.pojos.Manga manga1) {
        return context.insertInto(manga)
                .columns(manga.AUTHOR_ID, manga.TRANSLATOR_ID, manga.MIDDLE_REVIEW)
                .values(manga1.getAuthorId(), manga1.getTranslatorId(), manga1.getMiddleReview())
                .returningResult(field("manga_id")).fetchOne();
    }

    public Record addMangaTypeTag(Repositories.jooqGenEntities.tables.pojos.MangaTypeTag mangaTypeTag1) {
        return context.insertInto(mangaTypeTag)
                .columns(mangaTypeTag.MANGA_ID, mangaTypeTag.TAG, mangaTypeTag._TYPE)
                .values(mangaTypeTag1.getMangaId(), mangaTypeTag1.getTag(), mangaTypeTag1.get_Type())
                .returningResult(field("manga_id")).fetchOne();
    }

    public Record addPage(Repositories.jooqGenEntities.tables.pojos.Page page1) {
        return context.insertInto(page)
                .columns(page.PAGE_PLACE, page.CHAPTER_ID, page.INIT_PICTURE_LINK)
                .values(page1.getPagePlace(), page1.getChapterId(), page1.getInitPictureLink())
                .returningResult(field("chapter_id")).fetchOne();
    }

    public Record addRecommendation(Repositories.jooqGenEntities.tables.pojos.Recommendation recommendation1) {
        return context.insertInto(recommendation)
                .columns(recommendation.MANGA_ID, recommendation.USER_ID)
                .values(recommendation1.getMangaId(), recommendation1.getUserId())
                .returningResult(field("recommendate_id")).fetchOne();
    }

    public void addReview(Repositories.jooqGenEntities.tables.pojos.Reviews reviews1) {
        context.insertInto(reviews)
                .columns(reviews.MANGA_ID, reviews.USER_ID, reviews.REVIEW_RATE)
                .values(reviews1.getMangaId(), reviews1.getUserId(), reviews1.getReviewRate())
                .execute();
    }

    public void addToRead(Repositories.jooqGenEntities.tables.pojos.ToRead toRead1) {
        context.insertInto(toRead)
                .columns(toRead.MANGA_ID, toRead.USER_ID)
                .values(toRead1.getMangaId(), toRead1.getUserId())
                .execute();
    }

    public Record addTranslator(Repositories.jooqGenEntities.tables.pojos.Translator translator1) {
        return context.insertInto(translator)
                .columns(translator.TRANSLATOR_NAME)
                .values(translator1.getTranslatorName())
                .returningResult(field("translator_id")).fetchOne();
    }
}
