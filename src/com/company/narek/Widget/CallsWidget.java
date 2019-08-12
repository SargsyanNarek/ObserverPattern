package com.company.narek.Widget;

import com.company.narek.Observer.IObserver;
import com.company.narek.Widget.Notification.INotification;
import com.company.narek.Widget.Notification.Notification;

public class CallsWidget implements IObserver,IWidget {
    private Notification mNotification;

    @Override
    public void Update(INotification notification) {
        mNotification = ((Notification) notification);
        Display();
    }

    @Override
    public int getNotificationType() {
        return Notification.TYPE_CALLS_NOTIFICATION;
    }

    @Override
    public void Display() {
        System.out.println(mNotification.getContext());
    }
}
