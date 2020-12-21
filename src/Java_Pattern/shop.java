package Java_Pattern;

public class shop {
	
	public static void main(String[] args) {
		
		Phone p1 = new PhoneBuilder().setMemory(132).setOs("unix").getPhone();
		System.out.println(p1);
	}

}
