package HW3;

public class ConcreteObserver implements Observer 
{
    private Subject subject;
    
    public ConcreteObserver(Subject subject)
    {
        this.subject = subject;
        subject.RegisterObserver(this);
    }
   
    @Override
    public void update() 
    {
    
    }
}

