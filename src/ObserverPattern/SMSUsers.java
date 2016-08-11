package ObserverPattern;

public class SMSUsers implements Observer {

	private final Subject subject;
	private String desc;
	private String userInfo;
	public SMSUsers(Subject subject,String userInfo){
		if(subject == null)
			throw new IllegalArgumentException("No publisher found");
		this.subject = subject;
		this.userInfo = userInfo;
	}

	@Override
	public void subscribe() {
		// TODO Auto-generated method stub
		System.out.println("Subscribing "+userInfo+" to "+subject.subjectDetails());
		this.subject.subscribeObserver(this);
		System.out.println("Subscribed successfully.");
	}

	@Override
	public void unsubscribe() {
		// TODO Auto-generated method stub
		System.out.println("Unsubscribing "+userInfo+" to "+subject.subjectDetails());
		this.subject.unsubscribeObserver(this);
		System.out.println("Unsubscribed successfully.");
	}

	@Override
	public void update(String desc) {
		// TODO Auto-generated method stub
		this.desc = desc;
		display();
	}

	private void display(){
		System.out.println("["+userInfo+"]: "+desc);
	}
}
