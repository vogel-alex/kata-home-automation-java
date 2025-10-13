package home.automation;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch implements ISwitch {

	private boolean isOn = false;

	private Shutter shutter = new Shutter();

	private AirConditioning airConditioning = new AirConditioning();

	private Lights lights = new Lights();

	private Stereo stereo = new Stereo();

	private CoffeeMaker coffeeMaker = new CoffeeMaker();

	public void press() {
		if(isOn){
			turnOn();
		}		
		else{
			turnOff();
		}
	}

	@Override
	public void turnOff() {
		PrintConsole.bigOldSwitchPressed();
		shutter.close();
		airConditioning.setTemperatureInCelsius(20);
		lights.dimPercent(50);
		stereo.play("Bob Marley");
		coffeeMaker.brew(CoffeeMaker.Type.DECAF);
		isOn = true;
		PrintConsole.printLightBulb();
	}

	@Override
	public void turnOn() {
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
