
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Este programa conta de un menu con tres items en el cual puede hacer 
 * diferentes intecciones como abrir DOM, SAX, JAXB y esto lo mostrara en el 
 * jText.
 */

/**
 *
 * @author Ángel Esquinas
 */
public class Ventana extends javax.swing.JFrame {
    
    DOM gesDOM = new DOM();
    SAX gesSAX = new SAX();
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jBAñadir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTATitulo = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAAutor = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAPublicado = new javax.swing.JTextArea();
        jBGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTAAntiguo = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTANuevo = new javax.swing.JTextArea();
        jBModificar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMArchivos = new javax.swing.JMenu();
        jMIDom = new javax.swing.JMenuItem();
        jMISax = new javax.swing.JMenuItem();
        jMIJaxb = new javax.swing.JMenuItem();
        jMMostrar = new javax.swing.JMenu();
        jMIMostrarDOM = new javax.swing.JMenuItem();
        jMIMostrarSAX = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jBAñadir.setText("Añadir");
        jBAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAñadirActionPerformed(evt);
            }
        });

        jLabel2.setText("Titulo");

        jTATitulo.setColumns(20);
        jTATitulo.setRows(5);
        jScrollPane2.setViewportView(jTATitulo);

        jLabel3.setText("Autor");

        jTAAutor.setColumns(20);
        jTAAutor.setRows(5);
        jScrollPane3.setViewportView(jTAAutor);

        jLabel4.setText("Publicado");

        jTAPublicado.setColumns(20);
        jTAPublicado.setRows(5);
        jScrollPane4.setViewportView(jTAPublicado);

        jBGuardar.setText("Guardar XML");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLabel5.setText("Titulo Antiguo");

        jTAAntiguo.setColumns(20);
        jTAAntiguo.setRows(5);
        jScrollPane5.setViewportView(jTAAntiguo);

        jLabel6.setText("Titulo Nuevo");

        jTANuevo.setColumns(20);
        jTANuevo.setRows(5);
        jScrollPane6.setViewportView(jTANuevo);

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jMArchivos.setText("Archivos");

        jMIDom.setText("Abrir DOM");
        jMIDom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDomActionPerformed(evt);
            }
        });
        jMArchivos.add(jMIDom);

        jMISax.setText("Abrir SAX");
        jMISax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISaxActionPerformed(evt);
            }
        });
        jMArchivos.add(jMISax);

        jMIJaxb.setText("Abrir JAXB");
        jMArchivos.add(jMIJaxb);

        jMenuBar1.add(jMArchivos);

        jMMostrar.setText("Mostrar");

        jMIMostrarDOM.setText("Mostrar DOM");
        jMIMostrarDOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMostrarDOMActionPerformed(evt);
            }
        });
        jMMostrar.add(jMIMostrarDOM);

        jMIMostrarSAX.setText("Mostrar SAX");
        jMIMostrarSAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMostrarSAXActionPerformed(evt);
            }
        });
        jMMostrar.add(jMIMostrarSAX);

        jMenuBar1.add(jMMostrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane3)
                                            .addComponent(jScrollPane2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 62, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    * Abre un fichero y pone su DOM en el jLabel
    */
    private void jMIDomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDomActionPerformed
        File ficheroXML;
        ficheroXML = seleccionFichero();
        if(ficheroXML == null){
            jLabel1.setText("Selecciona un fichero");
        }
        else if (gesDOM.abrirXML_DOM(ficheroXML) == -1){
            jLabel1.setText("Error al crear el objeto DOM");          
        }
        else{
            jLabel1.setText("Objeto DOM creado");   
        }
        
    }//GEN-LAST:event_jMIDomActionPerformed

    private void jMIMostrarDOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMostrarDOMActionPerformed
        String salida = "";
        
        salida = gesDOM.recorrerDomMostrar();
        jTextArea1.setText(salida);
    }//GEN-LAST:event_jMIMostrarDOMActionPerformed

    private void jBAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAñadirActionPerformed
        if (gesDOM.añadirDom(jTATitulo.getText(), jTAAutor.getText(), jTAPublicado.getText()) == -1) {
            jLabel1.setText("Error al añadir el libro");  
        } 
        else {
            jLabel1.setText("Nodo añadido perfectamente");  
        }
    }//GEN-LAST:event_jBAñadirActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        File ficheroXML;
        ficheroXML = guardarFichero();
        if(ficheroXML == null){
            jLabel1.setText("Selecciona un fichero");
        }
        else if (gesDOM.guardarDom(ficheroXML) == -1) {
            jLabel1.setText("Error al guardar el archivo");  
        } 
        else {
            jLabel1.setText("Archivo guardado perfectamente");  
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        gesDOM.modifica(jTAAntiguo.getText(), jTANuevo.getText());
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jMISaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISaxActionPerformed
        File ficheroXML;
        ficheroXML = seleccionFichero();
        
        if(ficheroXML == null){// dependiendo de si elige un fichero o no entra en un if u otro
            jLabel1.setText("Selecciona un fichero");
        }
        else if (gesSAX.abrirXML_SAX(ficheroXML) == -1){
            jLabel1.setText("Error al crear el objeto SAX");          
        }
        else{
            jLabel1.setText("Objeto SAX creado");   
        }
    }//GEN-LAST:event_jMISaxActionPerformed

    private void jMIMostrarSAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMostrarSAXActionPerformed
        String salida = "";// en este string guardo lo que me devuelve y lo pongo en el jText
        
        salida = gesSAX.recorrerSAX();
        jTextArea1.setText(salida);
    }//GEN-LAST:event_jMIMostrarSAXActionPerformed
    
    private File seleccionFichero() {
        File fichero = null;
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("arhivos de documentos xml", "xml"));//seleccionar un archivo
        
        int seleccion = jFileChooser1.showOpenDialog(this);
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            fichero = jFileChooser1.getSelectedFile();
        }
            return fichero;
    }
    
    private File guardarFichero() {
        File fichero = null;
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("arhivos de documentos xml", "xml"));//seleccionar un archivo
        
        int seleccion = jFileChooser1.showSaveDialog(this);
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            fichero = jFileChooser1.getSelectedFile();
        }
            return fichero;
    }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAñadir;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    public javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMArchivos;
    private javax.swing.JMenuItem jMIDom;
    private javax.swing.JMenuItem jMIJaxb;
    private javax.swing.JMenuItem jMIMostrarDOM;
    private javax.swing.JMenuItem jMIMostrarSAX;
    private javax.swing.JMenuItem jMISax;
    private javax.swing.JMenu jMMostrar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTAAntiguo;
    private javax.swing.JTextArea jTAAutor;
    private javax.swing.JTextArea jTANuevo;
    private javax.swing.JTextArea jTAPublicado;
    private javax.swing.JTextArea jTATitulo;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
   
}
