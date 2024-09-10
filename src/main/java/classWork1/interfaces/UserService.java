package classWork1.interfaces;

import java.util.List;

public interface UserService {

    User getUserById(long id);

    void addUser(User user);

    List<User> getUsers();



}
