package tang.service;

import tang.model.User;
import tang.model.UserRole;

import java.util.List;

/**
 * Created by tang on 2017/3/15.
 */
public interface UserService {
    User getUserById(String id);
    List<User> getAll();
    List<User> getUserByName(String name);
    UserRole getUserRoleByName(String name);
    List<User> getUserRole();

}
