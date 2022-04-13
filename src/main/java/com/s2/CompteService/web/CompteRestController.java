package com.s2.CompteService.web;


import com.s2.CompteService.entities.Compte;
import com.s2.CompteService.repositories.CompteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompteRestController {

    private CompteRepository compteRepository;

    public CompteRestController(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }
    @GetMapping(path = "/comptes")
    public List<Compte> ListComptes(){
        System.out.printf("teessst");
        return compteRepository.findAll();

    }
    @GetMapping(path = "/comptes/{id}")
    public Compte getCompte(@PathVariable(name="id")long code){
        return compteRepository.findById(code).get();
    }

    @PostMapping(path = "/comptes")
    public Compte save( @RequestBody Compte compte){
        return compteRepository.save(compte);
    }

    @PutMapping(path = "/comptes/{id}")
    public Compte update(@PathVariable long id,@RequestBody Compte compte){
        compte.setCode(id);
        return compteRepository.save(compte);
    }

    @DeleteMapping(path= "/comptes/{id}")
    public void update(@PathVariable long id){

        compteRepository.deleteById(id);
    }
}
