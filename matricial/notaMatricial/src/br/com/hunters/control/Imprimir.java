package br.com.hunters.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.PrintStream;

import br.com.hunters.model.Constantes;

public class Imprimir implements ActionListener{
	
	
	//Porta original LPT1
	String portaImpressora = "C:/Users/Alexandre/Desktop/imprimir matricial/teste.txt";
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		FileOutputStream fos = null;
		PrintStream ps = null;
		
		// Abre a impressora
		try {
		     fos = new FileOutputStream(portaImpressora);
		     ps = new PrintStream(fos);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		//Prepara impressora
		ps.print(preparaImpressora());
		
		//Imprime primeira linha
		ps.print(linhaHorizontal(95));
		
		//Imprime Segunda Linha
		ps.print(proximaLinha());
		
		/* Imprime barra lateral*/
		ps.print(Constantes.BARRA_LATERAL);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(3));
		
		/*Imprime Texto quadro 1 - 12 colunas*/
		ps.print(Constantes.VIAL_IMOVEIS);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(3));
		
		/* Imprime barra lateral*/
		ps.print(Constantes.BARRA_LATERAL);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(4));
		
		/*Imprime Texto quadro 2 - 6 colunas*/
		ps.print(Constantes.CODIGO);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(4));
		
		/* Imprime barra lateral*/
		ps.print(Constantes.BARRA_LATERAL);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(4));
		
		/*Imprime Texto quadro 3 - 6 colunas*/
		ps.print(Constantes.NUMERO);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(4));
		
		/* Imprime barra lateral*/
		ps.print(Constantes.BARRA_LATERAL);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(3));
		
		/*Imprime Texto quadro 4 - 18 colunas*/
		ps.print(Constantes.MES_DE_COMPETENCIA);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(3));
		
		/* Imprime barra lateral*/
		ps.print(Constantes.BARRA_LATERAL);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(1));
		
		/*Imprime Texto quadro 5 - 17 colunas*/
		ps.print(Constantes.DATA_PAGAMENTO);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(1));
		
		/* Imprime barra lateral*/
		ps.print(Constantes.BARRA_LATERAL);
		
		//Imprime Terceira Linha
		
		/* Pula uma linha */
		ps.print(quebrarLinha(1));
		
		/* Retorno do carro */
		ps.print(Constantes.RETORNA_CARRO);
		
		/* Imprime barra lateral*/
		ps.print(Constantes.BARRA_LATERAL);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(3));
		
		/* Imprime texto 2 do quadro 1 */
		ps.print(Constantes.CRECI);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(2));
		
		/* Imprime barra lateral*/
		ps.print(Constantes.BARRA_LATERAL);
		
		/* Espaço em Branco */
		ps.print(espacosBrancos(4));
		
	}
	
	protected String preparaImpressora(){
		
		return Constantes.ESPACAMENTO_PADRAO + ("\u001B\u0043" + (char)30) + Constantes.RETORNA_CARRO;
		
	}
	
	protected String proximaLinha(){
		return quebrarLinha(1) + Constantes.RETORNA_CARRO;
		
	}
	
	
	
	/* Quebra N linhas */
	protected String quebrarLinha(int i) {
		String linhas = "";
		for(int index = 0 ; index < i; index++){
			linhas += Constantes.QUEBRAR_LINHA;
		}
		return linhas;
	}
	
	/* Imprime linha horizontal */
	protected String linhaHorizontal(int qnt){
		String linha = "";
		for(int i = 0; i < qnt; i++){
			linha += "_";
		}
		return linha;
	}
	
	/* Imprime espaços em branco */
	protected String espacosBrancos(int qnt){
		String espacos = "";
		for(int i = 0; i < qnt; i++){
			espacos += " ";
		}
		return espacos;
	}

}
