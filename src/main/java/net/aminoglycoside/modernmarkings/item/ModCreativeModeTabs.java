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

                        pOutput.accept(ModBlocks.FLOOR_MARKING_DANGER_YELLOW.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_DANGER_RED.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_EXIT.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_WHITE_LANE_CROSS.get());
                        pOutput.accept(ModBlocks.FLOOR_MARKING_YELLOW_LANE.get());


                    }).build());

    public static final RegistryObject<CreativeModeTab> WALL_MARKING_TAB = CREATIVE_MODE_TABS.register("wall_markings_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.CHALK.get()))
                    .title(Component.translatable("creativetab.wall_markings"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CHALK.get());

                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_0.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_1.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_2.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_3.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_4.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_5.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_6.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_7.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_8.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_9.get());

                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_NO.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_NUMERO.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_NUMBER_DASH.get());

                        pOutput.accept(ModBlocks.WALL_MARKING_ARROWLEFT.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_ARROWRIGHT.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_EXIT.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_HAZARDLINE_LEFT.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_HAZARDLINE_RIGHT.get());

                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_CHEMICAL.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_ELECTRIC.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_FIRE.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_FLUID.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_FROST.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_GEARS.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_LASER.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_MAGIC.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_MOB.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_PINCH.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_PRODUCTION.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_RADIATION.get());
                        pOutput.accept(ModBlocks.WALL_MARKING_SYMBOL_STORAGE.get());

                        pOutput.accept(ModBlocks.WALL_MARKING_WARNING_DANGER.get());





                    }).build());



    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
