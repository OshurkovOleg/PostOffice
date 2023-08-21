package ru.skyeng.oshurkov.PostOffice.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Entity
@Table(name = "postal_departments")
public class PostalDepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String index;

    @Column
    private long name;

    @Column
    private String address;

}
