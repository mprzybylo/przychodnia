package pl.max.przychodnia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.max.przychodnia.entity.Wizyty;
import pl.max.przychodnia.entity.WizytaRepo;

import java.util.Optional;

@RestController()
@RequestMapping("/wizyta")


public class WizityController {

    @Autowired
    private WizytaRepo wizytaRepo;

    @GetMapping("/{idWizyty}")

    public Wizyty getWizyta(@PathVariable Long idWizyty) {
        Optional<Wizyty> optionalWizyty = wizytaRepo.findById(idWizyty);
        return optionalWizyty.isPresent() ? optionalWizyty.get() : null;

    }

    @PostMapping()
    public Wizyty postWizyta(@RequestBody Wizyty wizyty) {
        return wizytaRepo.save(wizyty);
    }


    @PutMapping("/{idWizyty}")
    Wizyty putWizyta(@RequestBody Wizyty nowaWizyta, @PathVariable Long idWizyty) {

        Optional<Wizyty> optionalWizyty = wizytaRepo.findById(idWizyty);
        if (optionalWizyty.isPresent()) {
            Wizyty wizyty = optionalWizyty.get();

            wizyty.setId(nowaWizyta.getId());
            wizyty.setDataWizyty(nowaWizyta.getDataWizyty());
            wizyty.setGodzinaWizyty(nowaWizyta.getGodzinaWizyty());

            return wizytaRepo.save(wizyty);
        } else return null;

    }


    @DeleteMapping("/{idWizyty}")
    void deleteWizyty(@PathVariable Long idWizyty) {
        wizytaRepo.deleteById(idWizyty);
    }

}
