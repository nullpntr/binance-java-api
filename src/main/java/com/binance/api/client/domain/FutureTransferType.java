package com.binance.api.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum FutureTransferType {
  SPOT_TO_USDTM(1), USDTM_TO_SPOT(2), SPOT_TO_COINM(3), COINM_TO_SPOT(4);

  private Integer value;

  FutureTransferType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }
}
