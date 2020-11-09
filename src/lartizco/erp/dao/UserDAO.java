package lartizco.erp.dao;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import lartizco.erp.user.entidades.AdUsuario;

@Stateless
public class UserDAO extends AbstractDAO<AdUsuario> {

    @EJB
    private EntityManagerProviderDAO entityManagerProvider;

    public UserDAO() {
	super(AdUsuario.class);
    }

    @Override
    protected EntityManager getEntityManager() {
	return entityManagerProvider.getEntityManager();
    }
        

}
