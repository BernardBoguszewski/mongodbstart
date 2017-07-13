package com.example.demo.domain;

import com.example.demo.enums.ContactType;
import org.springframework.data.annotation.Id;

/**
 * Created by Britenet on 2017-07-13.
 */
public class Contact {

    @Id
    private String id;

    private String firstName;
    private String lastNsme;
    private Address address;
    private ContactType contactType;

}
