package xyz.camiloarguello.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.camiloarguello.Dao.iPastrieDao;
import xyz.camiloarguello.Entity.Pastrie;

import java.util.Collection;

@Service
public class PastrieService {
    @Autowired
    private iPastrieDao pastrieDao;

    public Collection<Pastrie> getAllPastries() {
        return pastrieDao.getAllPastries();
    }

    public Pastrie getPastrieById(int id){
        return this.pastrieDao.getPastrieById(id);
    }

    public void insertPastrieToDB(Pastrie pastrie){
        this.pastrieDao.insertPastrieToDB(pastrie);
    }

    public void removePastrieById(int id){
        this.pastrieDao.removePastrieById(id);
    }

    public void updatePastrie(Pastrie pastrie){
        this.pastrieDao.updatePastrie(pastrie);
    }
}
