package pl.max.przychodnia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.max.przychodnia.entity.Pacjent;
import pl.max.przychodnia.entity.PacjentRepo;


import java.util.Optional;


@RestController()
@RequestMapping("/pacjent")
public class PacjentController {

    @Autowired
    private PacjentRepo pacjentRepo;


    @GetMapping("/{idPacjenta}")
    public Pacjent getPacjent(@PathVariable Long idPacjenta) {
        Optional<Pacjent> optionalPacjent = pacjentRepo.findById(idPacjenta);
        return optionalPacjent.isPresent() ? optionalPacjent.get() : null;
    }

    @PostMapping()
    public Pacjent postPacjent(@RequestBody Pacjent pacjent) {
        return pacjentRepo.save(pacjent);
    }

    @PutMapping("/{idPacjenta}")
    Pacjent putPacjent(@RequestBody Pacjent nowyPacjent, @PathVariable Long idPacjenta) {

        Optional<Pacjent> optionalPacjent = pacjentRepo.findById(idPacjenta);
        if (optionalPacjent.isPresent()) {
            Pacjent pacjent = optionalPacjent.get();

            pacjent.setImie(nowyPacjent.getImie());
            pacjent.setNazwisko(nowyPacjent.getNazwisko());
            pacjent.setWiek_pacjenta(nowyPacjent.getWiek_pacjeta());
            return pacjentRepo.save(pacjent);

        } else return null;

    }

    @DeleteMapping("/{idPacjenta}")
    void deletePacjent(@PathVariable Long idPacjenta) {
        pacjentRepo.deleteById(idPacjenta);
    }


}
