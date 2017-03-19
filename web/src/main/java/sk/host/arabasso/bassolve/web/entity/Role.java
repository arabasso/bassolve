package sk.host.arabasso.bassolve.web.entity;

import javax.persistence.*;

/**
 * Created by arabasso on 22/08/15.
 */
@Entity
@Table(name = "role")
public class Role implements java.io.Serializable {
    private static final long serialVersionUID = -615312334271967062L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    private User user;

    protected Role(){
    }

    public Role(User user, String name) {
        this.user = user;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User getUser() {
        return user;
    }
}
