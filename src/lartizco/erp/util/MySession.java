package lartizco.erp.util;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class MySession {

    public static HttpSession getSession() {
	return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }

    public static String getSid() {
	HttpSession session = getSession();
	if (session != null) {
	    if (session.getAttribute("sid") != null)
		return session.getAttribute("sid").toString();
	    else
		return null;
	} else {
	    return null;
	}
    }
}
