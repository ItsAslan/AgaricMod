package itsaslan.agaric.render.item;

import itsaslan.agaric.lib.ModVars;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class WhiteFungiItemRenderer implements IItemRenderer {

    private IModelCustom model;
    private ResourceLocation texture;

    public WhiteFungiItemRenderer() {
        model = AdvancedModelLoader.loadModel(new ResourceLocation(ModVars.MOD_ID, "models/blocks/whiteFungiBlock.obj"));
        texture = new ResourceLocation(ModVars.MOD_ID, "textures/models/whiteFungiBlockTexture.png");
    }

    @Override
    public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data) {
        GL11.glPushMatrix();

        GL11.glScaled(1f, 1f, 1f);

        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        model.renderAll();

        GL11.glPopMatrix();
    }

}
