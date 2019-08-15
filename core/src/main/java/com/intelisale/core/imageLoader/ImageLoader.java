package com.intelisale.core.imageLoader;

import android.app.Activity;
import android.widget.ImageView;

import androidx.annotation.DrawableRes;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class ImageLoader {

    private final Activity mActivity;
    private final RequestOptions mDefaultRequestOptions;

    public ImageLoader(Activity activity) {
        mActivity = activity;
        mDefaultRequestOptions = new RequestOptions();
    }

    public ImageLoader(Activity mActivity, RequestOptions mDefaultRequestOptions) {
        this.mActivity = mActivity;
        this.mDefaultRequestOptions = mDefaultRequestOptions;
    }

    public void loadImage(String uri, ImageView target) {
        Glide.with(mActivity).load(uri).apply(mDefaultRequestOptions).into(target);
    }

    public void loadImage(String uri, ImageView target, @DrawableRes int inProgressDrawableId, @DrawableRes int errorDrawableId) {
        Glide.with(mActivity).load(uri).apply(mDefaultRequestOptions).load(inProgressDrawableId).error(errorDrawableId).into(target);
    }

    public void loadImageCenterCrop(String uri, ImageView target, @DrawableRes int inProgressDrawableId, @DrawableRes int errorDrawableId) {
        Glide.with(mActivity).load(uri).apply(mDefaultRequestOptions).centerCrop().load(inProgressDrawableId).error(errorDrawableId).into(target);
    }

    public void loadImageCircular(String uri, ImageView target, @DrawableRes int inProgressDrawableId, @DrawableRes int errorDrawableId) {
        Glide.with(mActivity).load(uri).apply(mDefaultRequestOptions).circleCrop().load(inProgressDrawableId).error(errorDrawableId).into(target);
    }
}
