package dps.authentication;

import javax.servlet.http.HttpSession;

public interface AuthenticationManagerFactory {
    AuthenticationManager getAuthenticationManager(HttpSession session);
}
