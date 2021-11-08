package com.tuempresa.facturaciongit.util;
import java.io.*;
import java.math.*;
import java.util.*;

import org.apache.commons.logging.*;
import org.openxava.util.*;
 
public class PreferenciasFacturacionGit {
	  private final static String ARCHIVO_PROPIEDADES="facturaciongit.properties";
	    private static Log log = LogFactory.getLog(PreferenciasFacturacionGit.class);
	 
	    private static Properties propiedades; // Almacenamos las propiedades aquí
	 
	    private static Properties getPropiedades() {
	        if (propiedades == null) { // Usamos inicialización vaga
	            PropertiesReader reader = // PropertiesReader es una clase de OpenXava
	                new PropertiesReader(
	                    PreferenciasFacturacionGit.class, ARCHIVO_PROPIEDADES);
	            try {
	                propiedades = reader.get();
	            }
	            catch (IOException ex) {
	                log.error(
	                    XavaResources.getString( // Para leer un mensaje i18n
	                        "properties_file_error",
	                        ARCHIVO_PROPIEDADES),
	                    ex);
	                  propiedades = new Properties();
	             }
	        }
	        return propiedades;
	    }
	 
	    public static BigDecimal getPorcentajeIVADefecto() { // El único método público
	        return new BigDecimal(getPropiedades().getProperty("porcentajeIVADefecto"));
	    }
}
