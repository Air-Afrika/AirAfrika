package ma.yc.airafraik.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.java.Log;
import ma.yc.airafraik.enums.ReservationStatus;
import ma.yc.airafraik.enums.ReserveType;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Log
@Entity
@Table(name = "reservation")
@ToString
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id ;
    private String code ;
    @Column(name = "price_total")
    private double prixTotal ;
    @Column(name = "date_reservation")
    private Timestamp date_Reservation;
    //TODO : CLIENT RESERVE PLUSIERE
    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client ;

    @Column(name = "date_depart")
    private String dateDepart;
    @Column(name = "date_arrivee")
    private String dateArrivee;

    @Column(name = "number_de_adulets")
    private int numberDeAdulets;

    @Column(name = "number_de_enfants")
    private int numberDeEnfants;

    @Column(name = "number_de_bebes")
    private int numberDeBebes;

    @Column(name = "lheure_depart")
    private String heureDepart ;

    @Column(name = "lheure_arrivee")
    private String heureArrivee;

    @Column(name = "ville_depart")
    private String villeDepart ;

    @Column(name = "ville_arrivee")
    private String villeArrivee ;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ReservationStatus status ;

    @Enumerated(EnumType.STRING)
    @Column(name = "flight_type")
    private ReserveType flightType;


    @Column(name = "cancelled")
    private boolean cancelled;




}
