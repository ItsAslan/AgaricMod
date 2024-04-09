package itsaslan.agaric.render.tileentity;

import itsaslan.agaric.lib.ModVars;
import itsaslan.agaric.tileentity.fungi.TileEntityBrownFungi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class BrownFungiTileRenderer extends TileEntitySpecialRenderer
{

    ResourceLocation texture = new ResourceLocation(ModVars.MOD_ID, "textures/models/brownFungiBlockTexture.png");
    IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation(ModVars.MOD_ID, "models/blocks/brownFungiBlock.obj"));

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float partialTicks)
    {
        GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5, y + 0.5, z + 0.5);

        int orientation = ((TileEntityBrownFungi) tileEntity).getOrientation();

        // Rotate based on metadata
        switch (orientation) {
            case 0:
                GL11.glRotatef(180, 0, 1, 0); // Facing south
                break;
            case 1:
                GL11.glRotatef(90, 0, 1, 0); // Facing west
                break;
            case 2:
                GL11.glRotatef(0, 0, 1, 0); // Facing north
                break;
            case 3:
                GL11.glRotatef(270, 0, 1, 0); // Facing east
                break;
        }

        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        model.renderAll();
        GL11.glPopMatrix();

    }

}
