package com.merebapps.engine.entity.particle;

import com.merebapps.engine.engine.Engine;
import com.merebapps.engine.entity.particle.GenericParticle;
import com.merebapps.engine.entity.particle.GenericParticleSystem;
import com.merebapps.engine.entity.particle.Particle;
import com.merebapps.engine.entity.shape.primitive.Circle;
import com.merebapps.engine.util.pool.Pool;
import com.merebapps.engine.util.pool.SafeFixedObjectPool;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public class CircleParticleSystem extends GenericParticleSystem {

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public CircleParticleSystem(Engine engine, int radius, int minCount) {
        this(engine, radius, minCount, minCount);
    }

    public CircleParticleSystem(Engine engine, int radius, int minCount, int maxCount) {
        super(engine, new SafeFixedObjectPool<>(new Pool.PoolObjectFactory<Particle>() {
            @Override
            public Particle createObject() {
                return new GenericParticle<>(engine, new Circle(engine, radius));
            }
        }, minCount, maxCount));
    }
    //========================================================

}
