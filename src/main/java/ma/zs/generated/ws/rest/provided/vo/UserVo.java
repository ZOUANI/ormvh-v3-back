package ma.zs.generated.ws.rest.provided.vo;

import java.util.Collection;
import java.util.List;
import java.util.Date;

public class UserVo {

    private Boolean credentialsNonExpired;

    private Boolean enabled;

    private String createdAt;

    private String updatedAt;

    private String email;

    private Boolean accountNonExpired;

    private Boolean accountNonLocked;

    private String id;

    private String username;

    private String password;
    private String newPassword;
    private String confirmPassword;

    private Boolean passwordChanged;
    private UserVo createdByVo;
    private UserVo updatedByVo;

    private Collection<RoleVo> rolesVo;

    private String createdAtMax;
    private String createdAtMin;
    private String updatedAtMax;
    private String updatedAtMin;

    public UserVo() {
        super();
    }

    public Boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public Boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserVo getCreatedByVo() {
        return createdByVo;
    }

    public void setCreatedByVo(UserVo createdByVo) {
        this.createdByVo = createdByVo;
    }

    public UserVo getUpdatedByVo() {
        return updatedByVo;
    }

    public void setUpdatedByVo(UserVo updatedByVo) {
        this.updatedByVo = updatedByVo;
    }

    public Collection<RoleVo> getRolesVo() {
        return rolesVo;
    }

    public void setRolesVo(Collection<RoleVo> rolesVo) {
        this.rolesVo = rolesVo;
    }

    public String getCreatedAtMax() {
        return createdAtMax;
    }

    public void setCreatedAtMax(String createdAtMax) {
        this.createdAtMax = createdAtMax;
    }

    public String getCreatedAtMin() {
        return createdAtMin;
    }

    public void setCreatedAtMin(String createdAtMin) {
        this.createdAtMin = createdAtMin;
    }

    public String getUpdatedAtMax() {
        return updatedAtMax;
    }

    public void setUpdatedAtMax(String updatedAtMax) {
        this.updatedAtMax = updatedAtMax;
    }

    public String getUpdatedAtMin() {
        return updatedAtMin;
    }

    public void setUpdatedAtMin(String updatedAtMin) {
        this.updatedAtMin = updatedAtMin;
    }

    public Boolean getPasswordChanged() {
        return passwordChanged;
    }

    public void setPasswordChanged(Boolean passwordChanged) {
        this.passwordChanged = passwordChanged;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}