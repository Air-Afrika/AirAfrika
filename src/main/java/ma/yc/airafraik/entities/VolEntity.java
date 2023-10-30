package ma.yc.airafraik.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Builder
@Entity
@Table(name = "VOL")
public class VolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code ;
    @Column(name = "heure_depart")
    private String heureDepart ;

    @Column(name = "heure_arrivee")
    private String heureArrivee;

    @Column(name = "date_depart")
    private Date dateDepart ;
    @Column(name = "date_arrivee")
    private Date dateArrive ;
    @Column(name = "ville_depart")
    private String villeDepart ;
    @Column(name = "ville_arrivee")
    private String villeArrivee ;
    @Column(name = "nombre_de_places")

    private int nomberDePlaces ;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "avion_id")
    private AvionEntity avion ;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vol_id")
    private VolEntity vol ;

    private double prix ;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "societe_aerienne_id")
    private SocieteAerienneEntity societeAerienneEntity ;



}
