package github.jcsmecabricks.redwoodvariants.init;

import github.jcsmecabricks.redwoodvariants.RedwoodVariants;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    public static final Text REDWOOD_TITLE = Text.translatable("itemGroup." + RedwoodVariants.MOD_ID + ".redwood_group");
    public static final ItemGroup REDWOOD_GROUP = register("redwood_group", FabricItemGroup.builder()
            .displayName(REDWOOD_TITLE)
            .icon(Items.SPRUCE_LOG::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(RedwoodVariants.MOD_ID))
                    .map(Registries.ITEM::getOptionalValue)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());
    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, RedwoodVariants.id(name), itemGroup);
    }
    public static void load() {

    }
}
