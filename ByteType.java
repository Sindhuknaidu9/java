class ByteType{
	public static void byteConverter()
	{	
		String age = "60";
		String month = "12";
		String weekdays = "7";
		String hoursInDay = "24";
		String wetherInDegrees = "-4";
		
		byte convertedAge = Byte.parseByte("60");
		byte convertedMonth = Byte.parseByte(month);
		byte convertedWeekdays = Byte.parseByte(weekdays);
		byte convertedHoursInDay = Byte.parseByte(hoursInDay);
		byte convertedWetherInDegrees = Byte.parseByte(wetherInDegrees);
		
		System.out.println("==================================================");
		System.out.println("Age is  "+(convertedAge+3));
		System.out.println("number of months in a year  "+convertedMonth);
		System.out.println("number of days in week  "+convertedWeekdays);
		System.out.println("number of hours in a day  "+convertedHoursInDay);
		System.out.println("wether in srinagar  "+convertedWetherInDegrees);
	}
}