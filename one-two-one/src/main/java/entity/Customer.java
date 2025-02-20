package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table( name = "Customer_table")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)



    private int id;

    private String name;

    @OneToOne
    @JoinColumn(name = "nic_number")
    private IDCard idCard;

}
//shasidu