package ma.yc.airafraik.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Builder
@Log
@Entity
@Table(name = "societe_aerienne")
public class SocieteAerienneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id ;

    private String code ;
    private String adresse ;
    private String telephone;
    private String nom;
    private String logo;

}
