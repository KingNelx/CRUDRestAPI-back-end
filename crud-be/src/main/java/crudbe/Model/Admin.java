package crudbe.Model;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Admins")
public class Admin {
    @Id
    @GeneratedValue
    private @Getter @Setter Long id;
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String userName;
    private @Getter @Setter String email;
    private @Getter @Setter String password;
}
