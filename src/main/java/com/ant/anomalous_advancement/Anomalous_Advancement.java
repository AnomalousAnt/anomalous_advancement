package com.ant.anomalous_advancement;

import com.ant.anomalous_advancement.block.ModBlocks;
import com.ant.anomalous_advancement.block.entity.ModBlockEntities;
import com.ant.anomalous_advancement.item.ModItemGroups;
import com.ant.anomalous_advancement.item.ModItems;
import com.ant.anomalous_advancement.screen.ModScreenHandlers;

import net.fabricmc.api.ModInitializer;

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
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}

}