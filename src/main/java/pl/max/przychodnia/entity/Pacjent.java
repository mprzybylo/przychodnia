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
    private Long idPacjeta;
    private String imiePacjenta;
    private String nazwiskoPacjenta;
    private Long wiekPacjeta;


    @OneToMany(mappedBy = "pacjent")
    private List<Wizyty> wizytyList;


    public Long getIdPacjeta() {
        return idPacjeta;
    }

    public void setIdPacjeta(Long idPacjeta) {
        this.idPacjeta = idPacjeta;
    }

    public String getImiePacjenta() {
        return imiePacjenta;
    }

    public void setImiePacjenta(String imiePacjenta) {
        this.imiePacjenta = imiePacjenta;
    }

    public String getNazwiskoPacjenta() {
        return nazwiskoPacjenta;
    }

    public void setNazwiskoPacjenta(String nazwiskoPacjenta) {
        this.nazwiskoPacjenta = nazwiskoPacjenta;
    }

    public Long getWiekPacjeta() {
        return wiekPacjeta;
    }

    public void setWiekPacjeta(Long wiekPacjeta) {
        this.wiekPacjeta = wiekPacjeta;
    }

    public List<Wizyty> getWizytyList() {
        return wizytyList;
    }

    public void setWizytyList(List<Wizyty> wizytyList) {
        this.wizytyList = wizytyList;
    }
}
