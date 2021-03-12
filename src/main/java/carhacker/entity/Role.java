package carhacker.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The type Book.
 * @author whurd
 */
@Entity(name = "Role")
@Table(name = "role") // case sensitive!
public class Role {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;

    @Column (name="role_name")
    private String roleName;

    @Column (name="user_name")
    private String userName;



    @OneToMany(mappedBy="role", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
    Set<User> Users = new HashSet<>();


    public Role() {
    }

}
