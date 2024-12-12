package github.jcsmecabricks.redwoodvariants.list;

import github.jcsmecabricks.redwoodvariants.RedwoodVariants;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagList {
    public static class Blocks {
        public static final TagKey<Block> REDWOOD_VARIANTS_TAG = TagKey.of(RegistryKeys.BLOCK, RedwoodVariants.id("customweapons_tag"));
   }
}
