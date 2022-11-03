package crudbe.Repository;

import crudbe.Entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorsRepo extends JpaRepository <Doctors, Long> {

    @Query("SELECT firstName from Doctors Doctor WHERE age >= 45")
    List<String> getFirstNames();
}
