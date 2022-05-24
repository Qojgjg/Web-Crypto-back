package ar.web.crypto.back.controller;

import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RestController(value = "Controller de Crypto")
@RequestMapping(path = "/web/crypto/api/v1", name = "CHOTO")
public class WebCryptoController {

    public static String apiKey="683489f8-0141-4598-9270-f0c59c75a2c2";
    @GetMapping(name = "Metodo para probar el servicio este levantado", path = "/cryptocurrency")
    public String postCrypto() throws URISyntaxException, IOException {
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        parameters.add(new BasicNameValuePair("convert","USD"));
        URIBuilder query = new URIBuilder("https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest");
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(query.addParameters(parameters).build());
        request.setHeader(HttpHeaders.ACCEPT, "application/json");
        request.addHeader("X-CMC_PRO_API_KEY", apiKey);
        CloseableHttpResponse response = client.execute(request);
        try {
            EntityUtils.consume(response.getEntity());
            return String.valueOf(response.getEntity());
        } finally {
            response.close();
        }
    }

}