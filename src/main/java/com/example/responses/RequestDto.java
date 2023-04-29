package com.example.responses;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RequestDto {
    private Long id;
    private String nom;
    private String numero;
    private String solde;
    private String agence;
    private String prenom;
    private String cni;

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nom='" + getNom() + "'" +
            ", numero='" + getNumero() + "'" +
            ", solde='" + getSolde() + "'" +
            ", agence='" + getAgence() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", cin='" + getCni() + "'" +
            "}";
    }
}
