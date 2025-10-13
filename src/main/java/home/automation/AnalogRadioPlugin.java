package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class AnalogRadioPlugin implements Device {

	public void play() {
		System.out.println("Playing analog radio");
	}

	@Override
	public void onActivatedMasterSwitch() {
		play();
	}

	@Override
	public void onDeactivatedMasterSwitch() {
	}

}
