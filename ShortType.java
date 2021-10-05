class ShortType{
	public static void shortConverter()
	{
		String engineeringCollege = "3500";
		String populationOfVillage = "1200";
		String languages = "7000";
		String numberOfEmployees = "250";
		String bataryCapacity = "5000";
		
		short convertedEngineeringCollege = Short.parseShort(engineeringCollege);
		short convertedPopulationOfVillage = Short.parseShort(populationOfVillage);
		short convertedLanguages = Short.parseShort(languages);
		short convertedNumberOfEmployees = Short.parseShort(numberOfEmployees);
		short convertedBataryCapacity = Short.parseShort(bataryCapacity);
		
		System.out.println("==================================================");
		System.out.println("Number of engineering colleges in India "+convertedEngineeringCollege);
		System.out.println("population of a village is  "+populationOfVillage);
		System.out.println("number of languages in world "+convertedLanguages);
		System.out.println("number of employees in a company "+convertedNumberOfEmployees);
		System.out.println("batary capacity of a mobile "+convertedBataryCapacity);
	}
}