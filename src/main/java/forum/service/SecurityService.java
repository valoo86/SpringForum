/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author ETY
 */
@Service
public class SecurityService {

    public boolean verifierAccess(String nomMethode) {
        if (nomMethode.startsWith("admin")) {
            return false;
        }

        return true;
    }
}
