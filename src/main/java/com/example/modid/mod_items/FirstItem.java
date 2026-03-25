package com.example.modid.mod_items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class FirstItem extends Item {
    public FirstItem() {
        //setRegistryName("ingot_aluminium");
        //setTranslationKey(ModTutorial.MODID + ".ingot_aluminium");

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}
