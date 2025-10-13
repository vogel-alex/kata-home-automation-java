package home.automation.appliances;

import home.automation.IAppliance;
import home.automation.Payload;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class AnalogRadioPlugin implements IAppliance {

	public void play() {
		System.out.println("Playing analog radio");
	}


	public record AnalogRadioPlay() implements Payload<AnalogRadioPlugin> {

		@Override
		public void apply(AnalogRadioPlugin radio) {
			radio.play();
		}
	}

}
