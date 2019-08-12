package com.company.narek.Widget;

import com.company.narek.Observer.IObserver;
import com.company.narek.Widget.Notification.INotification;
import com.company.narek.Widget.Notification.Notification;

public class MessengerWidget implements IObserver,IWidget {
    private Notification mNotification;

    public int getNotificationType() {
        return Notification.TYPE_MESSENGER_NOTIFICATION;
    }

    @Override
    public void Update(INotification notification) {
        mNotification = ((Notification) notification);
        Display();
    }

    @Override
    public void Display() {
        System.out.println(mNotification.getContext());
    }
}
