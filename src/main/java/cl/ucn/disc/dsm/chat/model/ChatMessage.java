/*
 * Copyright (c) 2019. Diego Urrutia-Astorga http://durrutia.cl
 */
package cl.ucn.disc.dsm.chat.model;

import java.time.LocalDateTime;

/**
 * Representacion de un mensaje de Chat.
 *
 * @author Diego Urrutia-Astorga.
 * @version 0.0.1
 */
public final class ChatMessage {

    /**
     * Tiempo en que el mensaje fue recibido por el server.
     */
    private final LocalDateTime timestamp;

    /**
     * Nombre del Usuario (NOT NULL).
     */
    private final String username;

    /**
     * Mensaje escrito por el de arriba.
     */
    private final String messsage;

    /**
     * The Constructor.
     *
     * @param timestamp tiempo.
     * @param username  usuario.
     * @param messsage  mensaje.
     */
    public ChatMessage(LocalDateTime timestamp, String username, String messsage) {
        this.timestamp = timestamp;
        this.username = username;
        this.messsage = messsage;
    }

    /**
     * @return the date.
     */
    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return the username.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return the message.
     */
    public String getMesssage() {
        return this.messsage;
    }
}
