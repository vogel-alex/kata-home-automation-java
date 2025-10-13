package home.automation;

import java.util.List;

public class ApplianceManager<T extends IAppliance> {

	private List<Payload<T>> payloads;
	private T appliance;

	public ApplianceManager(T appliance,List<Payload<T>> payloads) {
		this.payloads = payloads;
		this.appliance = appliance;
	}

	public void doStuff() {
		for (var p : payloads) {
			p.apply(appliance);
		}
	}

}
