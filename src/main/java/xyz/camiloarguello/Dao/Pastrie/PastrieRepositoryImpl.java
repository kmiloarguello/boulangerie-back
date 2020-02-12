package xyz.camiloarguello.Dao.Pastrie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.MongoRegexCreator;
import org.springframework.data.mongodb.core.query.Query;
import xyz.camiloarguello.Entity.Pastrie;

import java.util.Collection;

public class PastrieRepositoryImpl implements PastrieRepositoryCustom {

    private MongoTemplate mongoTemplate;

    @Autowired
    public PastrieRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    // When the controller triggers the function, it search by type using a Query and returning a collection of Pastries.
    @Override
    public Collection<Pastrie> findByType(String type) {

        Query query = new Query();
        query.addCriteria(Criteria.where("type").is(type));

        return mongoTemplate.find(query, Pastrie.class);

    }
}
