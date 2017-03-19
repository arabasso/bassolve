package sk.host.arabasso.bassolve.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sk.host.arabasso.bassolve.web.entity.User;

/**
 * Created by arabasso on 21/08/15.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN 'true' ELSE 'false' END FROM User u WHERE u.id <> ?1 and u.username = ?2")
    public Boolean existsByUsername(String username);
    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN 'true' ELSE 'false' END FROM User u WHERE u.username = ?1")
    public Boolean existsByIdAndUsername(long id, String username);
}
