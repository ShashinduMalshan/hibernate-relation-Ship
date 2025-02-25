package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.LineNumberInputStream;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "item")
public class Item {
    @Id
    @Column(name = "customer_id")

    private String id;
    @Column(length = 100)
    private String name;

    private int qty ;
    @Column(name = "unit_Price",precision = 10, scale = 2)
    private BigDecimal unitPrice;

    @OneToMany(mappedBy = "item")
    private List<OrderDetail> orderDetails;


}