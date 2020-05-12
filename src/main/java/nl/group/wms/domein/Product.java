package nl.group.wms.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int price;              // ct
//    private long eanCode;
//    private String description;
//    private int length;             // mm
//    private int width;              // mm
//    private int height;             // mm
//    private int weight;             // gr
//    private int inStock;            // TODO dit bij aanmaken van een nieuw productItem +1


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
