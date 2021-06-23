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
@Entity(name = "blues_uniform")
@Table
public class BluesUniform extends Uniform {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int tie;

    private int buckle;

    public BluesUniform(){}

    public BluesUniform(Belt belt, Hat hat, Jacket jacket, Pants pants, Shirt shirt, Socks socks, Shoes shoes, Insignia insignia, UniformType uniformType, int tie, int buckle) {
        super(belt, hat, jacket, pants, shirt, socks, shoes, insignia, uniformType);
        this.tie = tie;
        this.buckle = buckle;
    }
}
