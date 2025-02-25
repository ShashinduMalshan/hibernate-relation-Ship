package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "orders_details")

public class OrderDetail {

//    @Id
//    private int id;

    @EmbeddedId
    private OrderDetailsId id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "item_id")
    private Item item;

    private int qty;


    @Column(name = "unit_Price",precision = 10, scale = 2)
    private BigDecimal unitPrice;

}