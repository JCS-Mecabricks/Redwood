package github.jcsmecabricks.redwoodvariants.data.provider;

import github.jcsmecabricks.redwoodvariants.init.BlockInit;
import github.jcsmecabricks.redwoodvariants.init.ItemInit;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class RedwoodVariantsModelProvider extends FabricModelProvider {
    public RedwoodVariantsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTintableCross(BlockInit.REDWOOD_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerLog(BlockInit.REDWOOD_LOG)
                .log(BlockInit.REDWOOD_LOG)
                .wood(BlockInit.REDWOOD_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.REDWOOD_LEAVES);

        BlockStateModelGenerator.BlockTexturePool redwoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlockInit.REDWOOD_PLANKS);
        redwoodPool.button(BlockInit.REDWOOD_BUTTON);
        redwoodPool.slab(BlockInit.REDWOOD_SLAB);
        redwoodPool.stairs(BlockInit.REDWOOD_STAIRS);
        redwoodPool.fence(BlockInit.REDWOOD_FENCE);
        redwoodPool.family(BlockInit.REDWOOD_FAMILY);
        redwoodPool.family(BlockInit.REDWOOD_HANGING_FAMILY);
        redwoodPool.fenceGate(BlockInit.REDWOOD_FENCE_GATE);
        redwoodPool.pressurePlate(BlockInit.REDWOOD_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(BlockInit.REDWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlockInit.REDWOOD_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.REDWOOD_BOAT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.REDWOOD_CHEST_BOAT, Models.GENERATED);
    }

}
