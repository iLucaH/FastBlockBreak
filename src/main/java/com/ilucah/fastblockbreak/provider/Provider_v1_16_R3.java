package com.ilucah.fastblockbreak.provider;

import net.minecraft.server.v1_16_R3.BlockPosition;
import net.minecraft.server.v1_16_R3.IBlockData;
import net.minecraft.server.v1_16_R3.WorldServer;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R3.util.CraftMagicNumbers;

public class Provider_v1_16_R3 implements NMSProvider {

    @Override
    public void setBlockFast(Location location, Material material, boolean applyPhysics) {
        WorldServer world = ((CraftWorld)location.getWorld()).getHandle();
        BlockPosition blockPosition = new BlockPosition(location.getBlockX(), location.getBlockY(), location.getBlockZ());
        IBlockData blockData = CraftMagicNumbers.getBlock(material).getBlockData();
        world.setTypeAndData(blockPosition, blockData, applyPhysics ? 3 : 2);
    }

}
