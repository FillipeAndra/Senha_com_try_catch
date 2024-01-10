package SENHA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua senha ");
        String senha = leitor.nextLine();
        if(senha.length() <8){
            throw new SenhaInvalidaException("Senha invalida, por favor digitar, com no mínimo 8 caracteres");
        }


        try{
            System.out.println("senha cadastrada com sucesso!");
        }catch(SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }

    }
}