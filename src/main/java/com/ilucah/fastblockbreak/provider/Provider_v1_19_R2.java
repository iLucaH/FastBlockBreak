package com.ilucah.fastblockbreak.provider;

import org.bukkit.Location;
import org.bukkit.Material;

public class Provider_v1_19_R2 implements NMSProvider {

    /*
    As of v1_17_R1 #setType() is already blazing fast
     */
    @Override
    public void setBlockFast(Location location, Material material, boolean applyPhysics) {
        location.getBlock().setType(material, applyPhysics);
    }

}
