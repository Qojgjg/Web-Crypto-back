package ar.web.crypto.back.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;

@Service
public interface WebCryptoService {

    /**
     * Metodo que devuelve
     * @return String
     * @throws IOException Exception del archivo
     * @throws URISyntaxException Exception con la sintaxis de la URL
     */
    String postCrypto() throws IOException, URISyntaxException;
}
