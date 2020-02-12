package xyz.camiloarguello.Dao.Boutique;

import xyz.camiloarguello.Entity.Boutique;

import java.util.Collection;

public interface BoutiqueRepositoryCustom {
    Collection<Boutique> findByPostalCode(String postalCode);
}
