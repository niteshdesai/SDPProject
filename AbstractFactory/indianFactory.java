public class indianFactory extends abstractFactory {
    public maincourse getMaincourse()
    {
        return new indianMain();
    }
    public desserts getdesserts()
    {
      return new indiandesserts();
    }
    public appetizers getappetizers()
    {
        return  new indianappetizer();
    }
}
