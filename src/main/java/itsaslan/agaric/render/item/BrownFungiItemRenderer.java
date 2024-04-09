package itsaslan.agaric.render.item;

import itsaslan.agaric.lib.ModVars;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class BrownFungiItemRenderer implements IItemRenderer {

    private IModelCustom model;
    private ResourceLocation texture;

    public BrownFungiItemRenderer() {
        model = AdvancedModelLoader.loadModel(new ResourceLocation(ModVars.MOD_ID, "models/blocks/brownFungiBlock.obj"));
        texture = new ResourceLocation(ModVars.MOD_ID, "textures/models/brownFungiBlockTexture.png");
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        GL11.glPushMatrix();

        GL11.glScaled(1f, 1f, 1f);

        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        model.renderAll();

        GL11.glPopMatrix();
    }

}
