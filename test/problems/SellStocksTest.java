package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solutions.DailySolutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static assets.AppConstants.MATCHING_METHOD_DISPLAY;
import static assets.AppConstants.STOCK_ARRAY;


class SellStocksTest {

    @Test
    @DisplayName("Calculate the correct maximum profit")
    void runSellStocksSolution() {
        assertEquals(5, SellStocks.runSellStocksSolution(STOCK_ARRAY));
    }

    @Test
    @DisplayName(MATCHING_METHOD_DISPLAY)
    void runMatchingSellStockMethods() {
        assertEquals(SellStocks.runSellStocksSolution(STOCK_ARRAY), DailySolutions.runSellStocks(STOCK_ARRAY));
    }
}