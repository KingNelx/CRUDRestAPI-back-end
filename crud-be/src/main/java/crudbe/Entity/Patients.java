package crudbe.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Patient")
public class Patients {

    @Id
    @GeneratedValue
    private @Getter @Setter Long id;
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String address;
    private @Getter @Setter int age;
    private @Getter @Setter String gender;
    private @Getter @Setter String RHU;
    private @Getter @Setter String patientType;
}
