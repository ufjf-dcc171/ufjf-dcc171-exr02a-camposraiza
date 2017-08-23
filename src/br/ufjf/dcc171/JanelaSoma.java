package br.ufjf.dcc171;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class JanelaSoma extends JFrame {
    
    private final JLabel lblNumero1;
    private final JLabel lblNumero2;
     private final JLabel lblNumero3;
    private final JTextField txtNumero1;
    private final JTextField txtNumero2;    
    private int n1;
    private int n2;
    private StringBuffer linha;
    
    public JanelaSoma() throws HeadlessException {
    super("Soma");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        lblNumero1 = new JLabel ("Número 1:");
        txtNumero1 = new JTextField(15);
        add(lblNumero1);
        add(txtNumero1);
        
        lblNumero2 = new JLabel ("Número 2:");
        txtNumero2 = new JTextField(15);
        add(lblNumero2);
        add(txtNumero2);       
                
        lblNumero3 = new JLabel ("");
        add(lblNumero3);
        
        txtNumero1.addActionListener(new Numero1Enter());        
        txtNumero2.addActionListener(new Numero2Enter());        
        
    }

    private class Numero1Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n1 = Integer.parseInt(txtNumero1.getText());
            txtNumero2.requestFocus();
        }
    }
        
        
        private class Numero2Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n2 = Integer.parseInt(txtNumero2.getText());
            lblNumero3.setText(Integer.toString(n1+n2));
        }
        
        private class Inverte implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                
        StringBuffer sb = new StringBuffer(linha);
        sb.reverse();
        System.out.println(sb);  
            }
        }      


    }
    }

    

