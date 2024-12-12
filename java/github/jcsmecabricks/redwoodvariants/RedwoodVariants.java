package github.jcsmecabricks.redwoodvariants;

import github.jcsmecabricks.redwoodvariants.entity.ModBoats;
import github.jcsmecabricks.redwoodvariants.init.ItemInit;
import github.jcsmecabricks.redwoodvariants.init.BlockInit;
import github.jcsmecabricks.redwoodvariants.init.ItemGroupInit;
import github.jcsmecabricks.redwoodvariants.init.worldgen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedwoodVariants implements ModInitializer {
	public static final String MOD_ID = "redwood-variants";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		BlockInit.load();
		ItemGroupInit.load();
		ItemInit.load();
		ModWorldGeneration.generateWorldGen();
		ModBoats.load();

		FlammableBlockRegistry.getDefaultInstance().add(BlockInit.REDWOOD_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BlockInit.REDWOOD_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(BlockInit.REDWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(BlockInit.REDWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(BlockInit.REDWOOD_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BlockInit.REDWOOD_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BlockInit.REDWOOD_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BlockInit.REDWOOD_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BlockInit.REDWOOD_PRESSURE_PLATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BlockInit.REDWOOD_DOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BlockInit.REDWOOD_TRAPDOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(BlockInit.REDWOOD_BUTTON, 5, 20);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(Items.WARPED_BUTTON, BlockInit.REDWOOD_LOG);
			entries.addAfter(BlockInit.REDWOOD_LOG, BlockInit.REDWOOD_WOOD);
			entries.addAfter(BlockInit.REDWOOD_WOOD, BlockInit.REDWOOD_PLANKS);
			entries.addAfter(BlockInit.REDWOOD_PLANKS, BlockInit.REDWOOD_STAIRS);
			entries.addAfter(BlockInit.REDWOOD_STAIRS, BlockInit.REDWOOD_SLAB);
			entries.addAfter(BlockInit.REDWOOD_SLAB, BlockInit.REDWOOD_FENCE);
			entries.addAfter(BlockInit.REDWOOD_FENCE, BlockInit.REDWOOD_FENCE_GATE);
			entries.addAfter(BlockInit.REDWOOD_FENCE_GATE, BlockInit.REDWOOD_DOOR);
			entries.addAfter(BlockInit.REDWOOD_DOOR, BlockInit.REDWOOD_TRAPDOOR);
			entries.addAfter(BlockInit.REDWOOD_TRAPDOOR, BlockInit.REDWOOD_PRESSURE_PLATE);
			entries.addAfter(BlockInit.REDWOOD_PRESSURE_PLATE, BlockInit.REDWOOD_BUTTON);

		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(Items.DARK_OAK_SAPLING, BlockInit.REDWOOD_SAPLING);
			entries.addAfter(Blocks.CHERRY_LEAVES, BlockInit.REDWOOD_LEAVES);

		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.addAfter(Items.CHERRY_CHEST_BOAT, ItemInit.REDWOOD_CHEST_BOAT);
			entries.addAfter(ItemInit.REDWOOD_CHEST_BOAT, ItemInit.REDWOOD_BOAT);

		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
			entries.addAfter(Items.WARPED_HANGING_SIGN, ItemInit.REDWOOD_SIGN);
			entries.addAfter(ItemInit.REDWOOD_SIGN, ItemInit.HANGING_REDWOOD_SIGN);

		});
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}