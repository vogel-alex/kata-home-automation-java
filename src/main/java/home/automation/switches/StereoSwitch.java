package home.automation.switches;

import home.automation.Stereo;
import home.automation.Switch;

public class StereoSwitch implements Switch {

    private Stereo stereo;

    public StereoSwitch(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void activate() {
       stereo.play("Bob Marley");
    }

    @Override
    public void deactivate() {
        stereo.rememberPosition();
        stereo.off();
    }

}
