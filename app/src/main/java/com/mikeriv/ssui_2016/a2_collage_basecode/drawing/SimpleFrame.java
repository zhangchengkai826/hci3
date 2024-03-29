package com.mikeriv.ssui_2016.a2_collage_basecode.drawing;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Collections;

public class SimpleFrame extends BaseVisualElement {
    public SimpleFrame(float x, float y, float w, float h) {
        super(x, y, w, h);
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#draw(android.graphics.Canvas)
     */
    @Override
    public void draw(Canvas onCanvas) {
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.STROKE);
        onCanvas.drawRect(1, 1, getW(), getH(), paint);

        super.draw(onCanvas); // propagate downwards, just like super does
    }
}
