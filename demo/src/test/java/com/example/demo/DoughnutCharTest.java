package com.example.demo;

import org.apache.poi.xddf.usermodel.chart.*;
import org.apache.poi.xssf.usermodel.*;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DoughnutCharTest {


    @Test
    public void testCreateMultiChartByData() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("testSheet");

        //创建一个画布
        XSSFDrawing drawing = sheet.createDrawingPatriarch();

        XSSFClientAnchor anchor = drawing.createAnchor(0, 0, 0, 0, 0, 4, 7, 20);
        //创建一个chart对象
        XSSFChart chart = drawing.createChart(anchor);

        //标题
        chart.setTitleText("地区排名");
        //标题是否覆盖图表
        chart.setTitleOverlay(false);

        XDDFChartLegend orAddLegend = chart.getOrAddLegend();
        orAddLegend.setPosition(LegendPosition.TOP_RIGHT);
        //分类轴标数据，
        XDDFCategoryDataSource xddfCategoryDataSource = XDDFDataSourcesFactory.fromArray(new String[]{"俄罗斯", "加拿大", "美国", "中国"});
        //数据
        XDDFNumericalDataSource<Integer> yValues = XDDFDataSourcesFactory.fromArray(new Integer[]{1, 2, 5, 2});

        XDDFCategoryAxis categoryAxis = chart.createCategoryAxis(AxisPosition.BOTTOM);
        XDDFValueAxis valueAxis = chart.createValueAxis(AxisPosition.LEFT);

        XDDFChartData data = chart.createData(ChartTypes.DOUGHNUT, categoryAxis, valueAxis);

        data.setVaryColors(true);

        XDDFChartData.Series series = data.addSeries(xddfCategoryDataSource, yValues);

        chart.plot(data);

        File file = new File("D:\\excelTest\\doughnut-chart.xlsx");
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(file);
            workbook.write(fout);
        } finally {
            if (fout != null) {
                fout.close();
            }
        }


    }
}
