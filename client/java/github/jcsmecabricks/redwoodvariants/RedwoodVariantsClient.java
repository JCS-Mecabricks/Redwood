package github.jcsmecabricks.redwoodvariants;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import github.jcsmecabricks.redwoodvariants.entity.ModBoats;
import github.jcsmecabricks.redwoodvariants.init.BlockInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class RedwoodVariantsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.REDWOOD_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.REDWOOD_LEAVES, RenderLayer.getCutout());
		TerraformBoatClientHelper.registerModelLayers(ModBoats.REDWOOD_BOAT_ID);
		TerraformBoatClientHelper.registerModelLayers(ModBoats.REDWOOD_CHEST_BOAT_ID);
	}
}