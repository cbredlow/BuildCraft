/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.api.events;

import net.minecraft.entity.player.EntityPlayer;

import cpw.mods.fml.common.eventhandler.Event;

public class PipePlacedEvent extends Event {
	public EntityPlayer player;
	public String pipeType;
	public int x, y, z;

	public PipePlacedEvent(EntityPlayer player, String pipeType, int x, int y, int z) {
		this.player = player;
		this.pipeType = pipeType;
		this.x = x;
		this.y = y;
		this.z = z;
	}

}
