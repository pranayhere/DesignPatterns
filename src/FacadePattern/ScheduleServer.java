package FacadePattern;

public class ScheduleServer {
	public void startBooting() {
		System.out.println("System booting started...");
	}
	public void readSystemConfigFile() {
		System.out.println("Reading config file...");
	}
	public void init() {
		System.out.println("Initializing the server...");
	}
	public void initializeContext() {
		System.out.println("Initializing context...");
	}
	public void initializeListeners() {
		System.out.println("Initializing listeners...");
	}
	public void createSystemObjects() {
		System.out.println("Creating system object...");
		System.out.println("Server is started...");
	}
	public void releaseProcesses() {
		System.out.println("Shutdown is called...");
		System.out.println("Releasing processes...");
	}
	public void destroy() {
		System.out.println("Destroying the process...");
	}
	public void destroySystemObjects() {
		System.out.println("Destroying system objects...");
	}
	public void destoryListeners() {
		System.out.println("Destroying Listeners....");
	}
	public void destoryContext() {
		System.out.println("Destroying context...");
	}
	public void shutdown() {
		System.out.println("Shutdown");
	}
}
