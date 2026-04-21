package com.praktikum08.deploy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id; // Tambahkan import ini
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "20230140009_users")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id // WAJIB ADA: Menandai ini sebagai Primary Key
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String nim;
}