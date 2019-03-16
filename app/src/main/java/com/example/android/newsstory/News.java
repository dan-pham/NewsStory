package com.example.android.newsstory;

public class News {

    private String mTitle;
    private String mSectionName;
    private String mAuthorName;
    private String mDatePublished;
    private String mUrl;

    public News(String title, String sectionName, String authorName, String datePublished,
                String url) {
        mTitle = title;
        mSectionName = sectionName;
        mAuthorName = authorName;
        mDatePublished = datePublished;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getAuthorName() {
        return mAuthorName;
    }

    public String getDatePublished() {
        return mDatePublished;
    }

    public String getUrl() {
        return mUrl;
    }
}