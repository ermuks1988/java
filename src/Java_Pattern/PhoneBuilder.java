package Java_Pattern;

public class PhoneBuilder {
	
	private String Os;
	private double size;
	private String processor;
	private int memory;
	
	
	public PhoneBuilder setOs(String os) {
		Os = os;
		return this;
		
	}
	public PhoneBuilder setSize(double size) {
		this.size = size;
		return this;

	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;

	}
	public PhoneBuilder setMemory(int memory) {
		this.memory = memory;
		return this;

	}
	
	
	public Phone getPhone()
	{
		return new Phone(Os, size, processor, memory);
	}

}
