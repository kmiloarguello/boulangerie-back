package xyz.camiloarguello.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import xyz.camiloarguello.Dao.Pastrie.PastrieRepositoryCustom;
import xyz.camiloarguello.Entity.Pastrie;

import java.util.Collection;

public interface PastrieRepository extends MongoRepository<Pastrie,String> , PastrieRepositoryCustom {

}
