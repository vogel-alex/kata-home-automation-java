package home.automation;

public interface Payload<T extends IAppliance> {
    public void apply(T appliance);

}