package ma.zs.generated.security;


import ma.zs.generated.GeneratedApplication;
import ma.zs.generated.bean.Role;
import ma.zs.generated.bean.User;
import ma.zs.generated.service.facade.UserService;
import ma.zs.generated.service.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class SecurityUtil {
    /**
     * Get the login of the current user.
     *
     * @return the login of the current user.
     */
    @Autowired
    private static ApplicationContext applicationContext;

    public static User getCurrentUser() {
        UserService userService= GeneratedApplication.getCtx().getBean(UserService.class);

        SecurityContext securityContext = SecurityContextHolder.getContext();
        Object user = securityContext.getAuthentication().getPrincipal();
        System.out.println(user);
        if (user instanceof String) {
            return userService.findByUsername((String) user);
        } else if (user instanceof User) {
            return (User) user;
        } else {
            return null;
        }
//        return (User)Optional.ofNullable(securityContext.getAuthentication())
//                .map(authentication -> {
//                    if (authentication.getPrincipal() instanceof UserDetails) {
//                        UserDetails springSecurityUser = (UserDetails) authentication.getPrincipal();
//                        return springSecurityUser;
////                        return springSecurityUser.getUsername();
//                    }
////                    else if (authentication.getPrincipal() instanceof String) {
////                        return (String) authentication.getPrincipal();
////                    }
//                    return null;
//                }).get();
    }

    /**
     * Check if a user is authenticated.
     *
     * @return true if the user is authenticated, false otherwise.
     */
    public static boolean isAuthenticated() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication != null &&
                getAuthorities(authentication).noneMatch(AuthoritiesConstants.ANONYMOUS::equals);
    }

    /**
     * If the current user has a specific authority (security role).
     * <p>
     * The name of this method comes from the {@code isUserInRole()} method in the Servlet API.
     *
     * @param authority the authority to check.
     * @return true if the current user has the authority, false otherwise.
     */
    public static boolean isCurrentUserInRole(String authority) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication != null &&
                getAuthorities(authentication).anyMatch(authority::equals);
    }

    private static Stream<String> getAuthorities(Authentication authentication) {
        return authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority);
    }
    public static boolean isCai() {
        User user= getCurrentUser();
       return (user.getLeService()!=null && user.getLeService().getCode()!=null && user.getLeService().getCode().equals("cai"));
    }
    public static boolean isChargeRequette() {
        User user= getCurrentUser();
        List<Role> roles = user.getRoles();
        List<String> agentBureauRoles= Arrays.asList("CHARGE_DE_REQUETE");
        return isInRole(roles,agentBureauRoles);
    }
    public static boolean isAgentBureau() {
        User user= getCurrentUser();
        List<Role> roles = user.getRoles();
        List<String> agentBureauRoles= Arrays.asList("CHARGE_DE_TRAITEMENT_COURRIER");
        return isInRole(roles,agentBureauRoles);
    }

    public static  boolean isChefService( List<Role> roles) {
        List<String> agentBureauRoles= Arrays.asList("CHEF_DE_SERVICE");
        return isInRole(roles,agentBureauRoles);
    }

    public static  boolean isChefService() {
        User user= getCurrentUser();
        List<Role> roles = user.getRoles();
        List<String> agentBureauRoles= Arrays.asList("CHEF_DE_SERVICE");
        return isInRole(roles,agentBureauRoles);
    }

    public static  boolean isDirecteur() {
        User user= getCurrentUser();
        List<Role> roles = user.getRoles();

        List<String> agentBureauRoles= Arrays.asList("DIRECTEUR");
        return isInRole(roles,agentBureauRoles);
    }

    private static  boolean isInRole(List<Role> roles,List<String> seekedRoles) {
        if(ListUtil.isNotEmpty(roles)){
            for (int i = 0; i <roles.size() ; i++) {
                Role r= roles.get(i);
                if(seekedRoles.contains(r.getAuthority())){
                    return true;
                }
            }
        }
        return false;
    }

}
