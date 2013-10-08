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

public class btCollisionObjectFloatData extends BulletBase {
	private long swigCPtr;
	
	protected btCollisionObjectFloatData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btCollisionObjectFloatData(long cPtr, boolean cMemoryOwn) {
		this("btCollisionObjectFloatData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCollisionObjectFloatData obj) {
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
				gdxBulletJNI.delete_btCollisionObjectFloatData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setBroadphaseHandle(SWIGTYPE_p_void value) {
    gdxBulletJNI.btCollisionObjectFloatData_broadphaseHandle_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getBroadphaseHandle() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_broadphaseHandle_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setCollisionShape(SWIGTYPE_p_void value) {
    gdxBulletJNI.btCollisionObjectFloatData_collisionShape_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getCollisionShape() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_collisionShape_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setRootCollisionShape(btCollisionShapeData value) {
    gdxBulletJNI.btCollisionObjectFloatData_rootCollisionShape_set(swigCPtr, this, btCollisionShapeData.getCPtr(value), value);
  }

  public btCollisionShapeData getRootCollisionShape() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_rootCollisionShape_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionShapeData(cPtr, false);
  }

  public void setName(String value) {
    gdxBulletJNI.btCollisionObjectFloatData_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return gdxBulletJNI.btCollisionObjectFloatData_name_get(swigCPtr, this);
  }

  public void setWorldTransform(btTransformFloatData value) {
    gdxBulletJNI.btCollisionObjectFloatData_worldTransform_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getWorldTransform() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_worldTransform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setInterpolationWorldTransform(btTransformFloatData value) {
    gdxBulletJNI.btCollisionObjectFloatData_interpolationWorldTransform_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getInterpolationWorldTransform() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_interpolationWorldTransform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setInterpolationLinearVelocity(btVector3FloatData value) {
    gdxBulletJNI.btCollisionObjectFloatData_interpolationLinearVelocity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getInterpolationLinearVelocity() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_interpolationLinearVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setInterpolationAngularVelocity(btVector3FloatData value) {
    gdxBulletJNI.btCollisionObjectFloatData_interpolationAngularVelocity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getInterpolationAngularVelocity() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_interpolationAngularVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setAnisotropicFriction(btVector3FloatData value) {
    gdxBulletJNI.btCollisionObjectFloatData_anisotropicFriction_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getAnisotropicFriction() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_anisotropicFriction_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setContactProcessingThreshold(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_contactProcessingThreshold_set(swigCPtr, this, value);
  }

  public float getContactProcessingThreshold() {
    return gdxBulletJNI.btCollisionObjectFloatData_contactProcessingThreshold_get(swigCPtr, this);
  }

  public void setDeactivationTime(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_deactivationTime_set(swigCPtr, this, value);
  }

  public float getDeactivationTime() {
    return gdxBulletJNI.btCollisionObjectFloatData_deactivationTime_get(swigCPtr, this);
  }

  public void setFriction(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_friction_set(swigCPtr, this, value);
  }

  public float getFriction() {
    return gdxBulletJNI.btCollisionObjectFloatData_friction_get(swigCPtr, this);
  }

  public void setRollingFriction(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_rollingFriction_set(swigCPtr, this, value);
  }

  public float getRollingFriction() {
    return gdxBulletJNI.btCollisionObjectFloatData_rollingFriction_get(swigCPtr, this);
  }

  public void setRestitution(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_restitution_set(swigCPtr, this, value);
  }

  public float getRestitution() {
    return gdxBulletJNI.btCollisionObjectFloatData_restitution_get(swigCPtr, this);
  }

  public void setHitFraction(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_hitFraction_set(swigCPtr, this, value);
  }

  public float getHitFraction() {
    return gdxBulletJNI.btCollisionObjectFloatData_hitFraction_get(swigCPtr, this);
  }

  public void setCcdSweptSphereRadius(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_ccdSweptSphereRadius_set(swigCPtr, this, value);
  }

  public float getCcdSweptSphereRadius() {
    return gdxBulletJNI.btCollisionObjectFloatData_ccdSweptSphereRadius_get(swigCPtr, this);
  }

  public void setCcdMotionThreshold(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_ccdMotionThreshold_set(swigCPtr, this, value);
  }

  public float getCcdMotionThreshold() {
    return gdxBulletJNI.btCollisionObjectFloatData_ccdMotionThreshold_get(swigCPtr, this);
  }

  public void setHasAnisotropicFriction(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_hasAnisotropicFriction_set(swigCPtr, this, value);
  }

  public int getHasAnisotropicFriction() {
    return gdxBulletJNI.btCollisionObjectFloatData_hasAnisotropicFriction_get(swigCPtr, this);
  }

  public void setCollisionFlags(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_collisionFlags_set(swigCPtr, this, value);
  }

  public int getCollisionFlags() {
    return gdxBulletJNI.btCollisionObjectFloatData_collisionFlags_get(swigCPtr, this);
  }

  public void setIslandTag1(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_islandTag1_set(swigCPtr, this, value);
  }

  public int getIslandTag1() {
    return gdxBulletJNI.btCollisionObjectFloatData_islandTag1_get(swigCPtr, this);
  }

  public void setCompanionId(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_companionId_set(swigCPtr, this, value);
  }

  public int getCompanionId() {
    return gdxBulletJNI.btCollisionObjectFloatData_companionId_get(swigCPtr, this);
  }

  public void setActivationState1(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_activationState1_set(swigCPtr, this, value);
  }

  public int getActivationState1() {
    return gdxBulletJNI.btCollisionObjectFloatData_activationState1_get(swigCPtr, this);
  }

  public void setInternalType(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_internalType_set(swigCPtr, this, value);
  }

  public int getInternalType() {
    return gdxBulletJNI.btCollisionObjectFloatData_internalType_get(swigCPtr, this);
  }

  public void setCheckCollideWith(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_checkCollideWith_set(swigCPtr, this, value);
  }

  public int getCheckCollideWith() {
    return gdxBulletJNI.btCollisionObjectFloatData_checkCollideWith_get(swigCPtr, this);
  }

  public void setPadding(String value) {
    gdxBulletJNI.btCollisionObjectFloatData_padding_set(swigCPtr, this, value);
  }

  public String getPadding() {
    return gdxBulletJNI.btCollisionObjectFloatData_padding_get(swigCPtr, this);
  }

  public btCollisionObjectFloatData() {
    this(gdxBulletJNI.new_btCollisionObjectFloatData(), true);
  }

}
