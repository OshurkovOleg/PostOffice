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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_postal_departments")
    @SequenceGenerator(name = "sq_postal_departments", sequenceName = "sq_postal_departments", allocationSize = 1)
    private long id;

    @Column
    private int index;

    @Column
    private String name;

    @Column
    private String address;

}
