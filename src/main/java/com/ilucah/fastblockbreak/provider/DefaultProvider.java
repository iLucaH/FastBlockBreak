package com.ilucah.fastblockbreak.provider;

import org.bukkit.Location;
import org.bukkit.Material;

public class DefaultProvider implements NMSProvider {

    @Override
    public void setBlockFast(Location location, Material material, boolean applyPhysics) {
        location.getBlock().setType(material, applyPhysics);
    }
}
