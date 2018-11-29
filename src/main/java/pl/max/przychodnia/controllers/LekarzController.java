package pl.max.przychodnia.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.max.przychodnia.entity.Lekarz;
import pl.max.przychodnia.entity.LekarzRepo;


import java.util.Optional;

@RestController()
@RequestMapping("/lekarz")

public class LekarzController {

    @Autowired
    private LekarzRepo lekarzRepo;

    @GetMapping("/{Id_lekarza}")

    public Lekarz getLekarz(@PathVariable Long Id_lekarza) {
        Optional<Lekarz> optionalLekarz = lekarzRepo.findById(Id_lekarza);
        return optionalLekarz.isPresent() ? optionalLekarz.get() : null;
    }


    @PostMapping
    Lekarz postLekarz(@RequestBody Lekarz lekarz) {
        return lekarzRepo.save(lekarz);
    }


    @PutMapping("{/Id_lekarza}")
    Lekarz putLekarz(@RequestBody Lekarz infoLekarz, @PathVariable Long Id_lekarza) {

        Optional<Lekarz> optionalLekarz = lekarzRepo.findById(Id_lekarza);
        if (optionalLekarz.isPresent()) {
            Lekarz lekarz = optionalLekarz.get();

            infoLekarz.setIdLekarza(infoLekarz.getIdLekarza());
            infoLekarz.setImieLekarza(infoLekarz.getImieLekarza());
            infoLekarz.setNazwiskoLekarza(infoLekarz.getNazwiskoLekarza());
            infoLekarz.setSpecjalnoscLekarza(infoLekarz.getSpecjalnoscLekarza());
            return lekarzRepo.save(lekarz);
        } else return null;

    }

    @DeleteMapping("/{Id_lekarza}")
    void deleteLekarz(@PathVariable Long Id_lekarza) {
        lekarzRepo.deleteById(Id_lekarza);
    }

}
