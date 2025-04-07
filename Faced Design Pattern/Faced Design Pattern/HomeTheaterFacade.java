class HomeTheaterFacade {
    private Amplifier amp;
    private DVDPlayer dvd;
    private Projector projector;
    private Lights lights;
    private Screen screen;

    public HomeTheaterFacade() {
        this.amp = new Amplifier();
        this.dvd = new DVDPlayer();
        this.projector = new Projector();
        this.lights = new Lights();
        this.screen = new Screen();
    }


    public void watchMovie(String movie) {
       
        lights.dim();
        screen.down();
        projector.on();
        amp.on();
        dvd.on();
        dvd.play(movie);
    }

 
    public void endMovie() {
       
        dvd.off();
        amp.off();
        projector.off();
        screen.up();
        lights.on();
    }
}