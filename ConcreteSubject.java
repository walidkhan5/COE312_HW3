package HW3;

import java.util.*;

public class ConcreteSubject implements Subject 
{
    private ArrayList<Observer> Observers;

    public ConcreteSubject() 
    {
        Observers = new ArrayList<Observer>();
    }

    @Override
    public void RegisterObserver(Observer o) 
    {
        Observers.add(o);
    }

    @Override
    public void RemoveObserver(Observer o) 
    {
        int i = Observers.indexOf(o);
        if (i >= 0) Observers.remove(i);

    }

    @Override
    public void NotifyObserver() 
    {
        for (int i = 0; i < Observers.size(); i++) 
        {
            Observer observer = (Observer) Observers.get(i);
            observer.update();
        }
    }
}
