package github.jcsmecabricks.redwoodvariants.data.provider;

import github.jcsmecabricks.redwoodvariants.init.BlockInit;
import github.jcsmecabricks.redwoodvariants.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class RedwoodVariantsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public RedwoodVariantsBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(BlockInit.REDWOOD_STAIRS)
                .add(BlockInit.REDWOOD_PRESSURE_PLATE)
                .add(BlockInit.REDWOOD_BUTTON)
                .add(BlockInit.REDWOOD_DOOR)
                .add(BlockInit.REDWOOD_WOOD)
                .add(BlockInit.REDWOOD_LOG)
                .add(BlockInit.REDWOOD_FENCE)
                .add(BlockInit.REDWOOD_FENCE_GATE)
                .add(BlockInit.REDWOOD_SLAB)
                .add(BlockInit.REDWOOD_PLANKS)
                .add(BlockInit.REDWOOD_TRAPDOOR);

        getOrCreateTagBuilder(TagList.Blocks.REDWOOD_VARIANTS_TAG)
                .add(BlockInit.REDWOOD_STAIRS)
                .add(BlockInit.REDWOOD_PRESSURE_PLATE)
                .add(BlockInit.REDWOOD_BUTTON)
                .add(BlockInit.REDWOOD_DOOR)
                .add(BlockInit.REDWOOD_FENCE)
                .add(BlockInit.REDWOOD_FENCE_GATE)
                .add(BlockInit.REDWOOD_SLAB)
                .add(BlockInit.REDWOOD_PLANKS)
                .add(BlockInit.REDWOOD_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.FENCES).add(BlockInit.REDWOOD_FENCE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(BlockInit.REDWOOD_LOG, BlockInit.REDWOOD_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(BlockInit.REDWOOD_LOG, BlockInit.REDWOOD_WOOD);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(BlockInit.REDWOOD_FENCE_GATE);

    }
}
