package com.example.libraryapp;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class BookData implements Serializable {
        public Bitmap drawableId;
        public String title;
        String author;
        String publisher;
        String location;
        String summary;

        public BookData(Bitmap drawableId, String price,String author,String publisher,String location,String summary){
            this.drawableId = drawableId;
            this.title = price;
            this.author = author;
            this.publisher = publisher;
            this.location = location;
            this.summary = summary;
        }


}
