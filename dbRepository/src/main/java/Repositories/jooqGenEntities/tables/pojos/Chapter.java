/*
 * This file is generated by jOOQ.
 */
package Repositories.jooqGenEntities.tables.pojos;


import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


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
public class Chapter implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long chapterId;
    private String initPictureLink;
    private Long mangaId;

    public Chapter() {}

    public Chapter(Chapter value) {
        this.chapterId = value.chapterId;
        this.initPictureLink = value.initPictureLink;
        this.mangaId = value.mangaId;
    }

    @ConstructorProperties({ "chapterId", "initPictureLink", "mangaId" })
    public Chapter(
        @Nullable Long chapterId,
        @Nullable String initPictureLink,
        @Nullable Long mangaId
    ) {
        this.chapterId = chapterId;
        this.initPictureLink = initPictureLink;
        this.mangaId = mangaId;
    }

    /**
     * Getter for <code>public.chapter.chapter_id</code>.
     */
    @Nullable
    public Long getChapterId() {
        return this.chapterId;
    }

    /**
     * Setter for <code>public.chapter.chapter_id</code>.
     */
    public void setChapterId(@Nullable Long chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * Getter for <code>public.chapter.init_picture_link</code>.
     */
    @Size(max = 255)
    @Nullable
    public String getInitPictureLink() {
        return this.initPictureLink;
    }

    /**
     * Setter for <code>public.chapter.init_picture_link</code>.
     */
    public void setInitPictureLink(@Nullable String initPictureLink) {
        this.initPictureLink = initPictureLink;
    }

    /**
     * Getter for <code>public.chapter.manga_id</code>.
     */
    @Nullable
    public Long getMangaId() {
        return this.mangaId;
    }

    /**
     * Setter for <code>public.chapter.manga_id</code>.
     */
    public void setMangaId(@Nullable Long mangaId) {
        this.mangaId = mangaId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Chapter other = (Chapter) obj;
        if (this.chapterId == null) {
            if (other.chapterId != null)
                return false;
        }
        else if (!this.chapterId.equals(other.chapterId))
            return false;
        if (this.initPictureLink == null) {
            if (other.initPictureLink != null)
                return false;
        }
        else if (!this.initPictureLink.equals(other.initPictureLink))
            return false;
        if (this.mangaId == null) {
            if (other.mangaId != null)
                return false;
        }
        else if (!this.mangaId.equals(other.mangaId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.chapterId == null) ? 0 : this.chapterId.hashCode());
        result = prime * result + ((this.initPictureLink == null) ? 0 : this.initPictureLink.hashCode());
        result = prime * result + ((this.mangaId == null) ? 0 : this.mangaId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Chapter (");

        sb.append(chapterId);
        sb.append(", ").append(initPictureLink);
        sb.append(", ").append(mangaId);

        sb.append(")");
        return sb.toString();
    }
}