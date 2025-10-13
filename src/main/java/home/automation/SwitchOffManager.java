package home.automation;


import home.automation.appliances.AirConditioning;
import home.automation.appliances.Lights;
import home.automation.appliances.Shutter;
import home.automation.appliances.Stereo;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class SwitchOffManager implements ISwitchManager {


	private Shutter shutter = new Shutter();

	private AirConditioning airConditioning = new AirConditioning();

	private Lights lights = new Lights();

	private Stereo stereo = new Stereo();

	private CoffeeMaker coffeeMaker = new CoffeeMaker();

	public static interface Applience<T> {
		void applyChange(T payload);

		void off();
	}

	public static interface State {
		boolean turnedOn();

	}

	public void doStuff() {

			shutter.open();
			airConditioning.turnOff();
			lights.off();
			stereo.rememberPosition();
			stereo.off();
			if (coffeeMaker.isOn()) {
				coffeeMaker.doClean();
				coffeeMaker.shutDown();
			}
	}
}

