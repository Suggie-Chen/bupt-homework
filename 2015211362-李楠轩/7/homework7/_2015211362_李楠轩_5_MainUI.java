
package homework7;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.GridLayout;
public class _2015211362_李楠轩_5_MainUI extends javax.swing.JFrame {

		private javax.swing.JButton bBook;
	    private javax.swing.JButton bBuy;
	    private javax.swing.JButton bExit;
	    private javax.swing.JButton bStrategy;
	    private javax.swing.JLabel jLabel1;
	  //  private javax.swing.JLabel jLabel5;
	_2015211362_李楠轩_5_Controller controller = _2015211362_李楠轩_5_Controller.getInstance();
    public _2015211362_李楠轩_5_MainUI() {

        initComponents();
        setVisible(true);
  

    }
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

   
        bStrategy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bBook = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        bBuy = new javax.swing.JButton();
       
        
        

        jLabel1.setFont(new java.awt.Font("TimesRoman", 1, 13));
        jLabel1.setText("策略编号：");
        jLabel1.setSize(new java.awt.Dimension(0, 80));
      
        setSize(new java.awt.Dimension(450, 520));
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(size.width / 2 - 300, size.height / 2 - 300);

        bStrategy.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bStrategy.setText("策略");
        bStrategy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStrategyActionPerformed(evt);
            }
        });


        bBook.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bBook.setText("添书");
        bBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBookActionPerformed(evt);
            }
        });

        bExit.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bExit.setText("退出");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        bBuy.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bBuy.setText("买书");
        bBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuyActionPerformed(evt);
            }
        });
        JPanel aJPanel=new JPanel();
        aJPanel.setLayout(new GridLayout(2, 10)); 
        aJPanel.add(bBook);
        aJPanel.add(bStrategy);
        aJPanel.add(bBuy);
       aJPanel.add( bExit);
    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.add(aJPanel);
        setTitle ("book store");
        setDefaultCloseOperation (DISPOSE_ON_CLOSE);
        setLocationRelativeTo (getParent ());
        setSize(500,500 );
        //pack();
    }

    private void bBookActionPerformed(java.awt.event.ActionEvent evt) {
        new _2015211362_李楠轩_5_AddBookUI().setVisible(true);
        dispose();
    }

    private void bStrategyActionPerformed(java.awt.event.ActionEvent evt) {
        new _2015211362_李楠轩_5_StrategiesUI().setVisible(true);
        dispose();
    }

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void bBuyActionPerformed(java.awt.event.ActionEvent evt) {
        new _2015211362_李楠轩_5_BuyUI().setVisible(true);
        dispose();
    }

    
    public static void main(String args[]) {

       try {
    	   //设定皮肤
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("gtk".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(_2015211362_李楠轩_5_MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_2015211362_李楠轩_5_MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_2015211362_李楠轩_5_MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_2015211362_李楠轩_5_MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _2015211362_李楠轩_5_MainUI();
            }
        });
    }

}
