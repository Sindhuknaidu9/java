class Scooter{

	String company="tvs";
	int price=60000;
	int maxSpeed=70;
	int kmDriven;
	byte milage=40;

	Scooter(String company)
	{
		System.out.println(this);
		System.out.println(this.company);
		this.company=company;	
	}
	Scooter(int price)
	{
		
		System.out.println(this);
		System.out.println(this.price);
		this.price=price;
	
	}
	Scooter(byte milage)
	{

		System.out.println(this);
		System.out.println(this.milage);
		this.milage=milage;
		
	}

}