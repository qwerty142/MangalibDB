/*
 * This file is generated by jOOQ.
 */
package Repositories.jooqGenEntities.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
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
public class MangaTypeTag implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tag;
    private String _Type;
    private Long mangaId;

    public MangaTypeTag() {}

    public MangaTypeTag(MangaTypeTag value) {
        this.tag = value.tag;
        this._Type = value._Type;
        this.mangaId = value.mangaId;
    }

    @ConstructorProperties({ "tag", "_Type", "mangaId" })
    public MangaTypeTag(
        @Nullable String tag,
        @Nullable String _Type,
        @NotNull Long mangaId
    ) {
        this.tag = tag;
        this._Type = _Type;
        this.mangaId = mangaId;
    }

    /**
     * Getter for <code>public.manga_type_tag.tag</code>.
     */
    @Nullable
    public String getTag() {
        return this.tag;
    }

    /**
     * Setter for <code>public.manga_type_tag.tag</code>.
     */
    public void setTag(@Nullable String tag) {
        this.tag = tag;
    }

    /**
     * Getter for <code>public.manga_type_tag._type</code>.
     */
    @Nullable
    public String get_Type() {
        return this._Type;
    }

    /**
     * Setter for <code>public.manga_type_tag._type</code>.
     */
    public void set_Type(@Nullable String _Type) {
        this._Type = _Type;
    }

    /**
     * Getter for <code>public.manga_type_tag.manga_id</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getMangaId() {
        return this.mangaId;
    }

    /**
     * Setter for <code>public.manga_type_tag.manga_id</code>.
     */
    public void setMangaId(@NotNull Long mangaId) {
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
        final MangaTypeTag other = (MangaTypeTag) obj;
        if (this.tag == null) {
            if (other.tag != null)
                return false;
        }
        else if (!this.tag.equals(other.tag))
            return false;
        if (this._Type == null) {
            if (other._Type != null)
                return false;
        }
        else if (!this._Type.equals(other._Type))
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
        result = prime * result + ((this.tag == null) ? 0 : this.tag.hashCode());
        result = prime * result + ((this._Type == null) ? 0 : this._Type.hashCode());
        result = prime * result + ((this.mangaId == null) ? 0 : this.mangaId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MangaTypeTag (");

        sb.append(tag);
        sb.append(", ").append(_Type);
        sb.append(", ").append(mangaId);

        sb.append(")");
        return sb.toString();
    }
}
