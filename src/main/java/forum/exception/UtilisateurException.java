/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.exception;

/**
 *
 * @author ETY
 */
public class UtilisateurException extends Exception{

    public UtilisateurException() {
    }

    public UtilisateurException(String message) {
        super(message);
    }

    public UtilisateurException(String message, Throwable cause) {
        super(message, cause);
    }

    public UtilisateurException(Throwable cause) {
        super(cause);
    }

    public UtilisateurException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
