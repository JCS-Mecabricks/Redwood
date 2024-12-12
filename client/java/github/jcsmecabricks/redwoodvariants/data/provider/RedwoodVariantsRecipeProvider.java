package github.jcsmecabricks.redwoodvariants.data.provider;

import github.jcsmecabricks.redwoodvariants.init.BlockInit;
import github.jcsmecabricks.redwoodvariants.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class RedwoodVariantsRecipeProvider extends FabricRecipeProvider {
    public RedwoodVariantsRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.MISC, Items.STICK, 4)
                        .input('A', BlockInit.REDWOOD_PLANKS)
                        .pattern(" A")
                        .pattern(" A")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, Blocks.CRAFTING_TABLE)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .pattern("EE")
                        .pattern("EE")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, BlockInit.REDWOOD_FENCE_GATE)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .input('A', Items.STICK)
                        .pattern("EAE")
                        .pattern("EAE")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, BlockInit.REDWOOD_TRAPDOOR)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .pattern("EEE")
                        .pattern("EEE")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, BlockInit.REDWOOD_DOOR, 3)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .pattern("EE ")
                        .pattern("EE ")
                        .pattern("EE ")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, BlockInit.REDWOOD_FENCE, 3)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .input('A', Items.STICK)
                        .pattern("AEA")
                        .pattern("AEA")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, BlockInit.REDWOOD_SLAB, 6)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .pattern("EEE")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, BlockInit.REDWOOD_BUTTON)
                        .input(BlockInit.REDWOOD_PLANKS)
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, BlockInit.REDWOOD_PRESSURE_PLATE)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .pattern("EE")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, BlockInit.REDWOOD_STAIRS, 4)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .pattern("  E")
                        .pattern(" EE")
                        .pattern("EEE")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, BlockInit.REDWOOD_WOOD, 3)
                        .input('E', BlockInit.REDWOOD_LOG)
                        .pattern("EE")
                        .pattern("EE")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, Items.WOODEN_AXE)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .input('A', Items.STICK)
                        .pattern(" EE")
                        .pattern(" AE")
                        .pattern(" A ")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, Items.WOODEN_HOE)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .input('A', Items.STICK)
                        .pattern(" EE")
                        .pattern(" A ")
                        .pattern(" A ")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, Items.WOODEN_PICKAXE)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .input('A', Items.STICK)
                        .pattern("EEE")
                        .pattern(" A ")
                        .pattern(" A ")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, Items.WOODEN_SHOVEL)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .input('A', Items.STICK)
                        .pattern(" E ")
                        .pattern(" A ")
                        .pattern(" A ")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, Items.WOODEN_SWORD)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .input('A', Items.STICK)
                        .pattern(" E ")
                        .pattern(" E ")
                        .pattern(" A ")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, Blocks.CHEST)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .pattern("EEE")
                        .pattern("E E")
                        .pattern("EEE")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ItemInit.HANGING_REDWOOD_SIGN, 6)
                        .input('E', BlockInit.REDWOOD_LOG)
                        .input('A', Blocks.CHAIN)
                        .pattern("A A")
                        .pattern("EEE")
                        .pattern("EEE")
                        .criterion(hasItem(BlockInit.REDWOOD_LOG), conditionsFromItem(BlockInit.REDWOOD_LOG))
                        .criterion(hasItem(Blocks.CHAIN), conditionsFromItem(Blocks.CHAIN))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ItemInit.REDWOOD_BOAT)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .pattern("E E")
                        .pattern("EEE")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ItemInit.REDWOOD_CHEST_BOAT)
                        .input(ItemInit.REDWOOD_BOAT)
                        .input(Blocks.CHEST)
                        .criterion(hasItem(Blocks.CHEST), conditionsFromItem(Blocks.CHEST))
                        .criterion(hasItem(ItemInit.REDWOOD_BOAT), conditionsFromItem(ItemInit.REDWOOD_BOAT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ItemInit.REDWOOD_SIGN, 3)
                        .input('E', BlockInit.REDWOOD_PLANKS)
                        .input('A', Items.STICK)
                        .pattern("EEE")
                        .pattern("EEE")
                        .pattern(" A ")
                        .criterion(hasItem(BlockInit.REDWOOD_PLANKS), conditionsFromItem(BlockInit.REDWOOD_PLANKS))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, BlockInit.REDWOOD_PLANKS, 4)
                        .input(BlockInit.REDWOOD_LOG)
                        .criterion(hasItem(BlockInit.REDWOOD_LOG), conditionsFromItem(BlockInit.REDWOOD_LOG))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, BlockInit.REDWOOD_PLANKS, 4)
                        .input(BlockInit.REDWOOD_WOOD)
                        .criterion(hasItem(BlockInit.REDWOOD_WOOD), conditionsFromItem(BlockInit.REDWOOD_WOOD))
                        .offerTo(exporter, "redwood_planks_from_wood");
            }
            private static String hasTag(TagKey<Item> tag) {
                return "has_" + tag.id().toString();
            }
        };
    }

    @Override
    public String getName() {
        return "Redwood Variants Recipes";
    }
}
