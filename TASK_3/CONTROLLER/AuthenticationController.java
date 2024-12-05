package CONTROLLER;
import MODEL.Authentication;
import VIEW.AuthenticationView;

public class AuthenticationController {
    private Authentication model;
    private AuthenticationView view;

    // Constructor
    public AuthenticationController(Authentication model, AuthenticationView view) {
        this.model = model;
        this.view = view;
    }
    public void login() {
    }  // Show success or unsuccess if credentials are valid or not
}

