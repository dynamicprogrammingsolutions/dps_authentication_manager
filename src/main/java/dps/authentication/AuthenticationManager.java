package dps.authentication;

public interface AuthenticationManager {
    Boolean login(String username, String password);
    Boolean login(String token);
    AuthenticableUser getUser();
    String getToken();
    void logout();
    Boolean isAuthenticated();
    Boolean isAuthorized(String operation);
}
