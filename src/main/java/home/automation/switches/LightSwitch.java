package home.automation.switches;

import home.automation.Lights;
import home.automation.Switch;

public class LightSwitch implements Switch{

    private Lights lights;

    public LightSwitch(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void activate() {
        lights.dimPercent(50);
    }

    @Override
    public void deactivate() {
        lights.off();
    }

}
