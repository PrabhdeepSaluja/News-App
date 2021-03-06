package com.example.user.theguardiannews;

import android.graphics.Bitmap;
import android.support.annotation.Nullable;

public class ArticleData {

    private String mArticleTitle;
    private String mArticleSection;
    private Bitmap mArticleThumbnail;
    private String mArticlePublishTime;
    private String mArticleURL;

    public ArticleData(String articleSection, String articleTitle, Bitmap articleThumbnail, String articlePublishTime, String articleURL) {

        mArticleTitle = articleTitle;
        mArticleSection = articleSection;
        mArticleThumbnail = articleThumbnail;
        mArticlePublishTime = articlePublishTime;
        mArticleURL = articleURL;
    }

    @Nullable
    public String getArticleTitle() {
        return mArticleTitle;
    }

    @Nullable
    public String getArticleSection() {
        return mArticleSection;
    }

    @Nullable
    public Bitmap getArticleThumbnail() {
        return mArticleThumbnail;
    }

    @Nullable
    public String getArticlePublishTime() {
        return mArticlePublishTime;
    }

    @Nullable
    public String getArticleURL() {
        return mArticleURL;
    }
}
