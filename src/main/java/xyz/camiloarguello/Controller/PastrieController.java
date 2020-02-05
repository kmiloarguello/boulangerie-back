package xyz.camiloarguello.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import xyz.camiloarguello.Entity.Pastrie;
import xyz.camiloarguello.Service.PastrieService;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/pastries")
public class PastrieController {

    @Autowired
    private PastrieService pastrieService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Pastrie> getAllPastries(){
        return pastrieService.getAllPastries();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Pastrie getPastrieById(@PathVariable("id") int id){
        return pastrieService.getPastrieById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertPastrieToDB(@RequestBody Pastrie pastrie){
        pastrieService.insertPastrieToDB(pastrie);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removePastrieById(@PathVariable int id){
        pastrieService.removePastrieById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePastrie(@RequestBody Pastrie pastrie){
        pastrieService.updatePastrie(pastrie);
    }
}
