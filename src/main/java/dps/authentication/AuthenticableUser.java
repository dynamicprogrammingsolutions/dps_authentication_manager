package dps.authentication;

public interface AuthenticableUser {
    String getUsername();
    Boolean checkCredentials(String username, String password);
    Boolean isAuthorized(String operation);
}
