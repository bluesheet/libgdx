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

public class btBvhSubtreeInfoData extends BulletBase {
	private long swigCPtr;
	
	protected btBvhSubtreeInfoData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btBvhSubtreeInfoData(long cPtr, boolean cMemoryOwn) {
		this("btBvhSubtreeInfoData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btBvhSubtreeInfoData obj) {
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
				gdxBulletJNI.delete_btBvhSubtreeInfoData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setRootNodeIndex(int value) {
    gdxBulletJNI.btBvhSubtreeInfoData_rootNodeIndex_set(swigCPtr, this, value);
  }

  public int getRootNodeIndex() {
    return gdxBulletJNI.btBvhSubtreeInfoData_rootNodeIndex_get(swigCPtr, this);
  }

  public void setSubtreeSize(int value) {
    gdxBulletJNI.btBvhSubtreeInfoData_subtreeSize_set(swigCPtr, this, value);
  }

  public int getSubtreeSize() {
    return gdxBulletJNI.btBvhSubtreeInfoData_subtreeSize_get(swigCPtr, this);
  }

  public void setQuantizedAabbMin(int[] value) {
    gdxBulletJNI.btBvhSubtreeInfoData_quantizedAabbMin_set(swigCPtr, this, value);
  }

  public int[] getQuantizedAabbMin() {
    return gdxBulletJNI.btBvhSubtreeInfoData_quantizedAabbMin_get(swigCPtr, this);
  }

  public void setQuantizedAabbMax(int[] value) {
    gdxBulletJNI.btBvhSubtreeInfoData_quantizedAabbMax_set(swigCPtr, this, value);
  }

  public int[] getQuantizedAabbMax() {
    return gdxBulletJNI.btBvhSubtreeInfoData_quantizedAabbMax_get(swigCPtr, this);
  }

  public btBvhSubtreeInfoData() {
    this(gdxBulletJNI.new_btBvhSubtreeInfoData(), true);
  }

}
