class BooleanType{
	public static void booleanConverter()
	{	
		String lightSwitch = "true";
		String door = "false";
		String ignition = "true";
		String screenLock = "true";
		String password = "false";
		
		boolean convertedLightSwitch = Boolean.parseBoolean(lightSwitch);
		boolean convertedDoor = Boolean.parseBoolean(door);
		boolean convertedIgnition = Boolean.parseBoolean(ignition);
		boolean convertedScreenLock = Boolean.parseBoolean(screenLock);
		boolean convertedPassword = Boolean.parseBoolean(password);
		
		System.out.println("==================================================");
		System.out.println(convertedLightSwitch);
		System.out.println(convertedDoor);
		System.out.println(convertedIgnition);
		System.out.println(convertedScreenLock);
		System.out.println(convertedPassword);
	}
}