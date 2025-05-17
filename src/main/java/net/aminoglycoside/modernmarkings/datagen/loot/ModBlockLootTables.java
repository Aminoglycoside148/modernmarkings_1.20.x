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





    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
