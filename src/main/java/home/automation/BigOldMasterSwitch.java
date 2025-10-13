package home.automation;

import java.util.*;

import home.automation.appliances.AirConditioning;
import home.automation.appliances.Lights;
import home.automation.appliances.Shutter;
import home.automation.appliances.Stereo;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch {

	private boolean isOn = false;

	private SwitchOnManager switchOnManager;
	private SwitchOffManager switchOffManager;

	public static interface Applience<T> {
		void applyChange(T payload);

		void off();
	}

	public static interface State {
		boolean turnedOn();

	}

	public void press() {

		/*
		ApplianceManager<CoffeeMaker> coffeOnManager = new ApplianceManager<CoffeeMaker>(coffeeMaker, List.of(maker -> {
			maker.brew(CoffeeMaker.Type.DECAF);
		}));

		ApplianceManager<CoffeeMaker> coffeOffManager = new ApplianceManager<CoffeeMaker>(coffeeMaker,
				List.of(maker -> {
					if (maker.isOn()) {
						maker.doClean();
						maker.shutDown();
					}
				}));
				*/

		if (!isOn) {
			switchOnManager.doStuff();
		} else if (isOn) {
			switchOffManager.doStuff();
		}
	}

}
