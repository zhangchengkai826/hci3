package com.mikeriv.ssui_2016.a2_collage_basecode.drawing;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class PileLayout extends BaseVisualElement {
    public PileLayout(float x, float y, float w, float h) {
        super(x, y, w, h);
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#doLayout()
     */
    @Override
    public void doLayout() {
        for(VisualElement e: children){
            e.setX(0);
            e.setY(0);
        }
        super.doLayout();
    }
}
