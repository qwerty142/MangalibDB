/*
 * This file is generated by jOOQ.
 */
package Repositories.jooqGenEntities.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.math.BigDecimal;

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
public class Manga implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long mangaId;
    private BigDecimal middleReview;
    private Long authorId;
    private Long translatorId;

    public Manga() {}

    public Manga(Manga value) {
        this.mangaId = value.mangaId;
        this.middleReview = value.middleReview;
        this.authorId = value.authorId;
        this.translatorId = value.translatorId;
    }

    @ConstructorProperties({ "mangaId", "middleReview", "authorId", "translatorId" })
    public Manga(
        @Nullable Long mangaId,
        @Nullable BigDecimal middleReview,
        @Nullable Long authorId,
        @Nullable Long translatorId
    ) {
        this.mangaId = mangaId;
        this.middleReview = middleReview;
        this.authorId = authorId;
        this.translatorId = translatorId;
    }

    /**
     * Getter for <code>public.manga.manga_id</code>.
     */
    @Nullable
    public Long getMangaId() {
        return this.mangaId;
    }

    /**
     * Setter for <code>public.manga.manga_id</code>.
     */
    public void setMangaId(@Nullable Long mangaId) {
        this.mangaId = mangaId;
    }

    /**
     * Getter for <code>public.manga.middle_review</code>.
     */
    @Nullable
    public BigDecimal getMiddleReview() {
        return this.middleReview;
    }

    /**
     * Setter for <code>public.manga.middle_review</code>.
     */
    public void setMiddleReview(@Nullable BigDecimal middleReview) {
        this.middleReview = middleReview;
    }

    /**
     * Getter for <code>public.manga.author_id</code>.
     */
    @Nullable
    public Long getAuthorId() {
        return this.authorId;
    }

    /**
     * Setter for <code>public.manga.author_id</code>.
     */
    public void setAuthorId(@Nullable Long authorId) {
        this.authorId = authorId;
    }

    /**
     * Getter for <code>public.manga.translator_id</code>.
     */
    @Nullable
    public Long getTranslatorId() {
        return this.translatorId;
    }

    /**
     * Setter for <code>public.manga.translator_id</code>.
     */
    public void setTranslatorId(@Nullable Long translatorId) {
        this.translatorId = translatorId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Manga other = (Manga) obj;
        if (this.mangaId == null) {
            if (other.mangaId != null)
                return false;
        }
        else if (!this.mangaId.equals(other.mangaId))
            return false;
        if (this.middleReview == null) {
            if (other.middleReview != null)
                return false;
        }
        else if (!this.middleReview.equals(other.middleReview))
            return false;
        if (this.authorId == null) {
            if (other.authorId != null)
                return false;
        }
        else if (!this.authorId.equals(other.authorId))
            return false;
        if (this.translatorId == null) {
            if (other.translatorId != null)
                return false;
        }
        else if (!this.translatorId.equals(other.translatorId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.mangaId == null) ? 0 : this.mangaId.hashCode());
        result = prime * result + ((this.middleReview == null) ? 0 : this.middleReview.hashCode());
        result = prime * result + ((this.authorId == null) ? 0 : this.authorId.hashCode());
        result = prime * result + ((this.translatorId == null) ? 0 : this.translatorId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Manga (");

        sb.append(mangaId);
        sb.append(", ").append(middleReview);
        sb.append(", ").append(authorId);
        sb.append(", ").append(translatorId);

        sb.append(")");
        return sb.toString();
    }
}