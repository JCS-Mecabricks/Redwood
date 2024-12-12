package github.jcsmecabricks.redwoodvariants.data.provider;

import github.jcsmecabricks.redwoodvariants.RedwoodVariants;
import github.jcsmecabricks.redwoodvariants.init.BlockInit;
import github.jcsmecabricks.redwoodvariants.init.ItemGroupInit;
import github.jcsmecabricks.redwoodvariants.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RedwoodVariantsEnglishLanguageProvider extends FabricLanguageProvider {
    public RedwoodVariantsEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            RedwoodVariants.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        addText(translationBuilder, ItemGroupInit.REDWOOD_TITLE, "Redwood");
        translationBuilder.add(BlockInit.REDWOOD_STAIRS, "Redwood Stairs");
        translationBuilder.add(BlockInit.REDWOOD_BUTTON, "Redwood Button");
        translationBuilder.add(BlockInit.REDWOOD_DOOR, "Redwood Door");
        translationBuilder.add(BlockInit.REDWOOD_TRAPDOOR, "Redwood Trapdoor");
        translationBuilder.add(BlockInit.REDWOOD_PLANKS, "Redwood Planks");
        translationBuilder.add(BlockInit.REDWOOD_SLAB, "Redwood Slab");
        translationBuilder.add(BlockInit.REDWOOD_LOG, "Redwood Log");
        translationBuilder.add(BlockInit.REDWOOD_LEAVES, "Redwood Leaves");
        translationBuilder.add(BlockInit.REDWOOD_WOOD, "Redwood Wood");
        translationBuilder.add(BlockInit.REDWOOD_FENCE, "Redwood Fence");
        translationBuilder.add(BlockInit.REDWOOD_SAPLING, "Redwood Sapling");
        translationBuilder.add(BlockInit.REDWOOD_FENCE_GATE, "Redwood Fence Gate");
        translationBuilder.add(ItemInit.REDWOOD_SIGN, "Redwood Sign");
        translationBuilder.add(ItemInit.REDWOOD_BOAT, "Redwood Boat");
        translationBuilder.add(ItemInit.HANGING_REDWOOD_SIGN, "Redwood Hanging Sign");
        translationBuilder.add(ItemInit.REDWOOD_CHEST_BOAT, "Redwood Chest Boat");
        translationBuilder.add(BlockInit.REDWOOD_PRESSURE_PLATE, "Redwood Pressure Plate");


    }
}

