class Monitor{

	float size;
	String brand="hp";
	int price=16000;
	String resolution="XGA wide";
	byte refreshRate=60;

	Monitor(float size)
	{
		System.out.println(this);
		System.out.println(this.size);
		this.size=size;
	}
	Monitor(String resolution, String brand)
	{
		System.out.println(this);
		System.out.println(this.resolution);
		this.resolution=resolution;
	}
	Monitor(String brand)
	{
		System.out.println(this);
		System.out.println(this.brand);
		this.brand=brand;

	}
	Monitor(byte refreshRate)
	{
		System.out.println(this);
		System.out.println(this.refreshRate);
		this.refreshRate=refreshRate;
	}


}