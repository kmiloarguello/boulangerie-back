package xyz.camiloarguello.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import xyz.camiloarguello.Dao.Boutique.BoutiqueRepositoryCustom;
import xyz.camiloarguello.Entity.Boutique;

public interface BoutiqueRepository extends MongoRepository<Boutique, String>, BoutiqueRepositoryCustom {
}
