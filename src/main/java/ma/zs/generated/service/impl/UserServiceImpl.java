package ma.zs.generated.service.impl;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.zs.generated.bean.User;
import ma.zs.generated.bean.Role;
import ma.zs.generated.dao.UserDao;
import ma.zs.generated.service.facade.UserService;
import ma.zs.generated.service.facade.RoleService;

import ma.zs.generated.ws.rest.provided.vo.UserVo;
import ma.zs.generated.service.util.*;

@Service
public class UserServiceImpl extends  AbstractService<User> implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleService roleService;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public List<User> findByCreatedByUsername(String username) {
        return userDao.findByCreatedByUsername(username);
    }

    @Override
    @Transactional
    public int deleteByCreatedByUsername(String username) {
        return userDao.deleteByCreatedByUsername(username);
    }

    @Override
    public List<User> findByCreatedById(Long id) {
        return userDao.findByCreatedById(id);

    }

    @Override
    @Transactional
    public int deleteByCreatedById(Long id) {
        return userDao.deleteByCreatedById(id);

    }

    @Override
    public List<User> findByUpdatedByUsername(String username) {
        return userDao.findByUpdatedByUsername(username);
    }

    @Override
    @Transactional
    public int deleteByUpdatedByUsername(String username) {
        return userDao.deleteByUpdatedByUsername(username);
    }

    @Override
    public List<User> findByUpdatedById(Long id) {
        return userDao.findByUpdatedById(id);

    }

    @Override
    @Transactional
    public int deleteByUpdatedById(Long id) {
        return userDao.deleteByUpdatedById(id);

    }

    @Override
    public User findByUsername(String username) {
        if (username == null)
            return null;
        return userDao.findByUsername(username);
    }


    @Override
    @Transactional
    public int deleteByUsername(String username) {
        return userDao.deleteByUsername(username);
    }

    @Override
    public User findById(Long id) {
        if (id == null)
            return null;
        return userDao.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }

    @Override
//    @Transactional
    public User save(User user) {

        User foundedUserByUsername = findByUsername(user.getUsername());
        User foundedUserByEmail = userDao.findByEmail(user.getEmail());
        if (foundedUserByUsername != null || foundedUserByEmail != null)
            return null;
        else {
            List<String> authorities = new ArrayList<>();
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            user.setAccountNonExpired(true);
            user.setAccountNonLocked(true);
            user.setCredentialsNonExpired(true);
            user.setEnabled(true);
            user.setCreatedAt(new Date());
            for (Role role : user.getRoles()) {
                authorities.add(role.getAuthority());
            }
            user.getRoles().clear();
            for (String authority : authorities) {
                user.getRoles().add(roleService.findByAuthority(authority));
            }
            User savedUser = userDao.save(user);

//			for (Role role : user.getRoles()) {
//                System.out.println("loop add role ...");
//				savedUser.getRoles().add(roleService.findByAuthority(role.getAuthority()));
//			}
//            savedUser.getRoles().add(roleService.findByAuthority("ADMIN"));
            return savedUser;
        }
    }

    @Override
    public User update(User user) {
        User foundedUser = findById(user.getId());
        if (foundedUser == null)
            return null;

        return userDao.save(user);

    }

    @Override
    @Transactional
    public int delete(User user) {

        if (user.getUsername() == null)
            return -1;

        User foundedUser = findByUsername(user.getUsername());
        if (foundedUser == null)
            return -1;
        userDao.delete(foundedUser);
        return 1;
    }


    public List<User> findByCriteria(UserVo userVo) {
        String query = "SELECT o FROM User o where 1=1 ";
        query += addConstraint("o", "credentialsNonExpired", "=", userVo.getCredentialsNonExpired());
        query += addConstraint("o", "enabled", "=", userVo.getEnabled());
        query += addConstraintDate("o", "createdAt", "=", userVo.getCreatedAt());
        query += addConstraintDate("o", "updatedAt", "=", userVo.getUpdatedAt());
        query += addConstraint("o", "email", "LIKE", userVo.getEmail());

        query += addConstraint("o", "accountNonExpired", "=", userVo.getAccountNonExpired());
        query += addConstraint("o", "accountNonLocked", "=", userVo.getAccountNonLocked());
        query += addConstraint("o", "id", "=", userVo.getId());
        query += addConstraint("o", "username", "LIKE", userVo.getUsername());

        query += addConstraint("o", "password", "LIKE", userVo.getPassword());

        query += addConstraintMinMaxDate("o", "createdAt", userVo.getCreatedAtMin(), userVo.getCreatedAtMax());
        query += addConstraintMinMaxDate("o", "updatedAt", userVo.getUpdatedAtMin(), userVo.getUpdatedAtMax());
        if (userVo.getCreatedByVo() != null) {
            query += addConstraint("o", "createdBy.id", "=", userVo.getCreatedByVo().getId());
            query += addConstraint("o", "createdBy.username", "LIKE", userVo.getCreatedByVo().getUsername());
        }

        if (userVo.getUpdatedByVo() != null) {
            query += addConstraint("o", "updatedBy.id", "=", userVo.getUpdatedByVo().getId());
            query += addConstraint("o", "updatedBy.username", "LIKE", userVo.getUpdatedByVo().getUsername());
        }

        return entityManager.createQuery(query).getResultList();
    }


}
