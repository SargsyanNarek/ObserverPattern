package com.company.narek;

import com.company.narek.Subject.NotificationCenter;
import com.company.narek.Widget.CallsWidget;
import com.company.narek.Widget.MessengerWidget;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        NotificationCenter notificationCenter = new NotificationCenter();

        int i = 0;

        MessengerWidget messengerWidget = new MessengerWidget();

        notificationCenter.RegisterObserver(messengerWidget);

        Random random = new Random();

        Printer();


        while (true) {
            notificationCenter.NewNotificationAvailable();

            ++i;

            if (i == 7)
                notificationCenter.RegisterObserver(new CallsWidget());
            if (i == 10)
                notificationCenter.RegisterObserver(new MessengerWidget());
            try {
                Thread.sleep(random.nextInt(1001)+1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void Printer() {
        System.out.println("This string printed for GIT test !!!");
    }
}
