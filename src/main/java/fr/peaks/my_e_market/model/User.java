package fr.peaks.my_e_market.model;

import lombok.*;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User extends AbstractId{

    private String firstName;
    private String lastName;
    private String email;
}
