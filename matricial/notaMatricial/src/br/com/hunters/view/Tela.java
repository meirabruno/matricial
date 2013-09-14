package br.com.hunters.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.hunters.control.Imprimir;
import br.com.hunters.model.Constantes;

public class Tela extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4035703420464239930L;
	
	//Labels da tela
	private JLabel lbTitulo			= new JLabel(Constantes.VIAL_IMOVEIS);
	private JLabel lbCodigo 		= new JLabel(Constantes.CODIGO + ":");
	private JLabel lbNumero			= new JLabel(Constantes.NUMERO + ":");
	private JLabel lbMesCompetencia	= new JLabel(Constantes.MES_DE_COMPETENCIA + ":");
	private JLabel lbDataPagamento 	= new JLabel(Constantes.DATA_PAGAMENTO + ":");
	private JLabel lbLocatario 		= new JLabel("Locatário:");
	private JLabel lbImovel 		= new JLabel("Imóvel:");
	private JLabel lbInicio 		= new JLabel("Início:");
	private JLabel lbTermino 		= new JLabel("Término:");
	private JLabel lbNumeroCheque 	= new JLabel("O Pagamento foi efetuado com Cheque N°:");
	private JLabel lbBanco 			= new JLabel("Contra o Banco:");
	private JLabel lbAluguel 		= new JLabel("Aluguel:");
	private JLabel lbImpostoPredial = new JLabel("Imposto Predial:");
	private JLabel lbRateio 		= new JLabel("Rateio:");
	private JLabel lbImpostoRenda 	= new JLabel("Imposto de Renda:");
	private JLabel lbDesconto1 		= new JLabel("Desconto 1:");
	private JLabel lbDesconto2 		= new JLabel("Desconto 2:");
	private JLabel lbDesconto3 		= new JLabel("Desconto 3:");
	private JLabel lbTotal1 		= new JLabel("Total 1:");
	private JLabel lbTotal2 		= new JLabel("Total 2:");
	
	//Imputs da tela
	private JTextField txtCodigo 		 = new JTextField();
	private JTextField txtNumero 		 = new JTextField();
	private JTextField txtMesCompetencia = new JTextField();
	private JTextField txtDataPagamento  = new JTextField();
	private JTextField txtLocatario 	 = new JTextField();
	private JTextField txtImovel 		 = new JTextField();
	private JTextField txtInicio 		 = new JTextField();
	private JTextField txtTermino 		 = new JTextField();
	private JTextField txtNumeroCheque 	 = new JTextField();
	private JTextField txtBanco 		 = new JTextField();
	private JTextField txtAluguel 		 = new JTextField();
	private JTextField txtImpostoPredial = new JTextField();
	private JTextField txtRateio 		 = new JTextField();
	private JTextField txtImpostoRenda 	 = new JTextField();
	private JTextField txtDesconto1 	 = new JTextField();
	private JTextField txtDesconto2 	 = new JTextField();
	private JTextField txtDesconto3 	 = new JTextField();
	private JTextField txtTotal1 	 	 = new JTextField();
	private JTextField txtTotal2 		 = new JTextField();
	
	private JPanel painel 		= new JPanel();
	private JPanel painelBotoes = new JPanel();
	
	private JButton btLimpar 	= new JButton("Limpar");
	private JButton btImprimir 	= new JButton("Imprimir");
	
	private Imprimir imprimir = new Imprimir();
	
	public Tela(){
		super("Vial Imóveis");
		this.setLayout(null);
		this.setResizable(false);
		setSize(830, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.montaTela();
		btImprimir.addActionListener(imprimir );
	}
	
	//Adiciona os campos na tela
	public void montaTela(){
		Font fonte = new Font("Serif", Font.BOLD, 40);
		getLbTitulo().setFont(fonte);
		
		posicionaCampos();
		getPainel().setBackground(Color.lightGray);
		this.add(getPainel());
		getPainel().add(getLbTitulo());
		
		this.add(getLbCodigo());
		this.add(getTxtCodigo());
		this.add(getLbNumero());
		this.add(getTxtNumero());
		this.add(getLbMesCompetencia());
		this.add(getTxtMesCompetencia());
		this.add(getLbDataPagamento());
		this.add(getTxtDataPagamento());
		this.add(getLbLocatario());
		this.add(getTxtLocatario());
		this.add(getLbAluguel());
		this.add(getTxtAluguel());
		this.add(getLbImovel());
		this.add(getTxtImovel());
		this.add(getLbImpostoPredial());
		this.add(getTxtImpostoPredial());
		this.add(getLbInicio());
		this.add(getTxtInicio());
		this.add(getLbTermino());
		this.add(getTxtTermino());
		this.add(getLbRateio());
		this.add(getTxtRateio());
		this.add(getLbNumeroCheque());
		this.add(getTxtNumeroCheque());
		this.add(getLbImpostoRenda());
		this.add(getTxtImpostoRenda());
		this.add(getLbBanco());
		this.add(getTxtBanco());
		this.add(getLbDesconto1());
		this.add(getTxtDesconto1());
		this.add(getLbDesconto2());
		this.add(getTxtDesconto2());
		this.add(getLbDesconto3());
		this.add(getTxtDesconto3());
		this.add(getLbTotal1());
		this.add(getTxtTotal1());
		this.add(getLbTotal2());
		this.add(getTxtTotal2());
		
		getPainelBotoes().setLayout(null);
		getPainelBotoes().setBackground(Color.LIGHT_GRAY);
		getPainelBotoes().add(getBtLimpar());
		getPainelBotoes().add(getBtImprimir());
		this.add(getPainelBotoes());
			
	}
	
	
	//Posiciona os campos na tela
	public void posicionaCampos(){
		
		getPainel().setBounds(5, 5, 815, 80);
		getPainelBotoes().setBounds(592, 260, 200, 100);
		
		getLbTitulo().setBounds(5, 5, 500, 20);
		
		getLbCodigo().setBounds(5, 100, 200, 20);		
		getTxtCodigo().setBounds(55, 100, 100, 20);
		
		getLbNumero().setBounds(165, 100, 200, 20);
		getTxtNumero().setBounds(220, 100, 100, 20);
		
		getLbMesCompetencia().setBounds(330, 100, 200, 20);
		getTxtMesCompetencia().setBounds(460, 100, 100, 20);
		
		getLbDataPagamento().setBounds(570, 100, 120, 20);
		getTxtDataPagamento().setBounds(690, 100, 100, 20);
		
		getLbLocatario().setBounds(5, 140, 100, 20);
		getTxtLocatario().setBounds(70, 140, 491, 20);
		
		getLbAluguel().setBounds(638, 140, 100, 20);
		getTxtAluguel().setBounds(690, 140, 100, 20);
		
		getLbImovel().setBounds(5, 180, 100, 20);
		getTxtImovel().setBounds(70, 180, 491, 20);
		
		getLbImpostoPredial().setBounds(592, 180, 100, 20);
		getTxtImpostoPredial().setBounds(690, 180, 100, 20);
		
		getLbInicio().setBounds(5, 220, 100, 20);
		getTxtInicio().setBounds(70, 220, 100, 20);
		
		getLbTermino().setBounds(190, 220, 100, 20);
		getTxtTermino().setBounds(250, 220, 100, 20);
		
		getLbRateio().setBounds(645, 220, 100, 20);
		getTxtRateio().setBounds(690, 220, 100, 20);
		
		getLbNumeroCheque().setBounds(5, 260, 300, 20);
		getTxtNumeroCheque().setBounds(250, 260, 310, 20);
		
		getLbDesconto1().setBounds(5, 300, 100, 20);
		getTxtDesconto1().setBounds(80, 300, 100, 20);
		
		getLbDesconto2().setBounds(190, 300, 100, 20);
		getTxtDesconto2().setBounds(270,  300,  100,  20);
		
		getLbDesconto3().setBounds(380, 300, 100, 20);
		getTxtDesconto3().setBounds(460, 300, 100, 20);
		
		getLbTotal1().setBounds(5, 340, 100, 20);
		getTxtTotal1().setBounds(80, 340, 100, 20);
		
		getLbTotal2().setBounds(190, 340, 100, 20);
		getTxtTotal2().setBounds(270, 340, 100, 20);
		
		getBtLimpar().setBounds(50, 20, 100, 20);
		getBtImprimir().setBounds(50, 60, 100, 20);
	}

	public JLabel getLbTitulo() {
		return lbTitulo;
	}

	public void setLbTitulo(JLabel lbTitulo) {
		this.lbTitulo = lbTitulo;
	}

	public JLabel getLbCodigo() {
		return lbCodigo;
	}

	public void setLbCodigo(JLabel lbCodigo) {
		this.lbCodigo = lbCodigo;
	}

	public JLabel getLbNumero() {
		return lbNumero;
	}

	public void setLbNumero(JLabel lbNumero) {
		this.lbNumero = lbNumero;
	}

	public JLabel getLbMesCompetencia() {
		return lbMesCompetencia;
	}

	public void setLbMesCompetencia(JLabel lbMesCompetencia) {
		this.lbMesCompetencia = lbMesCompetencia;
	}

	public JLabel getLbDataPagamento() {
		return lbDataPagamento;
	}

	public void setLbDataPagamento(JLabel lbDataPagamento) {
		this.lbDataPagamento = lbDataPagamento;
	}

	public JLabel getLbLocatario() {
		return lbLocatario;
	}

	public void setLbLocatario(JLabel lbLocatario) {
		this.lbLocatario = lbLocatario;
	}

	public JLabel getLbImovel() {
		return lbImovel;
	}

	public void setLbImovel(JLabel lbImovel) {
		this.lbImovel = lbImovel;
	}

	public JLabel getLbInicio() {
		return lbInicio;
	}

	public void setLbInicio(JLabel lbInicio) {
		this.lbInicio = lbInicio;
	}

	public JLabel getLbTermino() {
		return lbTermino;
	}

	public void setLbTermino(JLabel lbTermino) {
		this.lbTermino = lbTermino;
	}

	public JLabel getLbNumeroCheque() {
		return lbNumeroCheque;
	}

	public void setLbNumeroCheque(JLabel lbNumeroCheque) {
		this.lbNumeroCheque = lbNumeroCheque;
	}

	public JLabel getLbBanco() {
		return lbBanco;
	}

	public void setLbBanco(JLabel lbBanco) {
		this.lbBanco = lbBanco;
	}

	public JLabel getLbAluguel() {
		return lbAluguel;
	}

	public void setLbAluguel(JLabel lbAluguel) {
		this.lbAluguel = lbAluguel;
	}

	public JLabel getLbImpostoPredial() {
		return lbImpostoPredial;
	}

	public void setLbImpostoPredial(JLabel lbImpostoPredial) {
		this.lbImpostoPredial = lbImpostoPredial;
	}

	public JPanel getPainelBotoes() {
		return painelBotoes;
	}

	public void setPainelBotoes(JPanel painelBotoes) {
		this.painelBotoes = painelBotoes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JLabel getLbRateio() {
		return lbRateio;
	}

	public void setLbRateio(JLabel lbRateio) {
		this.lbRateio = lbRateio;
	}

	public JLabel getLbImpostoRenda() {
		return lbImpostoRenda;
	}

	public void setLbImpostoRenda(JLabel lbImpostoRenda) {
		this.lbImpostoRenda = lbImpostoRenda;
	}

	public JLabel getLbDesconto1() {
		return lbDesconto1;
	}

	public void setLbDesconto1(JLabel lbDesconto1) {
		this.lbDesconto1 = lbDesconto1;
	}

	public JLabel getLbDesconto2() {
		return lbDesconto2;
	}

	public void setLbDesconto2(JLabel lbDesconto2) {
		this.lbDesconto2 = lbDesconto2;
	}

	public JLabel getLbDesconto3() {
		return lbDesconto3;
	}

	public void setLbDesconto3(JLabel lbDesconto3) {
		this.lbDesconto3 = lbDesconto3;
	}

	public JLabel getLbTotal1() {
		return lbTotal1;
	}

	public void setLbTotal1(JLabel lbTotal1) {
		this.lbTotal1 = lbTotal1;
	}

	public JLabel getLbTotal2() {
		return lbTotal2;
	}

	public void setLbTotal2(JLabel lbTotal2) {
		this.lbTotal2 = lbTotal2;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JTextField getTxtMesCompetencia() {
		return txtMesCompetencia;
	}

	public void setTxtMesCompetencia(JTextField txtMesCompetencia) {
		this.txtMesCompetencia = txtMesCompetencia;
	}

	public JTextField getTxtDataPagamento() {
		return txtDataPagamento;
	}

	public void setTxtDataPagamento(JTextField txtDataPagamento) {
		this.txtDataPagamento = txtDataPagamento;
	}

	public JTextField getTxtLocatario() {
		return txtLocatario;
	}

	public void setTxtLocatario(JTextField txtLocatario) {
		this.txtLocatario = txtLocatario;
	}

	public JTextField getTxtImovel() {
		return txtImovel;
	}

	public void setTxtImovel(JTextField txtImovel) {
		this.txtImovel = txtImovel;
	}

	public JTextField getTxtInicio() {
		return txtInicio;
	}

	public void setTxtInicio(JTextField txtInicio) {
		this.txtInicio = txtInicio;
	}

	public JTextField getTxtTermino() {
		return txtTermino;
	}

	public void setTxtTermino(JTextField txtTermino) {
		this.txtTermino = txtTermino;
	}

	public JTextField getTxtNumeroCheque() {
		return txtNumeroCheque;
	}

	public void setTxtNumeroCheque(JTextField txtNumeroCheque) {
		this.txtNumeroCheque = txtNumeroCheque;
	}

	public JTextField getTxtBanco() {
		return txtBanco;
	}

	public void setTxtBanco(JTextField txtBanco) {
		this.txtBanco = txtBanco;
	}

	public JTextField getTxtAluguel() {
		return txtAluguel;
	}

	public void setTxtAluguel(JTextField txtAluguel) {
		this.txtAluguel = txtAluguel;
	}

	public JTextField getTxtImpostoPredial() {
		return txtImpostoPredial;
	}

	public void setTxtImpostoPredial(JTextField txtImpostoPredial) {
		this.txtImpostoPredial = txtImpostoPredial;
	}

	public JTextField getTxtRateio() {
		return txtRateio;
	}

	public void setTxtRateio(JTextField txtRateio) {
		this.txtRateio = txtRateio;
	}

	public JTextField getTxtImpostoRenda() {
		return txtImpostoRenda;
	}

	public void setTxtImpostoRenda(JTextField txtImpostoRenda) {
		this.txtImpostoRenda = txtImpostoRenda;
	}

	public JTextField getTxtDesconto1() {
		return txtDesconto1;
	}

	public void setTxtDesconto1(JTextField txtDesconto1) {
		this.txtDesconto1 = txtDesconto1;
	}

	public JTextField getTxtDesconto2() {
		return txtDesconto2;
	}

	public void setTxtDesconto2(JTextField txtDesconto2) {
		this.txtDesconto2 = txtDesconto2;
	}

	public JTextField getTxtDesconto3() {
		return txtDesconto3;
	}

	public void setTxtDesconto3(JTextField txtDesconto3) {
		this.txtDesconto3 = txtDesconto3;
	}

	public JTextField getTxtTotal1() {
		return txtTotal1;
	}

	public void setTxtTotal1(JTextField txtTotal1) {
		this.txtTotal1 = txtTotal1;
	}

	public JTextField getTxtTotal2() {
		return txtTotal2;
	}

	public void setTxtTotal2(JTextField txtTotal2) {
		this.txtTotal2 = txtTotal2;
	}

	public JPanel getPainel() {
		return painel;
	}

	public void setPainel(JPanel painel) {
		this.painel = painel;
	}

	public JTextField getTxtCodigo() {
		return txtCodigo;
	}

	public void setTxtCodigo(JTextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}

	public JButton getBtLimpar() {
		return btLimpar;
	}

	public void setBtLimpar(JButton btLimpar) {
		this.btLimpar = btLimpar;
	}

	public JButton getBtImprimir() {
		return btImprimir;
	}

	public void setBtImprimir(JButton btImprimir) {
		this.btImprimir = btImprimir;
	}

	
}
