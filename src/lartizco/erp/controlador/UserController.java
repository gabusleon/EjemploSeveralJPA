package lartizco.erp.controlador;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import lartizco.erp.dao.AsociacionDAO;
import lartizco.erp.dao.UserDAO;
import lartizco.erp.user.entidades.AdUsuario;
import lartizco.erp.user.entidades.Asociacion;
import lartizco.erp.util.MySession;

@ManagedBean(name = "userController")
@ViewScoped
public class UserController {

    @EJB
    private UserDAO userDAO;
    @EJB
    private AsociacionDAO asociacionDAO;
    private AdUsuario adUsuario;
    private int codigo;

    public UserController() {
	adUsuario = new AdUsuario();
    }

    @PostConstruct
    public void init() {

    }

    public int getCodigo() {
	return codigo;
    }

    public void setCodigo(int codigo) {
	this.codigo = codigo;
    }

    public AdUsuario getAdUsuario() {
	return adUsuario;
    }

    public void setAdUsuario(AdUsuario adUsuario) {
	this.adUsuario = adUsuario;
    }

    public void ingresar() {
	// agregar la sesión y llamar al DAO correspondiente
	// para obtener datos de la una u otra base
	HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	// session.invalidate();
	session.setAttribute("sid", 0);

	adUsuario = userDAO.find(codigo);
	System.out.println("Usuario encontrado: " + adUsuario);
	session.setAttribute("sid", adUsuario.getAduCodigo());
	for (Asociacion aso : asociacionDAO.findAll()) {
	    System.out.println(aso);
	}

    }
}
