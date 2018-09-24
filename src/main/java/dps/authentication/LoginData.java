package dps.authentication;

import java.util.Date;

public interface LoginData {
    String getKey();
    void setKey(String key);
    String getToken();
    void setToken(String token);
    AuthenticableUser getUser();
    void setUser(AuthenticableUser user);
    Date getLoginTime();
    void setLoginTime(Date loginTime);
    Date getTokenIssueTime();
    void setTokenIssueTime(Date tokenIssueTime);
}