package pl.max.przychodnia.entity;

import javax.persistence.*;



@Entity
@Table(name="Wizyty")
public class Wizyty  {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idWizyty;

    @ManyToOne
    @JoinColumn(name = "pacjent_id")
    private  Pacjent pacjent;


    @ManyToOne
    @JoinColumn(name = "lekarzId")
    private Lekarz lekarz;
    private Long dataWizyty;
    private Long godzinaWizyty;

    @Enumerated(EnumType.STRING)
    private RodzajWizyt rodzajWizyt;


    public Long getId() {
        return idWizyty;
    }

    public void setId(Long id) {
        this.idWizyty = idWizyty;
    }

    public Pacjent getPacjent() {
        return pacjent;
    }

    public void setPacjent(Pacjent pacjent) {
        this.pacjent = pacjent;
    }

    public Lekarz getLekarz() {
        return lekarz;
    }

    public void setLekarz(Lekarz lekarz) {
        this.lekarz = lekarz;
    }

    public Long getDataWizyty() {
        return dataWizyty;
    }

    public void setDataWizyty(Long dataWizyty) {
        this.dataWizyty = dataWizyty;
    }

    public Long getGodzinaWizyty() {
        return godzinaWizyty;
    }

    public void setGodzinaWizyty(Long godzinaWizyty) {
        this.godzinaWizyty = godzinaWizyty;
    }

    public RodzajWizyt getRodzajWizyt() {
        return rodzajWizyt;
    }

    public void setRodzajWizyt(RodzajWizyt rodzajWizyt) {
        this.rodzajWizyt = rodzajWizyt;
    }
}
