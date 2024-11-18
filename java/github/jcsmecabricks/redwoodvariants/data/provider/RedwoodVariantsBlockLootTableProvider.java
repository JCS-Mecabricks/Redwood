package github.jcsmecabricks.redwoodvariants.data.provider;

import github.jcsmecabricks.redwoodvariants.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class RedwoodVariantsBlockLootTableProvider extends FabricBlockLootTableProvider {
    public RedwoodVariantsBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockInit.REDWOOD_STAIRS);
                addDrop(BlockInit.REDWOOD_PRESSURE_PLATE);
                addDrop(BlockInit.REDWOOD_SAPLING);
                addDrop(BlockInit.REDWOOD_BUTTON);
                addDrop(BlockInit.REDWOOD_TRAPDOOR);
                addDrop(BlockInit.REDWOOD_FENCE);
                leavesDrops(BlockInit.REDWOOD_LEAVES, BlockInit.REDWOOD_SAPLING, SAPLING_DROP_CHANCE);
                addDrop(BlockInit.REDWOOD_FENCE_GATE);
                addDrop(BlockInit.REDWOOD_PLANKS);
                addDrop(BlockInit.REDWOOD_LOG);
                addDrop(BlockInit.REDWOOD_WOOD);
                addDrop(BlockInit.STANDING_REDWOOD_SIGN);
                addDrop(BlockInit.HANGING_REDWOOD_SIGN);
                addDrop(BlockInit.WALL_REDWOOD_SIGN);
                addDrop(BlockInit.WALL_HANGING_REDWOOD_SIGN);
                addDrop(BlockInit.REDWOOD_SLAB, slabDrops(BlockInit.REDWOOD_SLAB));
                addDrop(BlockInit.REDWOOD_DOOR, doorDrops(BlockInit.REDWOOD_DOOR));
    }
}
