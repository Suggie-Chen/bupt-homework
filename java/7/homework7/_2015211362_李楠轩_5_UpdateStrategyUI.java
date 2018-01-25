
package homework7;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;

public class _2015211362_李楠轩_5_UpdateStrategyUI extends javax.swing.JFrame {

    _2015211362_李楠轩_5_Controller controller = _2015211362_李楠轩_5_Controller.getInstance();
    
    private javax.swing.JCheckBox aJCheckBox0;
    private javax.swing.JCheckBox aJCheckBox1;
    private javax.swing.JCheckBox aJCheckBox2;
    private javax.swing.JCheckBox aJCheckBox3;
    private javax.swing.JCheckBox aJCheckBox4;
    
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bSubmit;
    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lID;
    //姓名
    private javax.swing.JTextField tName;
    //参数
    private javax.swing.JTextField tParas;
    //下拉框
    private javax.swing.JComboBox<String> tType;
    public _2015211362_李楠轩_5_UpdateStrategyUI(String ID) {
        initComponents(ID);
    }
    private void initComponents(String ID) {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        
        tName = new javax.swing.JTextField();
        
        
        bCancel = new javax.swing.JButton();
        bSubmit = new javax.swing.JButton();
        
        tType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tParas = new javax.swing.JTextField();
        
        aJCheckBox0 = new javax.swing.JCheckBox();
        aJCheckBox1 = new javax.swing.JCheckBox();
        aJCheckBox2 = new javax.swing.JCheckBox();
        aJCheckBox3 = new javax.swing.JCheckBox();
        aJCheckBox4 = new javax.swing.JCheckBox();

        lID = new javax.swing.JLabel(ID);

      

        jLabel1.setFont(new java.awt.Font("TimesRoman", 1, 13)); 
        jLabel1.setText("策略编号：");
        jLabel1.setSize(new java.awt.Dimension(0, 80));

        jLabel2.setFont(new java.awt.Font("TimesRoman", 1, 13)); 
        jLabel2.setText("策略名称：");
        jLabel2.setSize(new java.awt.Dimension(0, 80));

        jLabel3.setFont(new java.awt.Font("TimesRoman", 1, 13)); 
        jLabel3.setText("策略类型：");
        jLabel3.setSize(new java.awt.Dimension(0, 80));

        jLabel4.setFont(new java.awt.Font("TimesRoman", 1, 13)); 
        jLabel4.setText("适用书籍：");
        jLabel4.setSize(new java.awt.Dimension(0, 80));

        jLabel6.setFont(new java.awt.Font("TimesRoman", 1, 13)); 
        jLabel6.setText("参数：");
        jLabel6.setSize(new java.awt.Dimension(0, 80));
      

        bCancel.setFont(new java.awt.Font("TimesRoman", 0, 13)); 
        bCancel.setText("取消");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        bSubmit.setFont(new java.awt.Font("TimesRoman", 0, 13)); 
        bSubmit.setText("提交");
        bSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitActionPerformed(evt);
            }
        });

        tType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "绝对值优惠策略", "百分比优惠策略", "顾客最优策略", " " }));
     
        aJCheckBox0.setText("非教材计算机");
     
        aJCheckBox1.setText("教材类");
      
        aJCheckBox2.setText("连环画");
      

        aJCheckBox3.setText("养生类");
    

        aJCheckBox4.setText("其他");

        lID.setFont(new java.awt.Font("TimesRoman", 0, 13)); 
        lID.setText(ID);

        JPanel aJPanel=new JPanel();
        
        aJPanel.setLayout(new GridLayout(10, 10));
        aJPanel.add(jLabel1);  
        aJPanel.add(new JLabel(ID));
        
        aJPanel.add(jLabel2);
        aJPanel.add(tName);
        
        aJPanel.add(jLabel3);
        aJPanel.add(tType);
        
        aJPanel.add(jLabel4);
        aJPanel.add(aJCheckBox0);
        aJPanel.add(aJCheckBox1);
        aJPanel.add(aJCheckBox2);
        aJPanel.add(aJCheckBox3);
        aJPanel.add(aJCheckBox4);
        
        aJPanel.add(jLabel6);
        aJPanel.add(tParas);
        
        aJPanel.add(bSubmit);
        aJPanel.add(bCancel);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.add(aJPanel);
        this.pack();
        setTitle ("改变策略");
        setDefaultCloseOperation (DISPOSE_ON_CLOSE);
        setLocationRelativeTo (getParent ());
        setSize(500,500 );
    }

 

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            String ID = lID.getText();
            String name = tName.getText();
            HashSet<Integer> books = new HashSet<Integer>();
            String paras = tParas.getText();
            int type = tType.getSelectedIndex();
            System.out.println(type);
            if (aJCheckBox0.isSelected()) books.add(_2015211362_李楠轩_5_ProductSpecification.NON_COMPUTER_TEXTBOOK);
            if (aJCheckBox1.isSelected()) books.add(_2015211362_李楠轩_5_ProductSpecification.TEXTBOOK);
            if (aJCheckBox2.isSelected()) books.add(_2015211362_李楠轩_5_ProductSpecification.COMIC_BOOK);
            if (aJCheckBox3.isSelected()) books.add(_2015211362_李楠轩_5_ProductSpecification.HEALTHCARE_BOOK);
            if (aJCheckBox4.isSelected()) books.add(_2015211362_李楠轩_5_ProductSpecification.OTHER_BOOK);

            controller.updateStrategy(type, paras, books, ID, name);

            System.out.println(_2015211362_李楠轩_5_PricingStrategyFactory.getInstance().getPricingStrategy(ID));
            JOptionPane.showMessageDialog(null, "修改成功！", "成功", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);

        }
    }

}
