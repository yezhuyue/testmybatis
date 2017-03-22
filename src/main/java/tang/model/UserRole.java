package tang.model;

import java.util.List;

public class UserRole {
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.ID
     *
     * @mbg.generated Wed Mar 15 21:41:14 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.ROLE_ID
     *
     * @mbg.generated Wed Mar 15 21:41:14 CST 2017
     */
    private String roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.USER_ID
     *
     * @mbg.generated Wed Mar 15 21:41:14 CST 2017
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.ID
     *
     * @return the value of user_role.ID
     *
     * @mbg.generated Wed Mar 15 21:41:14 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.ID
     *
     * @param id the value for user_role.ID
     *
     * @mbg.generated Wed Mar 15 21:41:14 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.ROLE_ID
     *
     * @return the value of user_role.ROLE_ID
     *
     * @mbg.generated Wed Mar 15 21:41:14 CST 2017
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.ROLE_ID
     *
     * @param roleId the value for user_role.ROLE_ID
     *
     * @mbg.generated Wed Mar 15 21:41:14 CST 2017
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.USER_ID
     *
     * @return the value of user_role.USER_ID
     *
     * @mbg.generated Wed Mar 15 21:41:14 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.USER_ID
     *
     * @param userId the value for user_role.USER_ID
     *
     * @mbg.generated Wed Mar 15 21:41:14 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }


}