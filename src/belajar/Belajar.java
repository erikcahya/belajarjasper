/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

import java.io.File;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author erik
 */
public class Belajar {
    
    
    
    /**
     * menampilkan berdasarkan nama file
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         report("erik",100);
         
         /**
          * untuk memanggil hasil report jasper yang ada di file jasper
          */
//         public static void main(String[] args) {
//        DBConnection connection = new DBConnection();
//
//        try {
//            String namafile = "src/day1/report1.jasper";
//            File report = new File(namafile);
//            JasperReport jr = (JasperReport) JRLoader.loadObject(report);
//            JasperPrint jp = JasperFillManager.fillReport(jr, null, connection.getConnection());
//            JasperViewer.viewReport(jp, false);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Gagal");
//        }
//    }
    }
/**
 * menampilkan berdasarkan nama file
 */
//    public static void report(String namafile) {
//        DBConnection connection = new DBConnection();
//        try {
//            
//            String namafile1 = "src/"+namafile+".jasper" ;
//            File report = new File(namafile);
//            JasperReport jr = (JasperReport) JRLoader.loadObject(report);
////            HashMap parameter = new HashMap();
////            parameter.clear();
////        parameter.put("kecamatan",report.getText());
//            JasperPrint jp = JasperFillManager.fillReport(jr, null, connection.getConnection());
//            JasperViewer.viewReport(jp, false);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Gagal");
//        }
//}
    /**
     * fungsi report berdasarkan dimana nama file yang akan di panggil bisa di sesuaikan sesuai parameter yang dipanggil
     * @param namafile 
     */
//   public static void report(String namafile) {
//        DBConnection connection = new DBConnection();
//        try {
//            
//            String namafile1 = "src/"+namafile+".jasper" ;
//            File report = new File(namafile);
//            JasperReport jr = (JasperReport) JRLoader.loadObject(report);
////            HashMap parameter = new HashMap();
////            parameter.clear();
////        parameter.put("kecamatan",report.getText());
//            JasperPrint jp = JasperFillManager.fillReport(jr, null, connection.getConnection());
//            JasperViewer.viewReport(jp, false);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Gagal");
//        }
//}
 
   /**
    * fungsi report berdasarkan dimana nama file yang akan di panggil bisa di sesuaikan sesuai parameter yang dipanggil dan juga ada tambahan bisa disesuaikan query nya
    * @param file
    * @param employee_id 
    */
   static void report(String file, int employee_id) {
        DBConnection connection = new DBConnection();

        try {
            String namafile = "src/" + file + ".jasper";
            File report = new File(namafile);
            JasperReport jr = (JasperReport) JRLoader.loadObject(report);
            HashMap parameter = new HashMap();
            parameter.put("employee_id", employee_id);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameter, connection.getConnection());
            JasperViewer.viewReport(jp);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }
    }

    

}    

