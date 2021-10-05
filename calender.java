class CalenderRunner{
	public static void main(String[] values){
		Calendar.person("sindhu");
		
	}
}

class Calender{
	public static void getMonth( String personName){
		
		if(personName == "sindhu")
			return month;
		else if(personName == "geetha")
			return month;
		else if(personName == "sanjay")
			return month;
		else if(personName == "teju")
			return month;
		
	}
	public static void person(String personName){
		int month;
		String day;
		
		if(personName == "sindhu"){
			month = 11;
			day = "monday";
		}
			
		if(personName == "geetha"){
			month = 3;
			day = "saturday";
		}
		if(personName == "sanjay"){
			month = 1;
			day = "sunday";
		}
		if(personName == "teju"){
			month = 12;
			day = "thursday";
		}

	}
	

public static String getBirthDay(String personName){
	
	if(personName == "sindhu")
			return "monday";
	else if(personName == "geetha")
			return "saturday";
		else if(personName == "sanjay")
			return "sunday";
		else if(personName == "teju")
			return "thursday";
 
	}
}