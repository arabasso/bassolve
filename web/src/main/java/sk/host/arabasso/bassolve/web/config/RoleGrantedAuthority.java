package sk.host.arabasso.bassolve.web.config;

import org.springframework.security.core.GrantedAuthority;
import sk.host.arabasso.bassolve.web.entity.Role;

/**
 * Created by arabasso on 22/08/15.
 */
public class RoleGrantedAuthority implements GrantedAuthority {
    private Role role;

    public RoleGrantedAuthority(Role role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return this.role.getName();
    }
}
