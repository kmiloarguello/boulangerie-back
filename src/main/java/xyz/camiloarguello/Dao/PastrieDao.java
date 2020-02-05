package xyz.camiloarguello.Dao;

import org.springframework.stereotype.Repository;
import xyz.camiloarguello.Entity.Pastrie;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PastrieDao implements iPastrieDao {

    private static Map<Integer, Pastrie> pastries;

    static {
        pastries = new HashMap<Integer, Pastrie>(){
            {
                put(1, new Pastrie(1,
                        "Croissaint",
                        "Viennoiserie",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/00_Croissant._Yum.jpg/420px-00_Croissant._Yum.jpg",
                        13,
                        "Un croissant est une viennoiserie à base d'une pâte levée feuilletée spécifique, la pâte à croissant, qui comporte de la levure et une proportion importante de beurre."));
                put(2, new Pastrie(2,
                        "Pain aux raisins",
                        "Viennoiserie",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Pain_aux_raisins.jpg/330px-Pain_aux_raisins.jpg",
                        10,
                        "C'est une viennoiserie en forme de spirale. Constituée d'une pâte feuilletée levée, mélangée avec des raisins secs, et fourrée de crème pâtissière, elle est traditionnellement consommée le matin au petit déjeuner, ou pour le goûter. "));
                put(3, new Pastrie(3,
                        "Éclair",
                        "Dessert",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Eclairs_with_chocolate_icing_at_Cafe_Blue_Hills.jpg/420px-Eclairs_with_chocolate_icing_at_Cafe_Blue_Hills.jpg",
                        14,
                        "C'est une pâtisserie d'origine française constituée de pâte à choux allongée et fourrée de crème pâtissière, avec un glaçage sur le dessus. "));
            }
        };
    }

    // Handle information

    @Override
    public Collection<Pastrie> getAllPastries() {
        return this.pastries.values();
    }

    @Override
    public Pastrie getPastrieById(int id) {
        return this.pastries.get(id);
    }

    @Override
    public void insertPastrieToDB(Pastrie pastrie){
        this.pastries.put(pastrie.getId(), pastrie);
    }

    @Override
    public void removePastrieById(int id) {
        this.pastries.remove(id);
    }

    @Override
    public void updatePastrie(Pastrie pastrie){
        Pastrie pastrie1 = pastries.get(pastrie.getId());
        pastrie1.setName(pastrie.getName());
        pastrie1.setType(pastrie.getType());
        pastrie1.setImage(pastrie.getImage());
        pastrie1.setPrice(pastrie.getPrice());
        pastrie1.setDescription(pastrie.getDescription());

        pastries.put(pastrie.getId(), pastrie);
    }

}
