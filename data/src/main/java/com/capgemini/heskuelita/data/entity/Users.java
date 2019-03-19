
package com.capgemini.heskuelita.core.beans;


import java.io.Serializable;
import java.time.LocalDate;
import lombok.*;
import javax.persistence.*;


@Data
@NoArgsConstructor
@Entity
@Table(name ="users")
public class Users implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO, generator = "users_seq")
    @SequenceGenerator(name = "users_seq", sequenceName = "users_seq")
    @Column (name="id_user", nullable=false, unique=true)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name ="last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;


    public Users(String name, String lastName, int age, String userName, String password, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}