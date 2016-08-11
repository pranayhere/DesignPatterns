package ObserverPattern;

public interface Subject {
	public void subscribeObserver(Observer observer);
	public void unsubscribeObserver(Observer observer);
	public void notifyObserver();
	public String subjectDetails();
}
