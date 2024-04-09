package itsaslan.agaric.tileentity.fungi;

import itsaslan.agaric.interfaces.IOrientationHandler;
import net.minecraft.tileentity.TileEntity;

public class TileEntityWhiteFungi extends TileEntity implements IOrientationHandler
{

    private int orientation = 0;

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

}
