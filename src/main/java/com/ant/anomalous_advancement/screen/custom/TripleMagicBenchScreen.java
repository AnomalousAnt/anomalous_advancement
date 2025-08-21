package com.ant.anomalous_advancement.screen.custom;

import com.ant.anomalous_advancement.Anomalous_Advancement;
import com.ant.anomalous_advancement.block.entity.custom.TripleMagicBenchEntity;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TripleMagicBenchScreen extends HandledScreen<TripleMagicBenchScreenHandler> {
    private static final Identifier GUI_TEXTURE =
            Identifier.of(Anomalous_Advancement.MOD_ID, "textures/gui/triple_magic_bench/triple_magic_bench_gui.png");

    public TripleMagicBenchScreen(TripleMagicBenchScreenHandler handler, PlayerInventory inventory, Text title) {
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

        TripleMagicBenchEntity bench = handler.getBlockEntity();
        int cost = bench.getCurrentExpCost();
        String costText = "";
        if (cost > 0) {
            int playerXP = this.client.player.experienceLevel;
            int color = playerXP >= cost ? 0xFF00FF00 : 0xFFFF5555; // Green or red
            if (cost == 42069) {
                costText = "Need Lower Tier First!";
            }
            else {
                costText = "EXP Cost: " + cost;
            }
            int x = 60;
            int y = 60;
            context.drawText(textRenderer, costText, x, y, color, true);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
