package com.example.SPRINGDATAREST_.GRAPHQL.DTO;

import com.example.SPRINGDATAREST_.GRAPHQL.enums.Genre;

public record EtudiantDTO (String nom,
                           String prenom,
                           Genre genre,
                           Long centreId) {


}
