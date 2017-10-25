package archivRest.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "BND_SHOTLISTEN")
public @Data class ShotList {

    //([BSHOT_ID],[BSHOT_BEARBEITER],[BSHOT_BEMERKUNG],[BSHOT_HATI_NR],[BSHOT_BETI_NR],[BSHOT_BEARBSTAT]
    //            ,[SB_ERFASST],[DAT_ERFASST],[SB_GEAENDERT],[DAT_GEAENDERT])
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BSHOT_ID")
    private Long id;
    @Column(name = "BSHOT_BEARBEITER")
    String bearbeiter;
    @Column(name = "BSHOT_BEMERKUNG")
    String bemerkung;
    @Column(name = "BSHOT_HATI_NR")
    Long hatiNr;
    @Column(name = "BSHOT_BETI_NR")
    Long betiNr;
    @Column(name = "BSHOT_BEARBSTAT")
    String bearbStat;
}