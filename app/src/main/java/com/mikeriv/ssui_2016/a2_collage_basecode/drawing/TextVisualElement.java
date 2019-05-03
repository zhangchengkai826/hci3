package com.mikeriv.ssui_2016.a2_collage_basecode.drawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;

public class TextVisualElement extends BaseVisualElement {
    String text;

    public TextVisualElement(float x, float y, String text, Typeface face, float textSize) {
        super(x, y, 0, 0);

        paint.setTypeface(face);
        paint.setTextSize(textSize);

        Rect bounds = new Rect();
        paint.getTextBounds(text, 0, text.length(), bounds);

        w = bounds.width();
        h = bounds.height();

        this.text = text;
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
        onCanvas.drawText(text, 0, h, paint);

        super.draw(onCanvas); // propagate downwards, just like super does
    }
}
