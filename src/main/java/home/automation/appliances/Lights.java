package home.automation.appliances;

import home.automation.IAppliance;
import home.automation.Payload;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Lights implements IAppliance {

	/**
	 * NOTE: starting from the next Software update, dimPercent will not work if the turnOn() method has not been called
	 * before.
	 **/
	public void dimPercent(int i) {
		System.out.println("Dimming to " + i + "%");
	}

	public void off() {
		System.out.println("Lights will go out in 10 seconds.");
	}

		public record LightsDim(int percent) implements Payload<Lights> {

		@Override
		public void apply(Lights light) {
			light.dimPercent(percent);;
		}
	}

	public record LightsOff() implements Payload<Lights> {

		@Override
		public void apply(Lights light) {
			light.off();
		}
	}
}
