package com.example.openmuzik;


import android.content.Context;

public class AlbumDetail {

    private String mArtistName;
    private String mMusicName;
    private int mImageId;

    public AlbumDetail(String artistName, String musicName, int imageId) {
        mArtistName = artistName;
        mMusicName = musicName;
        mImageId = imageId;

    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getMusicName() {
        return mMusicName;
    }

    public int getImageId() {
        return mImageId;
    }


}
