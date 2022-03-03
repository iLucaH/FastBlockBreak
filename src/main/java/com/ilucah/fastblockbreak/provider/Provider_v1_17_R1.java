package com.ilucah.fastblockbreak.provider;

import org.bukkit.Location;
import org.bukkit.Material;

public class Provider_v1_17_R1 implements NMSProvider {
    @Override
    public void setBlockFast(Location location, Material material, boolean applyPhysics) {
        location.getBlock().setType(material, applyPhysics);
    }
}
