package tang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tang.dao.UserMapper;
import tang.dao.UserRoleMapper;
import tang.model.User;
import tang.model.UserRole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tang on 2017/3/15.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    private UserRoleMapper userRoleMapper;

    public UserRoleMapper getUserRoleMapper() {
        return userRoleMapper;
    }
    @Autowired
    public void setUserRoleMapper(UserRoleMapper userRoleMapper) {
        this.userRoleMapper = userRoleMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> getAll() {
        return userMapper.selectAll();
    }

    public List<User> getUserByName(String name) {
        return userMapper.selectByName(name);
    }

    public UserRole getUserRoleByName(String name) {
        return userRoleMapper.selectUserRole(name);
    }

    public List<User> getUserRole() {
        return userMapper.getUserRole();
    }
}
