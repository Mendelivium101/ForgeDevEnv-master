package com.example.modid.proxy;

import ca.weblite.objc.Client;
import com.example.modid.mod_blocks.ModBlocks;
import com.example.modid.mod_items.ModItems;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends  CommonProxy{
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.ALL_ITEMS.forEach(ClientProxy::register);
        ModBlocks.MOD_ITEM_BLOCKS.forEach((ClientProxy::register));
        ModItems.MOD_ITEMS.forEach(ClientProxy::register);

        //ModelBakery.registerItemVariants(FirstItem,FirstItem.getRegistryName());
        //ModelLoader.setCustomModelResourceLocation(FirstItem,0,new ModelResourceLocation(FirstItem.getRegistryName(),"inventory"));
}

    public static void register(Item item){
        ModelBakery.registerItemVariants(item,item.getRegistryName());
        ModelLoader.setCustomModelResourceLocation(item,0,new ModelResourceLocation(item.getRegistryName(),"inventory"));
    }


    //@GameRegistry.ObjectHolder("modtut:ingot_aluminium")
    //public static FirstItem FirstItem;



}
