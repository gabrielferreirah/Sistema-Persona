
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriel de Oliveira Ferreira
 */
public class CadastroCliente {

    String[] nomes = new String[100];
    String[] sobrenomes = new String[100];
    int[] idades = new int[100];
    char[] sexos = new char[100];
    String[] cpfs = new String[100];
    String[] estados = new String[100];
    String[] cidades = new String[100];
    String[] bairros = new String[100];
    String[] logradouros = new String[100];
    String[] ceps = new String[100];
    String[] numeros = new String[100];
    String[] complementos = new String[100];
    int atual = 0;

    public void cadastrar() {
        solicitarInformacao(atual);
        atual++;

    }

    public void editar() {
        String busca = JOptionPane.showInputDialog("Digite o nome para editar");
        for (int i = 0; i < atual; i++) {
            if (nomes[i].equals(busca)) {
                solicitarInformacao(atual);
            }
            
        }
    }

    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");

        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                apresentarInformacao(i);
            }
        }
    }

    public void buscarPeloCPF() {
        String cpfBuscado = JOptionPane.showInputDialog("digite o CPF para a busca").replace(".", "").replace("-", "");
        for (int i = 0; i < atual; i++) {
            if (cpfs[i].equals(cpfBuscado)) {
                apresentarInformacao(i);
            }
            return;
        }
    }

    public void listar() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomes[i] + "  " + cpfs[i] + "\n";
        }
    }
    
    public void contabilizarPeloNome(){
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        int quantidadeRegistros = 0;
        for(int i = 0; i < atual; i++){
            if (nomes[i].contains(busca)) {
                quantidadeRegistros++;
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de " + busca + " é: " + quantidadeRegistros);
    }
    
    public void apresentarInformacao(int i){
        JOptionPane.showMessageDialog(null, 
                        "Nome: " + nomes[i]
                        + "\nIdade: " + idades[i]
                        + "\nCPF: " + cpfs[i]
                        + "\nEstado: " + estados[i]
                        + "\nCidade: " + cidades[i]
                        + "\nBairro: " + bairros[i]
                        + "\nLogradouro: " + logradouros[i]
                        + "\nCEP: " + ceps[i]
                        + "\nNúmero: " + numeros[i]
                        + "\nComplemento: " + complementos[i]
        );
    }

    private void solicitarInformacao(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog("Digite seu nome");
        sobrenomes[posicao] = JOptionPane.showInputDialog("Digite seu sobrenome");
        idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog(nomes[posicao] + ", " + "Digite sua idade"));
        sexos[posicao] = JOptionPane.showInputDialog(nomes[posicao] + ", " + "Digite seu sexo").charAt(0);
        cpfs[posicao] = JOptionPane.showInputDialog(nomes[posicao] + ", " + "Digite seu CPF").replace(".", "").replace("-", "");
        estados[posicao] = JOptionPane.showInputDialog(nomes[posicao] + ", " + "Digite seu estado").trim().toUpperCase();
        cidades[posicao] = JOptionPane.showInputDialog(nomes[posicao] + ", " + "Digite sua cidade");
        logradouros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + ", " + "Digite seu logradouro");
        bairros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + ", " + "Digite seu bairro");
        ceps[posicao] = JOptionPane.showInputDialog(nomes[posicao] + ", " + "Digite seu cep");
        numeros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + ", " + "Digite seu numero");
        complementos[posicao] = JOptionPane.showInputDialog(nomes[posicao] + ", " + "Digite seu complemento");
    }
}
