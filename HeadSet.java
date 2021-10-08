class HeadSet
{
int price;
String type;
String brand;
boolean noiceCancellation;
boolean mic;

HeadSet()
{
System.out.println("This is the No argument constructor");
}

HeadSet(String type)
{
System.out.println("Invoked the constructor with the type string");
type=type;
System.out.println("Type: "+type);
}

HeadSet(int price)
{
System.out.println("Invoked the constructor with the int price");
price=price;
System.out.println("Price: "+price);
}
HeadSet(String brand,int price)
{
System.out.println("Invoked the constructor with the brand string and int price");
price=price;
System.out.println("Brand: "+brand+"\nPrice: "+price);
}

HeadSet(String brand,boolean noiceCancellation)
{
System.out.println("Invoked the constructor with the brand string and boolean value");
brand=brand;
noiceCancellation=noiceCancellation;
System.out.println("Brand: "+brand+"\nNoice Cancellation: "+noiceCancellation);
}

HeadSet(String brand,boolean mic,boolean noiceCancellation)
{
System.out.println("Invoked the constructor with stringbrand, boolean mic and boolean noice");
brand=brand;
mic=mic;
noiceCancellation=noiceCancellation;
System.out.println("Brand: "+brand+"\nMic: "+mic+"\nNoice Cancellation: "+noiceCancellation);
}

HeadSet(boolean mic,boolean noiceCancellation)
{
System.out.println("Invoked the constructor with boolean mic and noice");
mic=mic;
noiceCancellation=noiceCancellation;
System.out.println("Mic: "+mic+"\nNoice Cancellation: "+noiceCancellation);
}

HeadSet(String type,int price,String brand,boolean mic,boolean noiceCancellation)
{
System.out.println("Invoked the constructor with all the values");
type=type;
brand=brand;
price=price;
mic=mic;
noiceCancellation=noiceCancellation;
System.out.println("Type: "+type+"Brand: "+brand+"\nPrice: "+price+"\nMic: "+mic+"\nNoice Cancellation: "+noiceCancellation);
}
}