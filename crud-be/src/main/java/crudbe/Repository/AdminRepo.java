package crudbe.Repository;

import crudbe.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Long> {
}
