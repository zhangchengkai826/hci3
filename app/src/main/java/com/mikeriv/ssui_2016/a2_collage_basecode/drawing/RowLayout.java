package com.mikeriv.ssui_2016.a2_collage_basecode.drawing;

public class RowLayout extends BaseVisualElement {
    public RowLayout(float x, float y, float w, float h) {
        super(x, y, w, h);
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#doLayout()
     */
    @Override
    public void doLayout() {
        float sumX = 0;
        for(VisualElement e: children){
            e.setX(sumX);
            e.setY((h - e.getH()) / 2);
            sumX += e.getW();
        }
        super.doLayout();
    }
}
