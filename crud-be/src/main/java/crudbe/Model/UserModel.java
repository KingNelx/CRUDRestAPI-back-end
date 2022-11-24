package crudbe.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Table(name="Users")
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue

    private @Getter @Setter Long id; 
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String email;
    private @Getter @Setter String userName;
}
