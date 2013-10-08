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

public class btBroadphaseProxy extends BulletBase {
	private long swigCPtr;
	
	protected btBroadphaseProxy(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btBroadphaseProxy(long cPtr, boolean cMemoryOwn) {
		this("btBroadphaseProxy", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btBroadphaseProxy obj) {
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
				gdxBulletJNI.delete_btBroadphaseProxy(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setClientObject(SWIGTYPE_p_void value) {
    gdxBulletJNI.btBroadphaseProxy_clientObject_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getClientObject() {
    long cPtr = gdxBulletJNI.btBroadphaseProxy_clientObject_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setCollisionFilterGroup(short value) {
    gdxBulletJNI.btBroadphaseProxy_collisionFilterGroup_set(swigCPtr, this, value);
  }

  public short getCollisionFilterGroup() {
    return gdxBulletJNI.btBroadphaseProxy_collisionFilterGroup_get(swigCPtr, this);
  }

  public void setCollisionFilterMask(short value) {
    gdxBulletJNI.btBroadphaseProxy_collisionFilterMask_set(swigCPtr, this, value);
  }

  public short getCollisionFilterMask() {
    return gdxBulletJNI.btBroadphaseProxy_collisionFilterMask_get(swigCPtr, this);
  }

  public void setMultiSapParentProxy(SWIGTYPE_p_void value) {
    gdxBulletJNI.btBroadphaseProxy_multiSapParentProxy_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getMultiSapParentProxy() {
    long cPtr = gdxBulletJNI.btBroadphaseProxy_multiSapParentProxy_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setUniqueId(int value) {
    gdxBulletJNI.btBroadphaseProxy_uniqueId_set(swigCPtr, this, value);
  }

  public int getUniqueId() {
    return gdxBulletJNI.btBroadphaseProxy_uniqueId_get(swigCPtr, this);
  }

  public void setAabbMin(btVector3 value) {
    gdxBulletJNI.btBroadphaseProxy_aabbMin_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAabbMin() {
    long cPtr = gdxBulletJNI.btBroadphaseProxy_aabbMin_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setAabbMax(btVector3 value) {
    gdxBulletJNI.btBroadphaseProxy_aabbMax_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAabbMax() {
    long cPtr = gdxBulletJNI.btBroadphaseProxy_aabbMax_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public int getUid() {
    return gdxBulletJNI.btBroadphaseProxy_getUid(swigCPtr, this);
  }

  public btBroadphaseProxy() {
    this(gdxBulletJNI.new_btBroadphaseProxy__SWIG_0(), true);
  }

  public btBroadphaseProxy(Vector3 aabbMin, Vector3 aabbMax, SWIGTYPE_p_void userPtr, short collisionFilterGroup, short collisionFilterMask, SWIGTYPE_p_void multiSapParentProxy) {
    this(gdxBulletJNI.new_btBroadphaseProxy__SWIG_1(aabbMin, aabbMax, SWIGTYPE_p_void.getCPtr(userPtr), collisionFilterGroup, collisionFilterMask, SWIGTYPE_p_void.getCPtr(multiSapParentProxy)), true);
  }

  public btBroadphaseProxy(Vector3 aabbMin, Vector3 aabbMax, SWIGTYPE_p_void userPtr, short collisionFilterGroup, short collisionFilterMask) {
    this(gdxBulletJNI.new_btBroadphaseProxy__SWIG_2(aabbMin, aabbMax, SWIGTYPE_p_void.getCPtr(userPtr), collisionFilterGroup, collisionFilterMask), true);
  }

  public static boolean isPolyhedral(int proxyType) {
    return gdxBulletJNI.btBroadphaseProxy_isPolyhedral(proxyType);
  }

  public static boolean isConvex(int proxyType) {
    return gdxBulletJNI.btBroadphaseProxy_isConvex(proxyType);
  }

  public static boolean isNonMoving(int proxyType) {
    return gdxBulletJNI.btBroadphaseProxy_isNonMoving(proxyType);
  }

  public static boolean isConcave(int proxyType) {
    return gdxBulletJNI.btBroadphaseProxy_isConcave(proxyType);
  }

  public static boolean isCompound(int proxyType) {
    return gdxBulletJNI.btBroadphaseProxy_isCompound(proxyType);
  }

  public static boolean isSoftBody(int proxyType) {
    return gdxBulletJNI.btBroadphaseProxy_isSoftBody(proxyType);
  }

  public static boolean isInfinite(int proxyType) {
    return gdxBulletJNI.btBroadphaseProxy_isInfinite(proxyType);
  }

  public static boolean isConvex2d(int proxyType) {
    return gdxBulletJNI.btBroadphaseProxy_isConvex2d(proxyType);
  }

  public final static class CollisionFilterGroups {
    public final static int DefaultFilter = 1;
    public final static int StaticFilter = 2;
    public final static int KinematicFilter = 4;
    public final static int DebrisFilter = 8;
    public final static int SensorTrigger = 16;
    public final static int CharacterFilter = 32;
    public final static int AllFilter = -1;
  }

}
