package com.ant.anomalous_advancement;

import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.block.entity.ModBlockEntities;
import com.ant.anomalous_advancement.item.ModItemGroups;
import com.ant.anomalous_advancement.item.ModItems;
import com.ant.anomalous_advancement.screen.ModScreenHandlers;
import com.ant.anomalous_advancement.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Anomalous_Advancement implements ModInitializer {
	public static final String MOD_ID = "anomalous_advancement";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container -> {
			ResourceManagerHelper.registerBuiltinResourcePack(
					Identifier.of(MOD_ID, "builtin"), // namespace = MOD_ID, path = "builtin"
					container,
					ResourcePackActivationType.DEFAULT_ENABLED
			);
		});
	}

}