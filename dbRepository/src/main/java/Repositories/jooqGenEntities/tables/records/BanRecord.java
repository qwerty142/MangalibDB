/*
 * This file is generated by jOOQ.
 */
package Repositories.jooqGenEntities.tables.records;


import Repositories.jooqGenEntities.tables.Ban;

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
public class BanRecord extends UpdatableRecordImpl<BanRecord> implements Record3<Long, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.ban.ban_id</code>.
     */
    public void setBanId(@Nullable Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.ban.ban_id</code>.
     */
    @Nullable
    public Long getBanId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.ban.ban_enum</code>.
     */
    public void setBanEnum(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.ban.ban_enum</code>.
     */
    @Size(max = 255)
    @Nullable
    public String getBanEnum() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.ban.user_id</code>.
     */
    public void setUserId(@Nullable Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.ban.user_id</code>.
     */
    @Nullable
    public Long getUserId() {
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
        return Ban.BAN.BAN_ID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return Ban.BAN.BAN_ENUM;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return Ban.BAN.USER_ID;
    }

    @Override
    @Nullable
    public Long component1() {
        return getBanId();
    }

    @Override
    @Nullable
    public String component2() {
        return getBanEnum();
    }

    @Override
    @Nullable
    public Long component3() {
        return getUserId();
    }

    @Override
    @Nullable
    public Long value1() {
        return getBanId();
    }

    @Override
    @Nullable
    public String value2() {
        return getBanEnum();
    }

    @Override
    @Nullable
    public Long value3() {
        return getUserId();
    }

    @Override
    @NotNull
    public BanRecord value1(@Nullable Long value) {
        setBanId(value);
        return this;
    }

    @Override
    @NotNull
    public BanRecord value2(@Nullable String value) {
        setBanEnum(value);
        return this;
    }

    @Override
    @NotNull
    public BanRecord value3(@Nullable Long value) {
        setUserId(value);
        return this;
    }

    @Override
    @NotNull
    public BanRecord values(@Nullable Long value1, @Nullable String value2, @Nullable Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BanRecord
     */
    public BanRecord() {
        super(Ban.BAN);
    }

    /**
     * Create a detached, initialised BanRecord
     */
    @ConstructorProperties({ "banId", "banEnum", "userId" })
    public BanRecord(@Nullable Long banId, @Nullable String banEnum, @Nullable Long userId) {
        super(Ban.BAN);

        setBanId(banId);
        setBanEnum(banEnum);
        setUserId(userId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised BanRecord
     */
    public BanRecord(Repositories.jooqGenEntities.tables.pojos.Ban value) {
        super(Ban.BAN);

        if (value != null) {
            setBanId(value.getBanId());
            setBanEnum(value.getBanEnum());
            setUserId(value.getUserId());
            resetChangedOnNotNull();
        }
    }
}
