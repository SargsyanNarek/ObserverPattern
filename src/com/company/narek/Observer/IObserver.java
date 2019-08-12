package com.company.narek.Observer;

import com.company.narek.Widget.Notification.INotification;

public interface IObserver {
    void Update(INotification notification);
    int getNotificationType();
}
