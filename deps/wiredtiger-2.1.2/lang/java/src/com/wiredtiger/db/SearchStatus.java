/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wiredtiger.db;

public enum SearchStatus {
  FOUND,
  NOTFOUND,
  SMALLER,
  LARGER;

  public final int swigValue() {
    return swigValue;
  }

  public static SearchStatus swigToEnum(int swigValue) {
    SearchStatus[] swigValues = SearchStatus.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (SearchStatus swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + SearchStatus.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private SearchStatus() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private SearchStatus(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private SearchStatus(SearchStatus swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

