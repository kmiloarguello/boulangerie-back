package xyz.camiloarguello.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import xyz.camiloarguello.Entity.Pastrie;

public interface PastrieRepository extends MongoRepository<Pastrie,String> {

}
