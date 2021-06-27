package com.cx.bank.model;

/**
 * @projectName Javabank
 * @package com.cx.bank.model
 * @className UserBean
 * @description 用于封装用户数据
 * @version v1.4
 */
public class UserBean {
    private String name;
    private String password;
    private static UserBean userBean;
    private UserBean() {

    }
    public static UserBean getUserBean() {
        if (userBean == null) {
            userBean = new UserBean();
        }
        return userBean;
    }

    public void setName(String name) { this.name = name; }

    public void setPassword(String password) { this.password = password; }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
