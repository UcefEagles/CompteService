package com.s2.CompteService.entities;
import com.s2.CompteService.enums.TypeCompte;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class  Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long code;
    private double solde;
    private Date dateCreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte type;
}
