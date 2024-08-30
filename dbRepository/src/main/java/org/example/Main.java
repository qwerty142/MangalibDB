package org.example;

import Repositories.jooqGenEntities.tables.pojos.Author;
import Repositories.jooqGenEntities.tables.pojos.Ban;
import Repositories.jooqGenEntities.tables.pojos.Chapter;
import Repositories.jooqGenEntities.tables.pojos.Mangareader;
import com.github.javafaker.Faker;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        while (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:postgresql://postgresql:5432/postgres", "postgres", "postgres");
                break;
            } catch (Exception e) {
                System.out.println("retry");
            }
        }
        MangaRepository mangaRepository = new MangaRepository(DSL.using(conn, SQLDialect.POSTGRES));
        /*for (long i = 800000; i < 1000000; i++) {
            mangaRepository.addUser(new Mangareader(i, "sss", "sss"));
            mangaRepository.addAuthor(new Author(i, "name"));
            mangaRepository.addBan(new Ban(i, "bad", i));
            mangaRepository.addTranslator(new Repositories.jooqGenEntities.tables.pojos.Translator(i, "name"));
            mangaRepository.addManga(new Repositories.jooqGenEntities.tables.pojos.Manga(i, BigDecimal.ONE, i, i));
            mangaRepository.addChapter(new Chapter(i, "link", i));
            mangaRepository.addCommentary(new Repositories.jooqGenEntities.tables.pojos.Commentary(i, "com", i, i));
            mangaRepository.addInCurrentReading(new Repositories.jooqGenEntities.tables.pojos.InCurrentReading(i, i));
            mangaRepository.addPage(new Repositories.jooqGenEntities.tables.pojos.Page(i, "link"));
            mangaRepository.addRecommendation(new Repositories.jooqGenEntities.tables.pojos.Recommendation(i, i, i));
            mangaRepository.addReview(new Repositories.jooqGenEntities.tables.pojos.Reviews(i, i, 1));
            mangaRepository.addToRead(new Repositories.jooqGenEntities.tables.pojos.ToRead(i, i));
        }*/
        Boolean needGen = Boolean.valueOf(System.getenv("GENERATE"));
        if (needGen) {
            Long amount = Long.valueOf(System.getenv("CREATE_NUM"));
            System.out.println(amount);
            EntityFieldGenerator generator = new EntityFieldGenerator(mangaRepository);
            // nead startof -user, -author, -translator, -manga, -chapter
            long authorStart = generator.generateAuthorFields(amount); //
            long userStart = generator.generateMangaReaderFields(amount); //
            long transStart = generator.generateTranslatorFields(amount); //
            long mangaStart = generator.generateMangaFields(amount, authorStart, transStart); //
            long chapterStart = generator.generateChapterFields(amount, mangaStart);
            // --------------------------------------------------
            generator.generateBanFields(amount, userStart);
            generator.generateCommentaryFields(amount, mangaStart, userStart);
            generator.generateInCurrentReadingFields(amount, mangaStart, userStart);
            generator.generatePageFields(amount, chapterStart);
            generator.generateRecommendationFields(amount, userStart, mangaStart);
            generator.generateMangaTypeTagFields(amount, mangaStart);
            generator.generateReviewsFields(amount, mangaStart, userStart);
            generator.generateToReadFields(amount, mangaStart, userStart);
        }


        /*Faker faker = new Faker();
        String name = faker.gameOfThrones().character();*/
    }
}