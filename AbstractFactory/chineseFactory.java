public class chineseFactory extends abstractFactory {
    public maincourse getMaincourse()
    {
        return new chineseMain();
    }
    public desserts getdesserts()
    {
      return new chinesedesserts();
    }
    public appetizers getappetizers()
    {
        return  new chineseappetizers();
    }

}
