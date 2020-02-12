package xyz.camiloarguello.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import xyz.camiloarguello.Dao.BoutiqueRepository;
import xyz.camiloarguello.Entity.Boutique;

import java.util.Collection;

@RestController
@RequestMapping("/boutiques")
public class BoutiqueController {

    @Autowired
    private BoutiqueRepository boutiqueRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Boutique> getAllBoutiques(){
        return this.boutiqueRepository.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Boutique getBoutiqueById(@PathVariable("id") String id){
        return this.boutiqueRepository.findById(id).orElse(null);
    }

    @RequestMapping(value = "/pc/{postalcode}", method = RequestMethod.GET)
    public Collection<Boutique> getBoutiqueByPostalCode(@PathVariable("postalcode") String postalCode){
        return this.boutiqueRepository.findByPostalCode(postalCode);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertNewBoutique(@RequestBody Boutique boutique){
        this.boutiqueRepository.insert(boutique);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeBoutiqueById(@PathVariable String id){
        this.boutiqueRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateBoutique(@RequestBody Boutique boutique){
        this.boutiqueRepository.save(boutique);
    }
}
