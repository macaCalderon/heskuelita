
package com.capgemini.heskuelita.core.beans;


import java.io.Serializable;
import java.time.LocalDate;
import lombok.*;
import javax.persistence.*;


@Data
@NoArgsConstructor
@Entity
@Table(name ="users")
public class User implements Serializable {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "first_name")
    private String firstName;

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



}