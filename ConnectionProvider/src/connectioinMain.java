import java.util.Scanner;

public class connectioinMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1:MySql Connection");
        System.out.println("2:PostgreSql Connection");
        System.out.println("3:Sqlite Connection");
        System.out.println("4:MSSql connection");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        DatabaseConnection obj=Factory.getconnection(choice);
        obj.connect();
        obj.executeQuery();
        obj.disconnect();
        sc.close();

    }
}
