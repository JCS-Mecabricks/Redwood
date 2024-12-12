package github.jcsmecabricks.redwoodvariants.init;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import github.jcsmecabricks.redwoodvariants.RedwoodVariants;
import github.jcsmecabricks.redwoodvariants.entity.ModBoats;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ItemInit {
    public static final Item REDWOOD_SIGN = registerItem("redwood_sign",
            new SignItem(BlockInit.STANDING_REDWOOD_SIGN, BlockInit.WALL_REDWOOD_SIGN, new Item.Settings().maxCount(16)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RedwoodVariants.MOD_ID, "redwood_sign")))));
    public static final Item HANGING_REDWOOD_SIGN = registerItem("hanging_redwood_sign",
            new HangingSignItem(BlockInit.HANGING_REDWOOD_SIGN, BlockInit.WALL_HANGING_REDWOOD_SIGN, new Item.Settings().maxCount(16)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RedwoodVariants.MOD_ID, "hanging_redwood_sign")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RedwoodVariants.MOD_ID, name), item);
    }

    public static final Item REDWOOD_BOAT = TerraformBoatItemHelper.registerBoatItem(
            ModBoats.REDWOOD_BOAT_ID, false);

    public static final Item REDWOOD_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(
            ModBoats.REDWOOD_CHEST_BOAT_ID, true);

    public static void load() {}
}
