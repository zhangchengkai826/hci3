package com.mikeriv.ssui_2016.a2_collage_basecode.drawing;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.ArrayList;
import java.util.Collections;

public class BaseVisualElement extends PrebaseVisualElement {

    float x = 0.f;
    float y = 0.f;
    float w = 0.f;
    float h = 0.f;
    VisualElement parent = null;
    ArrayList<VisualElement> children = new ArrayList<>();
    Paint paint = new Paint();

    public BaseVisualElement(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#setX(float)
     */
    @Override
    public void setX(float x) {
        this.x = x;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#setY(float)
     */
    @Override
    public void setY(float y) {
        this.y = y;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#getX()
     */
    @Override
    public float getX() {
        return x;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#getY()
     */
    @Override
    public float getY() {
        return y;
    }
    
    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#setW(float)
     */
    @Override
    public void setW(float w) {
        this.w = w;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#setH(float)
     */
    @Override
    public void setH(float h) {
        this.h = h;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#getW()
     */
    @Override
    public float getW() {
        return w;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#getH()
     */
    @Override
    public float getH() {
        return h;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#getParent()
     */
    @Override
    public VisualElement getParent() {
        return parent;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#setParent()
     */
    @Override
    public void setParent(VisualElement newParent) {
        parent = newParent;
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#getNumChildren()
     */
    @Override
    public int getNumChildren() {
        return children.size();
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#getChildAt(int)
     */
    @Override
    public VisualElement getChildAt(int index) {
        return children.get(index);
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#findChild(com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement)
     */
    @Override
    public int findChild(VisualElement child) {
        return children.indexOf(child);
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#addChild(com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement)
     */
    @Override
    public void addChild(VisualElement child) {
        children.add(child);
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#removeChildAt(int)
     */
    @Override
    public void removeChildAt(int index) {
        children.remove(index);
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#removeChild(com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement)
     */
    @Override
    public void removeChild(VisualElement child) {
        children.remove(child);
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#moveChildFirst(com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement)
     */
    @Override
    public void moveChildFirst(VisualElement child) {
        int index = findChild(child);
        for(int i = index - 1; i >= 0; i--) {
            Collections.swap(children, i, i+1);
        }
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#moveChildLast(com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement)
     */
    @Override
    public void moveChildLast(VisualElement child) {
        int index = findChild(child);
        for(int i = index; i < children.size()-1; i++) {
            Collections.swap(children, i, i+1);
        }
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#moveChildEarlier(com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement)
     */
    @Override
    public void moveChildEarlier(VisualElement child) {
        int index = findChild(child);
        Collections.swap(children, index-1, index);
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#moveChildLater(com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement)
     */
    @Override
    public void moveChildLater(VisualElement child) {
        int index = findChild(child);
        Collections.swap(children, index, index+1);
    }


    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#doLayout()
     */
    @Override
    public void doLayout() {
        for(VisualElement e: children){
            e.doLayout();
        }
    }

    /* (non-Javadoc)
     * @see com.mikeriv.ssui_2016.a2_collage_basecode.drawing.VisualElement#draw(android.graphics.Canvas)
     */
    @Override
    public void draw(Canvas onCanvas) {
        for(VisualElement e: children){
            onCanvas.save();
            onCanvas.translate(e.getX(), e.getY());
            onCanvas.clipRect(0, 0, e.getW(), e.getH());
            e.draw(onCanvas);
            onCanvas.restore();
        }
    }
}
