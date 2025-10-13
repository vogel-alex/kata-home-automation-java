package home.automation.appliances;

import home.automation.IAppliance;
import home.automation.Payload;
import home.automation.BigOldMasterSwitch.Applience;
import home.automation.BigOldMasterSwitch.State;
import home.automation.appliances.Stereo.StereoPayload;

/**
 * Created by Ferdinand.Szekeresch on 20.04.2017.
 */

/**
 * Starting from the next software update, it would be nice, if the source of
 * music were selectable by the user.
 */
public class Stereo implements IAppliance {

	public void play(String s) {
		System.out.println("Loading Spotify....");
		System.out.println("Get up, stand up... Stand up for your rights!");

	}

	public void rememberPosition() {
		System.out.println("Play will continue from 'I didn't shoot the deputy.'");
	}

	public void off() {
		System.out.println("Stereo Shutting down.");
	}

	public record StereoPlay(String playing) implements Payload<Stereo> {

		@Override
		public void apply(Stereo stereo) {
			stereo.play(playing);
		}
	}

	public record StereoOff() implements Payload<Stereo> {

		@Override
		public void apply(Stereo stereo) {
			stereo.off();
		}
	}
}
