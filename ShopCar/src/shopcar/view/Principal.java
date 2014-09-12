/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopcar.view;

import javax.enterprise.context.ApplicationScoped;
<<<<<<< HEAD
=======

>>>>>>> 981ac47570eeed7ea67322663c807dfffc527a98
import javax.inject.*;
import shopcar.controller.*;
import shopcar.model.*;
import shopcar.repository.JpaDAO;
import shopcar.util.*;



/**
 *
 * @author info1
 */
@ApplicationScoped
public class Principal
{
    @Inject private Util util;
    @Inject CadastroVeiculo cadastroVeiculo;
    @Inject private Moto m;
    @Inject private VendeCarro vendeCarro;
    @Inject private VeiculoController veiculoController;
    @Inject private ListagemVeiculo listagem;
    @Inject private Validator<Veiculo> valida; 
    
    @Inject private JpaDAO<Veiculo> dao;

    
    
    
    public Principal() { }
    
    public void MenuPrincipal()
    {
        for (int i = 0; i < 40; ++i) System.out.println();
        System.out.println("         *** ShopCar ***");
        System.out.println("-------------------------------");
        System.out.println("1 - Cadastrar Veiculos");
        System.out.println("2 - Listar Veiculos");
        System.out.println("3 - Ficha Veiculo");
        System.out.println("4- Vender Veiculo");
        System.out.println("5- Sair");
        System.out.println("");
        System.out.println("Escolha a opção desejada: ");
        
        try
        {
            nextMenu("menuprincipal",util.testInput(1,5));
        } 
        catch (Exception e)
        {
            util.clear();
            System.out.println(e.getMessage());
        }
    }
    
    public void nextMenu(String from,int escolha)
    {
        if(from.equalsIgnoreCase("menuprincipal"))
        {
            switch(escolha)
            {
                case 1: 
                    cadastroVeiculo.saveVeiculo();
                case 2:
                    listagem.pegarPlaca();
            }
        }
    }
    
    public int MenuDeListagem()
    {
        return 0;
    }
    
    private boolean testId(Object id)
    {
        return true;
    }
    
    public void teste()
<<<<<<< HEAD
    {    
=======
    {
        try
        {
            Veiculo v;
            v = dao.getById("ABC-1234");
            System.out.println(v.getPlaca());
        } 
        catch (Exception e)
        {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        }
>>>>>>> 981ac47570eeed7ea67322663c807dfffc527a98
        
    }
}
