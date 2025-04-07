
public class FacedMain {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        System.out.println("\nStarting the movie experience...");
        homeTheater.watchMovie("Inception");

        System.out.println("\nShutting down home theater...");
        homeTheater.endMovie();
    }
}
