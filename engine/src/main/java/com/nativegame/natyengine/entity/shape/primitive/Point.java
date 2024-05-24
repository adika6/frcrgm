package com.merebapps.engine.entity.shape.primitive;

import android.graphics.Canvas;

import com.merebapps.engine.camera.Camera;
import com.merebapps.engine.engine.Engine;
import com.merebapps.engine.entity.shape.ShapeEntity;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class Point extends ShapeEntity {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Point(Engine engine, float x, float y) {
        super(engine, x, y);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public boolean isCulling(Canvas canvas, Camera camera) {
        return camera.getWorldToScreenX(mX, mCoordinateType) > canvas.getWidth()
                || camera.getWorldToScreenY(mY, mCoordinateType) > canvas.getHeight()
                || camera.getWorldToScreenX(mX, mCoordinateType) < 0
                || camera.getWorldToScreenY(mY, mCoordinateType) < 0;
    }

    @Override
    protected void onDrawCanvas(Canvas canvas) {
        canvas.drawPoint(0, 0, mPaint);
    }
    //========================================================

}
