/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;

public class UniqueCouponCodeParams extends Resource {

  /** The date-time to be included when listing UniqueCouponCodes */
  @SerializedName("begin_time")
  @Expose
  private DateTime beginTime;

  /** The number of UniqueCouponCodes that will be generated */
  @SerializedName("limit")
  @Expose
  private Integer limit;

  /** Sort order to list newly generated UniqueCouponCodes (should always be `asc`) */
  @SerializedName("order")
  @Expose
  private String order;

  /** Sort field to list newly generated UniqueCouponCodes (should always be `created_at`) */
  @SerializedName("sort")
  @Expose
  private String sort;

  /** The date-time to be included when listing UniqueCouponCodes */
  public DateTime getBeginTime() {
    return this.beginTime;
  }

  /** @param beginTime The date-time to be included when listing UniqueCouponCodes */
  public void setBeginTime(final DateTime beginTime) {
    this.beginTime = beginTime;
  }

  /** The number of UniqueCouponCodes that will be generated */
  public Integer getLimit() {
    return this.limit;
  }

  /** @param limit The number of UniqueCouponCodes that will be generated */
  public void setLimit(final Integer limit) {
    this.limit = limit;
  }

  /** Sort order to list newly generated UniqueCouponCodes (should always be `asc`) */
  public String getOrder() {
    return this.order;
  }

  /** @param order Sort order to list newly generated UniqueCouponCodes (should always be `asc`) */
  public void setOrder(final String order) {
    this.order = order;
  }

  /** Sort field to list newly generated UniqueCouponCodes (should always be `created_at`) */
  public String getSort() {
    return this.sort;
  }

  /**
   * @param sort Sort field to list newly generated UniqueCouponCodes (should always be
   *     `created_at`)
   */
  public void setSort(final String sort) {
    this.sort = sort;
  }
}
