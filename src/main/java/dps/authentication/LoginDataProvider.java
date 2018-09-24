package dps.authentication;

public interface LoginDataProvider {
    LoginData addToken(String key, String token, AuthenticableUser user);
    void UpdateLoginData(LoginData loginData);
    LoginData getLoginData(String key);
}
