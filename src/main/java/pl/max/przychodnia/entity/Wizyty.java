package pl.max.przychodnia.entity;

import javax.persistence.*;



@Entity
@Table(name="Wizyty")
public class Wizyty  {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pacjent_id")
    private  Pacjent pacjent;


    @ManyToOne
    @JoinColumn(name = "lekarzId")
    private Lekarz lekarz;

    private Long Data_wizyty;
    private Long Godzina_wizyty;

    @Enumerated(EnumType.STRING)
    private RodzajWizyt rodzajWizyt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getData_wizyty() {
        return Data_wizyty;
    }

    public void setData_wizyty(Long data_wizyty) {
        Data_wizyty = data_wizyty;
    }

    public Long getGodzina_wizyty() {
        return Godzina_wizyty;
    }

    public void setGodzina_wizyty(Long godzina_wizyty) {
        Godzina_wizyty = godzina_wizyty;
    }

    public RodzajWizyt getRodzajWizyt() {
        return rodzajWizyt;
    }

    public void setRodzajWizyt(RodzajWizyt rodzajWizyt) {
        this.rodzajWizyt = rodzajWizyt;
    }
}
