class DoubleType{
	public static void doubleConverter()
	{
		String price = "987.654d";
		String fees = "46.90";
		String distance = "45.89";
		String calories = "203.67";
		String area = "5.98";
		
		double convertedPrice = Double.parseDouble(price);
		double convertedFees = Double.parseDouble(fees);
		double convertedDistance = Double.parseDouble(distance);
		double convertedCalories = Double.parseDouble(calories);
		double convertedarea = Double.parseDouble(area);
		
		System.out.println("==================================================");
		System.out.println("price of a product is "+convertedPrice);
		System.out.println("fees of a student is "+convertedFees);
		System.out.println("distance is "+convertedDistance+"km");
		System.out.println("calories in a cup of rice "+convertedCalories);
		System.out.println("area of circle is"+convertedarea);
	}
}