package com.merebapps.engine.entity.particle.initializer;

import android.graphics.Paint;

import com.merebapps.engine.entity.particle.Particle;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class PaintParticleInitializer implements ParticleInitializer {

    private final Paint mPaint;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public PaintParticleInitializer(Paint paint) {
        mPaint = paint;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void initParticle(Particle particle) {
        particle.setPaint(mPaint);
    }
    //========================================================

}
