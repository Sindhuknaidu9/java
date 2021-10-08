class Climate
	{
		int temp;
		String humidity;
		String description;
		String location;
		String type;

		Climate()
		{
		System.out.println("This is the No argument constructor");
		}
		Climate(String location)
		{
		System.out.println("Invoked the constructor with the location string");
		location=location;
		System.out.println("Location: "+location);
		}

		Climate(int temp,String humidity)
		{
		System.out.println("Invoked the constructor with the Temperature and humidity");
		temp=temp;
		humidity=humidity;
		System.out.println("Temperature: "+temp+"\nHumidity: "+humidity);
		}


		Climate(String description,int temp)
		{
		System.out.println("Invoked the constructor with the Temperature and Description string");
		description=description;
		System.out.println("All About the day: "+description);
		}

		Climate(int temp,String humidity,String description,String location,String type)
		{
		System.out.println("Invoked the constructor with all the values");
		temp=temp;
		humidity=humidity;
		description=description;
		location=location;
		type=type;
		System.out.println("Location: "+location+"\nTemperature: "+temp+"\nHumidity: "+humidity+"\nAbout the day: "+description+"\nChances of rain: "+type);
		}
		}