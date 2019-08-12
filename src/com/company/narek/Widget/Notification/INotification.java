package com.company.narek.Widget.Notification;

public interface INotification {
    public static final int TYPE_SYSTEM_NOTIFICATION = 0;
    public static final int TYPE_MESSENGER_NOTIFICATION = 1;
    public static final int TYPE_CALLS_NOTIFICATION = 2;

    int getType();
    String getContext();
    void setContext(String notification);

}
