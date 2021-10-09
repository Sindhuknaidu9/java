class HeadSetRunner
{
public static void main(String[] args)
{
int price = 950;
String type="wired";	
String brand="realme";
boolean noiceCancellation=false;
boolean mic=true;
new HeadSet();
new HeadSet(type);
new HeadSet(price);
new HeadSet(brand,price);
new HeadSet(brand,noiceCancellation);
new HeadSet(brand,mic,noiceCancellation);
new HeadSet(type,price,brand,mic,noiceCancellation);
}
}