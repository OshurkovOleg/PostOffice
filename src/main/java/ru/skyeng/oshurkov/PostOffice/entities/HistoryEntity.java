package ru.skyeng.oshurkov.PostOffice.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@NoArgsConstructor
@ToString
@Entity
@Table(name = "history_postal_items")
public class HistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private LocalDateTime date;
}
