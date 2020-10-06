package com.example.asimplebooklist;

public class BookData {

    private int resId;
    private String title;
    private String rate;

    public BookData(String title, Integer rating, Integer img )
    {
        this.title = title;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
