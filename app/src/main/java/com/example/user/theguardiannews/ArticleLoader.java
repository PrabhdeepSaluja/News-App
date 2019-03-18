package com.example.user.theguardiannews;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;

public class ArticleLoader extends AsyncTaskLoader {

    private Bundle pBundle;


    public ArticleLoader(final Context context, final Bundle bundle) {
        super(context);
        pBundle = bundle;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    @Nullable
    public Object loadInBackground() {
        List<ArticleData> articleList = null;
        if (pBundle != null) {
            articleList = QueryUtils.fetchArticleData(pBundle.getString("uri"));
        }
        return articleList;
    }
}