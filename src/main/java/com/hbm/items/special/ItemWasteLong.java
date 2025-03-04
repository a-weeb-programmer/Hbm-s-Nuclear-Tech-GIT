package com.hbm.items.special;

import java.util.List;

import com.hbm.main.MainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemWasteLong extends ItemHazard {

	public ItemWasteLong() {
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(MainRegistry.controlTab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tabs, List list) {
		for(int i = 0; i < WasteClass.values().length; ++i) {
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
		
		list.add(EnumChatFormatting.ITALIC + WasteClass.values()[rectify(stack.getItemDamage())].name);
		
		super.addInformation(stack, player, list, bool);
	}
	
	private int rectify(int meta) {
		return Math.abs(meta) % WasteClass.values().length;
	}
	
	public enum WasteClass {

		//all decayed versions include lead-types and classic nuclear waste
		URANIUM("Uranium"),			//plutonium 239 and 240, neptunium 237 / -
		NEPTUNIUM("Neptunium"),		//plutonium 239 and uranium 238 / -
		THORIUM("Thorium");			//uranium 233 and uranium 235 / -
		
		String name;
		
		private WasteClass(String name) {
			this.name = name;
		}
	}
}
