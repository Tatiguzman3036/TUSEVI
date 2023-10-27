package com.tusevi.viajesTusevi.modelos;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class CorreoServicio {
    public static void enviarCodigoValidacion(String destinatario, String codigoValidacion) {
        // Configura las propiedades para la sesión de JavaMail
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        String usuario = "growshopgozo@gmail.com";
        String contraseña = "xfiuncmddpjgregt";

        // Obtiene la sesión de JavaMail
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(usuario, contraseña);
            }
        });

        try {
            // Crea un mensaje de correo
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(usuario)); // Dirección de correo del remitente
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario)); // Dirección de correo del destinatario
            message.setSubject("Código de Validación"); // Asunto del correo
            message.setText("Tu código de validación es: " + codigoValidacion); // Contenido del correo

            // Envía el mensaje
            Transport.send(message);

            System.out.println("Correo enviado satisfactoriamente.");

        } catch (MessagingException e) {
            e.printStackTrace();
            System.err.println("Error al enviar el correo: " + e.getMessage());
        }
    }
}
