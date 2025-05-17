package net.aminoglycoside.modernmarkings.item;

import net.aminoglycoside.modernmarkings.AGSModernMarkingsMod;
import net.aminoglycoside.modernmarkings.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AGSModernMarkingsMod.MODID);

    public static final RegistryObject<CreativeModeTab> FLOOR_MARKING_TAB = CREATIVE_MODE_TABS.register("floor_markings_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.CHALK.get()))
                    .title(Component.translatable("creativetab.floor_markings"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CHALK.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_NOSTEP.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_WHITE_ARROW.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_WHITE_LANE.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_WHITE_DOUBLE_ARROW.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_WHITE_SQUARE.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_YELLOW_ARROW.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_YELLOW_SIDELINE.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_YELLOW_SQUARE.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_YELLOW_STRIPES.get());

                        pOutput.accept(ModBlocks.FLOOR_MARKING_REDX.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_NOENTRY.get());

                        pOutput.accept(ModBlocks.FLOOR_MARKING_BLACK_SINGLELINE.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_WHITE_SINGLELINE.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_RED_SINGLELINE.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_YELLOW_SINGLELINE.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_GREEN_SINGLELINE.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_BLUE_SINGLELINE.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_ORANGE_SINGLELINE.get());

                        pOutput.accept(ModBlocks.FLOOR_MARKING_YELLOW_HAZARDLINE.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_RED_HAZARDLINE.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_WHITEBLACK_HAZARDLINE.get());



                    })
                            .build());



    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
