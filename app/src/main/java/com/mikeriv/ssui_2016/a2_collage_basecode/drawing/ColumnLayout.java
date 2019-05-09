package com.mikeriv.ssui_2016.a2_collage_basecode.drawing;

public class ColumnLayout extends BaseVisualElement {
    public ColumnLayout(float x, float y, float w, float h) {
        super(x, y, w, h);
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#doLayout()
     */
    @Override
    public void doLayout() {
        float sumY = 0;
        for(VisualElement e: children){
            e.setX((w - e.getW()) / 2);
            e.setY(sumY);
            sumY += e.getH();
        }
        super.doLayout();
    }
}
