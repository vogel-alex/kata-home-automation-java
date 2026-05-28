package home.automation.switches;

import home.automation.AirConditioning;
import home.automation.Switch;

public class AirConditioningSwitch implements Switch {

    private AirConditioning airConditioning;

    public AirConditioningSwitch(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void activate() {
        airConditioning.setTemperatureInCelsius(20);
    }

    @Override
    public void deactivate() {
        airConditioning.turnOff();
    }

}
