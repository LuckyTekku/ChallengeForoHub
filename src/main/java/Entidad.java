package com.forohub.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

    @Entity
    @Table(name = "topicos")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = "id")
    public class Topic {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String titulo;
        private String mensaje;

        @CreationTimestamp
        @Column(name = "fecha_creacion")
        private LocalDateTime fechaCreacion;

        private String status;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "autor_id")
        private Author autor;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "curso_id")
        private Course curso;
    }
