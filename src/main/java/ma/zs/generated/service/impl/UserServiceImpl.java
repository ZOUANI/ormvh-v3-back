package ma.zs.generated.service.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import ma.zs.generated.bean.LeService;
import ma.zs.generated.security.SecurityUtil;
import ma.zs.generated.service.facade.LeServiceService;
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
public class UserServiceImpl extends AbstractService<User> implements UserService {

    @Autowired
    private LeServiceService leServiceService;

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleService roleService;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public List<User> findAllInService() {
        String query = "SELECT o FROM User o where 1=1 ";
        if(SecurityUtil.isChefService()){
            query += addConstraint("o", "leService.chef.username", "=", SecurityUtil.getCurrentUser().getUsername());
        }
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public List<User> findAll() {
        if(SecurityUtil.isChefService()){
            return userDao.findByLeServiceId(SecurityUtil.getCurrentUser().getLeService().getId());
        }else{
            return userDao.findAll();
        }
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
    public User save(User user) {

        User foundedUserByUsername = findByUsername(user.getUsername());
        User foundedUserByEmail = userDao.findByEmail(user.getEmail());
        if (foundedUserByUsername != null || foundedUserByEmail != null)
            return null;
        else {
            List<String> authorities = new ArrayList<>();
            user.setPassword(bCryptPasswordEncoder.encode(user.getUsername()));
            user.setAccountNonExpired(true);
            user.setAccountNonLocked(true);
            user.setCredentialsNonExpired(true);
            user.setEnabled(true);
            user.setPasswordChanged(false);
            user.setCreatedAt(new Date());
            for (Role role : user.getRoles()) {
                authorities.add(role.getAuthority());
            }
            user.getRoles().clear();
            for (String authority : authorities) {
                user.getRoles().add(roleService.findByAuthority(authority));
            }

          //  prepareSave(user);
            User mySaved= userDao.save(user);

            if(SecurityUtil.isChefService(user.getRoles())){
                if(mySaved.getLeService()!=null){
                   mySaved.getLeService().setChef(mySaved);
                   leServiceService.update(mySaved.getLeService());

                }
            }
            return mySaved;
        }
    }

    @Override
    public User update(User user) {
        User foundedUser = findById(user.getId());
        if (foundedUser == null)
            return null;
        else {
            foundedUser.setEmail(user.getEmail());
            foundedUser.setUsername(user.getUsername());
            foundedUser.setEnabled(user.isEnabled());
            foundedUser.setCredentialsNonExpired(user.isCredentialsNonExpired());
            foundedUser.setAccountNonLocked(user.isAccountNonLocked());
            foundedUser.setAccountNonExpired(user.isAccountNonExpired());
            foundedUser.setRoles(new ArrayList<>());

            for (Role role : user.getRoles()) {
                foundedUser.getRoles().add(roleService.findByAuthority(role.getAuthority()));
            }

            prepareUpdate(foundedUser);
            return userDao.save(foundedUser);
        }


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
        System.out.println(userVo.getCredentialsNonExpired());
        String query = "SELECT o FROM User o where 1=1 ";
        if (userVo.getCredentialsNonExpired() != null) {
            query += addConstraint("o", "credentialsNonExpired", "=", userVo.getCredentialsNonExpired() ? 1 : 0);
        }
        if (userVo.getEnabled() != null) {
            query += addConstraint("o", "enabled", "=", userVo.getEnabled() ? 1 : 0);
        }
        if (userVo.getAccountNonExpired() != null) {
            query += addConstraint("o", "accountNonExpired", "=", userVo.getAccountNonExpired()? 1 : 0);
        }
        if (userVo.getAccountNonLocked() != null) {
            query += addConstraint("o", "accountNonLocked", "=", userVo.getAccountNonLocked()? 1 : 0);
        }
        query += addConstraint("o", "username", "LIKE", userVo.getUsername());
        query += addConstraint("o", "email", "LIKE", userVo.getEmail());
//        query += addConstraintDate("o", "createdAt", "=", userVo.getCreatedAt());
//        query += addConstraintDate("o", "updatedAt", "=", userVo.getUpdatedAt());

//        query += addConstraint("o", "id", "=", userVo.getId());

//        query += addConstraint("o", "password", "LIKE", userVo.getPassword());

//        query += addConstraintMinMaxDate("o", "createdAt", userVo.getCreatedAtMin(), userVo.getCreatedAtMax());
//        query += addConstraintMinMaxDate("o", "updatedAt", userVo.getUpdatedAtMin(), userVo.getUpdatedAtMax());
        /*if (userVo.getCreatedByVo() != null) {
            query += addConstraint("o", "createdBy.id", "=", userVo.getCreatedByVo().getId());
            query += addConstraint("o", "createdBy.username", "LIKE", userVo.getCreatedByVo().getUsername());
        }

        if (userVo.getUpdatedByVo() != null) {
            query += addConstraint("o", "updatedBy.id", "=", userVo.getUpdatedByVo().getId());
            query += addConstraint("o", "updatedBy.username", "LIKE", userVo.getUpdatedByVo().getUsername());
        }*/

        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public int resetPassword(UserVo userVo) {
        User userDB = findByUsername(userVo.getUsername());
        String existingPassword = userVo.getPassword();
        String dbPassword = userDB.getPassword();
        if (userDB != null && bCryptPasswordEncoder.matches(existingPassword, dbPassword)) {
            userDB.setPassword(bCryptPasswordEncoder.encode(userVo.getNewPassword()));
            userDB.setPasswordChanged(true);
            userDao.save(userDB);
            return 1;
        } else return -1;
    }

    @Override
    public User initPassword(String username) {
        User user = userDao.findByUsername(username);
        if (user == null) {
            return null;
        } else {
            user.setPassword(bCryptPasswordEncoder.encode(user.getUsername()));
            user.setPasswordChanged(false);
            return userDao.save(user);
        }
    }



}
