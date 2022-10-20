/**
 * This file is automatically created by Recurly's OpenAPI generation process
 * and thus any edits you make by hand will be lost. If you wish to make a
 * change to this file, please create a Github issue explaining the changes you
 * need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import com.recurly.v3.Constants;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

public class FraudInfo extends Resource {

  
  /**
   * Kount decision
   */
  
  @SerializedName("decision")
  @Expose
  private Constants.KountDecision decision;

  
  /**
   * Kount rules
   */
  
  @SerializedName("risk_rules_triggered")
  @Expose
  private Map riskRulesTriggered;

  
  /**
   * Kount score
   */
  
  @SerializedName("score")
  @Expose
  private Integer score;



  
  /**
   * Kount decision
   */
  
  public Constants.KountDecision getDecision() { return this.decision; }

  
  /**
   * @param decision Kount decision
   */
  
  public void setDecision(final Constants.KountDecision decision) { this.decision = decision; }

  
  /**
   * Kount rules
   */
  
  public Map getRiskRulesTriggered() { return this.riskRulesTriggered; }

  
  /**
   * @param riskRulesTriggered Kount rules
   */
  
  public void setRiskRulesTriggered(final Map riskRulesTriggered) { this.riskRulesTriggered = riskRulesTriggered; }

  
  /**
   * Kount score
   */
  
  public Integer getScore() { return this.score; }

  
  /**
   * @param score Kount score
   */
  
  public void setScore(final Integer score) { this.score = score; }

}
