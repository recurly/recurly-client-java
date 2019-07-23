/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import java.util.Map;

public class FraudInfo extends Resource {

  @SerializedName("decision")
  @Expose
  private String decision;

  @SerializedName("risk_rules_triggered")
  @Expose
  private Map<String, String> riskRulesTriggered;

  @SerializedName("score")
  @Expose
  private Integer score;

  public String getDecision() {
    return this.decision;
  }

  public void setDecision(final String decision) {
    this.decision = decision;
  }

  public Map<String, String> getRiskRulesTriggered() {
    return this.riskRulesTriggered;
  }

  public void setRiskRulesTriggered(final Map<String, String> riskRulesTriggered) {
    this.riskRulesTriggered = riskRulesTriggered;
  }

  public Integer getScore() {
    return this.score;
  }

  public void setScore(final Integer score) {
    this.score = score;
  }
}
