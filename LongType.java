class LongType{
	public static void longConverter()
	{	
		String phnumber = "9876543210";
		String population = "4641054775l";
		String areaOfLand = "148940000";
		String water= "598100000000";
		
		long convertedPhnumber = Long.parseLong(phnumber);
		long convertedPopulation = Long.parseLong(population);
		long convertedAreaOfLand = Long.parseLong(areaOfLand);
		long convertedWater = Long.parseLong(water);
		
		System.out.println("==================================================");
		System.out.println("contact number "+convertedPhnumber);
		System.out.println("total number of population in asia "+convertedPopulation);
		System.out.println("Area of land on earth "+convertedAreaOfLand+"sq km");
		System.out.println("total liters of water used in china in a year "+convertedWater);
	}
}