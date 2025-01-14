/*
 * This file is generated by jOOQ.
 */
package Repositories.jooqGenEntities.tables.records;


import Repositories.jooqGenEntities.tables.Chapter;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ChapterRecord extends UpdatableRecordImpl<ChapterRecord> implements Record3<Long, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.chapter.chapter_id</code>.
     */
    public void setChapterId(@Nullable Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.chapter.chapter_id</code>.
     */
    @Nullable
    public Long getChapterId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.chapter.init_picture_link</code>.
     */
    public void setInitPictureLink(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.chapter.init_picture_link</code>.
     */
    @Size(max = 255)
    @Nullable
    public String getInitPictureLink() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.chapter.manga_id</code>.
     */
    public void setMangaId(@Nullable Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.chapter.manga_id</code>.
     */
    @Nullable
    public Long getMangaId() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<Long, String, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row3<Long, String, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return Chapter.CHAPTER.CHAPTER_ID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return Chapter.CHAPTER.INIT_PICTURE_LINK;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return Chapter.CHAPTER.MANGA_ID;
    }

    @Override
    @Nullable
    public Long component1() {
        return getChapterId();
    }

    @Override
    @Nullable
    public String component2() {
        return getInitPictureLink();
    }

    @Override
    @Nullable
    public Long component3() {
        return getMangaId();
    }

    @Override
    @Nullable
    public Long value1() {
        return getChapterId();
    }

    @Override
    @Nullable
    public String value2() {
        return getInitPictureLink();
    }

    @Override
    @Nullable
    public Long value3() {
        return getMangaId();
    }

    @Override
    @NotNull
    public ChapterRecord value1(@Nullable Long value) {
        setChapterId(value);
        return this;
    }

    @Override
    @NotNull
    public ChapterRecord value2(@Nullable String value) {
        setInitPictureLink(value);
        return this;
    }

    @Override
    @NotNull
    public ChapterRecord value3(@Nullable Long value) {
        setMangaId(value);
        return this;
    }

    @Override
    @NotNull
    public ChapterRecord values(@Nullable Long value1, @Nullable String value2, @Nullable Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChapterRecord
     */
    public ChapterRecord() {
        super(Chapter.CHAPTER);
    }

    /**
     * Create a detached, initialised ChapterRecord
     */
    @ConstructorProperties({ "chapterId", "initPictureLink", "mangaId" })
    public ChapterRecord(@Nullable Long chapterId, @Nullable String initPictureLink, @Nullable Long mangaId) {
        super(Chapter.CHAPTER);

        setChapterId(chapterId);
        setInitPictureLink(initPictureLink);
        setMangaId(mangaId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ChapterRecord
     */
    public ChapterRecord(Repositories.jooqGenEntities.tables.pojos.Chapter value) {
        super(Chapter.CHAPTER);

        if (value != null) {
            setChapterId(value.getChapterId());
            setInitPictureLink(value.getInitPictureLink());
            setMangaId(value.getMangaId());
            resetChangedOnNotNull();
        }
    }
}
