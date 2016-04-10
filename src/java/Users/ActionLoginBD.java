package Users;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ActionLoginBD extends org.apache.struts.action.Action {
    
    private static final String SUCCESS = "Menu";
    private static final String FAIL = "Error";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
            
            ActionLogin actionlogin = (ActionLogin)form;
             /*Aqui va la logica de negocio*/
        HttpSession sesion = request.getSession();
        sesion.setAttribute("userName", actionlogin.getNombre());        
        sesion.setAttribute("pass", actionlogin.getPassword());                
        LoginBean lb = new LoginBean();
        // check to see if this user/password combination are valid
        if (lb.validateUser(actionlogin.getNombre(), actionlogin.getPassword())) {
            return mapping.findForward(SUCCESS);
        } else{ // username/password not validated        
            return mapping.findForward(FAIL);
        }                           
    }
}
