package pl.max.przychodnia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Lekarze")
public class Lekarz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLekarza;
    private String imieLekarza;
    private String nazwiskoLekarza;
    private String specjalnoscLekarza;

    @OneToMany(mappedBy = "lekarz")
    private List<Wizyty> wizytyList;

    public Long getIdLekarza() {
        return idLekarza;
    }

    public void setIdLekarza(Long idLekarza) {
        this.idLekarza = idLekarza;
    }

    public String getImieLekarza() {
        return imieLekarza;
    }

    public void setImieLekarza(String imieLekarza) {
        this.imieLekarza = imieLekarza;
    }

    public String getNazwiskoLekarza() {
        return nazwiskoLekarza;
    }

    public void setNazwiskoLekarza(String nazwiskoLekarza) {
        this.nazwiskoLekarza = nazwiskoLekarza;
    }

    public String getSpecjalnoscLekarza() {
        return specjalnoscLekarza;
    }

    public void setSpecjalnoscLekarza(String specjalnoscLekarza) {
        this.specjalnoscLekarza = specjalnoscLekarza;
    }

    public List<Wizyty> getWizytyList() {
        return wizytyList;
    }

    public void setWizytyList(List<Wizyty> wizytyList) {
        this.wizytyList = wizytyList;
    }
}
