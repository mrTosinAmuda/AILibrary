/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author Tosin Amuda
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                MainFrame.this.setVisible(false);
                MainFrame.this.dispose();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuUninformedSearch = new javax.swing.JMenu();
        jMenuItemDFS = new javax.swing.JMenuItem();
        jMenuItemDLS = new javax.swing.JMenuItem();
        jMenuItemIDS = new javax.swing.JMenuItem();
        jMenuItemBFS = new javax.swing.JMenuItem();
        jMenuItemBID = new javax.swing.JMenuItem();
        jMenuItemUCS = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemTowerOfHanoi = new javax.swing.JMenuItem();
        jMenuInformedSearch = new javax.swing.JMenu();
        jMenuItemBestFirstSearch = new javax.swing.JMenuItem();
        jMenuItemHillClimbing = new javax.swing.JMenuItem();
        jMenuItemSimulatedAnnealing = new javax.swing.JMenuItem();
        jMenuMachineLearning = new javax.swing.JMenu();
        jMenuANN = new javax.swing.JMenu();
        jMenuSupervizedANN = new javax.swing.JMenu();
        jMenuItemPerceptron = new javax.swing.JMenuItem();
        jMenuUnsupervizedANN = new javax.swing.JMenu();
        jMenuEvolutionaryComputation = new javax.swing.JMenu();
        jMenuItemGeneticAlgorithm = new javax.swing.JMenuItem();
        jMenuSwarmAlgorithm = new javax.swing.JMenu();
        jMenuWindow = new javax.swing.JMenu();
        jMenuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuUninformedSearch.setText("Uninformed Search");

        jMenuItemDFS.setText("Depth-First Search (DFS)");
        jMenuItemDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDFSActionPerformed(evt);
            }
        });
        jMenuUninformedSearch.add(jMenuItemDFS);

        jMenuItemDLS.setText("Depth-Limited Search (DLS)");
        jMenuItemDLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDLSActionPerformed(evt);
            }
        });
        jMenuUninformedSearch.add(jMenuItemDLS);

        jMenuItemIDS.setText("Iterative Deepening Search (IDS)");
        jMenuItemIDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIDSActionPerformed(evt);
            }
        });
        jMenuUninformedSearch.add(jMenuItemIDS);

        jMenuItemBFS.setText("Breadth-First Search (BFS)");
        jMenuItemBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBFSActionPerformed(evt);
            }
        });
        jMenuUninformedSearch.add(jMenuItemBFS);

        jMenuItemBID.setText("Bidirectional Search (BID)");
        jMenuItemBID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBIDActionPerformed(evt);
            }
        });
        jMenuUninformedSearch.add(jMenuItemBID);

        jMenuItemUCS.setText("Uniform-Cost Search(UCS)");
        jMenuItemUCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUCSActionPerformed(evt);
            }
        });
        jMenuUninformedSearch.add(jMenuItemUCS);
        jMenuUninformedSearch.add(jSeparator1);

        jMenuItemTowerOfHanoi.setText("Tower of Hanoi");
        jMenuUninformedSearch.add(jMenuItemTowerOfHanoi);

        jMenuBar1.add(jMenuUninformedSearch);

        jMenuInformedSearch.setText("Informed Search");

        jMenuItemBestFirstSearch.setText("Best First Search");
        jMenuInformedSearch.add(jMenuItemBestFirstSearch);

        jMenuItemHillClimbing.setText("Hill Climbing");
        jMenuItemHillClimbing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHillClimbingActionPerformed(evt);
            }
        });
        jMenuInformedSearch.add(jMenuItemHillClimbing);

        jMenuItemSimulatedAnnealing.setText("Simulated Annealing");
        jMenuInformedSearch.add(jMenuItemSimulatedAnnealing);

        jMenuBar1.add(jMenuInformedSearch);

        jMenuMachineLearning.setText("Machine Learning");
        jMenuBar1.add(jMenuMachineLearning);

        jMenuANN.setText("Artificial Neural Network");

        jMenuSupervizedANN.setText("Supervized ANN");

        jMenuItemPerceptron.setText("Single Layer Perceptron");
        jMenuItemPerceptron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPerceptronActionPerformed(evt);
            }
        });
        jMenuSupervizedANN.add(jMenuItemPerceptron);

        jMenuANN.add(jMenuSupervizedANN);

        jMenuUnsupervizedANN.setText("Unsupervized ANN");
        jMenuANN.add(jMenuUnsupervizedANN);

        jMenuBar1.add(jMenuANN);

        jMenuEvolutionaryComputation.setText("Evolutionary Computation");
        jMenuEvolutionaryComputation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEvolutionaryComputationActionPerformed(evt);
            }
        });

        jMenuItemGeneticAlgorithm.setText("Genetic Algorithm");
        jMenuItemGeneticAlgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGeneticAlgorithmActionPerformed(evt);
            }
        });
        jMenuEvolutionaryComputation.add(jMenuItemGeneticAlgorithm);

        jMenuBar1.add(jMenuEvolutionaryComputation);

        jMenuSwarmAlgorithm.setText("Swarm Algorithm");
        jMenuBar1.add(jMenuSwarmAlgorithm);

        jMenuWindow.setText("Window");
        jMenuBar1.add(jMenuWindow);

        jMenuHelp.setText("Help");
        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 871, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemIDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIDSActionPerformed
        // TODO add your handling code here:
        this.setContentPane(new IDSVisualize());
        this.repaint();
        this.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItemIDSActionPerformed

    private void jMenuItemBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBFSActionPerformed
        // TODO add your handling code here:
        this.setContentPane(new BFSVisualize());
        this.repaint();
        this.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItemBFSActionPerformed

    private void jMenuItemUCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUCSActionPerformed
        // TODO add your handling code here:
        this.setContentPane(new UCSVisualize());
        this.repaint();
        this.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItemUCSActionPerformed

    private void jMenuItemHillClimbingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHillClimbingActionPerformed
        // TODO add your handling code here:
        this.setContentPane(new HillClimbingUI());
        this.repaint();
        this.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItemHillClimbingActionPerformed

    private void jMenuItemPerceptronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPerceptronActionPerformed
        // TODO add your handling code here:
        this.setContentPane(new SingleLayerPerceptronUI());
        this.repaint();
        this.setVisible(rootPaneCheckingEnabled);

    }//GEN-LAST:event_jMenuItemPerceptronActionPerformed

    private void jMenuItemDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDFSActionPerformed
        // TODO add your handling code here:
        this.setContentPane(new DFSVisualize());
        this.repaint();
        this.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItemDFSActionPerformed

    private void jMenuItemBIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBIDActionPerformed
        // TODO add your handling code here:
        this.setContentPane(new BIDIVisualize());
        this.repaint();
        this.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItemBIDActionPerformed

    private void jMenuItemDLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDLSActionPerformed
        // TODO add your handling code here:
        this.setContentPane(new DLSVisualize());
        this.repaint();
        this.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItemDLSActionPerformed

    private void jMenuEvolutionaryComputationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEvolutionaryComputationActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuEvolutionaryComputationActionPerformed

    private void jMenuItemGeneticAlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGeneticAlgorithmActionPerformed
        // TODO add your handling code here:
        this.setContentPane(new GeneticAlgorithm());
        this.repaint();
        this.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItemGeneticAlgorithmActionPerformed

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
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }

            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mainframe = new MainFrame();
                mainframe.setContentPane(new LandingPanel());
                mainframe.setLocation(300, 10);
                mainframe.setSize(900, 700);
                mainframe.setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuANN;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEvolutionaryComputation;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenu jMenuInformedSearch;
    private javax.swing.JMenuItem jMenuItemBFS;
    private javax.swing.JMenuItem jMenuItemBID;
    private javax.swing.JMenuItem jMenuItemBestFirstSearch;
    private javax.swing.JMenuItem jMenuItemDFS;
    private javax.swing.JMenuItem jMenuItemDLS;
    private javax.swing.JMenuItem jMenuItemGeneticAlgorithm;
    private javax.swing.JMenuItem jMenuItemHillClimbing;
    private javax.swing.JMenuItem jMenuItemIDS;
    private javax.swing.JMenuItem jMenuItemPerceptron;
    private javax.swing.JMenuItem jMenuItemSimulatedAnnealing;
    private javax.swing.JMenuItem jMenuItemTowerOfHanoi;
    private javax.swing.JMenuItem jMenuItemUCS;
    private javax.swing.JMenu jMenuMachineLearning;
    private javax.swing.JMenu jMenuSupervizedANN;
    private javax.swing.JMenu jMenuSwarmAlgorithm;
    private javax.swing.JMenu jMenuUninformedSearch;
    private javax.swing.JMenu jMenuUnsupervizedANN;
    private javax.swing.JMenu jMenuWindow;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
