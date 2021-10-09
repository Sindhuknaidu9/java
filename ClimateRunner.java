class ClimateRunner
{
public static void main(String[] args)
{
int temp=30;
String humidity="Lightly Humid";
String description="partialy cloudy";
String location="Bhadravathi";
String type ="cloudy";
new Climate();
new Climate(location);
new Climate(temp,humidity);
new Climate(type);
new Climate(temp,description);
new Climate(temp,humidity,description,location,type);
}
} 