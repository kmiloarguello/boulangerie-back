package xyz.camiloarguello.Dao.Pastrie;

import org.springframework.data.mongodb.repository.Query;
import xyz.camiloarguello.Entity.Pastrie;

import java.util.Collection;

public interface PastrieRepositoryCustom {
    // Define the custom function to get data from MongoDB
    Collection<Pastrie> findByType(String type);

    //    @Query("{''}")
//    Collection<Pastrie> findByPriceLowerThan(int price);
}
