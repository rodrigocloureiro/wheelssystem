package br.com.wheels.model;

import br.com.wheels.model.enums.CategoriaBike;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor@NoArgsConstructor
@ToString
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter@Setter
    private int id;
    @Getter@Setter
    //@Column(name = "model")
    private String modelo;
    @Getter@Setter
    private CategoriaBike categoria;
}
