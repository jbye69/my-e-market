package fr.peaks.my_e_market.model;

import lombok.*;

import javax.persistence.Entity;

@Entity
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Product extends AbstractId {

    private String name;
    private String reference;
    private String description;
    private float price;

}
