package com.wolf.consumer.entity;


import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @since 2022-03-14
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一标识
     */
    private String userId;

    /**
     * 用户编码/手机号
     */
    private String userCode;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 用户状态 0:禁用，1：启用
     */
    private String status;

    /**
     * 用户邮箱
     */
    private String userMail;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 用户机构id
     */
    private String userOrg;

    /**
     * 用户企业id
     */
    private String userCompany;

    /**
     * 用户企业名称
     */
    private String userCompName;

    /**
     * 创建人
     */
    private String createId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改人
     */
    private String updateId;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 删除人
     */
    private String delId;

    /**
     * 删除时间
     */
    private LocalDateTime delTime;

    /**
     * 删除标志
     */
    private Boolean delFlg;

    public String getUserId() {
        return userId;
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserCode() {
        return userCode;
    }

    public User setUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public User setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public User setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public User setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getUserMail() {
        return userMail;
    }

    public User setUserMail(String userMail) {
        this.userMail = userMail;
        return this;
    }

    public String getUserType() {
        return userType;
    }

    public User setUserType(String userType) {
        this.userType = userType;
        return this;
    }

    public String getUserOrg() {
        return userOrg;
    }

    public void setUserOrg(String userOrg) {
        this.userOrg = userOrg;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public User setUserCompany(String userCompany) {
        this.userCompany = userCompany;
        return this;
    }

    public String getUserCompName() {
        return userCompName;
    }

    public User setUserCompName(String userCompName) {
        this.userCompName = userCompName;
        return this;
    }

    public String getCreateId() {
        return createId;
    }

    public User setCreateId(String createId) {
        this.createId = createId;
        return this;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public User setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getUpdateId() {
        return updateId;
    }

    public User setUpdateId(String updateId) {
        this.updateId = updateId;
        return this;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public User setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getDelId() {
        return delId;
    }

    public User setDelId(String delId) {
        this.delId = delId;
        return this;
    }

    public LocalDateTime getDelTime() {
        return delTime;
    }

    public User setDelTime(LocalDateTime delTime) {
        this.delTime = delTime;
        return this;
    }

    public Boolean getDelFlg() {
        return delFlg;
    }

    public User setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
        return this;
    }


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userCode=" + userCode +
                ", username=" + username +
                ", nickname=" + nickname +
                ", password=" + password +
                ", enabled=" + enabled +
                ", status=" + status +
                ", userMail=" + userMail +
                ", userType=" + userType +
                ", userOrg=" + userOrg +
                ", userCompany=" + userCompany +
                ", userCompName=" + userCompName +
                ", createId=" + createId +
                ", createTime=" + createTime +
                ", updateId=" + updateId +
                ", updateTime=" + updateTime +
                ", delId=" + delId +
                ", delTime=" + delTime +
                ", delFlg=" + delFlg +
                "}";
    }

}
