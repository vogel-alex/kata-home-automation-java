package home.automation.appliances;

import home.automation.IAppliance;
import home.automation.Payload;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Shutter implements IAppliance {

	public void close() {
		System.out.println("Closing blinds.");

	}

	public void open() {
		System.out.println("Opening blinds. Avert your eyes.");
	}

	public record ShutterPayload(boolean open) implements Payload<Shutter> {

		@Override
		public void apply(Shutter appliance) {
			if(open) {
				appliance.open();
			} else {
				appliance.close();
			}
		}

	}
}
