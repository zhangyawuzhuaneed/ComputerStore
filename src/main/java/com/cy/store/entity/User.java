package com.cy.store.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/** 用户数据的实体类 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity implements Serializable {
    private Integer uid;
    private String username;
    private String password;
    private String salt;
    private String phone;
    private String email;
    private Integer gender;
    private String avatar;
    private Integer isDelete;

}
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof User)) return false;
//
//        User user = (User) o;
//
//        if (getUid() != null ? !getUid().equals(user.getUid()) : user.getUid() != null) return false;
//        if (getUsername() != null ? !getUsername().equals(user.getUsername()) : user.getUsername() != null)
//            return false;
//        if (getPassword() != null ? !getPassword().equals(user.getPassword()) : user.getPassword() != null)
//            return false;
//        if (getSalt() != null ? !getSalt().equals(user.getSalt()) : user.getSalt() != null) return false;
//        if (getPhone() != null ? !getPhone().equals(user.getPhone()) : user.getPhone() != null) return false;
//        if (getEmail() != null ? !getEmail().equals(user.getEmail()) : user.getEmail() != null) return false;
//        if (getGender() != null ? !getGender().equals(user.getGender()) : user.getGender() != null) return false;
//        if (getAvatar() != null ? !getAvatar().equals(user.getAvatar()) : user.getAvatar() != null) return false;
//        return getIsDelete() != null ? getIsDelete().equals(user.getIsDelete()) : user.getIsDelete() == null;
//    }

//    @Override
//    public int hashCode() {
//        int result = getUid() != null ? getUid().hashCode() : 0;
//        result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
//        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
//        result = 31 * result + (getSalt() != null ? getSalt().hashCode() : 0);
//        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
//        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
//        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
//        result = 31 * result + (getAvatar() != null ? getAvatar().hashCode() : 0);
//        result = 31 * result + (getIsDelete() != null ? getIsDelete().hashCode() : 0);
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "uid=" + uid +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                ", salt='" + salt + '\'' +
//                ", phone='" + phone + '\'' +
//                ", email='" + email + '\'' +
//                ", gender=" + gender +
//                ", avatar='" + avatar + '\'' +
//                ", isDelete=" + isDelete +
//                "} " + super.toString();
//    }
//}
