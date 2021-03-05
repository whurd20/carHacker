package carhacker.persistence;

import carhacker.entity.User;
import carhacker.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 * @author whurd
 */
class UserDaoTest {

    UserDao userDao;

    /**
     * Sets up by rebuilding db
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        userDao = new UserDao();
    }

    /**
     * Get by id success test
     */
    @Test
    void getByIdSuccess() {
//        User retrievedUser = userDao.getById(3);
//        assertEquals("Java: A Beginner’s Guide (Sixth Edition)", retrievedUser.getTitle());
//        assertEquals("Herbert Schilt", retrievedUser.getAuthor());
//        assertEquals("978-0071809252", retrievedUser.getIsbn());
//        assertEquals(2014, retrievedUser.getPublicationYear());

    }

    /**
     * Save or update success test
     */
    @Test
    void saveOrUpdateSuccess() {
//        String newTitle = "The Silmarillion";
//        User userToUpdate = userDao.getById(3);
//        userToUpdate.setTitle(newTitle);
//        userDao.saveOrUpdate(userToUpdate);
//        User retrievedUser = userDao.getById(3);
//        assertEquals(newTitle, retrievedUser.getTitle());
    }

    /**
     * Insert success test
     */
    @Test
    void insertSuccess() {
//        User newUser = new User("LOTR", "Tolkien", "99894566-5656", 1930);
//        int id = userDao.insert(newUser);
//        assertNotEquals(0,id);
//        User insertedUser = userDao.getById(id);
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
        userDao.delete(userDao.getById(3));
        assertNull(userDao.getById(3));
    }

    /**
     * Get all success test
     */
    @Test
    void getAllSuccess() {
        List<User> users = userDao.getAll();
        assertEquals(3, users.size());
    }
}