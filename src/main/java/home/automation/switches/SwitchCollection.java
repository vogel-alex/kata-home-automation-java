package home.automation.switches;

import java.util.List;

import home.automation.Switch;

public record SwitchCollection(String name, List<Switch> switches) {

}
