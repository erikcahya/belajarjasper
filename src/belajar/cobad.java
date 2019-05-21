/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;
import java.io.IOException;
import java.util.HashMap;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
/**
 *
 * @author erik
 */
public class cobad {
    

// Java Program To Call Jasper Report

  public static void main(String[] args) throws JRException, IOException {
   
    JasperReport jasperReport = JasperCompileManager.compileReport("contoh.jrxml");
    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,new HashMap(), new JREmptyDataSource());
    JasperExportManager.exportReportToPdfFile(jasperPrint, "contoh.pdf");
  }
}
    

