package com.example.CitasInstituto.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreDirector;

    private String Contacto;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Colegio_ID")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Colegio colegio;
}
