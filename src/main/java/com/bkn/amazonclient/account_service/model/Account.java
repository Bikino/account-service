package com.bkn.amazonclient.account_service.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Account {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}
