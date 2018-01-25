
package homework7;

import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class _2015211362_�����_5_StrategiesUI extends javax.swing.JFrame {

    //Ч��������֮ǰ�Ѿ�����õ�controller
    _2015211362_�����_5_Controller controller = _2015211362_�����_5_Controller.getInstance();
    private javax.swing.JButton bAdd1;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bReload;
    private javax.swing.JButton bUpdate;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tStrategies;
    public _2015211362_�����_5_StrategiesUI() {
        initComponents();
    }

    private void updateRowData(javax.swing.JTable tStrategies)
    {
        String[][] rowsData = controller.getAllStrategiesInfo();
    
        tStrategies.setModel(new javax.swing.table.DefaultTableModel(rowsData,
                new String [] {
                        "���", "����", "����", "�����鼮", "����"
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
                        "�Żݱ��", "�Ż�����", "�Ż�����", "�����鼮", "����"
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
        jScrollPane1.setViewportView(tStrategies);//��ӹ���
        

        jLabel5.setFont(new java.awt.Font("TimesRoman", 1, 48)); 
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("����ά��");

        bDelete.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bDelete.setText("ɾ��");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bUpdate.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bUpdate.setText("����");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bReload.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bReload.setText("ˢ��");
        bReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReloadActionPerformed(evt);
            }
        });

        bCancel.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bCancel.setText("�˳�");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        bAdd1.setFont(new java.awt.Font("TimesRoman", 1, 14)); 
        bAdd1.setText("���");
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
       
        setTitle ("���Թ���");
        setDefaultCloseOperation (DISPOSE_ON_CLOSE);
        setLocationRelativeTo (getParent ());
     //   setSize(600,400 );
       // pack();
    }

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int strategyIdx = tStrategies.getSelectedRow();
            if (strategyIdx < 0) throw new Exception("����ѡ����Ҫɾ���Ĳ��ԣ�");
            String ID = tStrategies.getValueAt(strategyIdx, 0).toString();//���Ե�ID
            controller.deleteStrategy(ID);
            
            
            DefaultTableModel model = (DefaultTableModel) tStrategies.getModel();
            model.removeRow(strategyIdx);
            tStrategies.setModel(model);
            JOptionPane.showMessageDialog(null, "ɾ���ɹ���", "�ɹ�", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "����", JOptionPane.ERROR_MESSAGE);
        }
    }                                       

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            int strategyIdx = tStrategies.getSelectedRow();
            if (strategyIdx < 0) throw new Exception("����ѡ����Ҫ�༭�Ĳ��ԣ�");

            String ID = tStrategies.getValueAt(strategyIdx, 0).toString();

            new _2015211362_�����_5_UpdateStrategyUI(ID).setVisible(true);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "����", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void bReloadActionPerformed(java.awt.event.ActionEvent evt) {
        updateRowData(tStrategies);
    }

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {
        new _2015211362_�����_5_MainUI().setVisible(true);
        this.dispose();
    }

    private void bAdd1ActionPerformed(java.awt.event.ActionEvent evt) {
        new _2015211362_�����_5_AddStrategyUI().setVisible(true);
    }
}
  
