
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K1NGSHOOT
 */
public class Principal extends javax.swing.JFrame {
int senhastotal=25;
int senhaatual=0; 
int totalritada; 
int tuasenha; 
int ultimasenha=25;
int Senhaporentrar;
int senhaatendida; //declaracao das variaveis
int	proxima;
int poratender;
int	proximaat;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelatual = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jButton2.setText("Entrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 20, 80, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(160, 20, 170, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escreva a sua senha");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 0, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha Atual");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(450, 10, 200, 30);

        jLabelatual.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabelatual.setForeground(new java.awt.Color(255, 204, 0));
        jLabelatual.setText("24");
        jPanel1.add(jLabelatual);
        jLabelatual.setBounds(460, 0, 160, 200);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("0");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(460, 330, 200, 120);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("0");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(460, 150, 160, 200);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Proxima senha");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 160, 200, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("0");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(470, 470, 100, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Atendidas");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(450, 300, 200, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Por atender");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(450, 440, 200, 30);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Bem vindo ao distema de gestao de filas, \n\nMANUAL\n\no sistema controla uma bicha de atendimento de no\nmaximo 25 senhas, geradas automaticamente.\n\nNo lado directo tens um mapa onde mostra \nos seguintes pontos: \n\n1-Senha atual: é o numero da senha \nque se encontra em frente da fila\n\n2-Proxima senha: é o numero da senha \nque deve se preparar\n\n3- Atendidas: é o numero total de senhas \nque ja foram atendidas\n\n4- Por atender: é o numero total de \nsenhas que ainda não foram atendidas");
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 400, 410);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 70, 420, 430);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 530);

        setSize(new java.awt.Dimension(657, 546));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	


        if (jTextField1.getText().isEmpty()) {
           JOptionPane.showMessageDialog(this, "Escreva o numero da senha" );
 
        }else{
         tuasenha = Integer.parseInt(jTextField1.getText());
            Senhaporentrar=ultimasenha-1;


if(tuasenha == Senhaporentrar){

	
	 JOptionPane.showMessageDialog(this, "Atendido Com sucesso|| TOTAL ATENDIDO: "+ senhaatendida);
        ultimasenha--;
	senhaatendida++;
        
        	proxima=ultimasenha-2;
jLabel5.setText(""+proxima);
		
                	proximaat=ultimasenha-1;
jLabelatual.setText(""+proximaat);
jLabel4.setText(""+senhaatendida);
	 poratender=25-senhaatendida;
         jLabel7.setText(""+poratender);
		
			
        
}else{

 JOptionPane.showMessageDialog(this, "Aguarde a sua vez" );
}
  
            
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelatual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
