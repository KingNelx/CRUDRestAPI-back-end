package crudbe.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
@Table (name="Doctor")
@AllArgsConstructor
@NoArgsConstructor
public class Doctors {

    @Id
    @GeneratedValue

    private @Getter @Setter Long id;
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String specialties;
    private @Getter @Setter int licenseNumber;
    private @Getter @Setter int ptrNumber;
    private @Getter @Setter int prcNumber;
    private @Getter @Setter int age;


}
