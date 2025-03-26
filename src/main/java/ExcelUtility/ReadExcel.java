package ExcelUtility;

import java.io.IOException;

public interface ReadExcel {

    public String GetReadFile(int sheet,int row,int col) throws IOException;
}
