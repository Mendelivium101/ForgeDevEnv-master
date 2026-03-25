package com.example.modid.special_recipes;

import com.example.modid.mod_blocks.ModBlocks;
import com.example.modid.mod_items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.example.modid.mod_blocks.ModBlocks.MOD_BLOCKS;
import static com.example.modid.mod_items.ModItems.ALL_ITEMS;
import static com.example.modid.mod_items.ModItems.MOD_ITEMS;

public class furnaceRecipes {
    public static void furnaceRecipes() {
        GameRegistry.addSmelting(new ItemStack(ModBlocks.malachite), new ItemStack(ModItems.ingot_copper), 1);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.chalcopyrite_cufes2), new ItemStack(ModItems.ingot_copper), 1);

        GameRegistry.addSmelting(new ItemStack(ModBlocks.natural_cassiterite), new ItemStack(ModItems.ingot_tin), 1);

    }
}