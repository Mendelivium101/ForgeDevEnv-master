package com.example.modid.mod_items;

import com.example.modtut.Tags;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModTutCreativeTab extends CreativeTabs {

    public ModTutCreativeTab() {
        super(Tags.MOD_ID);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.APPLE);
    }
}
