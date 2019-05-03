package com.mikeriv.ssui_2016.a2_collage_basecode.drawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;

import com.mikeriv.ssui_2016.a2_collage_basecode.CollageActivity;

public class NinePartImage extends BaseVisualElement {
    private NinePatch patchs = null;

    public NinePartImage(float x, float y, float w, float h, NinePatch patches) {
        super(x, y, w, h);
        this.patchs = patches;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#draw(android.graphics.Canvas)
     */
    @Override
    public void draw(Canvas onCanvas) {
        patchs.draw(onCanvas, new Rect(0, 0, (int)w, (int)h), paint);

        super.draw(onCanvas); // propagate downwards, just like super does
    }
}
