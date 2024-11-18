package github.jcsmecabricks.redwoodvariants;

import github.jcsmecabricks.redwoodvariants.data.generator.ModWorldGenerator;
import github.jcsmecabricks.redwoodvariants.data.provider.*;
import github.jcsmecabricks.redwoodvariants.init.worldgen.ConfiguredFeatureInit;
import github.jcsmecabricks.redwoodvariants.init.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class RedwoodVariantsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(RedwoodVariantsRecipeProvider::new);
		pack.addProvider(RedwoodVariantsModelProvider::new);
		pack.addProvider(RedwoodVariantsItemTagProvider::new);
		pack.addProvider(RedwoodVariantsEnglishLanguageProvider::new);
		pack.addProvider(RedwoodVariantsBlockTagProvider::new);
		pack.addProvider(RedwoodVariantsBlockLootTableProvider::new);
		pack.addProvider(ModWorldGenerator::new);




	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		DataGeneratorEntrypoint.super.buildRegistry(registryBuilder);
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureInit::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureInit::boostrap);
	}
}

