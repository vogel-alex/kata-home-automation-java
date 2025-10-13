package home.automation;

import java.util.*;

import home.automation.appliances.AirConditioning;
import home.automation.appliances.Lights;
import home.automation.appliances.Shutter;
import home.automation.appliances.Stereo;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class SwitchOnManager implements ISwitchManager {


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
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			shutter.close();
			airConditioning.setTemperatureInCelsius(20);
			lights.dimPercent(50);
			stereo.play("Bob Marley");
			coffeeMaker.brew(CoffeeMaker.Type.DECAF);
			isOn = true;
			printLight();
	}

	private void printLight() {
		StringBuffer b = new StringBuffer();
		b.append("         |\n");
		b.append(" \\     _____     /\n");
		b.append("     /       \\\n");
		b.append("    (         )\n");
		b.append("-   ( ))))))) )   -\n");
		b.append("     \\ \\   / /\n");
		b.append("      \\|___|/\n");
		b.append("  /    |___|    \\\n");
		b.append("       |___| prs\n");
		b.append("       |___|\n");
		System.out.println(b.toString());
	}
}
