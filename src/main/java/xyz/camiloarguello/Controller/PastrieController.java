package xyz.camiloarguello.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import xyz.camiloarguello.Dao.PastrieRepository;
import xyz.camiloarguello.Entity.Pastrie;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
// @CrossOrigin(origins = "https://boulangerie-front.herokuapp.com", allowedHeaders = "*")
@RequestMapping("/pastries")
public class PastrieController {

    @Autowired
    private PastrieRepository pastrieRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Pastrie> getAllPastries(){
        return this.pastrieRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Pastrie getPastrieById(@PathVariable("id") String id){
        return this.pastrieRepository.findById(id).orElse(null);
    }

    @RequestMapping(value = "/type/{type}",method = RequestMethod.GET)
    public Collection<Pastrie> getByType(@PathVariable("type") String type) {
        return this.pastrieRepository.findByType(type);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertPastrieToDB(@RequestBody Pastrie pastrie){
        this.pastrieRepository.insert(pastrie);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removePastrieById(@PathVariable String id){
        this.pastrieRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePastrie(@RequestBody Pastrie pastrie){
        this.pastrieRepository.save(pastrie);
    }


}
