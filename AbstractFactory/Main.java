import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter cuisine Type like(Indian or Chinese)");
        String Cuisine=sc.next();
        abstractFactory afobj=abstractFactory.getFactory(Cuisine);

        desserts di=afobj.getdesserts();

        di.prepar();
    }
}
