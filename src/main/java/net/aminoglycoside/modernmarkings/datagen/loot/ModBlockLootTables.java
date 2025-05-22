package net.aminoglycoside.modernmarkings.datagen.loot;

import net.aminoglycoside.modernmarkings.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.FLOOR_MARKING_NOSTEP.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_WHITE_ARROW.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_WHITE_DOUBLE_ARROW.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_WHITE_LANE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_WHITE_SQUARE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_YELLOW_ARROW.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_YELLOW_SIDELINE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_YELLOW_SQUARE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_YELLOW_STRIPES.get());

        this.dropSelf(ModBlocks.FLOOR_MARKING_BLACK_SINGLELINE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_BLUE_SINGLELINE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_GREEN_SINGLELINE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_ORANGE_SINGLELINE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_RED_SINGLELINE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_WHITE_SINGLELINE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_YELLOW_SINGLELINE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_RED_HAZARDLINE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_YELLOW_HAZARDLINE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_WHITEBLACK_HAZARDLINE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_NOENTRY.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_REDX.get());

        this.dropSelf(ModBlocks.FLOOR_MARKING_EXIT.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_DANGER_RED.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_DANGER_YELLOW.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_YELLOW_LANE.get());
        this.dropSelf(ModBlocks.FLOOR_MARKING_WHITE_LANE_CROSS.get());

        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_0.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_1.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_2.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_3.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_4.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_5.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_6.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_7.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_8.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_9.get());

        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_NO.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_DASH.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_NUMERO.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_COMMA.get());
        this.dropSelf(ModBlocks.WALL_MARKING_NUMBER_PERIOD.get());

        this.dropSelf(ModBlocks.WALL_MARKING_ARROWRIGHT.get());
        this.dropSelf(ModBlocks.WALL_MARKING_ARROWLEFT.get());
        this.dropSelf(ModBlocks.WALL_MARKING_HAZARDLINE_RIGHT.get());
        this.dropSelf(ModBlocks.WALL_MARKING_HAZARDLINE_LEFT.get());
        this.dropSelf(ModBlocks.WALL_MARKING_EXIT.get());

        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_CHEMICAL.get());
        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_ELECTRIC.get());
        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_FIRE.get());
        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_FLUID.get());
        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_FROST.get());
        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_GEARS.get());
        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_LASER.get());
        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_MAGIC.get());
        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_MOB.get());
        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_PINCH.get());
        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_PRODUCTION.get());
        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_RADIATION.get());
        this.dropSelf(ModBlocks.WALL_MARKING_SYMBOL_STORAGE.get());
        this.dropSelf(ModBlocks.WALL_MARKING_WARNING_DANGER.get());

        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_EU.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_EV.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_FE.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_HV.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_IV.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_LUV.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_LV.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_MAX.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_MV.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_PERT.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_RF.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_UEV.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_UHV.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_UIV.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_UMV.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_UV.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_UXV.get());
        this.dropSelf(ModBlocks.WALL_MARKING_VOLTAGE_ZPM.get());







    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
