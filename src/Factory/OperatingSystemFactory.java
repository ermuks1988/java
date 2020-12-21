package Factory;

public class OperatingSystemFactory {

	public Factory_OS getInstance(String str) {
		if (str.endsWith("open"))
			return new Factory_Android();

		else if (str.equals("closed"))
			return new Factory_Windows();

		else
			return new Factory_IOS();

	}

}
