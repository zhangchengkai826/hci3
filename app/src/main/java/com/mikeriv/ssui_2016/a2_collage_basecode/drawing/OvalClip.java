package com.mikeriv.ssui_2016.a2_collage_basecode.drawing;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public class OvalClip extends BaseVisualElement {
    public OvalClip(float x, float y, float w, float h) {
        super(x, y, w, h);
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#draw(android.graphics.Canvas)
     */
    @Override
    public void draw(Canvas onCanvas) {
        Path path = new Path();
        path.addOval(0, 0, w, h, Path.Direction.CCW);
        onCanvas.clipPath(path);

        super.draw(onCanvas); // propagate downwards, just like super does
    }
}
