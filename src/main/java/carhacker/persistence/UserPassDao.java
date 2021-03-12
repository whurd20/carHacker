package carhacker.persistence;

import carhacker.entity.UserPass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 *
 * TODO a logger is used here, be sure to set up a log4j2.properties file
 */
public class UserPassDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get user by id
     */
    public UserPass getById(int id) {

        Session session = sessionFactory.openSession();
        UserPass userPass = session.get( UserPass.class, id );
        session.close();
        logger.info("getById method run.");
        return userPass;
    }

    /**
     * update userPass
     * @param userPass  UserPass to be inserted or updated
     */
    public void saveOrUpdate(UserPass userPass) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(userPass);
        transaction.commit();
        session.close();
    }

    /**
     * update UserPass
     * @param userPass  UserPass to be inserted or updated
     */
    public int insert(UserPass userPass) {

        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(userPass);
        transaction.commit();
        session.close();
        logger.info("insert method run.");
        return id;
    }

    /**
     * Delete a userPass
     * @param userPass UserPass to be deleted
     */
    public void delete(UserPass userPass) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(userPass);
        transaction.commit();
        session.close();
    }


    /** Return a list of all users
     *
     * @return All users
     */
    public List<UserPass> getAll() {
        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<UserPass> query = builder.createQuery( UserPass.class );
        Root<UserPass> root = query.from( UserPass.class );
        List<UserPass> userPasses = session.createQuery( query ).getResultList();

        logger.debug("The list of userPasses " + userPasses);
        session.close();

        return userPasses;
    }
}
