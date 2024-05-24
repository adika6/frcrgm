package com.merebapps.engine.util.debug;

import android.graphics.Canvas;

import com.merebapps.engine.camera.Camera;
import com.merebapps.engine.engine.Engine;
import com.merebapps.engine.entity.text.Text;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class FPSCounter extends Text {

    private int mDrawCount;
    private long mTotalTime;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public FPSCounter(Engine engine, int width, int height) {
        this(engine, 0, 0, width, height);
    }

    public FPSCounter(Engine engine, float x, float y, int width, int height) {
        super(engine, x, y, width, height);
        setCoordinateType(Camera.CoordinateType.CAMERA);
        setPaint(engine.getDebugger().getDebugTextPaint());
        setTextHorizontalAlign(TextHorizontalAlign.LEFT);
        setTextVerticalAlign(TextVerticalAlign.TOP);
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    protected void onStart() {
        mDrawCount = 0;
        mTotalTime = 0;
    }

    @Override
    protected void onUpdate(long elapsedMillis) {
        mTotalTime += elapsedMillis;
        if (mTotalTime >= 1000) {
            float fps = mDrawCount * 1000f / mTotalTime;
            setText("FPS: " + fps);
            mDrawCount = 0;
            mTotalTime = mTotalTime % 1000;
        }
    }

    @Override
    protected void onPostDraw(Canvas canvas, Camera camera) {
        mDrawCount++;
    }
    //========================================================

}
