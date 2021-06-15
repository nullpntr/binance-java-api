package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Order or trade report update event.
 * <p>
 * This event is embedded as part of a user data update event.
 *
 * @see UserDataUpdateEvent
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderTradeUpdateEvent {

  @JsonProperty("e")
  private String eventType;

  @JsonProperty("E")
  private Long eventTime;

  @JsonProperty("s")
  private String symbol;

  @JsonProperty("c")
  private String newClientOrderId;

  /**
   * Buy/Sell order side.
   */
  @JsonProperty("S")
  private OrderSide side;

  /**
   * Type of order.
   */
  @JsonProperty("o")
  private OrderType type;

  /**
   * Time in force to indicate how long will the order remain active.
   */
  @JsonProperty("f")
  private TimeInForce timeInForce;

  /**
   * Original quantity in the order.
   */
  @JsonProperty("q")
  private BigDecimal originalQuantity;

  /**
   * Price.
   */
  @JsonProperty("p")
  private BigDecimal price;

  /**
   * Type of execution.
   */
  @JsonProperty("x")
  private ExecutionType executionType;

  /**
   * Status of the order.
   */
  @JsonProperty("X")
  private OrderStatus orderStatus;

  /**
   * Reason why the order was rejected.
   */
  @JsonProperty("r")
  private OrderRejectReason orderRejectReason;

  /**
   * Order id.
   */
  @JsonProperty("i")
  private Long orderId;

  /**
   * Quantity of the last filled trade.
   */
  @JsonProperty("l")
  private BigDecimal quantityLastFilledTrade;

  /**
   * Accumulated quantity of filled trades on this order.
   */
  @JsonProperty("z")
  private BigDecimal accumulatedQuantity;

  /**
   * Price of last filled trade.
   */
  @JsonProperty("L")
  private BigDecimal priceOfLastFilledTrade;

  /**
   * Commission.
   */
  @JsonProperty("n")
  private BigDecimal commission;

  /**
   * Asset on which commission is taken
   */
  @JsonProperty("N")
  private String commissionAsset;

  /**
   * Order/trade time.
   */
  @JsonProperty("T")
  private Long orderTradeTime;

  /**
   * Trade id.
   */
  @JsonProperty("t")
  private Long tradeId;

  /**
   * Order creation time.
   */
  @JsonProperty("O")
  private Long orderCreationTime;

  /**
   * Cumulative quote asset transacted quantity.
   */
  @JsonProperty("Z")
  private BigDecimal cumulativeQuoteQty;

  /**
   * Last quote asset transacted quantity (i.e. lastPrice * lastQty).
   */
  @JsonProperty("Y")
  private BigDecimal lastQuoteQty;

  /**
   * Quote Order Qty.
   */
  @JsonProperty("Q")
  private BigDecimal quoteOrderQty;

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Long getEventTime() {
    return eventTime;
  }

  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getNewClientOrderId() {
    return newClientOrderId;
  }

  public void setNewClientOrderId(String newClientOrderId) {
    this.newClientOrderId = newClientOrderId;
  }

  public OrderSide getSide() {
    return side;
  }

  public void setSide(OrderSide side) {
    this.side = side;
  }

  public OrderType getType() {
    return type;
  }

  public void setType(OrderType type) {
    this.type = type;
  }

  public TimeInForce getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(TimeInForce timeInForce) {
    this.timeInForce = timeInForce;
  }

  public BigDecimal getOriginalQuantity() {
    return originalQuantity;
  }

  public void setOriginalQuantity(BigDecimal originalQuantity) {
    this.originalQuantity = originalQuantity;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public ExecutionType getExecutionType() {
    return executionType;
  }

  public void setExecutionType(ExecutionType executionType) {
    this.executionType = executionType;
  }

  public OrderStatus getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus;
  }

  public OrderRejectReason getOrderRejectReason() {
    return orderRejectReason;
  }

  public void setOrderRejectReason(OrderRejectReason orderRejectReason) {
    this.orderRejectReason = orderRejectReason;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public BigDecimal getQuantityLastFilledTrade() {
    return quantityLastFilledTrade;
  }

  public void setQuantityLastFilledTrade(BigDecimal quantityLastFilledTrade) {
    this.quantityLastFilledTrade = quantityLastFilledTrade;
  }

  public BigDecimal getAccumulatedQuantity() {
    return accumulatedQuantity;
  }

  public void setAccumulatedQuantity(BigDecimal accumulatedQuantity) {
    this.accumulatedQuantity = accumulatedQuantity;
  }

  public BigDecimal getPriceOfLastFilledTrade() {
    return priceOfLastFilledTrade;
  }

  public void setPriceOfLastFilledTrade(BigDecimal priceOfLastFilledTrade) {
    this.priceOfLastFilledTrade = priceOfLastFilledTrade;
  }

  public BigDecimal getCommission() {
    return commission;
  }

  public void setCommission(BigDecimal commission) {
    this.commission = commission;
  }

  public String getCommissionAsset() {
    return commissionAsset;
  }

  public void setCommissionAsset(String commissionAsset) {
    this.commissionAsset = commissionAsset;
  }

  public Long getOrderTradeTime() {
    return orderTradeTime;
  }

  public void setOrderTradeTime(Long orderTradeTime) {
    this.orderTradeTime = orderTradeTime;
  }

  public Long getTradeId() {
    return tradeId;
  }

  public void setTradeId(Long tradeId) {
    this.tradeId = tradeId;
  }

  public Long getOrderCreationTime() {
    return orderCreationTime;
  }

  public void setOrderCreationTime(Long orderCreationTime) {
    this.orderCreationTime = orderCreationTime;
  }

  public BigDecimal getCumulativeQuoteQty() {
    return cumulativeQuoteQty;
  }

  public void setCumulativeQuoteQty(BigDecimal cumulativeQuoteQty) {
    this.cumulativeQuoteQty = cumulativeQuoteQty;
  }

  public BigDecimal getLastQuoteQty() {
    return lastQuoteQty;
  }

  public void setLastQuoteQty(BigDecimal lastQuoteQty) {
    this.lastQuoteQty = lastQuoteQty;
  }

  public BigDecimal getQuoteOrderQty() {
    return quoteOrderQty;
  }

  public void setQuoteOrderQty(BigDecimal quoteOrderQty) {
    this.quoteOrderQty = quoteOrderQty;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("eventType", eventType)
        .append("eventTime", eventTime)
        .append("symbol", symbol)
        .append("newClientOrderId", newClientOrderId)
        .append("side", side)
        .append("type", type)
        .append("timeInForce", timeInForce)
        .append("originalQuantity", originalQuantity)
        .append("price", price)
        .append("executionType", executionType)
        .append("orderStatus", orderStatus)
        .append("orderRejectReason", orderRejectReason)
        .append("orderId", orderId)
        .append("quantityLastFilledTrade", quantityLastFilledTrade)
        .append("accumulatedQuantity", accumulatedQuantity)
        .append("priceOfLastFilledTrade", priceOfLastFilledTrade)
        .append("commission", commission)
        .append("commissionAsset", commissionAsset)
        .append("orderTradeTime", orderTradeTime)
        .append("tradeId", tradeId)
        .append("orderCreationTime", orderCreationTime)
        .append("cumulativeQuoteQty", cumulativeQuoteQty)
        .append("lastQuoteQty", lastQuoteQty)
        .append("quoteOrderQty", quoteOrderQty)
        .toString();
  }
}
