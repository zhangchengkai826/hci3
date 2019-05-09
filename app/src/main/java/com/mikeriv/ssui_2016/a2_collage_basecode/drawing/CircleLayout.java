package com.mikeriv.ssui_2016.a2_collage_basecode.drawing;

public class CircleLayout extends BaseVisualElement {
    private float layoutCenterX;
    private float layoutCenterY;
    private float layoutRadius;

    public CircleLayout(float x, float y, float w, float h, float layoutCenterX
            , float layoutCenterY, float layoutRadius) {
        super(x, y, w, h);
        this.layoutCenterX = layoutCenterX;
        this.layoutCenterY = layoutCenterY;
        this.layoutRadius = layoutRadius;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#doLayout()
     */
    @Override
    public void doLayout() {
        double dDeg = 2 * Math.PI / children.size();
        double curDeg = 0.;
        for(VisualElement e: children){
            double dx = layoutRadius * Math.cos(curDeg);
            double dy = layoutRadius * Math.sin(curDeg);
            e.setX((int)(layoutCenterX + dx - e.getW()/2));
            e.setY((int)(layoutCenterY + dy - e.getH()/2));
            curDeg += dDeg;
        }
        super.doLayout();
    }
}
