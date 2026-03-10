package com.irontroll.irontrolltestmod.item;
import com.irontroll.irontrolltestmod.IrontrollTestMod;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItems {
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(IrontrollTestMod.MODID);

  public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth", 
    () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
    () -> new Item(new Item.Properties()));

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}