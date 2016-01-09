package com.hhua.android.producthunt;


import android.content.Context;

import com.parse.Parse;

/*
 * This is the Android application itself and is used to configure various settings
 * including the image cache in memory and on disk. This also adds a singleton
 * for accessing the relevant rest client.
 *
 *     TwitterClient client = TwitterApplication.getRestClient();
 *     // use client to send requests to API
 *
 */
public class ProductHuntApplication extends com.activeandroid.app.Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        ProductHuntApplication.context = this;
        Parse.initialize(this, "Parse Application ID", "Parse client key");
    }


    public static ProductHuntClient getRestClient() {
        return (ProductHuntClient) ProductHuntClient.getInstance(ProductHuntClient.class, ProductHuntApplication.context);
    }

}
