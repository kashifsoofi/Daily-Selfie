package com.course.labs.dailyselfie;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kashif on 16/11/14.
 */
public class SelfieRecord {
    private String mPath;
    private String mName;
    private boolean mSelected;

    public SelfieRecord(String path, String name) {
        mPath = path;
        mName = name;
        mSelected = false;
    }

    public String getPath() {
        return mPath;
    }

    public String getDisplayName() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date date = format.parse(mName, new ParsePosition(0));
        return new SimpleDateFormat("dd MMM, yyyy HH:mm:ss").format(date);
    }

    public boolean getSelected() {
        return mSelected;
    }

    public void setSelected(boolean selected) {
        mSelected = selected;
    }

    @Override
    public String toString() {
        return mName;
    }
}
