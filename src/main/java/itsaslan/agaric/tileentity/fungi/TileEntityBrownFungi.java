package itsaslan.agaric.tileentity.fungi;

import itsaslan.agaric.interfaces.IOrientationHandler;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBrownFungi extends TileEntity implements IOrientationHandler
{

    private int orientation = 0;

    @Override
    public int getOrientation() {
        return orientation;
    }

    @Override
    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

}
