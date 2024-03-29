package dev.theagameplayer.blightedworlds.data;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import dev.theagameplayer.blightedworlds.BlightedWorldsMod;
import dev.theagameplayer.blightedworlds.registries.custom.BWCavernSettings;
import dev.theagameplayer.blightedworlds.registries.data.BWDimensionTypes;
import dev.theagameplayer.blightedworlds.registries.data.BWLevelStems;
import dev.theagameplayer.blightedworlds.registries.data.BWNoiseGeneratorSettings;
import dev.theagameplayer.blightedworlds.registries.data.BWNoiseRouterData;
import dev.theagameplayer.blightedworlds.registries.data.BWStructureSets;
import dev.theagameplayer.blightedworlds.registries.data.BWStructures;
import dev.theagameplayer.blightedworlds.world.level.levelgen.CavernSettings;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.DataPackRegistryEvent;

public final class BWRegistriesDatapackProvider extends DatapackBuiltinEntriesProvider {
	public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
			.add(BWCavernSettings.CAVERN_SETTINGS, BWCavernSettings::bootstrap)
			.add(Registries.STRUCTURE, BWStructures::bootstrap)
			.add(Registries.STRUCTURE_SET, BWStructureSets::bootstrap)
			.add(Registries.DENSITY_FUNCTION, BWNoiseRouterData::bootstrap)
			.add(Registries.DIMENSION_TYPE, BWDimensionTypes::bootstrap)
			.add(Registries.NOISE_SETTINGS, BWNoiseGeneratorSettings::bootstrap)
			.add(Registries.LEVEL_STEM, BWLevelStems::bootstrap);
	
	public BWRegistriesDatapackProvider(final PackOutput packOutputIn, final CompletableFuture<HolderLookup.Provider> lookupProviderIn) {
		super(packOutputIn, lookupProviderIn, BUILDER, Set.of(BlightedWorldsMod.MODID));
	}
	
	public static final void registerDatapackRegistries(final DataPackRegistryEvent.NewRegistry eventIn) {
		eventIn.dataPackRegistry(BWCavernSettings.CAVERN_SETTINGS, CavernSettings.DIRECT_CODEC);
	}
}
