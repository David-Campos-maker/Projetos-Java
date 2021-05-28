/*Este projeto é uma implementação simples de um banco (será atualizado)*/

package Banquin;

import Banquin.entidade.Cliente;
import Banquin.entidade.Conta;

public class Main {
    public static void main(String args[]) {
        //Comandos de Teste
        Cliente cliente = new Cliente();
        cliente.nome = "David Campos";
        System.out.println("Cliente: " + cliente.nome);

        Conta conta = new Conta(123456);
        System.out.println("Saldo: R$ " + conta.getSaldo());
        conta.creditar(1000);
        System.out.println("Saldo: R$ " + conta.getSaldo());
        conta.debitar(200);
        System.out.println("Saldo: R$ " + conta.getSaldo());
        conta.debitar(1000);
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}
