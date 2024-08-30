package org.example;

import Repositories.jooqGenEntities.tables.pojos.*;
import com.github.javafaker.Faker;
import org.example.faker.DataFaker;
import org.jooq.Record;

import java.math.BigDecimal;
import java.util.Random;

public class EntityFieldGenerator {
    /*private static final DataFaker FAKER = new DataFaker();*/
    private static MangaRepository mangaRepository;
    private final static Random rand = new Random();
    public EntityFieldGenerator(MangaRepository repository) {
        mangaRepository = repository;
    }

    public long generateAuthorFields(long amount) {
        String name = DataFaker.getName();
        Record curId = mangaRepository.addAuthor(new Author(0L, name));
        long id = (long) curId.intoArray()[0];
        long ret = id;
        if (id >= amount) {
            return id;
        }

        for (; id < amount; id++) {
            name = DataFaker.getName();
            mangaRepository.addAuthor(new Author(0L, name));
        }
        return ret;
    }

    public void generateBanFields(long amount, long userIdStart) {
        String name = DataFaker.getComments();

        for (long i = userIdStart; i < amount; i++) {
            name = DataFaker.getComments();
            long usr = rand.nextLong(userIdStart, amount);
            mangaRepository.addBan(new Ban(0L, name, usr));
        }
    }

    public long generateChapterFields(long amount, long mangaStartId) {
        String name = DataFaker.getName();
        Record record = mangaRepository.addChapter(new Chapter(0L, name, mangaStartId));
        long id = (long) record.intoArray()[0];
        long ret = id;
        if (id >= amount) {
            return id;
        }
        mangaStartId++;
        for (int i = (int) mangaStartId; i < amount; i++) {
            name = DataFaker.getLink();
            long mang = rand.nextInt((int) mangaStartId, (int) amount);
            mangaRepository.addChapter(new Chapter(0L, name, mang));
        }
        return ret;
    }

    public void generateCommentaryFields(long amount, long mangaStart, long userStart) {
        String name = DataFaker.getName();
        long i = mangaStart;
        long j = userStart;

        for (; (i < amount) && (j < amount); i++, j++) {
            name = DataFaker.getComments();
            long mng = rand.nextLong(mangaStart, amount);
            long usr = rand.nextLong(userStart, amount);
            mangaRepository.addCommentary(new Commentary(0L, name, mng, usr));
        }
    }

    public void generateInCurrentReadingFields(long amount, long mangaStart, long userStart) {
        long i = mangaStart;
        long j = userStart;
        for (; (i < amount) && (j < amount); i++, j++) {
            mangaRepository.addInCurrentReading(new InCurrentReading(i, j));
        }
    }

    public long generateMangaFields(long amount, long authorStart, long translatorStart) {
        Random random = new Random();
        BigDecimal num = BigDecimal.valueOf(random.nextInt( 8));
        long auth = random.nextInt((int) authorStart, (int) amount);
        long trans = random.nextInt((int) translatorStart, (int) amount);
        Record curId = mangaRepository.addManga(new Manga(0L, num, auth, trans));
        long id = (long) curId.intoArray()[0];
        long ret = id;
        if (id >= amount) {
            return id;
        }

        for (; id < amount; id++, authorStart++, translatorStart++) {
            num = BigDecimal.valueOf(random.nextInt( 8));
            auth = random.nextInt((int) authorStart, (int) amount);
            trans = random.nextInt((int) translatorStart, (int) amount);
            mangaRepository.addManga(new Manga(0L, num, auth, trans));
        }
        return ret;
    }

    public void generateMangaTypeTagFields(long amount, long mangaStart) {
        String tag = DataFaker.getTagOrType();
        String type = DataFaker.getTagOrType();
        Record curId = mangaRepository.addMangaTypeTag(new MangaTypeTag(tag, type, mangaStart));
        long id = (long) curId.intoArray()[0];
        if (id >= amount) {
            return;
        }
        mangaStart++;
        for (; mangaStart < amount; mangaStart++) {
            tag = DataFaker.getTagOrType();
            type = DataFaker.getTagOrType();
            mangaRepository.addMangaTypeTag(new MangaTypeTag(tag, type, mangaStart));
        }
    }

    public long generateTranslatorFields(long amount) {

        String name = DataFaker.getName();
        Record curId = mangaRepository.addTranslator(new Translator(0L, name));
        long id = (long) curId.intoArray()[0];
        long ret = id;
        if (id >= amount) {
            return id;
        }

        for (; id < amount; id++) {
            name = DataFaker.getName();
            mangaRepository.addTranslator(new Translator(0L, name));
        }
        return ret;
    }

    public long generateMangaReaderFields(long amount) {
        String password = DataFaker.getPassword();
        String email = DataFaker.getEmail();
        Record curId = mangaRepository.addUser(new Mangareader(0L, password, email));
        long id = (long) curId.intoArray()[0];
        long ret = id;
        if (id >= amount) {
            return id - amount;
        }

        for (; id < amount; id++) {
            password = DataFaker.getPassword();
            email = DataFaker.getEmail();
            mangaRepository.addUser(new Mangareader(0L, password, email));
        }

        return ret;
    }

    public void generatePageFields(long amount, long chapterStart) {
        Random random = new Random();
        String pictureLink = DataFaker.getLink();
        Record curId = mangaRepository.addPage(new Page(chapterStart, 1L, pictureLink));
        long id = (long) curId.intoArray()[0];
        if (id >= amount) {
            return;
        }

        for (; chapterStart < amount; chapterStart++) {
            pictureLink = DataFaker.getLink();
            mangaRepository.addPage(new Page(chapterStart, (long) random.nextInt( 1000), pictureLink));
        }
    }

    public void generateRecommendationFields(long amount, long userStart, long mangaStart) {
        Record curId = mangaRepository.addRecommendation(new Recommendation(0L, mangaStart, userStart));
        long id = (long) curId.intoArray()[0];
        if (id >= amount) {
            return;
        }

        for (; id < amount; id++, userStart++, mangaStart++) {
            long usr = rand.nextLong(userStart, amount);
            long mng = rand.nextLong(mangaStart, amount);
            mangaRepository.addRecommendation(new Recommendation(0L, mng, usr));
        }
    }

    public void generateReviewsFields(long amount, long mangaStart, long userStart) {
        Random random = new Random();
        int rate = random.nextInt( 10);
        /*mangaRepository.addReview(new Reviews(mangaStart, userStart, rate));*/

        for (; mangaStart < amount; userStart++, mangaStart++) {
            rate = random.nextInt( 10);
            mangaRepository.addReview(new Reviews(mangaStart, userStart, rate));
        }
    }

    public void generateToReadFields(long amount, long mangaStart, long userStart) {
        /*mangaRepository.addToRead(new ToRead(mangaStart, userStart));*/

        for (; mangaStart < amount; mangaStart++, userStart++) {
            mangaRepository.addToRead(new ToRead(mangaStart, userStart));
        }
    }


}
