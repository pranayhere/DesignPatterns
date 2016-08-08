package FacadePattern;

public class FacadeDemo {
	public static void main(String[] args) throws InterruptedException {
		ScheduleServer scheduleServer = new ScheduleServer();
		ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);
		
		facadeServer.startServer();
		Thread.sleep(3000);
		facadeServer.stopServer();
	}
}
