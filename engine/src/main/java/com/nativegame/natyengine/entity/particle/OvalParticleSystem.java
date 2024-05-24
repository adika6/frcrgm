package com.merebapps.engine.entity.particle;

import com.merebapps.engine.engine.Engine;
import com.merebapps.engine.entity.particle.GenericParticle;
import com.merebapps.engine.entity.particle.GenericParticleSystem;
import com.merebapps.engine.entity.particle.Particle;
import com.merebapps.engine.entity.shape.primitive.Oval;
import com.merebapps.engine.util.pool.Pool;
import com.merebapps.engine.util.pool.SafeFixedObjectPool;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class OvalParticleSystem extends GenericParticleSystem {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public OvalParticleSystem(Engine engine, int width, int height, int minCount) {
        this(engine, width, height, minCount, minCount);
    }

    public OvalParticleSystem(Engine engine, int width, int height, int minCount, int maxCount) {
        super(engine, new SafeFixedObjectPool<>(new Pool.PoolObjectFactory<Particle>() {
            @Override
            public Particle createObject() {
                return new GenericParticle<>(engine, new Oval(engine, width, height));
            }
        }, minCount, maxCount));
    }
    //========================================================

}
