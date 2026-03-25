package com.example.modid.toolTips;

import com.example.modid.mod_items.ModItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class IngotCopper extends ModItems {
    @Override
    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
        tooltip.add("Cu");
        super.addInformation(stack, player, tooltip, advanced);
    }
}
