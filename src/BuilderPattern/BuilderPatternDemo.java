package BuilderPattern;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder("500GB", "2GB").setBluetoothEnabled(true).build();
		System.out.println("comp : "+comp.isBluetoothEnabled());
	}
}
