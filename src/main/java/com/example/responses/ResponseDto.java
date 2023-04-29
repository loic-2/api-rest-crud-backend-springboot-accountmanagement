package com.example.responses;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ResponseDto {
    private Long id;
    private String nom;
    private String prenom;
    private String solde;
    private String cni;
    private String numero;
    private String agence;
}
