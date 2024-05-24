package com.merebapps.engine.entity.shape.primitive;

import android.graphics.Canvas;

import com.merebapps.engine.engine.Engine;
import com.merebapps.engine.entity.shape.RectangleShapeEntity;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class Rectangle extends RectangleShapeEntity {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Rectangle(Engine engine, int width, int height) {
        this(engine, 0, 0, width, height);
    }

    public Rectangle(Engine engine, float x, float y, int width, int height) {
        super(engine, x, y, width, height);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    protected void onDrawCanvas(Canvas canvas) {
        canvas.drawRect(0, 0, getWidth(), getHeight(), mPaint);
    }
    //========================================================

}
