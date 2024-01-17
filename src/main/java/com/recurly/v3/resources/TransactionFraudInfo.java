/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Constants;
import com.recurly.v3.Resource;
import java.util.List;

public class TransactionFraudInfo extends Resource {

  /** Kount decision */
  @SerializedName("decision")
  @Expose
  private Constants.KountDecision decision;

  /** Object type */
  @SerializedName("object")
  @Expose
  private String object;

  /** Kount transaction reference ID */
  @SerializedName("reference")
  @Expose
  private String reference;

  /** A list of fraud risk rules that were triggered for the transaction. */
  @SerializedName("risk_rules_triggered")
  @Expose
  private List<FraudRiskRule> riskRulesTriggered;

  /** Kount score */
  @SerializedName("score")
  @Expose
  private Integer score;

  /** Kount decision */
  public Constants.KountDecision getDecision() {
    return this.decision;
  }

  /** @param decision Kount decision */
  public void setDecision(final Constants.KountDecision decision) {
    this.decision = decision;
  }

  /** Object type */
  public String getObject() {
    return this.object;
  }

  /** @param object Object type */
  public void setObject(final String object) {
    this.object = object;
  }

  /** Kount transaction reference ID */
  public String getReference() {
    return this.reference;
  }

  /** @param reference Kount transaction reference ID */
  public void setReference(final String reference) {
    this.reference = reference;
  }

  /** A list of fraud risk rules that were triggered for the transaction. */
  public List<FraudRiskRule> getRiskRulesTriggered() {
    return this.riskRulesTriggered;
  }

  /**
   * @param riskRulesTriggered A list of fraud risk rules that were triggered for the transaction.
   */
  public void setRiskRulesTriggered(final List<FraudRiskRule> riskRulesTriggered) {
    this.riskRulesTriggered = riskRulesTriggered;
  }

  /** Kount score */
  public Integer getScore() {
    return this.score;
  }

  /** @param score Kount score */
  public void setScore(final Integer score) {
    this.score = score;
  }
}
