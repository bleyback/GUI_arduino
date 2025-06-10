package GUI_arduino;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.util.ArrayList;
import java.util.Enumeration; 
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger; 
import javax.swing.JMenuItem;
import jssc.SerialPortEvent;
import jssc.SerialPortException;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

public class GUI_Arduino extends javax.swing.JFrame {

    Integer quantity,nomIntege;
//Lista inicializada para validar tamaño  
    List<String> lista_Serial = new ArrayList<>();
//Lista sin inicializar  
    //List<JMenuItem> listado_menu;
    List<JMenuItem> listado_menu = new ArrayList<>();
    JMenuItem serial;
    String nombre_puerto;

    public GUI_Arduino() {

        initComponents();
        setTitle("Java Arduino RxTx");
        setVisible(true);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        mensaje = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu_Run = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menu_Tools = new javax.swing.JMenu();
        menu_Tools_SerialPorts = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Angel samuel godoy ponce");

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel2)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu_file.setText("File");
        menu_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_fileActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Conectar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_file.add(jMenuItem1);

        jMenuItem3.setText("Desconectar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_file.add(jMenuItem3);

        jMenuBar1.add(menu_file);

        menu_Run.setText("Run");

        jMenuItem2.setText("jMenuItem1");
        menu_Run.add(jMenuItem2);

        jMenuBar1.add(menu_Run);

        menu_Tools.setText("Tools");
        menu_Tools.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                menu_ToolsAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        menu_Tools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ToolsActionPerformed(evt);
            }
        });

        menu_Tools_SerialPorts.setText("Serial Ports:");
        menu_Tools_SerialPorts.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
                menu_Tools_SerialPortsMenuDeselected(evt);
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
            }
        });
        menu_Tools_SerialPorts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_Tools_SerialPortsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_Tools_SerialPortsMouseEntered(evt);
            }
        });
        menu_Tools_SerialPorts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Tools_SerialPortsActionPerformed(evt);
            }
        });
        menu_Tools.add(menu_Tools_SerialPorts);

        jMenuBar1.add(menu_Tools);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void menu_Tools_SerialPortsMenuDeselected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_Tools_SerialPortsMenuDeselected
       
    }//GEN-LAST:event_menu_Tools_SerialPortsMenuDeselected

    private void menu_Tools_SerialPortsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_Tools_SerialPortsMouseClicked
       //agregar_puerto();
    }//GEN-LAST:event_menu_Tools_SerialPortsMouseClicked

    private void menu_Tools_SerialPortsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_Tools_SerialPortsMouseEntered
   
        
            agregar_puerto();
      
    }//GEN-LAST:event_menu_Tools_SerialPortsMouseEntered

    private void menu_ToolsAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_menu_ToolsAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_ToolsAncestorMoved

    private void menu_ToolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ToolsActionPerformed
    
    }//GEN-LAST:event_menu_ToolsActionPerformed

    private void menu_Tools_SerialPortsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Tools_SerialPortsActionPerformed
        
    }//GEN-LAST:event_menu_Tools_SerialPortsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            fun_conectar();
        } catch (ArduinoException ex) {
            Logger.getLogger(GUI_Arduino.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        
        try {
            //ino.sendData(mensaje.getText());
            ino.sendData(mensaje.getText());
        } catch (ArduinoException ex) {
            Logger.getLogger(GUI_Arduino.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SerialPortException ex) {
            Logger.getLogger(GUI_Arduino.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println(mensaje.getText());
//           Integer num = Integer.parseInt(mensaje.getText());
//           ino.sendByte(num);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        cerrar();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menu_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_fileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_fileActionPerformed

    public void limpiar_lista() {

        lista_Serial.clear();
        listado_menu.clear();
        menu_Tools_SerialPorts.removeAll();

    }

    public void agregar_puerto() {
        limpiar_lista();
        lista_Serial = listado();

        for (int i = 0; lista_Serial.size() > i; i++) {
            //if (lista_Serial.size() > 0) {
                serial = new JMenuItem();
                serial.setText(lista_Serial.get(i));
                listado_menu.add(serial);
                menu_Tools_SerialPorts.add(listado_menu.get(i));
                serial.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        nombre_puerto = evt.getActionCommand();
                        System.out.println(nombre_puerto);
                    }
                });

                
          //  }

        }

    }
 List<String> lista = new ArrayList();
    PanamaHitek_Arduino ino = new PanamaHitek_Arduino();
    public List<String> listado() {

        lista = ino.getSerialPorts();

        return lista;
    }
    
    // Metodo Listener

    private SerialPortEventListener listener = new SerialPortEventListener() {
    @Override
    public void serialEvent(SerialPortEvent spe) {
        try {
            if (ino.isMessageAvailable()) {
                txtArea.append("\nResultado: "+ino.printMessage());
            }
        } catch (SerialPortException | ArduinoException ex) {
            Logger.getLogger(GUI_Arduino.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
    };
    
public void fun_conectar() throws ArduinoException {
    try {
        
            ino.arduinoRXTX(nombre_puerto, 9600, listener);
            System.out.println("Conectado al puerto " + nombre_puerto);

    } catch (ArduinoException e) {
        System.err.println("Error de Arduino al abrir el puerto: " + e.getMessage());
        throw e; // Re-lanzar si necesitas manejarlo fuera
    } catch (Exception e) {
        System.err.println("Error inesperado al abrir el puerto: " + e.getMessage());
        e.printStackTrace();
    }
}

    
     public  void cerrar() {
        System.out.println("Desconectar Arduino");
        try {
            // String mensaje = JOptionPane.showInputDialog("Ingrese codigo");
            ino.killArduinoConnection();

        } catch (ArduinoException ev) {
            System.out.println("Error");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField mensaje;
    private javax.swing.JMenu menu_Run;
    private javax.swing.JMenu menu_Tools;
    public javax.swing.JMenu menu_Tools_SerialPorts;
    private javax.swing.JMenu menu_file;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
