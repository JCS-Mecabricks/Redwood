package github.jcsmecabricks.redwoodvariants.init.worldgen.tree;

import github.jcsmecabricks.redwoodvariants.init.worldgen.ConfiguredFeatureInit;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator REDWOOD =
            new SaplingGenerator("redwood", 0f, Optional.of(ConfiguredFeatureInit.GIANT_REDWOOD_TREE_KEY),
                    Optional.empty(),
                    Optional.of(ConfiguredFeatureInit.REDWOOD_TREE_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

}