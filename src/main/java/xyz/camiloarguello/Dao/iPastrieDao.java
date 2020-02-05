package xyz.camiloarguello.Dao;

import xyz.camiloarguello.Entity.Pastrie;

import java.util.Collection;

public interface iPastrieDao {
    Collection<Pastrie> getAllPastries();

    Pastrie getPastrieById(int id);

    void insertPastrieToDB(Pastrie pastrie);

    void removePastrieById(int id);

    void updatePastrie(Pastrie pastrie);
}
