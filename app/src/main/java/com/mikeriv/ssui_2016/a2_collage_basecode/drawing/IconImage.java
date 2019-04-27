package com.mikeriv.ssui_2016.a2_collage_basecode.drawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class IconImage extends BaseVisualElement {
    Bitmap image = null;

    public IconImage(float x, float y, Bitmap image) {
        super(x, y, image.getWidth(), image.getHeight());
        this.image = image;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#sizeIsIntrinsic()
     */
    @Override
    public boolean sizeIsIntrinsic() {
        // default value -- override in subclasses that need to...
        return true;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#draw(android.graphics.Canvas)
     */
    @Override
    public void draw(Canvas onCanvas) {
        onCanvas.drawBitmap(image, 0, 0, paint);

        super.draw(onCanvas); // propagate downwards, just like super does
    }
}
