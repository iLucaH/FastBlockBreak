package com.ilucah.fastblockbreak.provider;

import org.bukkit.Location;
import org.bukkit.Material;

public interface NMSProvider {

    /**
     * Method to set a block faster than bukkit allows.
     *
     * @param location The location of the block you want set.
     * @param material The material of the new block you want to set.
     * @param applyPhysics If you want to the block to update after set.
     */
    void setBlockFast(Location location, Material material, boolean applyPhysics);

}
