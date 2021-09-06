package io.github.simplycmd.simplylib.registry.example;

import io.github.simplycmd.simplylib.registry.RegisterModItemCallback;
import io.github.simplycmd.simplylib.scheduler.example.SchedulerExampleItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;

public class ExampleItemRegistry {
    public static void register() {
        RegisterModItemCallback.EVENT.register((items) -> {
            items.put("simplylib_item", new SchedulerExampleItem(new FabricItemSettings().group(ItemGroup.MISC)));
        });
    }
}
