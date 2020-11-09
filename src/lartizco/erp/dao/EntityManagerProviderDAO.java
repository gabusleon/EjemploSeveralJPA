package lartizco.erp.dao;

import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpSession;

@Stateless
public class EntityManagerProviderDAO {

    @PersistenceContext(unitName = "EjemploUsersJPA")
    private EntityManager entityManagerUno;

    @PersistenceContext(unitName = "EjemploEJBJPA")
    private EntityManager entityManagerDos;

    @PersistenceContext(unitName = "EjemploJEEJPA")
    private EntityManager entityManagerTres;

    public EntityManager getEntityManager() {
	int bandera = 1;
	HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	// session.invalidate();
	bandera = (int) session.getAttribute("sid");

	if (bandera == 1) {
	    System.out.println("Hola1");
	    return entityManagerUno;
	} else if (bandera == 2) {
	    System.out.println("Hola2");
	    return entityManagerDos;
	} else if (bandera == 3) {
	    System.out.println("Hola3");
	    return entityManagerTres;
	} else {
	    // por defecto
	    System.out.println("Hola por defecto");
	    return entityManagerUno;
	}

    }

}
