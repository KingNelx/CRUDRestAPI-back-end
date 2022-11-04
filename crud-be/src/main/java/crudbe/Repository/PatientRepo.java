package crudbe.Repository;

import crudbe.Entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepo extends JpaRepository <Patients, Long> {

    @Query("SELECT firstName, lastName FROM Patients Patient WHERE patientType = Cancer")
    List<String> getPatientCancer();
}
