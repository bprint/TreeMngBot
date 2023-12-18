package com.example.treemngbot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter @Setter
public class TGUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String userName;

    @Column
    private Timestamp registeredAt;

//    @Override
//    public String toString() {
//        return "User{" +
//                "chatId=" + chatId +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", userName='" + userName + '\'' +
//                ", registeredAt=" + registeredAt +
//                '}';
//    }
}
