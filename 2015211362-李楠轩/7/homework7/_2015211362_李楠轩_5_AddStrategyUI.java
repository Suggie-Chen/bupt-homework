
package homework7;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;

public class _2015211362_�����_5_AddStrategyUI extends javax.swing.JFrame {

		private JCheckBox cType0;
	    private JCheckBox cType1;
	    private JCheckBox cType2;
	    private JCheckBox cType3;
	    private JCheckBox cType4;
	    private JButton bCancel;
	    private JButton bSubmit;
	    private JLabel jLabel1;
	    private JLabel jLabel2;
	    private JLabel jLabel3;
	    private JLabel jLabel4;
	    private JLabel jLabel6;
	    private JTextField tID;
	    private JTextField tName;
	    private JTextField tParas;
	    private JComboBox<String> tType;
    _2015211362_�����_5_Controller controller = _2015211362_�����_5_Controller.getInstance();

    public _2015211362_�����_5_AddStrategyUI() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        tName = new JTextField();
        tID = new JTextField();
        bCancel = new JButton();
        bSubmit = new JButton();
        
        tType = new JComboBox<>();
        
        jLabel6 = new JLabel();
        tParas = new JTextField();
        //ѡ����һ����Ʒ����
        cType0 = new JCheckBox();
        cType1 = new JCheckBox();
        cType2 = new JCheckBox();
        cType3 = new JCheckBox();
        cType4 = new JCheckBox();
        
        
        setSize(new java.awt.Dimension(450, 520));
        setLocationRelativeTo(getParent());

        jLabel1.setFont(new java.awt.Font("TimesRoman", 1, 13));
        jLabel1.setText("���Ա�ţ�");
        jLabel1.setSize(new java.awt.Dimension(0, 80));

        jLabel2.setFont(new java.awt.Font("TimesRoman", 1, 13));
        jLabel2.setText("�������ƣ�");
        jLabel2.setSize(new java.awt.Dimension(0, 80));

        jLabel3.setFont(new java.awt.Font("TimesRoman", 1, 13));
        jLabel3.setText("�������ͣ�");
        jLabel3.setSize(new java.awt.Dimension(0, 80));

        jLabel4.setFont(new java.awt.Font("TimesRoman", 1, 13));
        jLabel4.setText("�����鼮��");
        jLabel4.setSize(new java.awt.Dimension(0, 80));
        
        jLabel6.setFont(new java.awt.Font("TimesRoman", 1, 13));
        jLabel6.setText("������");
        jLabel6.setSize(new java.awt.Dimension(0, 80));
        
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
                bsubmitok(evt);
            }
        });

        tType.setModel(new DefaultComboBoxModel<>(new String[] { "����ֵ�Żݲ���", "�ٷֱ��Żݲ���", "�˿����Ų���", " " }));

        cType0.setText("�ǽ̲ļ����");
        cType1.setText("�̲���");
        cType2.setText("������");
        cType3.setText("������");
        cType4.setText("����");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel aJPanel=new JPanel();
       
        aJPanel.setLayout(new GridLayout(10, 10));
        aJPanel.add(jLabel1);
        aJPanel.add(tID);
        
        aJPanel.add(jLabel2);
        aJPanel.add(tName);
        
        aJPanel.add(jLabel3);
        aJPanel.add(tType);
        
        aJPanel.add(jLabel4);
        aJPanel.add(cType0);
        aJPanel.add(cType1);
        aJPanel.add(cType2);
        aJPanel.add(cType3);
        aJPanel.add(cType4);
        
        aJPanel.add(jLabel6);
        aJPanel.add(tParas);
        
        aJPanel.add(bSubmit);
        aJPanel.add(bCancel);
        
        
        this.add(aJPanel);
        this.pack();
        setTitle ("���ͼ��");
        setDefaultCloseOperation (DISPOSE_ON_CLOSE);
        setLocationRelativeTo (getParent ());
        setSize(500,500 );
    }
    //���ȡ��
    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }
    //�������ݣ�ȷ�ϰ�ť���º����
    private void bsubmitok(java.awt.event.ActionEvent evt) {
        try{
            String ID = tID.getText();
            String name = tName.getText();
            //��hashset��װbooks��֮��Ƚ�books����û���������������
            HashSet<Integer> books = new HashSet<Integer>();
            String paras = tParas.getText();//����
            int type = tType.getSelectedIndex();

            if (cType0.isSelected()) books.add(_2015211362_�����_5_ProductSpecification.NON_COMPUTER_TEXTBOOK);
            if (cType1.isSelected()) books.add(_2015211362_�����_5_ProductSpecification.TEXTBOOK);
            if (cType2.isSelected()) books.add(_2015211362_�����_5_ProductSpecification.COMIC_BOOK);
            if (cType3.isSelected()) books.add(_2015211362_�����_5_ProductSpecification.HEALTHCARE_BOOK);
            if (cType4.isSelected()) books.add(_2015211362_�����_5_ProductSpecification.OTHER_BOOK);

            //���������
            controller.addStrategy(type, paras, books, ID, name);

            System.out.println(_2015211362_�����_5_PricingStrategyFactory.getInstance().getPricingStrategy(ID));
            this.dispose();
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "����", JOptionPane.ERROR_MESSAGE);

        }
    }

   
   
}
