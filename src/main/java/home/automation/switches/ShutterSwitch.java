package home.automation.switches;

import home.automation.Shutter;
import home.automation.Switch;

public class ShutterSwitch implements Switch {

    private Shutter shutter;

    public ShutterSwitch(Shutter shutter) {
        this.shutter = shutter;
    }

    @Override
    public void activate() {
        shutter.close();
        
    }

    @Override
    public void deactivate() {
        shutter.open();
    }
    
}
