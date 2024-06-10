/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login_clinica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * @author Jamyl
 */
public class Gestion_users extends javax.swing.JFrame {
    private static final String API_URL = "http://localhost:8080/api/user/";
    
    /**
     * Creates new form Gestion_users
     */
    public Gestion_users() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("GESTIÓN DE USUARIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        jButton3.setText("Mostrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 170, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 170, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 170, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Fecha de nacimiento", "Telefono", "Email", "Dirección", "Género"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 880, 150));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 170, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 176, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 176, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 176, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 176, -1));

        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("DNI:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Apellidos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Contraseña:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Email:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Dirección:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Género:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 176, -1));

        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Telefono:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jButton5.setText("Gestionar Doctores");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jamyl\\Desktop\\fondoG.png")); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        // Obtener los datos de los campos de texto
        String dni = jTextField1.getText();
        String name = jTextField2.getText();
        String lastname = jTextField3.getText();
        String password = jTextField4.getText();
        String bornDateString = jTextField5.getText(); // Obtener la cadena de texto para bornDate
        String email = jTextField6.getText();
        String address = jTextField7.getText();
        String gender = jTextField8.getText();
        String phone = jTextField9.getText();
        boolean status=true;
        boolean google=false;

        // Convertir bornDate de String a Date
        DateFormat dateFormatInput = new SimpleDateFormat("yyyy-MM-dd"); // Formato esperado de fecha
        Date bornDate = dateFormatInput.parse(bornDateString);

        // Formatear bornDate al formato deseado
        DateFormat dateFormatOutput = new SimpleDateFormat("yyyy-MM-dd"); // Formato de fecha deseado
        String formattedBornDate = dateFormatOutput.format(bornDate);

        // Convertir los datos a un objeto JSON
        JSONObject json = new JSONObject();
        json.put("dni", dni);
        json.put("name", name);
        json.put("lastname", lastname);
        json.put("password", password);
        json.put("bornDate", formattedBornDate);
        json.put("phone", phone);
        json.put("email", email);
        json.put("address", address);
        json.put("gender", gender);
        json.put("status", status);
        json.put("google", google);

        // Convertir el objeto JSON a una cadena
        String jsonPayload = json.toString();

        // Crear la URL
        URL url = new URL(API_URL);

        // Abrir la conexión HTTP
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Establecer el método de solicitud (POST)
        connection.setRequestMethod("POST");

        // Establecer el tipo de contenido del cuerpo de la solicitud
        connection.setRequestProperty("Content-Type", "application/json");

        // Habilitar el envío de datos
        connection.setDoOutput(true);

        // Obtener el flujo de salida para escribir los datos JSON
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(jsonPayload.getBytes());
        outputStream.flush();

        // Obtener el código de respuesta
        int responseCode = connection.getResponseCode();

        // Mostrar mensaje de éxito si la respuesta es satisfactoria
        if (responseCode == HttpURLConnection.HTTP_OK) {
            JOptionPane.showMessageDialog(this, "Usuario registrado con éxito.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Si la respuesta no es satisfactoria, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Ocurrió un error al registrar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Cerrar la conexión
        connection.disconnect();
    } catch (IOException | ParseException | JSONException e) {
        // Mostrar mensaje de excepción ocurrida
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Excepción", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // Obtener el DNI del jTextField1
            String dni = jTextField1.getText();

            // Construir la URL del endpoint DELETE
            URL url = new URL(API_URL + dni);

            // Abrir conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Establecer el método de solicitud (DELETE)
            connection.setRequestMethod("DELETE");

            // Obtener el código de respuesta
            int responseCode = connection.getResponseCode();

            // Mostrar mensaje de éxito si la respuesta es satisfactoria
            if (responseCode == HttpURLConnection.HTTP_OK) {
                JOptionPane.showMessageDialog(this, "Usuario eliminado con éxito.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Si la respuesta no es satisfactoria, mostrar un mensaje de error
                JOptionPane.showMessageDialog(this, "Ocurrió un error al eliminar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        // Cerrar la conexión
            connection.disconnect();
        } catch (IOException e) {
            // Mostrar mensaje de excepción ocurrida
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Excepción", JOptionPane.ERROR_MESSAGE);
            System.out.println(""+e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // Create the URL
            URL url = new URL(API_URL);

            // Open HTTP connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method (GET)
            connection.setRequestMethod("GET");

            // Get response code
            int responseCode = connection.getResponseCode();

            // Read response from server
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Update JTable with response data
            updateTable(response.toString());

            // Close connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    private void updateTable(String responseData) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    // Clear existing table data
    model.setRowCount(0);

    // Parse response data and add rows to the table
    // Assuming the response data is organized in rows and columns separated by a specific delimiter (e.g., comma)
    String[] rows = responseData.split("},"); // Assuming rows are separated by semicolon
    for (String row : rows) {
        String[] rowData = row.split(","); // Separa las columnas por coma

        // Remove specific words and characters from each cell value
        for (int i = 0; i < rowData.length; i++) {
            // Remove specific words
            rowData[i] = rowData[i].replaceAll("(dni|name|lastname|bornDate|phone|email|address|gender|role)", "").trim();
            // Remove curly braces, colon, and double quotes
            rowData[i] = rowData[i].replaceAll("[{}:\"]", "").trim();
            // If the column is "Fecha de nacimiento", format the date
            if (i == 3) {
                rowData[i] = formatDate(rowData[i]); // Assuming the fourth column is "Fecha de nacimiento"
            }
        }

        // Add row data to the table
        model.addRow(rowData);
    }
}

// Method to format date
private String formatDate(String dateStr) {
    try {
        DateFormat dateFormatInput = new SimpleDateFormat("yyyy-MM-dd"); // Input date format
        DateFormat dateFormatOutput = new SimpleDateFormat("yyyy-MM-dd"); // Output date format
        Date date = dateFormatInput.parse(dateStr);
        return dateFormatOutput.format(date);
    } catch (ParseException e) {
        e.printStackTrace();
        return dateStr; // Return original string if parsing fails
    }
}


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Gestion_doctors gestionDoctorsFrame = new Gestion_doctors();

        // Hacer visible el JFrame Gestion_doctors
        gestionDoctorsFrame.setVisible(true);

        // Cerrar el JFrame actual (Gestion_users)
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Gestion_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
