package home.automation;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */
public class BigOldMasterSwitch implements ISwitch {
	
	Set<IAutomationDevice> devices = new LinkedHashSet<IAutomationDevice>();
	
	/*
	 * Factory für die Geräte
	 * set von objekten, die abgearbeitet werden können.
	 * abstraktion von objekten, und von konfigurationen.
	 */

	private boolean isOn = false;


	public void press() {
		if (!isOn) {
			System.out.println("BIG OLD SWITCH PRESSED.\n\n");
			
			for (var device: devices) {
				device.turnOn();
			}
			
			isOn = true;
			StringBuffer b = new StringBuffer();
			b.append("         |\n");
			b.append(" \\     _____     /\n");
			b.append("     /       \\\n");
			b.append("    (         )\n");
			b.append("-   ( ))))))) )   -\n");
			b.append("     \\ \\   / /\n");
			b.append("      \\|___|/\n");
			b.append("  /    |___|    \\\n");
			b.append("       |___| prs\n");
			b.append("       |___|\n");
			System.out.println(b.toString());
		} else if (isOn) {
			for (var device: devices) {
				device.turnOff();
			}
		}
	}


	@Override
	public void addDevice(IAutomationDevice device) {
		this.devices.add(device);
	}


	@Override
	public void addDevices(Set<IAutomationDevice> devices) {
		this.devices.addAll(devices);
	}
}
