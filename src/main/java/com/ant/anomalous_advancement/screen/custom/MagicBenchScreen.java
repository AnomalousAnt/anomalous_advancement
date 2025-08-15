package com.ant.anomalous_advancement.screen.custom;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.block.entity.custom.MagicBenchEntity;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MagicBenchScreen extends HandledScreen<MagicBenchScreenHandler> {
    private static final Identifier GUI_TEXTURE =
            Identifier.of(Anomalous_Advancement.MOD_ID, "textures/gui/magic_bench/magic_bench_gui.png");

    public MagicBenchScreen(MagicBenchScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        context.drawTexture(RenderPipelines.GUI_TEXTURED, GUI_TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight, 256, 256);
    }

    @Override
    protected void drawForeground(DrawContext context, int mouseX, int mouseY) {
        super.drawForeground(context, mouseX, mouseY);

        MagicBenchEntity bench = handler.getBlockEntity();
        int cost = bench.getCurrentExpCost();

        if (cost > 0) {
            int playerXP = this.client.player.experienceLevel;
            int color = playerXP >= cost ? 0xFF00FF00 : 0xFFFF5555; // Green or red
            String costText = "EXP Cost: " + cost;

            int x = 60;
            int y = 60;

            context.drawText(textRenderer, costText, x, y, color, false);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
