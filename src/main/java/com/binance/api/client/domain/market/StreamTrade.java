package com.binance.api.client.domain.market;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StreamTrade {

  @JsonProperty("t")
  private long tradeId;

  @JsonProperty("p")
  private BigDecimal price;

  @JsonProperty("q")
  private BigDecimal quantity;

  @JsonProperty("b")
  private long buyerOrderId;

  @JsonProperty("a")
  private long sellerOrderId;

  @JsonProperty("T")
  private long tradeTime;

  @JsonProperty("m")
  private boolean isBuyerMaker;

  @JsonProperty("M")
  private boolean isIgnore;

  public long getTradeId() {
    return tradeId;
  }

  public void setTradeId(long tradeId) {
    this.tradeId = tradeId;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public long getBuyerOrderId() {
    return buyerOrderId;
  }

  public void setBuyerOrderId(long buyerOrderId) {
    this.buyerOrderId = buyerOrderId;
  }

  public long getSellerOrderId() {
    return sellerOrderId;
  }

  public void setSellerOrderId(long sellerOrderId) {
    this.sellerOrderId = sellerOrderId;
  }

  public long getTradeTime() {
    return tradeTime;
  }

  public void setTradeTime(long tradeTime) {
    this.tradeTime = tradeTime;
  }

  public boolean isBuyerMaker() {
    return isBuyerMaker;
  }

  public void setBuyerMaker(boolean buyerMaker) {
    isBuyerMaker = buyerMaker;
  }

  public boolean isIgnore() {
    return isIgnore;
  }

  public void setIgnore(boolean ignore) {
    isIgnore = ignore;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("tradeId", tradeId)
        .append("price", price)
        .append("quantity", quantity)
        .append("buyerOrderId", buyerOrderId)
        .append("sellerOrderId", sellerOrderId)
        .append("tradeTime", tradeTime)
        .append("isBuyerMaker", isBuyerMaker)
        .append("isIgnore", isIgnore)
        .toString();
  }
}
