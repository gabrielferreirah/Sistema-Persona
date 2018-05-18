
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
public class Sistema {

    CadastroCliente registroCliente = new CadastroCliente();

    public void apresentarMenu() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar Cliente"
                + "\n2 - Editar Cliente"
                + "\n3 - Buscar pelo nome"
                + "\n4 - Buscar pelo CPF"
                + "\n5 - Listar Clientes"
                + "\n8001 - Sair"
        ));
        while (menu != 8001) {
            switch (menu) {
                case 1:
                    registroCliente.cadastrar();
                    break;
                case 2:
                    registroCliente.editar();
                    break;
                case 3:
                    registroCliente.buscarPeloNome();
                    break;
                case 4:
                    registroCliente.buscarPeloCPF();
                    break;
                case 5:
                    registroCliente.listar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 - Cadastrar Cliente"
                    + "\n2 - Editar Cliente"
                    + "\n3 - Editar pelo nome"
                    + "\n4 - Buscar pelo CPF"
                    + "\n5 - Listar Clientes"
                    + "\n8001 - Sair"
            ));
        }
    }
}
