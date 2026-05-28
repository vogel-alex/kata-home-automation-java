package home.automation;

public class Home {

    private Shutter shutter = new Shutter();

	private AirConditioning airConditioning = new AirConditioning();

	private Lights lights = new Lights();

	private Stereo stereo = new Stereo();

	private CoffeeMaker coffeeMaker = new CoffeeMaker();


    public AirConditioning getAirConditioning() {
        return airConditioning;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public Lights getLights() {
        return lights;
    }

    public Shutter getShutter() {
        return shutter;
    }

    public Stereo getStereo() {
        return stereo;
    }
}
