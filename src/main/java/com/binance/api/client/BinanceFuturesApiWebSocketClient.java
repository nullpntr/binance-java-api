package com.binance.api.client;

import com.binance.api.client.domain.event.BookTickerEvent;
import java.io.Closeable;

/** Binance API data streaming facade, supporting streaming of events through web sockets. */
public interface BinanceFuturesApiWebSocketClient extends Closeable {

  Closeable onBookTickerEvent(String symbol, BinanceApiCallback<BookTickerEvent> callback);

  /**
   * @deprecated This method is no longer functional. Please use the returned {@link Closeable} from
   *     any of the other methods to close the web socket.
   */
  @Deprecated
  void close();
}
