package Barchart;


import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman Al Hafizh
 */
public class BarChart extends javax.swing.JFrame {
    /**
     * Creates new form BarChart
     */
    public BarChart() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = createBarChartPanel1();
        jPanel2 = createBarChartPanel2();
        jPanel3 = createBarChartPanel3();
        jPanel4 = createPieChartPanel1();
        jPanel5 = createPieChartPanel2();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Bar Chart
    public static JPanel createBarChartPanel1(){
        DefaultCategoryDataset barDataset = new DefaultCategoryDataset();
        List<data> daftar = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            data e = new data();
            e.setInfo(10);
            e.setTitle("eee" + i);
            daftar.add(i, e);
        }
        
        for (int i = 0; i < daftar.size(); i++) {
            barDataset.setValue(daftar.get(i).getInfo(), "", daftar.get(i).getTitle());
        }
        
        JFreeChart chart = ChartFactory.createBarChart3D("Kost Berdasarkan Kecamatan", "Kecamatan", "Jumlah", barDataset, PlotOrientation.VERTICAL, true, true, false);
        
        return new ChartPanel(chart);
    }
    
    public static JPanel createBarChartPanel2(){
        DefaultCategoryDataset barDataset = new DefaultCategoryDataset();
        List<data> daftar = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            data e = new data();
            e.setInfo(10);
            e.setTitle("eee" + i);
            daftar.add(i, e);
        }
        
        for (int i = 0; i < daftar.size(); i++) {
            barDataset.setValue(daftar.get(i).getInfo(), "", daftar.get(i).getTitle());
        }
        
        JFreeChart chart = ChartFactory.createBarChart3D("Kost Berdasarkan Kecamatan", "Kecamatan", "Jumlah", barDataset, PlotOrientation.VERTICAL, true, true, false);
        
        return new ChartPanel(chart);
    }
    
    public static JPanel createBarChartPanel3(){
        DefaultCategoryDataset barDataset = new DefaultCategoryDataset();
        List<data> daftar = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            data e = new data();
            e.setInfo(10);
            e.setTitle("eee" + i);
            daftar.add(i, e);
        }
        
        for (int i = 0; i < daftar.size(); i++) {
            barDataset.setValue(daftar.get(i).getInfo(), "", daftar.get(i).getTitle());
        }
        
        JFreeChart chart = ChartFactory.createBarChart3D("Kost Berdasarkan Kecamatan", "Kecamatan", "Jumlah", barDataset, PlotOrientation.VERTICAL, true, true, false);
        
        return new ChartPanel(chart);
    }

    // Pie Chart
    public static JPanel createPieChartPanel1(){
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        List<data> daftar = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            data e = new data();
            e.setInfo(10);
            e.setTitle("eee" + i);
            daftar.add(i, e);
        }
        
        for (int i = 0; i < daftar.size(); i++) {
            pieDataset.setValue(daftar.get(i).getTitle(), daftar.get(i).getInfo());
        }
        JFreeChart chart = ChartFactory.createPieChart3D("Kost Berdasarkan Gender", pieDataset, true, true, true);
        
        return new ChartPanel(chart);
    }
    
    public static JPanel createPieChartPanel2(){
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        List<data> daftar = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            data e = new data();
            e.setInfo(10);
            e.setTitle("eee" + i);
            daftar.add(i, e);
        }
        
        for (int i = 0; i < daftar.size(); i++) {
            pieDataset.setValue(daftar.get(i).getTitle(), daftar.get(i).getInfo());
        }
        JFreeChart chart = ChartFactory.createPieChart3D("Kost Berdasarkan Range Harga", pieDataset, true, true, true);
        
        return new ChartPanel(chart);
    }
    
        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BarChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarChart().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
