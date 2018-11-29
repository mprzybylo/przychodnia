package pl.max.przychodnia.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Pacjeci")
public class Pacjent {

    @Id
    @Column(name = "pacjent_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_pacjeta;
    private String Imie;
    private String Nazwisko;
    private Long Wiek_pacjeta;


    @OneToMany(mappedBy = "pacjent")
    private List<Wizyty> wizytyList;


    public Long getId_pacjeta() {
        return Id_pacjeta;
    }

    public void setId_pacjeta(Long id_pacjeta) {
        Id_pacjeta = id_pacjeta;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public Long getWiek_pacjeta() {
        return Wiek_pacjeta;
    }

    public void setWiek_pacjenta(Long wiek_pacjeta) {
        Wiek_pacjeta = wiek_pacjeta;
    }

    public List<Wizyty> getWizytyList() {
        return wizytyList;
    }

    public void setWizytyList(List<Wizyty> wizytyList) {
        this.wizytyList = wizytyList;
    }
}
