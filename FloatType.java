class FloatType{
	public static void floatConverter()
	{
		String salary = "3.8f";
		String version = "1.8f";
		String percentage = "82.30f";
		String dataSpeed = "12.3f";
		String distance = "28.6f";
		
		float convertedSalary = Float.parseFloat(salary);
		float convertedVersion = Float.parseFloat(version);
		float convertedPercentage = Float.parseFloat(percentage);
		float convertedDataSpeed= Float.parseFloat(dataSpeed);
		float convertedDistance= Float.parseFloat(distance);
		
		System.out.println("==================================================");
		System.out.println("salary of a employee per annum "+(convertedSalary+23));
		System.out.println("java version "+convertedVersion);
		System.out.println("persentage obtained in MCA "+convertedPercentage);
		System.out.println("speed of data is "+convertedDataSpeed+"kbps");
		System.out.println("distance from bhadravathi to shimogga is "+convertedDistance+"km");
	}
}