package com.mikeriv.ssui_2016.a2_collage_basecode.drawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;

public class NinePartImage extends BaseVisualElement {
    NinePatchDrawable drawable = null;

    public NinePartImage(float x, float y, float w, float h, NinePatch patches) {
        super(x, y, w, h);
        this.drawable = new NinePatchDrawable(patches);
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#draw(android.graphics.Canvas)
     */
    @Override
    public void draw(Canvas onCanvas) {
        drawable.setBounds(new Rect(0, 0, (int)w, (int)h));
        drawable.draw(onCanvas);

        super.draw(onCanvas); // propagate downwards, just like super does
    }
}
