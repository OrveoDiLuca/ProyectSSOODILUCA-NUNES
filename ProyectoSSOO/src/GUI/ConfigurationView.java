/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author juann
 */
public class ConfigurationView extends javax.swing.JPanel {

    /**
     * Creates new form ConfigurationView
     */
    public ConfigurationView() {
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

        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        minusWorkers = new javax.swing.JButton();
        plusWorkers = new javax.swing.JButton();
        minusMotherboard = new javax.swing.JButton();
        plusMotherboard = new javax.swing.JButton();
        minusCPU = new javax.swing.JButton();
        plusCPU = new javax.swing.JButton();
        minusRAM = new javax.swing.JButton();
        plusRAM = new javax.swing.JButton();
        minusPowerSupply = new javax.swing.JButton();
        plusPowerSupply = new javax.swing.JButton();
        minusGPU = new javax.swing.JButton();
        plusGPU = new javax.swing.JButton();
        minusAssemblers = new javax.swing.JButton();
        plusAssemblers = new javax.swing.JButton();
        numWorkers = new javax.swing.JLabel();
        workersMotherboards = new javax.swing.JLabel();
        workersCPU = new javax.swing.JLabel();
        workersRAM = new javax.swing.JLabel();
        workersPowerSupply = new javax.swing.JLabel();
        workersGPU = new javax.swing.JLabel();
        numAssemblers = new javax.swing.JLabel();
        daysDuration = new javax.swing.JTextField();
        saveConfiguration = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(204, 204, 204));
        content.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        content.setPreferredSize(new java.awt.Dimension(800, 450));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nro Trabajadores");
        content.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel2.setText("Productores de CPU");
        content.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel3.setText("Productores de Placas base");
        content.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel4.setText("Productores de RAM");
        content.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel5.setText("Productores de fuentes de alimentacion");
        content.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel6.setText("Productores de GPU");
        content.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel7.setText("Ensambladores");
        content.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jLabel8.setText("Duracion de un dia");
        content.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        minusWorkers.setText("-");
        minusWorkers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusWorkersActionPerformed(evt);
            }
        });
        content.add(minusWorkers, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        plusWorkers.setText("+");
        plusWorkers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusWorkersActionPerformed(evt);
            }
        });
        content.add(plusWorkers, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        minusMotherboard.setText("-");
        minusMotherboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusMotherboardActionPerformed(evt);
            }
        });
        content.add(minusMotherboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        plusMotherboard.setText("+");
        plusMotherboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusMotherboardActionPerformed(evt);
            }
        });
        content.add(plusMotherboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        minusCPU.setText("-");
        minusCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusCPUActionPerformed(evt);
            }
        });
        content.add(minusCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        plusCPU.setText("+");
        plusCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusCPUActionPerformed(evt);
            }
        });
        content.add(plusCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        minusRAM.setText("-");
        minusRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusRAMActionPerformed(evt);
            }
        });
        content.add(minusRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        plusRAM.setText("+");
        plusRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusRAMActionPerformed(evt);
            }
        });
        content.add(plusRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        minusPowerSupply.setText("-");
        minusPowerSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusPowerSupplyActionPerformed(evt);
            }
        });
        content.add(minusPowerSupply, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        plusPowerSupply.setText("+");
        plusPowerSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusPowerSupplyActionPerformed(evt);
            }
        });
        content.add(plusPowerSupply, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        minusGPU.setText("-");
        minusGPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusGPUActionPerformed(evt);
            }
        });
        content.add(minusGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        plusGPU.setText("+");
        plusGPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusGPUActionPerformed(evt);
            }
        });
        content.add(plusGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        minusAssemblers.setText("-");
        minusAssemblers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusAssemblersActionPerformed(evt);
            }
        });
        content.add(minusAssemblers, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        plusAssemblers.setText("+");
        plusAssemblers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusAssemblersActionPerformed(evt);
            }
        });
        content.add(plusAssemblers, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        numWorkers.setText("0");
        content.add(numWorkers, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 20, -1));

        workersMotherboards.setText("0");
        content.add(workersMotherboards, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 20, -1));

        workersCPU.setText("0");
        content.add(workersCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 20, -1));

        workersRAM.setText("0");
        content.add(workersRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 20, -1));

        workersPowerSupply.setText("0");
        content.add(workersPowerSupply, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 20, -1));

        workersGPU.setText("0");
        content.add(workersGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 20, -1));

        numAssemblers.setText("0");
        content.add(numAssemblers, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 20, -1));
        content.add(daysDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 150, -1));

        saveConfiguration.setText("Guardar");
        content.add(saveConfiguration, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jLabel9.setText("Configuracion");
        content.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void minusWorkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusWorkersActionPerformed
        int num = Integer.parseInt(numWorkers.getText());
        if(num != 0){
            num--;
            numWorkers.setText(Integer.toString(num));
        }
    }//GEN-LAST:event_minusWorkersActionPerformed

    private void plusWorkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusWorkersActionPerformed
        int num = Integer.parseInt(numWorkers.getText());        
        num++;
        numWorkers.setText(Integer.toString(num));     
    }//GEN-LAST:event_plusWorkersActionPerformed

    private void minusMotherboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusMotherboardActionPerformed
        int num = Integer.parseInt(workersMotherboards.getText());
        if(num != 0){
            num--;
            workersMotherboards.setText(Integer.toString(num));
        }
    }//GEN-LAST:event_minusMotherboardActionPerformed

    private void plusMotherboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusMotherboardActionPerformed
        int num = Integer.parseInt(workersMotherboards.getText());        
        num++;
        workersMotherboards.setText(Integer.toString(num)); 
    }//GEN-LAST:event_plusMotherboardActionPerformed

    private void minusCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusCPUActionPerformed
        int num = Integer.parseInt(workersCPU.getText());
        if(num != 0){
            num--;
            workersCPU.setText(Integer.toString(num));
        }
    }//GEN-LAST:event_minusCPUActionPerformed

    private void plusCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusCPUActionPerformed
        int num = Integer.parseInt(workersCPU.getText());        
        num++;
        workersCPU.setText(Integer.toString(num)); 
    }//GEN-LAST:event_plusCPUActionPerformed

    private void minusRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusRAMActionPerformed
        int num = Integer.parseInt(workersRAM.getText());
        if(num != 0){
            num--;
            workersRAM.setText(Integer.toString(num));
        }
    }//GEN-LAST:event_minusRAMActionPerformed

    private void plusRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusRAMActionPerformed
        int num = Integer.parseInt(workersRAM.getText());        
        num++;
        workersRAM.setText(Integer.toString(num)); 
    }//GEN-LAST:event_plusRAMActionPerformed

    private void minusPowerSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusPowerSupplyActionPerformed
        int num = Integer.parseInt(workersPowerSupply.getText());
        if(num != 0){
            num--;
            workersPowerSupply.setText(Integer.toString(num));
        }
    }//GEN-LAST:event_minusPowerSupplyActionPerformed

    private void plusPowerSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusPowerSupplyActionPerformed
        int num = Integer.parseInt(workersPowerSupply.getText());        
        num++;
        workersPowerSupply.setText(Integer.toString(num)); 
    }//GEN-LAST:event_plusPowerSupplyActionPerformed

    private void minusGPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusGPUActionPerformed
        int num = Integer.parseInt(workersGPU.getText());
        if(num != 0){
            num--;
            workersGPU.setText(Integer.toString(num));
        }
    }//GEN-LAST:event_minusGPUActionPerformed

    private void plusGPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusGPUActionPerformed
        int num = Integer.parseInt(workersGPU.getText());        
        num++;
        workersGPU.setText(Integer.toString(num)); 
    }//GEN-LAST:event_plusGPUActionPerformed

    private void minusAssemblersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusAssemblersActionPerformed
        int num = Integer.parseInt(numAssemblers.getText());
        if(num != 0){
            num--;
            numAssemblers.setText(Integer.toString(num));
        }
    }//GEN-LAST:event_minusAssemblersActionPerformed

    private void plusAssemblersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusAssemblersActionPerformed
        int num = Integer.parseInt(numAssemblers.getText());        
        num++;
        numAssemblers.setText(Integer.toString(num)); 
    }//GEN-LAST:event_plusAssemblersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JTextField daysDuration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton minusAssemblers;
    private javax.swing.JButton minusCPU;
    private javax.swing.JButton minusGPU;
    private javax.swing.JButton minusMotherboard;
    private javax.swing.JButton minusPowerSupply;
    private javax.swing.JButton minusRAM;
    private javax.swing.JButton minusWorkers;
    private javax.swing.JLabel numAssemblers;
    private javax.swing.JLabel numWorkers;
    private javax.swing.JButton plusAssemblers;
    private javax.swing.JButton plusCPU;
    private javax.swing.JButton plusGPU;
    private javax.swing.JButton plusMotherboard;
    private javax.swing.JButton plusPowerSupply;
    private javax.swing.JButton plusRAM;
    private javax.swing.JButton plusWorkers;
    private javax.swing.JButton saveConfiguration;
    private javax.swing.JLabel workersCPU;
    private javax.swing.JLabel workersGPU;
    private javax.swing.JLabel workersMotherboards;
    private javax.swing.JLabel workersPowerSupply;
    private javax.swing.JLabel workersRAM;
    // End of variables declaration//GEN-END:variables
}
