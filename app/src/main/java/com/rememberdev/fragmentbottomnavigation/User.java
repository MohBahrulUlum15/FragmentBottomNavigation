package com.rememberdev.fragmentbottomnavigation;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private int photo;
    private String nama;
    private String isi;

    User () {
    }

    protected User(Parcel in) {
        photo = in.readInt();
        nama = in.readString();
        isi = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(photo);
        parcel.writeString(nama);
        parcel.writeString(isi);
    }
}
