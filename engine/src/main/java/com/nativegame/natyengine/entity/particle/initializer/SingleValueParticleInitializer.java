package com.merebapps.engine.entity.particle.initializer;

import com.merebapps.engine.entity.particle.Particle;
import com.merebapps.engine.util.RandomUtils;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public abstract class SingleValueParticleInitializer implements ParticleInitializer {

    private final float mMinValue;
    private final float mMaxValue;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    protected SingleValueParticleInitializer(float minValue, float maxValue) {
        mMinValue = minValue;
        mMaxValue = maxValue;
    }
    //========================================================

    //--------------------------------------------------------
    // Overriding methods
    //--------------------------------------------------------
    @Override
    public void initParticle(Particle particle) {
        float value = RandomUtils.nextFloat(mMinValue, mMaxValue);
        onInitParticle(particle, value);
    }
    //========================================================

    //--------------------------------------------------------
    // Methods
    //--------------------------------------------------------
    protected abstract void onInitParticle(Particle particle, float value);
    //========================================================

}
