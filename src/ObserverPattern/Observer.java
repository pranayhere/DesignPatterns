package ObserverPattern;

public interface Observer {
	public void subscribe();
	public void unsubscribe();
	public void update(String desc);
}
