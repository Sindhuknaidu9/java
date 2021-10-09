class IntegerType{
	public static void integerConverter()
	{
		String engineeringCollege = "3500";
		String population = "1200000";
		String languages = "7000";
		String numberOfEmployees = "250";
		String bataryCapacity = "5000";
		
		int convertedEngineeringCollege = Integer.parseInt(engineeringCollege);
		int convertedPopulation = Integer.parseInt(population);
		int convertedLanguages = Integer.parseInt(languages);
		int convertedNumberOfEmployees = Integer.parseInt(numberOfEmployees);
		int convertedBataryCapacity = Integer.parseInt(bataryCapacity);
		
		System.out.println("==================================================");
		System.out.println("Number of engineering colleges in India "+convertedEngineeringCollege);
		System.out.println("population   "+convertedPopulation);
		System.out.println("number of languages in world "+convertedLanguages);
		System.out.println("number of employees in a company "+convertedNumberOfEmployees);
		System.out.println("batary capacity of a mobile "+convertedBataryCapacity);
	}
}