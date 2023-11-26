import javax.persistence.*;
import java.time.LocalDate;
import java.util.Optional;

@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String email;

    @Transient
    private String dob;

    private int age;

    @Transient
    public LocalDate getDobAsLocalDate() {
        return LocalDate.parse(dob);
    }

    public int calculateAge() {
        return Period.between(getDobAsLocalDate(), LocalDate.now()).getYears();
    }


}
