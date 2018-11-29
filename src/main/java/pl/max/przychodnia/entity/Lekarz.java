package pl.max.przychodnia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Lekarze")
public class Lekarz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_lekarza;
    private String Imie_lekarza;
    private String Nazwisko_lekarza;
    private String Specjalnosc;

    @OneToMany(mappedBy = "lekarz")
    private List<Wizyty> wizytyList;

    public Long getId_lekarza() {
        return Id_lekarza;
    }

    public void setId_lekarza(Long id_lekarza) {
        Id_lekarza = id_lekarza;
    }

    public String getImie_lekarza() {
        return Imie_lekarza;
    }

    public void setImie_lekarza(String imie_lekarza) {
        Imie_lekarza = imie_lekarza;
    }

    public String getNazwisko_lekarza() {
        return Nazwisko_lekarza;
    }

    public void setNazwisko_lekarza(String nazwisko_lekarza) {
        Nazwisko_lekarza = nazwisko_lekarza;
    }

    public String getSpecjalnosc() {
        return Specjalnosc;
    }

    public void setSpecjalnosc(String specjalnosc) {
        Specjalnosc = specjalnosc;
    }

    public List<Wizyty> getWizytyList() {
        return wizytyList;
    }

    public void setWizytyList(List<Wizyty> wizytyList) {
        this.wizytyList = wizytyList;
    }
}
