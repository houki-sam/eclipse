

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class Sample {

    public static void aaa() {

        Map<String, Object> parameters = getParams();
        try {
            File jrxmlFile = new File("src/chocobanana/sample.jrxml");
            JasperReport report = JasperCompileManager.compileReport(jrxmlFile.getAbsolutePath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
            JasperExportManager.exportReportToPdfFile(jasperPrint, "receipt.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("終了しました");

    }

    /**
     * PDF出力の際に使用するパラメータを取得
     *
     * @return
     */
    private static Map<String, Object> getParams() {
        Map<String, Object> params = new HashMap<>();

        params.put("name", "ウィズテクノロジー");
        params.put("amount", new BigDecimal(1000000));
        params.put("remarks", "保守費用");
        params.put("paymentDate", new Date());
        params.put("paymentTypeName", "現金");

        return params;
    }

}