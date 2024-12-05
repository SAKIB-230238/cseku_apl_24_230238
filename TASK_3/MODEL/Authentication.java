package MODEL;
public class Authentication {
    private String username;
    private String password;

    // Constructor
    public Authentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Validate login details
    public boolean validateLogin() {
        return this.username.equals("admin") && this.password.equals("admin123");
    }
}

