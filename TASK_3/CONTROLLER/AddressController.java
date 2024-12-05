package CONTROLLER;
import MODEL.Address;
import VIEW.AddressView;

public class AddressController {
    private Address model;
    private AddressView view;
    public AddressController(Address model, AddressView view) {
        this.model = model;
        this.view = view;
    }
    public void displayAddressDetails() {
        view.displayAddressDetails(model);
    }
}
