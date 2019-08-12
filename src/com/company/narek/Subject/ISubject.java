package com.company.narek.Subject;

import com.company.narek.Observer.IObserver;

public interface ISubject {
    void RegisterObserver(IObserver observer);
    void UnregisterObserver(IObserver observer);
    void NotifyObservers();
}
