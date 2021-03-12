package carhacker.persistence;

import carhacker.entity.UserPass;
import carhacker.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type UserPass dao test.
 * @author whurd
 */
class UserPassDaoTest {

    UserPassDao userPassDao;

    /**
     * Sets up by rebuilding db
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        userPassDao = new UserPassDao();
    }

    /**
     * Get by id success test
     */
    @Test
    void getByIdSuccess() {
        UserPass retrievedUserPass = userPassDao.getById(1);
        assertEquals("testhashc0de", retrievedUserPass.getPassword());


    }

    /**
     * Save or update success test
     */
    @Test
    void saveOrUpdateSuccess() {
//        String newTitle = "The Silmarillion";
//        UserPass userToUpdate = userPassDao.getById(3);
//        userToUpdate.setTitle(newTitle);
//        userPassDao.saveOrUpdate(userToUpdate);
//        UserPass retrievedUser = userPassDao.getById(3);
//        assertEquals(newTitle, retrievedUser.getTitle());
    }

    /**
     * Insert success test
     */
    @Test
    void insertSuccess() {
//        UserPass newUser = new UserPass("LOTR", "Tolkien", "99894566-5656", 1930);
//        int id = userPassDao.insert(newUser);
//        assertNotEquals(0,id);
//        UserPass insertedUser = userPassDao.getById(id);
//        assertEquals("LOTR", insertedUser.getTitle());
//        assertEquals("Tolkien", insertedUser.getAuthor());
//        assertEquals("99894566-5656", insertedUser.getIsbn());
//        assertEquals(1930, insertedUser.getPublicationYear());
    }

    /**
     * Delete success test
     */
    @Test
    void deleteSuccess() {
        userPassDao.delete(userPassDao.getById(3));
        assertNull(userPassDao.getById(3));
    }

    /**
     * Get all success test
     */
    @Test
    void getAllSuccess() {
        List<UserPass> userPasses = userPassDao.getAll();
        assertEquals(3, userPasses.size());
    }
}