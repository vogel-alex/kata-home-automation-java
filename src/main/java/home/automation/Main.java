package home.automation;

import java.util.List;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {

	public static void main(String[] args) {
		BigOldMasterSwitch s = new BigOldMasterSwitch(List.of(new Shutter(), new AirConditioning(), new Lights(), new Stereo(), new CoffeeMaker()));
		s.press();

		s.press();
	}

}
