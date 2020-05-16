package observer;

public interface Subject {

	public void addObserve(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyAllObservers();
	
}
