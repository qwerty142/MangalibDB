/*
 * This file is generated by jOOQ.
 */
package Repositories.jooqGenEntities;


import Repositories.jooqGenEntities.tables.Author;
import Repositories.jooqGenEntities.tables.Ban;
import Repositories.jooqGenEntities.tables.Chapter;
import Repositories.jooqGenEntities.tables.Commentary;
import Repositories.jooqGenEntities.tables.InCurrentReading;
import Repositories.jooqGenEntities.tables.Manga;
import Repositories.jooqGenEntities.tables.MangaTypeTag;
import Repositories.jooqGenEntities.tables.Mangareader;
import Repositories.jooqGenEntities.tables.Page;
import Repositories.jooqGenEntities.tables.Recommendation;
import Repositories.jooqGenEntities.tables.Reviews;
import Repositories.jooqGenEntities.tables.ToRead;
import Repositories.jooqGenEntities.tables.Translator;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.13"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.author</code>.
     */
    public final Author AUTHOR = Author.AUTHOR;

    /**
     * The table <code>public.ban</code>.
     */
    public final Ban BAN = Ban.BAN;

    /**
     * The table <code>public.chapter</code>.
     */
    public final Chapter CHAPTER = Chapter.CHAPTER;

    /**
     * The table <code>public.commentary</code>.
     */
    public final Commentary COMMENTARY = Commentary.COMMENTARY;

    /**
     * The table <code>public.in_current_reading</code>.
     */
    public final InCurrentReading IN_CURRENT_READING = InCurrentReading.IN_CURRENT_READING;

    /**
     * The table <code>public.manga</code>.
     */
    public final Manga MANGA = Manga.MANGA;

    /**
     * The table <code>public.manga_type_tag</code>.
     */
    public final MangaTypeTag MANGA_TYPE_TAG = MangaTypeTag.MANGA_TYPE_TAG;

    /**
     * The table <code>public.mangareader</code>.
     */
    public final Mangareader MANGAREADER = Mangareader.MANGAREADER;

    /**
     * The table <code>public.page</code>.
     */
    public final Page PAGE = Page.PAGE;

    /**
     * The table <code>public.recommendation</code>.
     */
    public final Recommendation RECOMMENDATION = Recommendation.RECOMMENDATION;

    /**
     * The table <code>public.reviews</code>.
     */
    public final Reviews REVIEWS = Reviews.REVIEWS;

    /**
     * The table <code>public.to_read</code>.
     */
    public final ToRead TO_READ = ToRead.TO_READ;

    /**
     * The table <code>public.translator</code>.
     */
    public final Translator TRANSLATOR = Translator.TRANSLATOR;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    @NotNull
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    @NotNull
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Author.AUTHOR,
            Ban.BAN,
            Chapter.CHAPTER,
            Commentary.COMMENTARY,
            InCurrentReading.IN_CURRENT_READING,
            Manga.MANGA,
            MangaTypeTag.MANGA_TYPE_TAG,
            Mangareader.MANGAREADER,
            Page.PAGE,
            Recommendation.RECOMMENDATION,
            Reviews.REVIEWS,
            ToRead.TO_READ,
            Translator.TRANSLATOR
        );
    }
}
