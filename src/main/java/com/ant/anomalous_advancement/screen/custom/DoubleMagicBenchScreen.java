package com.ant.anomalous_advancement.screen.custom;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.block.entity.custom.DoubleMagicBenchEntity;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;

    public class DoubleMagicBenchScreen extends AbstractContainerScreen<DoubleMagicBenchScreenHandler> {

        private static final Identifier GUI_TEXTURE =
                Identifier.fromNamespaceAndPath(Anomalous_Advancement.MOD_ID,
                        "textures/gui/double_magic_bench/double_magic_bench_gui.png");

        public DoubleMagicBenchScreen(DoubleMagicBenchScreenHandler handler, Inventory inventory, Component title) {
            super(handler, inventory, title);
        }

        @Override
        public void extractContents(GuiGraphicsExtractor g, int mouseX, int mouseY, float delta) {
            int x = leftPos;
            int y = topPos;

            g.blit(RenderPipelines.GUI_TEXTURED,
                    GUI_TEXTURE,
                    x, y,
                    0, 0,
                    imageWidth, imageHeight,
                    256, 256
            );

            super.extractContents(g, mouseX, mouseY, delta);
        }

        @Override
        protected void extractLabels(GuiGraphicsExtractor g, int mouseX, int mouseY) {
            super.extractLabels(g, mouseX, mouseY);

            DoubleMagicBenchEntity bench = menu.getBlockEntity();
            int cost = bench.getCurrentExpCost();

            if (cost <= 0) return;

            int playerXP = minecraft.player.experienceLevel;
            int color = playerXP >= cost ? 0xFF00FF00 : 0xFFFF5555;

            String text = (cost == 42069)
                    ? "Need Lower Tier First!"
                    : "EXP Cost: " + cost;

            g.text(font, text, 60, 60, color, true);
        }

        @Override
        public void extractRenderState(GuiGraphicsExtractor g, int mouseX, int mouseY, float delta) {
            super.extractRenderState(g, mouseX, mouseY, delta);

            this.extractTooltip(g, mouseX, mouseY);
        }
    }