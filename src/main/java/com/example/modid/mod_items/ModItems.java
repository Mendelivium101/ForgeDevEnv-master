package com.example.modid.mod_items;

import com.example.modid.ModTutorial;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

//item list
public class ModItems {
    public static final List<Item> ALL_ITEMS = new ArrayList<>();
    public static final List<Block> ALL_BLOCKS = new ArrayList<>();
    public static final List<Item> MOD_ITEMS = new ArrayList<>();

    public static final ModTutCreativeTab TAB = new ModTutCreativeTab();

private static Item modItems(String name){
    Item temp = new Item().setRegistryName(name).setTranslationKey(ModTutorial.MODID + "." + name).setCreativeTab(TAB);
    MOD_ITEMS.add(temp);
    return temp;
}
    public static final Item ingot_zinc = modItems("ingot_zinc");
    public static final Item ingot_copper = modItems("ingot_copper");
    public static final Item ingot_aluminium = modItems("ingot_aluminium");
    public static final Item ingot_tin = modItems("ingot_tin");



    //static {
    //    basicItem("ingot_zinc");
    //    basicItem("ingot_copper");
    //    basicItem("ingot_aluminium");
    //    basicItem("ingot_Tin");
    //
    //    basicBlock("block_aluminium", Material.IRON);
    //}

    //private static void basicItem(String name) {
    //    ALL_ITEMS.add(new Item().setRegistryName(name).setTranslationKey(ModTutorial.MODID + "." + name).setCreativeTab(TAB));
    //}

    //private static void basicBlock(String name, Material material) {
    //    Block temp = new Block(material).setRegistryName(name).setTranslationKey(ModTutorial.MODID + "." + name).setCreativeTab(TAB);
    //    ALL_BLOCKS.add(temp);
    //    ALL_ITEMS.add(new ItemBlock(temp).setRegistryName(name));
    //}
}

