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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TAGS_ID")
    @SequenceGenerator(name = "SQ_TAGS_ID", sequenceName = "SQ_TAGS_ID", allocationSize = 1)
    private long id;

    @Column(name = "track_number")
    private String trackNumber;

    @Column
    private String type;

    @Column
    private long index;

    @Column
    private String address;

    @Column
    private String name;

}
