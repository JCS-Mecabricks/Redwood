package github.jcsmecabricks.redwoodvariants.init;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import github.jcsmecabricks.redwoodvariants.RedwoodVariants;
import github.jcsmecabricks.redwoodvariants.init.worldgen.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlockInit {
    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_planks")))));

    public static final Block REDWOOD_PRESSURE_PLATE = registerBlock("redwood_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create().strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_pressure_plate")))
                            .instrument(NoteBlockInstrument.BASS)));

    public static final Block REDWOOD_BUTTON = registerBlock("redwood_button",
            new ButtonBlock(BlockSetType.OAK, 2,
                    AbstractBlock.Settings.create().strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .noCollision()
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_button")))
                            .instrument(NoteBlockInstrument.BASS)));

    public static final Block REDWOOD_SLAB = registerBlock("redwood_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_slab")))
                    .instrument(NoteBlockInstrument.BASS)));

    public static final Block REDWOOD_FENCE = registerBlock("redwood_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_fence")))
                    .instrument(NoteBlockInstrument.BASS)));

    public static final Block REDWOOD_FENCE_GATE = registerBlock("redwood_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.create().strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_fence_gate")))
                            .instrument(NoteBlockInstrument.BASS)));

    public static final Block REDWOOD_DOOR = registerBlock("redwood_door",
            new DoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create().strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_door")))
                            .instrument(NoteBlockInstrument.BASS)));

    public static final Block REDWOOD_TRAPDOOR = registerBlock("redwood_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create().strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_trapdoor")))
                            .instrument(NoteBlockInstrument.BASS)));

    public static final Block REDWOOD_LOG = registerBlock("redwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_log")))
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3f)));

    public static final Identifier REDWOOD_SIGN_TEXTURE = Identifier.of(RedwoodVariants.MOD_ID, "entity/signs/redwood");
    public static final Identifier REDWOOD_HANGING_SIGN_TEXTURE = Identifier.of(RedwoodVariants.MOD_ID, "entity/signs/hanging/redwood");
    public static final Identifier REDWOOD_HANGING_GUI_SIGN_TEXTURE = Identifier.of(RedwoodVariants.MOD_ID, "textures/gui/hanging_signs/redwood");

    public static final Block STANDING_REDWOOD_SIGN = Registry.register(Registries.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_sign"),
            new TerraformSignBlock(REDWOOD_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_sign")))));

    public static final Block WALL_REDWOOD_SIGN = Registry.register(Registries.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_wall_sign"),
            new TerraformWallSignBlock(REDWOOD_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_wall_sign")))));

    public static final Block WALL_HANGING_REDWOOD_SIGN = Registry.register(Registries.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(REDWOOD_HANGING_SIGN_TEXTURE, REDWOOD_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_wall_hanging_sign")))));
    public static final Block HANGING_REDWOOD_SIGN = Registry.register(Registries.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_hanging_sign"),
            new TerraformHangingSignBlock(REDWOOD_HANGING_SIGN_TEXTURE, REDWOOD_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_hanging_sign")))));

    public static final BlockFamily REDWOOD_FAMILY = BlockFamilies.register(BlockInit.REDWOOD_PLANKS)
            .sign(BlockInit.STANDING_REDWOOD_SIGN, WALL_REDWOOD_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final BlockFamily REDWOOD_HANGING_FAMILY = BlockFamilies.register(BlockInit.REDWOOD_LOG)
            .sign(BlockInit.HANGING_REDWOOD_SIGN, WALL_HANGING_REDWOOD_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final Block REDWOOD_SAPLING = registerBlock("redwood_sapling",
            new SaplingBlock(ModSaplingGenerators.REDWOOD,
                    AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_sapling")))));

    public static final Block REDWOOD_WOOD = registerBlock("redwood_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_wood")))
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3f)));

    public static final Block REDWOOD_STAIRS = registerBlock("redwood_stairs",
            new StairsBlock(BlockInit.REDWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_stairs")))
                            .instrument(NoteBlockInstrument.BASS)));

    public static final Block REDWOOD_LEAVES = registerBlock("redwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
                    .strength(0.2f)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, "redwood_leaves")))
                    .suffocates(Blocks::never)
                    .burnable()
                    .blockVision(Blocks::never)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)
                    .nonOpaque()));

    public static <T extends Block> T register(String name, T block) {
        RedwoodVariants.LOGGER.info("Registering block and item for: {}", name);

        Identifier blockId = Identifier.of(RedwoodVariants.MOD_ID, name); // Use the identifier for the block
        Registry.register(Registries.BLOCK, blockId, block);
        Registry.register(Registries.ITEM, blockId, new BlockItem(block, new Item.Settings()));

        return block;
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RedwoodVariants.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RedwoodVariants.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RedwoodVariants.MOD_ID, name)))));
    }
    public static void load() {}
    }
