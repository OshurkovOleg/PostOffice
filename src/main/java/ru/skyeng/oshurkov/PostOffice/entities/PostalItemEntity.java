package ru.skyeng.oshurkov.PostOffice.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Entity
@Table(name = "postal_items")
public class PostalItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_postal_items")
    @SequenceGenerator(name = "sq_postal_items", sequenceName = "sq_postal_items", allocationSize = 1)
    private long id;

    @Column(name = "track_number")
    private String trackNumber;

    @Column
    private String type;

    @Column
    private int index;

    @Column
    private String address;

    @Column
    private String name;

}
