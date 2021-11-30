package com.example.storegames.model;

import java.util.Date;
import java.util.UUID;

public class Game {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mBuyed;

    public Game() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isBuyed() {
        return mBuyed;
    }

    public void setBuyed(boolean mBuyed) {
        this.mBuyed = mBuyed;
    }
}
