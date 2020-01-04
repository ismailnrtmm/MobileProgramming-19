package com.ismailnrtmm.myrecyclevieww;

import android.os.Parcel;
import android.os.Parcelable;

public class Fak implements Parcelable {
    private String name;
    private String description;
    private String photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.photo);
    }

    Fak (){

    }

    private Fak(Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        this.photo = in.readString();
    }

    public static final Parcelable.Creator<Fak> CREATOR = new Parcelable.Creator<Fak>() {
        @Override
        public Fak createFromParcel(Parcel source) {
            return new Fak (source);
        }

        @Override
        public Fak[] newArray(int size) {
            return new Fak[size];
        }
    };

}
