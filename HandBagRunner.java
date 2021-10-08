class HandBagRunner
{
public static void main(String[] args)
{
String color="Black";
int price=2000;
String brand="lavie";
String material="Leather";
String capacity="4ltr";
new HandBag();
new HandBag(color);
new HandBag(price);
new HandBag(price,brand);
new HandBag(material,capacity);
new HandBag(material,capacity,brand);
new HandBag(color,material,capacity,brand);
new HandBag(color,price,material,capacity,brand);
}
} 