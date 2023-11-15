package solutions;

import assets.AppConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellStocksTest {

    @Test
    @DisplayName("Calculate the correct maximum profit")
    void runSellStocksSolution() {
        assertEquals(5, SellStocks.runSellStocksSolution(AppConstants.STOCK_ARRAY));
    }
}