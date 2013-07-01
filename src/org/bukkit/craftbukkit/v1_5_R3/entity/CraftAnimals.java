package org.bukkit.craftbukkit.v1_5_R3.entity;

import net.minecraft.entity.passive.EntityAnimal;

import org.bukkit.craftbukkit.v1_5_R3.CraftServer;
import org.bukkit.entity.Animals;
//import org.bukkit.craftbukkit.v1_5_R3.CraftServer;

public class CraftAnimals extends CraftAgeable implements Animals {

    public CraftAnimals(CraftServer server, EntityAnimal entity) {
        super(server, entity);
    }

    @Override
    public EntityAnimal getHandle() {
        return (EntityAnimal) entity;
    }

    @Override
    public String toString() {
        return "CraftAnimals";
    }
}
