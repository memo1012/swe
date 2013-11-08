
package de.shop.util;

import static de.shop.util.Constants.REST_PATH;

public class TestConstants {

	public static final String WEB_PROJEKT = "shop";
	
	// https
	public static final String HTTPS = "https";
	public static final String HOST = "localhost";
	public static final int PORT = 8443;
	public static final String KEYSTORE_TYPE = "JKS";
	public static final String TRUSTSTORE_NAME = "client.truststore";
	public static final String TRUSTSTORE_PASSWORD = "Zimmermann";
	
	// Basis-URI
	// https://localhost:8443/shop/rest
	public static final String BASE_URI = HTTPS + "://" + HOST + ":" + PORT + "/" + WEB_PROJEKT + REST_PATH;
	
	// Pfade 
	//Kunde
	public static final String KUNDEN_URI = BASE_URI + "/kunden";
	public static final String KUNDEN_ID_PATH_PARAM = "kundenId";
	public static final String KUNDEN_ID_URI = KUNDEN_URI + "/{" + KUNDEN_ID_PATH_PARAM + "}";
	public static final String KUNDEN_ID_FILE_URI = KUNDEN_ID_URI + "/file";
	
	// Bestellung
	public static final String BESTELLUNGEN_URI = BASE_URI + "/bestellung";
	public static final String BESTELLUNGEN_ID_PATH_PARAM = "bestellungId";
	public static final String BESTELLUNGEN_ID_URI = BESTELLUNGEN_URI + "/{" + BESTELLUNGEN_ID_PATH_PARAM + "}";
	public static final String BESTELLUNGEN_ID_KUNDE_URI = BESTELLUNGEN_ID_URI + "/kunde";
	
	
	public static final String ARTIKEL_URI = BASE_URI + "/artikel";
	
	// Username und Password
	public static final String USERNAME = "3";
	public static final String PASSWORD = "3";
	public static final String USERNAME_ADMIN = "2";
	public static final String PASSWORD_ADMIN = "2";
	public static final String PASSWORD_FALSCH = "falsch";
	
	// Testklassen fuer Service- und Domain-Tests (nicht in Software Engineering)
	public static final Class<?>[] TEST_CLASSES = { };
	
	private TestConstants() {
		
	}
			
}
