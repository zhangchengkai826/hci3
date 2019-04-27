package com.mikeriv.ssui_2016.a2_collage_basecode.drawing;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class SolidBackDrop extends BaseVisualElement {
    int color = Color.BLACK;

    public SolidBackDrop(float x, float y, float w, float h, int color) {
        super(x, y, w, h);
        this.color = color;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#draw(android.graphics.Canvas)
     */
    @Override
    public void draw(Canvas onCanvas) {
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        onCanvas.drawRect(1, 1, getW(), getH(), paint);

        super.draw(onCanvas); // propagate downwards, just like super does
    }
}
