package com.ant.anomalous_advancement.sound;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent CLOAKED_CHAUFFEUR = registerSoundEvent("cloaked_chauffeur");
    public static final RegistryKey<JukeboxSong> CLOAKED_CHAUFFEUR_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Anomalous_Advancement.MOD_ID, "cloaked_chauffeur"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Anomalous_Advancement.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }


    public static void registerSounds() {
        Anomalous_Advancement.LOGGER.info("Registering Mod Sounds for " + Anomalous_Advancement.MOD_ID);
    }
}
