package Factory;

public class Factory_main {
	
	public static void main(String[] args) {
		
		OperatingSystemFactory ofs = new OperatingSystemFactory();
		Factory_OS obj = ofs.getInstance("closed");
		obj.spec();
		
	}

}
