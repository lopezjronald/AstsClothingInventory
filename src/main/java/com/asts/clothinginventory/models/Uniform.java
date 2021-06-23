package com.asts.clothinginventory.models;

abstract class Uniform {
    Belt belt;
    Hat hat;
    Jacket jacket;
    Pants pants;
    Shirt shirt;
    Socks socks;
    Shoes shoes;
    Insignia insignia;
    UniformType uniformType;

    public Uniform(Belt belt, Hat hat, Jacket jacket, Pants pants, Shirt shirt, Socks socks, Shoes shoes, Insignia insignia, UniformType uniformType) {
        this.belt = belt;
        this.hat = hat;
        this.jacket = jacket;
        this.pants = pants;
        this.shirt = shirt;
        this.socks = socks;
        this.shoes = shoes;
        this.insignia = insignia;
        this.uniformType = uniformType;
    }

    public Uniform() {

    }
}
