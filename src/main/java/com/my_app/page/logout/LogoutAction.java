package com.my_app.page.logout;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LogoutAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        // Get the current session associated with this request
        HttpSession session = request.getSession(false);

        // If there's a session, invalidate it
        if (session != null) {
            session.invalidate();
        }
        
        return mapping.findForward("loginPage");
    }
}
