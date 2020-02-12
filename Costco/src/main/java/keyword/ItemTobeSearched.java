
package keyword;
import base.CommonAPI;
import utility.DataReader;
import java.io.IOException;

public class ItemTobeSearched extends CommonAPI {


    DataReader dr = new DataReader();

    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"/excelFile/drivenFile.xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = System.getProperty("user.dir")+"/excelFile/drivenFile.xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }
}
