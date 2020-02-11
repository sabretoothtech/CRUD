/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author YAXMA
 */
public class mainW extends javax.swing.JFrame {
Connection conn=null;
     ResultSet rs = null;
     PreparedStatement pst=null;
     
     //validar datos
     validarDatos vld= new validarDatos();
     
    /**
     * Creates new form mainW
     */
    public mainW() {
        initComponents();
         conn=Conexion.ConnecrDb(); 
         setLocationRelativeTo(this);
         UpdateJTable();
         
         //vlidar datos
         vld.ValidarNum(PerNumero);
         vld.ValidarCartr(PerNombre);
         vld.limitarNumdeCarac(PerNumero, 8);
         
         
    }
private void UpdateJTable(){
        
        
         String sql="Select  Nombre,Numero  from PersonasDatos ";
     
  try{
    pst =conn.prepareStatement(sql);
    rs=pst.executeQuery();
    //pst.execute();
   dataview.setModel(DbUtils.resultSetToTableModel(rs));
          
    }catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);

    }finally {
try{
  rs.close();
      pst.close();
     
  }
  catch(Exception e) {
                   }
      } 

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PerNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PerNumero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataview = new javax.swing.JTable();
        saveBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        delBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        PerNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Número:");

        PerNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        dataview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dataview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataviewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataview);

        saveBTN.setText("Guardar");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        updateBTN.setText("Actualizar");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        delBTN.setText("Eliminar");
        delBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(PerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(PerNumero))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delBTN)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(PerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBTN)
                    .addComponent(delBTN)
                    .addComponent(saveBTN))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        //guardar en la base de datos
       
       
      
      
        
         String sql="INSERT INTO PersonasDatos(Nombre,Numero) "+ "values(?,?)";
         //convertimos a integer
          int Pnumber=Integer.parseInt(PerNumero.getText());
        try{
            

            //Data to insert in the DB
            pst =conn.prepareStatement(sql);
            pst.setString(1, PerNombre.getText());
            pst.setInt(2, Pnumber);
           
        
            pst.execute();
            //actualizamos la tabla
            UpdateJTable();
            JOptionPane.showMessageDialog(null, "Guardado");
//limpiamos los campos
    PerNombre.setText("");
    PerNumero.setText("");
          
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);

        }finally {
            try{
                rs.close();
                pst.close();
                // conn.close();
            }
            catch(Exception e) {
            }
        }
        
    }//GEN-LAST:event_saveBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        // actualizar campos
      
         try{
        //obtener nombre guardado      
       int row =dataview.getSelectedRow();
      String Rnombre=(dataview.getModel().getValueAt(row, 0).toString());
      //datos para actualizar
      String Pnombre=PerNombre.getText();
      String Pnumero=PerNumero.getText();



       
String sql="update PersonasDatos set Nombre='"+Pnombre+"',Numero='"+Pnumero+"' where Nombre='"+Rnombre+"'"; 

String nombre=Rnombre;
        int confirmar = JOptionPane.showConfirmDialog(null, "Todos los datos de:\n"  + nombre + "\n serán actualizados, esta acción es permanente.\n" +
         "¿Desea Continuar?", "Actualizar", WIDTH, HEIGHT, null);
        
        if(confirmar == JOptionPane.YES_OPTION){
          pst =conn.prepareStatement(sql);
    pst.execute();
    JOptionPane.showMessageDialog(null, "Actualizado"); 
    
    //actualizamos la tabla y limpiamos los campos 
    UpdateJTable();
    PerNombre.setText("");
    PerNumero.setText("");
        }

                
    }catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);
    }finally {
try{
  rs.close();
      pst.close();
    // conn.close();
  }
  catch(Exception e) {
                   }
      
        
        
       
           
        }    
        
           
    }//GEN-LAST:event_updateBTNActionPerformed

    private void dataviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataviewMouseClicked
        // pasar a los campos
        if(dataview.getSelectedRowCount()>0){
         PerNombre.setText(dataview.getValueAt(dataview.getSelectedRow(),0).toString());
          PerNumero.setText(dataview.getValueAt(dataview.getSelectedRow(),1).toString());
        }
        
    }//GEN-LAST:event_dataviewMouseClicked

    private void delBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBTNActionPerformed
        // TODO add your handling code here:
         String sql="delete from PersonasDatos where Nombre=?";
         try{
    pst =conn.prepareStatement(sql);
    pst.setString(1, PerNombre.getText());
    
   // rs=pst.executeQuery();
    pst.execute();
    //actualizamos la tabla 
    UpdateJTable();
    JOptionPane.showMessageDialog(null, "Eliminado");
//limpiamos los campos
PerNombre.setText("");
PerNumero.setText("");
    }catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);

    }finally {
try{
  rs.close();
      pst.close();
     //conn.close();
  }
  catch(Exception e) {
                   }
      } 
    }//GEN-LAST:event_delBTNActionPerformed

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
            java.util.logging.Logger.getLogger(mainW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PerNombre;
    private javax.swing.JTextField PerNumero;
    private javax.swing.JTable dataview;
    private javax.swing.JButton delBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveBTN;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
