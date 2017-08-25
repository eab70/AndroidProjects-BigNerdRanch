package com.bignerdranch.android.criminalintent;

import android.icu.lang.UCharacterCategory;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Created by eabac on 7/22/2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private Date mTime;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = Calendar.getInstance().getTime();
        mTime = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) { mTitle = title; }

    public Date getDate() {return mDate; }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getTime() {return mTime; }

    public void setTime(Date time) { mTime = time;}

}
