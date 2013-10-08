/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btConeShape extends btConvexInternalShape {
	private long swigCPtr;
	
	protected btConeShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, gdxBulletJNI.btConeShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btConeShape(long cPtr, boolean cMemoryOwn) {
		this("btConeShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(gdxBulletJNI.btConeShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btConeShape obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btConeShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btConeShape(float radius, float height) {
    this(gdxBulletJNI.new_btConeShape(radius, height), true);
  }

  public float getRadius() {
    return gdxBulletJNI.btConeShape_getRadius(swigCPtr, this);
  }

  public float getHeight() {
    return gdxBulletJNI.btConeShape_getHeight(swigCPtr, this);
  }

  public void setConeUpIndex(int upIndex) {
    gdxBulletJNI.btConeShape_setConeUpIndex(swigCPtr, this, upIndex);
  }

  public int getConeUpIndex() {
    return gdxBulletJNI.btConeShape_getConeUpIndex(swigCPtr, this);
  }

}
