package com.asts.clothinginventory.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Builder
@Getter
@Setter
@Entity(name = "physical_fitness_uniform")
@Table
public class PTUniform extends Uniform {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Shorts shorts;

    public PTUniform() {}

    public PTUniform(Long id, Shorts shorts, Belt belt, Hat hat, Jacket jacket, Pants pants, Shirt shirt, Socks socks, Shoes shoes, Insignia insignia, UniformType uniformType) {
        super(belt, hat, jacket, pants, shirt, socks, shoes, insignia, uniformType);
        this.id = id;
        this.shorts = shorts;
    }

}
