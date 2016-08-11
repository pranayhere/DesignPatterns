package ObserverPattern;

import java.util.List;

public class CommentaryObject implements Subject, Commentary {
	private final List<Observer> observers;
	private String desc;
	private final String subjectDetails;

	public CommentaryObject(List<Observer> observers, String subjectDetails) {
		this.observers = observers;
		this.subjectDetails = subjectDetails;
	}

	@Override
	public void setDesc(String desc) {
		// TODO Auto-generated method stub
		this.desc = desc;
		notifyObserver();
	}

	@Override
	public void subscribeObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void unsubscribeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(observer);
		observers.remove(index);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println();
		for(Observer observer : observers){
			observer.update(desc);
		}
	}

	@Override
	public String subjectDetails() {
		// TODO Auto-generated method stub
		return subjectDetails;
	}


}
