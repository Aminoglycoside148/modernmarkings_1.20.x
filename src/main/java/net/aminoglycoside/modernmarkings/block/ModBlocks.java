package net.aminoglycoside.modernmarkings.block;

import net.aminoglycoside.modernmarkings.AGSModernMarkingsMod;
import net.aminoglycoside.modernmarkings.block.custom.MarkingFloor;
import net.aminoglycoside.modernmarkings.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AGSModernMarkingsMod.MODID);

    //add blocks like
    //public static final RegistryObject <Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
    //    () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject <Block> FLOOR_MARKING_NOSTEP = registerBlock("floor_marking_nostep",
        () -> new MarkingFloor(BlockBehaviour.Properties.of()
                .sound(SoundType.WOOL)
                .noOcclusion()
                .noCollission()),"tooltip.ags_modernmarkings.floormarkingbasic");

    public static final RegistryObject <Block> FLOOR_MARKING_WHITE_ARROW = registerBlock("floor_marking_white_arrow",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarkingbasic");

    public static final RegistryObject <Block> FLOOR_MARKING_WHITE_DOUBLE_ARROW = registerBlock("floor_marking_white_double_arrow",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarkingbasic");

    public static final RegistryObject <Block> FLOOR_MARKING_WHITE_LANE = registerBlock("floor_marking_white_lane",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_whiteline");

    public static final RegistryObject <Block> FLOOR_MARKING_WHITE_SQUARE = registerBlock("floor_marking_white_square",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_whiteline");

    public static final RegistryObject <Block> FLOOR_MARKING_YELLOW_ARROW = registerBlock("floor_marking_yellow_arrow",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarkingbasic");

    public static final RegistryObject <Block> FLOOR_MARKING_YELLOW_SIDELINE = registerBlock("floor_marking_yellow_sideline",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_yellowline");

    public static final RegistryObject <Block> FLOOR_MARKING_YELLOW_SQUARE = registerBlock("floor_marking_yellow_square",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_yellowline");

    public static final RegistryObject <Block> FLOOR_MARKING_YELLOW_STRIPES = registerBlock("floor_marking_yellow_stripes",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarkingbasic");

    public static final RegistryObject <Block> FLOOR_MARKING_BLACK_SINGLELINE = registerBlock("floor_marking_black_singleline",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_blackline");
    public static final RegistryObject <Block> FLOOR_MARKING_BLUE_SINGLELINE = registerBlock("floor_marking_blue_singleline",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_blueline");
    public static final RegistryObject <Block> FLOOR_MARKING_GREEN_SINGLELINE = registerBlock("floor_marking_green_singleline",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_greenline");
    public static final RegistryObject <Block> FLOOR_MARKING_NOENTRY = registerBlock("floor_marking_noentry",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarkingbasic");
    public static final RegistryObject <Block> FLOOR_MARKING_ORANGE_SINGLELINE = registerBlock("floor_marking_orange_singleline",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_orangeline");
    public static final RegistryObject <Block> FLOOR_MARKING_REDX = registerBlock("floor_marking_redx",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarkingbasic");
    public static final RegistryObject <Block> FLOOR_MARKING_RED_SINGLELINE = registerBlock("floor_marking_red_singleline",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_redline");
    public static final RegistryObject <Block> FLOOR_MARKING_WHITE_SINGLELINE = registerBlock("floor_marking_white_singleline",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_whiteline");
    public static final RegistryObject <Block> FLOOR_MARKING_WHITEBLACK_HAZARDLINE = registerBlock("floor_marking_whiteblack_hazardline",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_whitehazard");
    public static final RegistryObject <Block> FLOOR_MARKING_YELLOW_SINGLELINE = registerBlock("floor_marking_yellow_singleline",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_yellowline");
    public static final RegistryObject <Block> FLOOR_MARKING_RED_HAZARDLINE = registerBlock("floor_marking_red_hazardline",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_redhazard");
    public static final RegistryObject <Block> FLOOR_MARKING_YELLOW_HAZARDLINE = registerBlock("floor_marking_yellow_hazardline",
            () -> new MarkingFloor(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOL)
                    .noOcclusion()
                    .noCollission()),"tooltip.ags_modernmarkings.floormarking_yellowhazard");


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties())
        {
            @Override
            public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {
                tooltip.add(Component.translatable (tooltipKey));
                super.appendHoverText(stack, level, tooltip, flagIn);
            }
        });
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }



}

