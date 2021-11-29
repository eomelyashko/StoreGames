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

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismBuyed() {
        return mBuyed;
    }

    public void setmBuyed(boolean mBuyed) {
        this.mBuyed = mBuyed;
    }
}
