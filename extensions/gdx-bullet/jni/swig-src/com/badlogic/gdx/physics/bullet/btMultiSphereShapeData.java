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

public class btMultiSphereShapeData extends BulletBase {
	private long swigCPtr;
	
	protected btMultiSphereShapeData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btMultiSphereShapeData(long cPtr, boolean cMemoryOwn) {
		this("btMultiSphereShapeData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btMultiSphereShapeData obj) {
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
				gdxBulletJNI.delete_btMultiSphereShapeData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setConvexInternalShapeData(btConvexInternalShapeData value) {
    gdxBulletJNI.btMultiSphereShapeData_convexInternalShapeData_set(swigCPtr, this, btConvexInternalShapeData.getCPtr(value), value);
  }

  public btConvexInternalShapeData getConvexInternalShapeData() {
    long cPtr = gdxBulletJNI.btMultiSphereShapeData_convexInternalShapeData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexInternalShapeData(cPtr, false);
  }

  public void setLocalPositionArrayPtr(btPositionAndRadius value) {
    gdxBulletJNI.btMultiSphereShapeData_localPositionArrayPtr_set(swigCPtr, this, btPositionAndRadius.getCPtr(value), value);
  }

  public btPositionAndRadius getLocalPositionArrayPtr() {
    long cPtr = gdxBulletJNI.btMultiSphereShapeData_localPositionArrayPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btPositionAndRadius(cPtr, false);
  }

  public void setLocalPositionArraySize(int value) {
    gdxBulletJNI.btMultiSphereShapeData_localPositionArraySize_set(swigCPtr, this, value);
  }

  public int getLocalPositionArraySize() {
    return gdxBulletJNI.btMultiSphereShapeData_localPositionArraySize_get(swigCPtr, this);
  }

  public void setPadding(String value) {
    gdxBulletJNI.btMultiSphereShapeData_padding_set(swigCPtr, this, value);
  }

  public String getPadding() {
    return gdxBulletJNI.btMultiSphereShapeData_padding_get(swigCPtr, this);
  }

  public btMultiSphereShapeData() {
    this(gdxBulletJNI.new_btMultiSphereShapeData(), true);
  }

}
