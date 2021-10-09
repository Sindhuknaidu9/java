class SpeakerRunner{
	public static void main(String[] values){
		Speaker.volume(10);
		Speaker.power(true);
	}
}

class Speaker{
	public static void volume( int level){
		
		if(level <= 0)
			System.out.println("on it first");
		if(level <= 3)
			System.out.println("ok");
		if(level >= 3)
			System.out.println("loud");
		if(level > 9)
			System.out.println("call police");
		
	}

public static boolean power(boolean value){
	boolean turnOn = true;
	boolean turnOff = false;
	
	if(turnOn = true)
		System.out.println("true");
	else 
		System.out.println("false");
		return value;
 
	}
}