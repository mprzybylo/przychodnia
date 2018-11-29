//package pl.max.przychodnia.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import pl.max.przychodnia.entity.Pacjent;
//import pl.max.przychodnia.entity.PacjentRepo;
//
//@RestController()
//@RequestMapping("/test")
//public class TestConroller {
//
//    @Autowired
//    private PacjentRepo pacjentRepo;
//
//    @GetMapping("/")
//    public String welcome() {//Welcome page, non-rest
//        return "czesc" ;
//    }
//
//    @GetMapping("/pacjent")
//    public Pacjent getPAcjent() {//Welcome page, non-rest
//        Pacjent pacjent = new Pacjent();
//        pacjent.setImie("Adam");
//        return pacjent;
//    }
//
//    @PostMapping("/pacjent")
//    public Pacjent postPacjent(@RequestBody Pacjent pacjent) {
//
//        return pacjentRepo.save(pacjent);
//
//    }
//}
