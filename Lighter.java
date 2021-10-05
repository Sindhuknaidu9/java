class LighterRunner{
	public static void main(String[] args){
		Lighter.on(true);
		Lighter.off(false);
		Lighter.light(-6);
	}
}

class Lighter{
	public static boolean on(boolean valueArg){
		boolean value = valueArg;
		if(value){
			System.out.println("lighter is on");
		}
		System.out.println(value);
		return valueArg;
	}

	public static boolean off(boolean valueArg){
		boolean value = valueArg;
		if(value == false){
			System.out.println("lighter is off");
		}
		System.out.println(value);
		return valueArg;
	}
	
	public static boolean light(int width){
		int value = width;
		if(value > 0){
			return true;
		}
			return false;
	}
}
