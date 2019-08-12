package com.company.narek.Widget.Notification;

public class Notification implements INotification {
    private String mNotification;
    private int mType;

    public Notification(String notification, int type) {
        mNotification = notification;
        mType = type;
    }

    @Override
    public int getType() {
        return mType;
    }

    @Override
    public String getContext() {
        return mNotification;
    }

    @Override
    public void setContext(String notification) {
        mNotification = notification;
    }
}
