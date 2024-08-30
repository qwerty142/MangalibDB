package org.example;

import Repositories.jooqGenEntities.tables.pojos.Author;
import org.example.faker.DataFaker;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MainByHand {
    public static void main(String[] args) {
        Connection conn = null;
        while (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
                break;
            } catch (Exception e) {
                System.out.println("retry");
            }
        }
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(8);
        MangaRepository mangaRepository = new MangaRepository(DSL.using(conn, SQLDialect.POSTGRES));
        EntityFieldGenerator generator = new EntityFieldGenerator(mangaRepository);
        executor.execute(() -> generator.generateCommentaryFields(600000, 617, 1));
        executor.execute(() -> generator.generateChapterFields(600000, 617));
        executor.execute(() -> generator.generateInCurrentReadingFields(600000, 617, 1));
        executor.execute(() -> generator.generateRecommendationFields(600000, 1, 617));
        executor.execute(() -> generator.generateMangaTypeTagFields(600000, 617));
        executor.execute(() -> generator.generateReviewsFields(600000, 617, 1));
        executor.execute(() -> generator.generateToReadFields(600000, 617, 1));
    }
}
