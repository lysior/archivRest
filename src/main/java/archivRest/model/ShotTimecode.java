package archivRest.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "BND_TIMECODES")
public @Data class ShotTimecode {

    //	[BTIME_ID] 	[BTIME_SHOTLISTE][BTIME_CODE_IN]   [BTIME_CODE_OUT]    [BTIME_INHALT]
	//[BTIME_DBE] [BTIME_SACHINHALT]    [BTIME_GELOESCHT_JN]	[SB_ERFASST][DAT_ERFASST]
	// [SB_GEAENDERT] [DAT_GEAENDERT]  [SB_GELOESCHT] [DAT_GELOESCHT]
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BTIME_ID")
    private Long id;
    @Column(name = "BTIME_SHOTLISTE")
    Long shotlist;
    @Column(name = "BTIME_CODE_IN")
    String tcIn;
    @Column(name = "BTIME_CODE_OUT")
    String tcOut;
    @Column(name = "BTIME_INHALT")
    String inhalt;
    @Column(name = "BTIME_SACHINHALT")
    String sachinhalt;
    @Column(name = "BTIME_GELOESCHT_JN")
    Boolean geloeschtJN;
}