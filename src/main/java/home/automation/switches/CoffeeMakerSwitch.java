package home.automation.switches;

import home.automation.CoffeeMaker;
import home.automation.Switch;

public class CoffeeMakerSwitch implements Switch{

    private CoffeeMaker coffeeMaker;

    public CoffeeMakerSwitch(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void activate() {
        coffeeMaker.brew(CoffeeMaker.Type.DECAF);
    }

    @Override
    public void deactivate() {
        if (coffeeMaker.isOn()) {
				coffeeMaker.doClean();
				coffeeMaker.shutDown();
			}
    }

}
