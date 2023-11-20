package br.com.aulaws.controller;

import br.com.aulaws.dao.ClienteDAO;
import br.com.aulaws.domain.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ClienteController {

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnNovo;

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField tfCPF;

    @FXML
    private TextField tfEndereco;

    @FXML
    private TextField tfNome;

    @FXML
    private Label lblMessage;

    private Cliente cliente;

    private ClienteDAO clienteDAO;

    @FXML
    void handlerCancelar(ActionEvent event) {
        cliente = null;
        habilitarComponentes(true);
        btnNovo.setDisable(false);
        btnCancelar.setDisable(true);
    }

    @FXML
    void handlerLimpar(ActionEvent event) {
        limparCampos();
    }

    @FXML
    void handlerNovo(ActionEvent event) {
        cliente = new Cliente();
        habilitarComponentes(false);
        btnNovo.setDisable(true);
    }

    @FXML
    void handlerSalvar(ActionEvent event) {
        
        if(isValido()){
            clienteDAO = new ClienteDAO();
            preencherCliente();
            clienteDAO.inserir(cliente);
            lblMessage.setText("Cliente cadastrado com sucesso!");
            lblMessage.setVisible(true);
        }       

    }

    private void habilitarComponentes(Boolean habilitar){
        tfCPF.setDisable(habilitar);
        tfEndereco.setDisable(habilitar);
        tfNome.setDisable(habilitar);
        btnSalvar.setDisable(habilitar);
        btnLimpar.setDisable(habilitar);
        btnCancelar.setDisable(habilitar);
    }

    private Boolean isValido(){
        if (tfCPF.getText().isEmpty() || tfCPF.getText().isBlank()) {
            lblMessage.setText("CPF obrigatório!");
            lblMessage.setVisible(true);
            return false;
        }

        lblMessage.setVisible(false);
        return true;
    }

    private void limparCampos(){
        tfCPF.clear();
        tfEndereco.clear();
        tfNome.clear();
        lblMessage.setVisible(false);
    }

    private void preencherCliente(){
        cliente.setCpf( tfCPF.getText() );
        cliente.setEndereco( tfEndereco.getText() );
        cliente.setNome( tfNome.getText() );
    }

}
