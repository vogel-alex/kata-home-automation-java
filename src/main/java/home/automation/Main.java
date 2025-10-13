package home.automation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class Main {

	public static void main(String[] args) {
		List<ISwitch> switches = new ArrayList<>();
		BigOldMasterSwitch s = new BigOldMasterSwitch();

		switches.add(s);

		for( var sw : switches) {	
			sw.press();
			sw.press();
		}
		
	}

}
