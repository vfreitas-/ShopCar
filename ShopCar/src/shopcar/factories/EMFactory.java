/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopcar.factories;


import javax.enterprise.context.*;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import shopcar.qualifiers.MyDatabase;


/**
 *
 * @author info1
 */
public class EMFactory
{
    private static final String UNIT_NAME = "shopcar";
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory(UNIT_NAME);
 
    @Produces 
    @MyDatabase
    //@ApplicationScoped
    public EntityManager createEM()
    {
        return factory.createEntityManager();
    }
    
//    public void closeEntityManager(@Disposes @MyDatabase EntityManager em)
//    {
//        em.close();
//    }
}
