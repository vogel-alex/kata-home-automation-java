package home.automation.appliances;

import home.automation.IAppliance;
import home.automation.Payload;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class AirConditioning implements IAppliance {

	private int temperatureInCelsius;

	public void setTemperatureInCelsius(int temperatureInCelsius) {
		System.out.println("Setting temperature to " + temperatureInCelsius);
		this.temperatureInCelsius = temperatureInCelsius;
	}

	public void turnOff() {
		System.out.println("Turning off airconditioning.");
	}

		public record AirConditioningSetTemp(int percent) implements Payload<AirConditioning> {

		@Override
		public void apply(AirConditioning light) {
			light.setTemperatureInCelsius(percent);;
		}
	}

	public record AirConditioningOff() implements Payload<AirConditioning> {

		@Override
		public void apply(AirConditioning light) {
			light.turnOff();
		}
	}
}
