class Entertain{
	public static void entertain(){
		int ticketPrice = 250;
		float movieLength = 2.5f;
		float rating = 4.5f;
		String movie = "Android Kunjappan";
		String actors[] = {"Soubin","Suraj","Megha","Kendy","Rajesh"};
		
		System.out.println("Movie name is "+movie);
		System.out.println("Ticket Price is "+ticketPrice);
		System.out.println("Movie Length is "+movieLength);
		System.out.println("Movie rating is "+rating);
		
		for(int index = 0; index < actors.length; index++)
		{
			String temp = actors[index];
			System.out.println(temp);
		}
	}
}

class Movie{
	public static void main(String[] args){
		Entertain.entertain();
	}
}