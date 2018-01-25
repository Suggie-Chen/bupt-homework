/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

import java.awt.GridLayout;

import javax.swing.*;

/**
 *
 * @author YeWenting
 */
public class _2015211362_李楠轩_5_BuyUI extends javax.swing.JFrame {

    
    _2015211362_李楠轩_5_Controller controller = _2015211362_李楠轩_5_Controller.getInstance();
    _2015211362_李楠轩_5_ShoppingCartUI shoppingCartUI = new _2015211362_李楠轩_5_ShoppingCartUI();
    _2015211362_李楠轩_5_Sale sale = controller.getSale();
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bCancel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tNum;
    private javax.swing.JTable tBooks;
   // private JScrollPane jsp;
    public _2015211362_李楠轩_5_BuyUI()
    {
        sale.registerObserver(shoppingCartUI);
        initComponents();
    }

    private void updateRowData(javax.swing.JTable jBooks)
    {
        String[][] rowsData = controller.getAllBooksInfo();

        tBooks.setModel(new javax.swing.table.DefaultTableModel(
                rowsData,
                new String [] {
                        "ISBN", "书名", "类型", "单价", "优惠"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tBooks = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(450, 520));
        setLocationRelativeTo(getParent());

        updateRowData(tBooks);
        tBooks.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tBooks);

        jLabel5.setFont(new java.awt.Font("TimesRoman", 1, 48)); 
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("购买书籍");

        bAdd.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bAdd.setText("加入购物车");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bCancel.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bCancel.setText("退出");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("TimesRoman", 1, 18)); 
        jLabel2.setText("数量：");

        tNum.setFont(new java.awt.Font("TimesRoman", 0, 18)); 

        jLabel3.setFont(new java.awt.Font("TimesRoman", 1, 18)); 
        jLabel3.setText("点击以购买");

        jLabel4.setFont(new java.awt.Font("TimesRoman", 1, 18)); 
        jLabel4.setText("本");
        JPanel aJPanel=new JPanel();
        
        aJPanel.setLayout(new GridLayout(10, 10)); 
        aJPanel.add(jLabel3);
        aJPanel.add(jScrollPane1);
       
        aJPanel.add(jLabel2);
        aJPanel.add(tNum);
        aJPanel.add(bAdd);
        aJPanel.add(bCancel);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.add(aJPanel);
        this.pack();
        setTitle ("买书");
        setDefaultCloseOperation (DISPOSE_ON_CLOSE);
        setLocationRelativeTo (getParent ());
        setSize(500,850 );
    }

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {
        new _2015211362_李楠轩_5_MainUI().setVisible(true);
        shoppingCartUI.dispose();
        this.dispose();
    }

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            int bookIdx = tBooks.getSelectedRow();
            if (bookIdx < 0) throw new Exception("请点击书籍！");
            String ISBN = tBooks.getValueAt(bookIdx, 0).toString();
            int num = Integer.parseInt(tNum.getText());

            controller.buyBook(ISBN, num);
          //  JOptionPane.showMessageDialog(null, "成功！", "成功", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "失败", JOptionPane.ERROR_MESSAGE);
        }

    }

  
   
  
}
