
package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    
    private String id;
    
    private String name;

    private Date productSnapshotDate;

    private String type;
    
    public Product(String id, String name, Date productSnapshotDate, String type)
    {
        this.id=id;
        this.name=name;
        this.productSnapshotDate=productSnapshotDate;
        this.type=type;
    }
    
    public String getProductId() {
        return id;
    }

    public String getProductName() {
        return name;
    }

    public Date getProductSnapshotDate() {
        return productSnapshotDate;
    }

    public String getProductType() {
        return type;
    }
    
    
}
