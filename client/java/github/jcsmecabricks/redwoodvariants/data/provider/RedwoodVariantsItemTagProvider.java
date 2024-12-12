package github.jcsmecabricks.redwoodvariants.data.provider;

import github.jcsmecabricks.redwoodvariants.init.BlockInit;
import github.jcsmecabricks.redwoodvariants.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class RedwoodVariantsItemTagProvider extends FabricTagProvider<Item> {
    public RedwoodVariantsItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(ItemInit.REDWOOD_SIGN);

        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(ItemInit.HANGING_REDWOOD_SIGN);

        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(ItemInit.REDWOOD_BOAT);

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(BlockInit.REDWOOD_WOOD.asItem())
                .add(BlockInit.REDWOOD_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(BlockInit.REDWOOD_WOOD.asItem())
                .add(BlockInit.REDWOOD_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(ItemInit.REDWOOD_CHEST_BOAT);

    }
}
