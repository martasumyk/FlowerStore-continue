import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    public List<AppUser> getAllUsers() {
        return appUserRepository.findAll();
    }

    public void addUser(AppUser user) {
        user.setAge(user.calculateAge());
        appUserRepository.save(user);
    }

    public Optional<AppUser> findUserByEmail(String email) {
        return appUserRepository.findUserByEmail(email);
    }
}
