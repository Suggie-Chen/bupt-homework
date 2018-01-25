
package homework7;

import java.awt.GridLayout;

import javax.swing.*;

public class _2015211362_李楠轩_5_AddBookUI extends JFrame {

	private javax.swing.JButton bCancel;
    private javax.swing.JButton bSubmit;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JTextField tISBN;
    private JTextField tName;
    private JTextField tPrice;
   // private JCheckBox yy;
    private JComboBox<String> tType;
	public _2015211362_李楠轩_5_AddBookUI() {
		jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        tName = new JTextField();
        tISBN = new JTextField();
        tPrice = new JTextField();
        jLabel5 = new JLabel();
        bCancel = new JButton();
        bSubmit = new JButton();
        tType = new JComboBox();

        setSize(new java.awt.Dimension(450, 520));
        setLocationRelativeTo(getParent());

        jLabel1.setFont(new java.awt.Font("TimesRoman", 1, 13)); 
        jLabel1.setText("ISBN号：");
        jLabel1.setSize(new java.awt.Dimension(0, 80));

        jLabel2.setFont(new java.awt.Font("TimesRoman", 1, 13)); 
        jLabel2.setText("书名：");
        jLabel2.setSize(new java.awt.Dimension(0, 80));

        jLabel3.setFont(new java.awt.Font("TimesRoman", 1, 13)); 
        jLabel3.setText("书籍类型：");
        jLabel3.setSize(new java.awt.Dimension(0, 80));

        jLabel4.setFont(new java.awt.Font("TimesRoman", 1, 13)); 
        jLabel4.setText("单价：");
        jLabel4.setSize(new java.awt.Dimension(0, 80));

        jLabel5.setFont(new java.awt.Font("TimesRoman", 1, 48)); 
        jLabel5.setText("添加书籍");

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

        tType.setModel(new DefaultComboBoxModel<>(new String[] { "非教材类计算机图书", "教材类图书", "连环画类图书", "养生类图书", "其他" }));
        
        JPanel aJPanel=new JPanel();
        aJPanel.setLayout(new GridLayout(10, 10));
        aJPanel.add(jLabel1);
        aJPanel.add(tISBN);
        
        aJPanel.add(jLabel2);
        aJPanel.add(tName);
        
        aJPanel.add(jLabel3);
        aJPanel.add(tType);
        
        aJPanel.add(jLabel4);
        aJPanel.add(tPrice);
        
       // aJPanel.add(jLabel5);
        aJPanel.add(bSubmit);
        
        aJPanel.add(bCancel);
      
        this.add(aJPanel);
        this.pack();
        setTitle ("添加图书");
        setDefaultCloseOperation (DISPOSE_ON_CLOSE);
        setLocationRelativeTo (getParent ());
        setSize(500,500 );
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//点击关闭就把模块关闭
    }

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        new _2015211362_李楠轩_5_MainUI().setVisible(true);
        this.dispose();
    }

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitActionPerformed
        try{
            String isbn = tISBN.getText();
            double price = Double.parseDouble(tPrice.getText());
            String name = tName.getText();
            int type = tType.getSelectedIndex();
            System.out.println(type);
            if (isbn.equals("")) throw new Exception("ISBN号不能为空！");
            if (name.equals("")) throw new Exception("书名不能为空！");
            if (price <= 0 ) throw new Exception("价格不能为负数！");

            _2015211362_李楠轩_5_Controller.getInstance().addBook(isbn, price, name, type);//调用control

            JOptionPane.showMessageDialog(null, "添加成功！", "成功", JOptionPane.INFORMATION_MESSAGE);
            new _2015211362_李楠轩_5_MainUI().setVisible(true);
            this.dispose();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);

        }
    }

   
}
