public abstract class abstractFactory {
    public  abstract maincourse getMaincourse();
    public  abstract desserts getdesserts();
    public  abstract appetizers getappetizers();

    public static abstractFactory getFactory(String cuisine)
    {
         if(cuisine.equalsIgnoreCase("Indian"))
         {
            return new indianFactory();
         }
         else if (cuisine.equalsIgnoreCase("chinese")) {
            return new chineseFactory();
         }
         else
         {
            throw new IllegalAccessError("Enter only Indian or Chinese Cuisine");
         }
         
    }
}
