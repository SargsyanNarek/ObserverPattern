package com.company.narek.Subject;

import com.company.narek.Widget.Notification.INotification;
import com.company.narek.Observer.IObserver;
import com.company.narek.Widget.Notification.Notification;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NotificationCenter implements ISubject {
    ArrayList<IObserver> mObservers;

    Random mRandom;

    List<INotification> mNotifications;

    public NotificationCenter() {
        mObservers = new ArrayList<>();
        mRandom = new Random();
    }

    public void NewNotificationAvailable() {
        NotifyObservers(NotificationGenerator());
    }

    private INotification NotificationGenerator() {
        int random = mRandom.nextInt(3);

        String type;
        switch (random) {
            case Notification.TYPE_SYSTEM_NOTIFICATION: {
                type = "System ";
                break;
            }
            case Notification.TYPE_MESSENGER_NOTIFICATION:  {
                type = "Messenger ";
                break;
            }
            case Notification.TYPE_CALLS_NOTIFICATION: {
                type = "Calls ";
                break;
            }
            default: {
                type = "?";
                break;
            }
        }

        return ((INotification) new Notification(type + "Notification #" + mRandom.nextInt(), random));
    }

    @Override
    public void RegisterObserver(IObserver observer) {
        mObservers.add(observer);
    }

    @Override
    public void UnregisterObserver(IObserver observer) {
        mObservers.remove(observer);
    }

    @Override
    public void NotifyObservers() {

    }

    public void NotifyObservers(INotification notification) {
        for (IObserver observer:mObservers) {
            if (observer.getNotificationType() == notification.getType())
                observer.Update(notification);
        }
    }
}
