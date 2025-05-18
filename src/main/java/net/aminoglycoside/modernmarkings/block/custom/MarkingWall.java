package net.aminoglycoside.modernmarkings.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MarkingWall extends HorizontalDirectionalBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;


    public MarkingWall(Properties pProperties) {
        super(pProperties);
    }



    private static final VoxelShape SHAPE_E = Block.box(0.0, 0.0, 0.0, 0.1, 16, 16.0);
    private static final VoxelShape SHAPE_W = Block.box(15.9, 0.0, 0.0, 16.0, 16, 16.0);
    private static final VoxelShape SHAPE_N = Block.box(0.0, 0.0, 15.9, 16.0, 16, 16.0);
    private static final VoxelShape SHAPE_S = Block.box(0.0, 0.0, 0.0, 16.0, 16, 0.1);



    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case NORTH: return SHAPE_N;
            case SOUTH: return SHAPE_S;
            case EAST: return SHAPE_E;
            case WEST: return SHAPE_W;
            default: return SHAPE_N; // Fallback
        }
    }


    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));

    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }


}
