/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public enum ZoomLevel {
  ZoomLevel0(OsmAndCoreJNI.ZoomLevel0_get()),
  ZoomLevel1,
  ZoomLevel2,
  ZoomLevel3,
  ZoomLevel4,
  ZoomLevel5,
  ZoomLevel6,
  ZoomLevel7,
  ZoomLevel8,
  ZoomLevel9,
  ZoomLevel10,
  ZoomLevel11,
  ZoomLevel12,
  ZoomLevel13,
  ZoomLevel14,
  ZoomLevel15,
  ZoomLevel16,
  ZoomLevel17,
  ZoomLevel18,
  ZoomLevel19,
  ZoomLevel20,
  ZoomLevel21,
  ZoomLevel22,
  ZoomLevel23,
  ZoomLevel24,
  ZoomLevel25,
  ZoomLevel26,
  ZoomLevel27,
  ZoomLevel28,
  ZoomLevel29,
  ZoomLevel30,
  ZoomLevel31(OsmAndCoreJNI.ZoomLevel31_get()),
  InvalidZoom(OsmAndCoreJNI.InvalidZoom_get()),
  MinZoomLevel(OsmAndCoreJNI.MinZoomLevel_get()),
  MaxZoomLevel(OsmAndCoreJNI.MaxZoomLevel_get());

  public final int swigValue() {
    return swigValue;
  }

  public static ZoomLevel swigToEnum(int swigValue) {
    ZoomLevel[] swigValues = ZoomLevel.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ZoomLevel swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ZoomLevel.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ZoomLevel() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ZoomLevel(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ZoomLevel(ZoomLevel swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
