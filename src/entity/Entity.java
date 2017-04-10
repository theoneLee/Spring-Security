package entity;

import com.sun.istack.internal.NotNull;

/**
 * Created by Lee on 2017/4/9 0009.
 */

public class Entity {
    private Integer id;
    @NotNull
    private String username;
    @NotNull
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
