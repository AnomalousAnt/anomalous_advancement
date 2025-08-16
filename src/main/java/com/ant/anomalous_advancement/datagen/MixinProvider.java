package com.ant.anomalous_advancement.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.data.DataProvider;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class MixinProvider implements DataProvider {
    private final Path outputPath;

    public MixinProvider(FabricDataOutput output) {
        this.outputPath = getOutputPathFromDataOutput(output);
    }

    private static Path getOutputPathFromDataOutput(FabricDataOutput output) {
        try {
            var field = net.minecraft.data.DataOutput.class.getDeclaredField("path");
            field.setAccessible(true);
            return (Path) field.get(output);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to get output path from FabricDataOutput", e);
        }
    }

    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        JsonObject root = new JsonObject();
        root.addProperty("required", true);
        root.addProperty("minVersion", "0.8");
        root.addProperty("compatibilityLevel", "JAVA_22");
        root.addProperty("package", "com.ant.anomalous_advancement.mixin");

        JsonArray mixins = new JsonArray();
        mixins.add("ModifyToolDurabilityMixin");
        root.add("mixins", mixins);

        JsonObject injectors = new JsonObject();
        injectors.addProperty("defaultRequire", 1);
        root.add("injectors", injectors);

        Path mixinFile = outputPath.resolve("mixins.anomalous_advancement.json");

        return DataProvider.writeToPath(writer, root, mixinFile);
    }

    @Override
    public String getName() {
        return "Mixin JSON Provider";
    }
}
