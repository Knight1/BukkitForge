package org.bukkit.craftbukkit.v1_5_R3.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityFireball;

import org.bukkit.craftbukkit.v1_5_R3.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.LivingEntity;
import org.bukkit.util.Vector;
//import org.bukkit.craftbukkit.v1_5_R3.CraftServer;

public class CraftFireball extends AbstractProjectile implements Fireball {
	// FIXME: Implement these for real!
	private float theYield = 1.0F; // seems to be default.
	private boolean makeFire = true;
	
    public CraftFireball(CraftServer server, EntityFireball entity) {
        super(server, entity);
    }

    public float getYield() {
        return theYield;
    }

    public boolean isIncendiary() {
        return makeFire;
    }

    public void setIsIncendiary(boolean isIncendiary) {
        makeFire = isIncendiary;
    }

    public void setYield(float yield) {
        theYield = yield;
    }

    public LivingEntity getShooter() {
        if (getHandle().shootingEntity != null) {
            return (LivingEntity) CraftFireball.getEntity(server, getHandle().shootingEntity);
        }

        return null;
    }

    public void setShooter(LivingEntity shooter) {
        if (shooter instanceof CraftLivingEntity) {
            getHandle().shootingEntity = (EntityLiving) ((CraftLivingEntity) shooter).entity;
        }
    }

    public Vector getDirection() {
        return new Vector(getHandle().accelerationX, getHandle().accelerationY, getHandle().accelerationZ);
    }

    public void setDirection(Vector direction) {
        //getHandle().(direction.getX(), direction.getY(), direction.getZ());
    	// FIXME
    }

    @Override
    public EntityFireball getHandle() {
        return (EntityFireball) entity;
    }

    @Override
    public String toString() {
        return "CraftFireball";
    }

    public EntityType getType() {
        return EntityType.FIREBALL;
    }
}
