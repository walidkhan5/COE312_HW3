package HW3;

public interface Subject {
	void RegisterObserver(Observer o);
    void RemoveObserver(Observer o);
    void  NotifyObserver();
}
