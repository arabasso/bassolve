package sk.host.arabasso.bassolve.web.entity;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import sk.host.arabasso.bassolve.web.config.RoleGrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static java.util.stream.Collectors.toList;

/**
 * Created by arabasso on 21/08/15.
 */
@Entity
@Table(name = "user")
public class User implements UserDetails, java.io.Serializable {
    private static final long serialVersionUID = -6113123348770067062L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
    private boolean enabled;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Role> roles;

	protected User(){
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.enabled = true;
        this.roles = new HashSet<>();

        addRole("ROLE_USER");
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles
                .stream()
                .map(RoleGrantedAuthority::new)
                .collect(toList());
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return enabled;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public long getId() {
        return id;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public void addRole(String name){
        roles.add(new Role(this, name));
    }

    public void removeRole(String role){
        roles.removeIf(r -> r.getName() == role);
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
