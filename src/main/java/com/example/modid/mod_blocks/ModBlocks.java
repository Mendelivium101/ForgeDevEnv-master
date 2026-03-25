package com.example.modid.mod_blocks;

import com.example.modid.ModTutorial;
import com.example.modid.mod_items.ModTutCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> MOD_BLOCKS = new ArrayList<>();
    public static final List<Item> MOD_ITEM_BLOCKS = new ArrayList<>();

    public static final ModTutCreativeTab TAB2 = new ModTutCreativeTab();

    //private static void modBlocks(String name, Material material) {
    //    Block temp = new Block(material).setRegistryName(name).setTranslationKey(ModTutorial.MODID + "." + name).setCreativeTab(TAB2);
    //    MOD_BLOCKS.add(temp);
    //    MOD_ITEM_BLOCKS.add(new ItemBlock(temp).setRegistryName(name));
    //}
    //static {
    //    modBlocks("chalcopyrite_cufes2", Material.ROCK); //CuFeS2
    //    modBlocks("malachite", Material.ROCK);
    //}

    private static Block modBlocks(String name, Material material) {
        Block temp = new Block(material).setRegistryName(name).setTranslationKey(ModTutorial.MODID + "." + name).setCreativeTab(TAB2);
        MOD_BLOCKS.add(temp);
        MOD_ITEM_BLOCKS.add(new ItemBlock(temp).setRegistryName(name));
        return temp;
    }
    public static final Block chalcopyrite_cufes2 = modBlocks("chalcopyrite_cufes2", Material.ROCK); //CuFeS2
    public static final Block malachite = modBlocks("malachite", Material.ROCK);
    public static final Block natural_cassiterite = modBlocks("natural_cassiterite", Material.ROCK);
    public static final Block block_aluminium = modBlocks("block_aluminium", Material.ROCK);

}
