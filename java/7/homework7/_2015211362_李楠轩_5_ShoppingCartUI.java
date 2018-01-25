
package homework7;

import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class _2015211362_�����_5_ShoppingCartUI extends javax.swing.JFrame implements _2015211362_�����_5_Observer {

	private javax.swing.JButton bCancel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tCart;
    private javax.swing.JLabel tTotal;
	public _2015211362_�����_5_ShoppingCartUI()
    {
        initComponents();
    }

    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCart = new javax.swing.JTable();
        tTotal = new javax.swing.JLabel();
        bCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(0, size.height / 2 - 300);

        jLabel5.setFont(new java.awt.Font("TimesRoman", 1, 48)); 
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("���ﳵ");

        tCart.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); 
        tCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "����", "����", "ԭ��", "����"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tCart);

        tTotal.setFont(new java.awt.Font("TimesRoman", 1, 18)); 
        tTotal.setText("�ܼƣ�");

        bCancel.setFont(new java.awt.Font("TimesRoman", 0, 13)); 
        bCancel.setText("����");
        bCancel.setActionCommand("");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });
        JPanel aJPanel=new JPanel();
        
        aJPanel.setLayout(new GridLayout(10, 10));
        aJPanel.add(jScrollPane1);  
        aJPanel.add(tTotal);
        aJPanel.add(bCancel);	
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.add(aJPanel);
        setTitle ("����");
        setDefaultCloseOperation (DISPOSE_ON_CLOSE);
        setLocationRelativeTo (getParent ());
     //   setSize(600,400 );
       // pack();
        pack();
    }

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    public void update(_2015211362_�����_5_Sale sale)
    {
        String[][] rowsData = sale.getCartInfo();
        double totalCost = sale.getTotal();

        tCart.setModel(new javax.swing.table.DefaultTableModel(rowsData,
                new String [] {
                        "����", "����", "ԭ��", "����"
                }));
        tTotal.setText("�ܼۣ� " + String.valueOf(totalCost));
        this.setVisible(true);
    }

  
    
   
}
