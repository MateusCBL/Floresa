package com.example.demo;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

public class User {



    @Entity
    public class user{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Long id;
        private String name;
        private String email;

        public Long getId(){return id; }
        public void setId(Long id) {this.id = id; }

        public String getName(){return name; }
        public void setSName(String name) {this.name = name; }

        public String getEmail(){return email; }
        public void setId(String email) {this.email = email; }


    }
}
