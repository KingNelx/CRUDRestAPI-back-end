package crudbe.Repository;

import crudbe.Entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DoctorsRepo extends JpaRepository <Doctors, Long> {

}
