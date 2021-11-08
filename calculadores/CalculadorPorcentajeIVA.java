package com.tuempresa.facturaciongit.calculadores;
import org.openxava.calculators.*; // Para usar 'ICalculator'

import com.tuempresa.facturaciongit.util.*; // Para usar 'PreferenciasFacturacion'
 
public class CalculadorPorcentajeIVA implements ICalculator {
	public Object calculate() throws Exception {
        return PreferenciasFacturacionGit.getPorcentajeIVADefecto();
    }
}
