package archivRest.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by JStratma on 25.10.2017.
 */
@Entity
@Table(name = "ALLG_PERSONEN")
public @Data class AllgPerson {
/*    CREATE TABLE [ARCHIV].[ALLG_PERSONEN](
TODO: REF	[PE_SPORTART] [bigint] NULL,
ToDO: REF [PE_VEREIN] [bigint] NULL,
)*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PE_LFD_NR")
    private Long id;
    @Column(name = "PE_VORNAME")
    String vorname;
    @Column(name = "PE_NAME")
    String name;
    @Column(name = "PE_VEREIN")
    String verein;
    @Column(name = "PE_BEMERKUNG")
    String bemerkung;
    @Column(name = "PE_GEBURTSDATUM")
    Date geburtsDatum;
    @Column(name = "PE_STERBEDATUM")
    Date sterbeDatum;
    @Column(name = "PE_GESCHLECHT")
    String geschlecht;
    @Column(name = "PE_LAND")
    String land;
    @Column(name = "PE_NATIONALITAET")
    String nationalitaet;
    @Column(name = "PE_RUECKENNUMMER")
    String rueckennr;
    @Column(name = "PE_SAISON")
    String saison;
    @Column(name = "PE_LIGA")
    String liga;
    @Column(name = "PE_KONTROLLIERT")
    Integer kontrolliert;
    @Column(name = "PE_NAME_GES")
    String nameGes;
    @Column(name = "PE_BANDARCHIV_JN")
    String bandArchivJN;
    @Column(name = "PE_VORNAME_UEBERN")
    String vornameUebername;
    @Column(name = "PE_NAME_UEBERN")
    String nameUebernahme;

}
