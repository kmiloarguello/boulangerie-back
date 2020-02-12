package xyz.camiloarguello.Dao.Boutique;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import xyz.camiloarguello.Entity.Boutique;

import java.util.Collection;

public class BoutiqueRepositoryImpl implements BoutiqueRepositoryCustom {

    private MongoTemplate mongoTemplate;

    public BoutiqueRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Collection<Boutique> findByPostalCode(String postalCode) {
        Query query = new Query();

        query.addCriteria(Criteria.where("postalcode").is(postalCode));

        return mongoTemplate.find(query, Boutique.class);
    }
}
