package testdata;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;


public class DemoTestData  extends ExcelDataConfig {

    public DemoTestData() {
      super
              ("src\\test\\resources\\excelSheet\\Demo_Data.xlsx");
            }

    @DataProvider(name = "DemoLogin")
    public Object[][] DemoLogin() {

        int rows = getRowCount("Demo_Sheet");
        int col = getColumnCount("Demo_Sheet");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Demo_Sheet", i, j);
            }
        }
        return data;
    }

}
