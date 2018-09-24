package dps.authentication;

public interface UserDataProvider {
    AuthenticableUser getUserByCredentials(String username, String password);
    Boolean checkAuthorization(AuthenticableUser user, String operation);

}
