
package homework7;

import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class _2015211362_李楠轩_5_StrategiesUI extends javax.swing.JFrame {

    //效果是适用之前已经定义好的controller
    _2015211362_李楠轩_5_Controller controller = _2015211362_李楠轩_5_Controller.getInstance();
    private javax.swing.JButton bAdd1;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bReload;
    private javax.swing.JButton bUpdate;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tStrategies;
    public _2015211362_李楠轩_5_StrategiesUI() {
        initComponents();
    }

    private void updateRowData(javax.swing.JTable tStrategies)
    {
        String[][] rowsData = controller.getAllStrategiesInfo();
    
        tStrategies.setModel(new javax.swing.table.DefaultTableModel(rowsData,
                new String [] {
                        "编号", "名字", "类型", "适用书籍", "参数"
                }));
    }

    private void initComponents() {
   
        
        tStrategies = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        bDelete = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bReload = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        bAdd1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       // setSize(new java.awt.Dimension(550, 350));
        setSize(1000,1000);
        setLocationRelativeTo(getParent());

        String[][] rowsData = controller.getAllStrategiesInfo();

        tStrategies.setModel(new javax.swing.table.DefaultTableModel(
                rowsData,
                new String [] {
                        "优惠编号", "优惠名字", "优惠类型", "适用书籍", "参数"
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
        tStrategies.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tStrategies);//添加滚动
        

        jLabel5.setFont(new java.awt.Font("TimesRoman", 1, 48)); 
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("策略维护");

        bDelete.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bDelete.setText("删除");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bUpdate.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bUpdate.setText("更新");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bReload.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bReload.setText("刷新");
        bReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReloadActionPerformed(evt);
            }
        });

        bCancel.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bCancel.setText("退出");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        bAdd1.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bAdd1.setText("添加");
        bAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdd1ActionPerformed(evt);
            }
        });
        JPanel aJPanel=new JPanel();
        aJPanel.add(bReload);
        aJPanel.setLayout(new GridLayout(10, 6));
       // aJPanel.add(jScrollPane1);
        aJPanel.add(jScrollPane1); 
        aJPanel.add(bAdd1);
       // aJPanel.add(bDelete);
        aJPanel.add(bUpdate);
        aJPanel.add(bCancel);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.add(aJPanel);
       
        setTitle ("策略管理");
        setDefaultCloseOperation (DISPOSE_ON_CLOSE);
        setLocationRelativeTo (getParent ());
     //   setSize(600,400 );
       // pack();
    }

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int strategyIdx = tStrategies.getSelectedRow();
            if (strategyIdx < 0) throw new Exception("请点击选中想要删除的策略！");
            String ID = tStrategies.getValueAt(strategyIdx, 0).toString();//策略的ID
            controller.deleteStrategy(ID);
            
            
            DefaultTableModel model = (DefaultTableModel) tStrategies.getModel();
            model.removeRow(strategyIdx);
            tStrategies.setModel(model);
            JOptionPane.showMessageDialog(null, "删除成功！", "成功", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
        }
    }                                       

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            int strategyIdx = tStrategies.getSelectedRow();
            if (strategyIdx < 0) throw new Exception("请点击选中想要编辑的策略！");

            String ID = tStrategies.getValueAt(strategyIdx, 0).toString();

            new _2015211362_李楠轩_5_UpdateStrategyUI(ID).setVisible(true);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void bReloadActionPerformed(java.awt.event.ActionEvent evt) {
        updateRowData(tStrategies);
    }

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {
        new _2015211362_李楠轩_5_MainUI().setVisible(true);
        this.dispose();
    }

    private void bAdd1ActionPerformed(java.awt.event.ActionEvent evt) {
        new _2015211362_李楠轩_5_AddStrategyUI().setVisible(true);
    }
}
  
