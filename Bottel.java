class Storing{
	public static void storing(){
		int bottelPrice = 250;
		String color = "Blue";
		float height = 4.5f;
		String quality = "Good";
		String brands[] = {"cello","milton","pegion","borosil","wildcraft"};
		
		System.out.println("Bottel price is "+bottelPrice);
		System.out.println("Bottel color is "+color);
		System.out.println("Bottel height is "+height);
		System.out.println("Quality of the bottel is "+quality);
		
		for(int index = 0; index < brands.length; index++)
		{
			String temp = brands[index];
			System.out.println(temp);
		}
	}
}

class Bottel{
	public static void main(String[] args){
		Storing.storing();
	}
}





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