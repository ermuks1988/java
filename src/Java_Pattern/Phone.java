package Java_Pattern;
/*
 * Date : 7 dec 2020
 * Builder design pattern 
 * its a creational design pattern
 *
 * 
 */
public class Phone {
	
	private String Os;
	private double size;
	private String processor;
	private int memory;
	
	public Phone(String os, double size, String processor, int memory) {
		super();
		Os = os;
		this.size = size;
		this.processor = processor;
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "Phone [Os=" + Os + ", size=" + size + ", processor=" + processor + ", memory=" + memory + "]";
	}
	
	

}
