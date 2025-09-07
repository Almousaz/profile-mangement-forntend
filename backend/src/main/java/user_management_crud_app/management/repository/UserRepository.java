package user_management_crud_app.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import user_management_crud_app.management.entity.OurUsers;

import java.util.Optional;

public interface UserRepository extends JpaRepository<OurUsers , Integer> {
    Optional<OurUsers> findByEmail(String email);
}
