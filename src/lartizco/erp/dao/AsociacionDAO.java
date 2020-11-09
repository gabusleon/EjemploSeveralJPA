package lartizco.erp.dao;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import lartizco.erp.user.entidades.Asociacion;

@Stateless
public class AsociacionDAO extends AbstractDAO<Asociacion> {

    @EJB
    private EntityManagerProviderDAO entityManagerProvider;

    public AsociacionDAO() {
	super(Asociacion.class);
    }

    @Override
    protected EntityManager getEntityManager() {
	return entityManagerProvider.getEntityManager();
    }
}
