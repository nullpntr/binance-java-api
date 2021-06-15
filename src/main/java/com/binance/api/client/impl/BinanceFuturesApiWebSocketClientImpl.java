package com.binance.api.client.impl;

import com.binance.api.client.BinanceApiCallback;
import com.binance.api.client.BinanceFuturesApiWebSocketClient;
import com.binance.api.client.config.BinanceApiConfig;
import com.binance.api.client.domain.event.BookTickerEvent;
import java.io.Closeable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;

/**
 * Binance API WebSocket client implementation using OkHttp.
 */
public class BinanceFuturesApiWebSocketClientImpl
    implements BinanceFuturesApiWebSocketClient, Closeable {

  private final OkHttpClient client;

  public BinanceFuturesApiWebSocketClientImpl(OkHttpClient client) {
    this.client = client;
  }

  @Override
  public Closeable onBookTickerEvent(String symbol, BinanceApiCallback<BookTickerEvent> callback) {
    final String channel = String.format("%s@bookTicker", symbol);
    return createNewWebSocket(
        channel, new BinanceApiWebSocketListener<>(callback, BookTickerEvent.class));
  }

  /**
   * @deprecated This method is no longer functional. Please use the returned {@link Closeable} from
   * any of the other methods to close the web socket.
   */
  @Override
  public void close() {
  }

  private Closeable createNewWebSocket(String channel, BinanceApiWebSocketListener<?> listener) {
    String streamingUrl =
        String.format("%s/%s", BinanceApiConfig.getFuturesStreamApiBaseUrl(), channel);
    Request request = new Request.Builder().url(streamingUrl).build();
    final WebSocket webSocket = client.newWebSocket(request, listener);
    return () -> {
      final int code = 1000;
      listener.onClosing(webSocket, code, null);
      webSocket.close(code, null);
      listener.onClosed(webSocket, code, null);
    };
  }
}
