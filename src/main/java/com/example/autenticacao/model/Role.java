package com.example.autenticacao.model;

import jakarta.persistence.*;
import lombok.Data;

    @Entity
    @Data
    @Table(name = "roles")
    public class Role {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

        public Role(String name) {
            this.name = name;
        }

        public Role() {
        }
    }
