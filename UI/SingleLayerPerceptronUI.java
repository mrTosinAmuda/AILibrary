/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.ANN.SingleLayerPerceptron;
import Model.ANN.TrainingData;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

/**
 *
 * @author tosinamuda
 */
public class SingleLayerPerceptronUI extends javax.swing.JPanel {

    /**
     * Creates new form SingleLayerPerceptronUI
     */
    public SingleLayerPerceptronUI() {
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

        jLabelLearningRate = new javax.swing.JLabel();
        jButtonSolve = new javax.swing.JButton();
        jTextFieldLearningRate = new javax.swing.JTextField();
        jComboBoxChooseProblem = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOutput = new javax.swing.JTextArea();

        jLabelLearningRate.setText("Learning Rate (Alpha)");

        jButtonSolve.setText("Solve");
        jButtonSolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolveActionPerformed(evt);
            }
        });

        jComboBoxChooseProblem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OR", "AND", "XOR", " " }));

        jLabel1.setText("Choose a Problem");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextAreaOutput.setColumns(20);
        jTextAreaOutput.setRows(5);
        jScrollPane1.setViewportView(jTextAreaOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSolve)
                    .addComponent(jLabelLearningRate)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldLearningRate)
                        .addComponent(jComboBoxChooseProblem, 0, 225, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabelLearningRate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLearningRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxChooseProblem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButtonSolve)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolveActionPerformed
        // TODO add your handling code here:
		jTextAreaOutput.setText("");
        double alpha = Double.parseDouble(jTextFieldLearningRate.getText());
        int index = jComboBoxChooseProblem.getSelectedIndex();
        SingleLayerPerceptron SLP = null;
      Task t;
        switch(index)
        {
            case 0:
                 SLP = new SingleLayerPerceptron(alpha, TrainingData.createORDataSet());
                 break;
            case 1:
                SLP = new SingleLayerPerceptron(alpha, TrainingData.createANDDataSet());
                break;
            case 2:
                SLP = new SingleLayerPerceptron(alpha, TrainingData.createXORDataSet());
                break;
            default:
                break;
        }
        t = new Task(SLP, this.jTextAreaOutput);
        t.execute();
        
    }//GEN-LAST:event_jButtonSolveActionPerformed

   public static void main(String [] args)
    {
        SingleLayerPerceptronUI drawNode = new SingleLayerPerceptronUI();
        
        JFrame frame = new JFrame();
        frame.add(drawNode);
        frame.setSize(200, 400);
        frame.setVisible(true);
        frame.pack();
    }
   
   class Task extends SwingWorker<String, Void>
   {
       private SingleLayerPerceptron SLP;
       private JTextArea jTextArea;
       
       Task(SingleLayerPerceptron SLP, JTextArea jTextOutput)
       {
           this.SLP = SLP;
           this.jTextArea = jTextOutput;
       }
       
       

        @Override
        protected String doInBackground() throws Exception {
            this.SLP.Train();
            return this.SLP.ToString();
        }
        
      
         
         
             
    @Override
    protected void done() {
        String text = null;
        try {
            text = get();
        } catch (Exception ignore) {
            ignore.printStackTrace();
            text = "Single Layer Perceptron Error";
        }
        this.jTextArea.setText(text);
        
    }
        
   }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSolve;
    private javax.swing.JComboBox jComboBoxChooseProblem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLearningRate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaOutput;
    private javax.swing.JTextField jTextFieldLearningRate;
    // End of variables declaration//GEN-END:variables
}
