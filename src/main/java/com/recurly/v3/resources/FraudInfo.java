package com.recurly.v3.resources;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class FraudInfo extends Resource {

  @SerializedName("decision")
  private String decision;

  @SerializedName("risk_rules_triggered")
  private Map<String, String> riskRulesTriggered;

  @SerializedName("score")
  private Integer score;


  public String getDecision() { return this.decision; }
  public void setDecision(final String decision) { this.decision = decision; }

  public Map<String, String> getRiskRulesTriggered() { return this.riskRulesTriggered; }
  public void setRiskRulesTriggered(final Map<String, String> riskRulesTriggered) { this.riskRulesTriggered = riskRulesTriggered; }

  public Integer getScore() { return this.score; }
  public void setScore(final Integer score) { this.score = score; }

}
