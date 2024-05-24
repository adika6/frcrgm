package com.merebapps.engine.entity.modifier;

import android.graphics.Path;
import android.graphics.PathMeasure;

import com.merebapps.engine.entity.shape.Shape;
import com.merebapps.engine.util.modifier.BaseValueModifier;
import com.merebapps.engine.util.modifier.tween.Tweener;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class PathModifier extends BaseValueModifier<Shape> {

    private final PathMeasure mPathMeasure;

    private final float[] mPathPosition = new float[2];

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public PathModifier(Path path, long duration, long startDelay, Tweener tweener) {
        super(duration, startDelay, tweener);
        mPathMeasure = new PathMeasure(path, false);
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public void setPath(Path path) {
        mPathMeasure.setPath(path, false);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    protected void initValue(Shape shape) {
        mPathMeasure.getPosTan(0, mPathPosition, null);
        shape.setX(mPathPosition[0]);
        shape.setY(mPathPosition[1]);
    }

    @Override
    protected void updateValue(Shape shape, float percentage) {
        float percentageValue = mPathMeasure.getLength() * percentage;
        mPathMeasure.getPosTan(percentageValue, mPathPosition, null);
        shape.setX(mPathPosition[0]);
        shape.setY(mPathPosition[1]);
    }

    @Override
    protected void endValue(Shape shape) {
        mPathMeasure.getPosTan(mPathMeasure.getLength(), mPathPosition, null);
        shape.setX(mPathPosition[0]);
        shape.setY(mPathPosition[1]);
    }
    //========================================================

}
