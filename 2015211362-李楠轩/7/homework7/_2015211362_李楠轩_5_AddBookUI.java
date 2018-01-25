
package homework7;

import java.awt.GridLayout;

import javax.swing.*;

public class _2015211362_�����_5_AddBookUI extends JFrame {

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
	public _2015211362_�����_5_AddBookUI() {
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
        jLabel1.setText("ISBN�ţ�");
        jLabel1.setSize(new java.awt.Dimension(0, 80));

        jLabel2.setFont(new java.awt.Font("TimesRoman", 1, 13)); 
        jLabel2.setText("������");
        jLabel2.setSize(new java.awt.Dimension(0, 80));

        jLabel3.setFont(new java.awt.Font("TimesRoman", 1, 13)); 
        jLabel3.setText("�鼮���ͣ�");
        jLabel3.setSize(new java.awt.Dimension(0, 80));

        jLabel4.setFont(new java.awt.Font("TimesRoman", 1, 13)); 
        jLabel4.setText("���ۣ�");
        jLabel4.setSize(new java.awt.Dimension(0, 80));

        jLabel5.setFont(new java.awt.Font("TimesRoman", 1, 48)); 
        jLabel5.setText("����鼮");

        bCancel.setFont(new java.awt.Font("TimesRoman", 0, 13)); 
        bCancel.setText("ȡ��");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        bSubmit.setFont(new java.awt.Font("TimesRoman", 0, 13)); 
        bSubmit.setText("�ύ");
        bSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitActionPerformed(evt);
            }
        });

        tType.setModel(new DefaultComboBoxModel<>(new String[] { "�ǽ̲�������ͼ��", "�̲���ͼ��", "��������ͼ��", "������ͼ��", "����" }));
        
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
        setTitle ("���ͼ��");
        setDefaultCloseOperation (DISPOSE_ON_CLOSE);
        setLocationRelativeTo (getParent ());
        setSize(500,500 );
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//����رվͰ�ģ��ر�
    }

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        new _2015211362_�����_5_MainUI().setVisible(true);
        this.dispose();
    }

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitActionPerformed
        try{
            String isbn = tISBN.getText();
            double price = Double.parseDouble(tPrice.getText());
            String name = tName.getText();
            int type = tType.getSelectedIndex();
            System.out.println(type);
            if (isbn.equals("")) throw new Exception("ISBN�Ų���Ϊ�գ�");
            if (name.equals("")) throw new Exception("��������Ϊ�գ�");
            if (price <= 0 ) throw new Exception("�۸���Ϊ������");

            _2015211362_�����_5_Controller.getInstance().addBook(isbn, price, name, type);//����control

            JOptionPane.showMessageDialog(null, "��ӳɹ���", "�ɹ�", JOptionPane.INFORMATION_MESSAGE);
            new _2015211362_�����_5_MainUI().setVisible(true);
            this.dispose();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "����", JOptionPane.ERROR_MESSAGE);

        }
    }

   
}
