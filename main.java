package atividadeFullStack;

import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class main {
        public static void main(String args[]) {
        pessoafisica israel = new pessoafisica("Israel", 1, "Goiania", "617.111.323-24", 21, "Masculino");
        pessoafisica celia = new pessoafisica("Celia", 2, "Goiânia", "331.254.212-24", 18, "Feminino");
        
        pessoa_juridica accon = new pessoa_juridica("Accon", 3, "Italia", "321.323.444-23", "Refrigerante");
        pessoa_juridica hut = new pessoa_juridica("Pizza Hut", 4, "Milão", "444.421.412-42", "Pizzaria");
        
        ContaEspecial ceIsrael = new ContaEspecial(israel, 111, 10000, 15000);
        ContaPoupanca cpCelia = new ContaPoupanca(celia, 222, 5000, 10);
        
        ContaEspecial ceAccon = new ContaEspecial(accon, 333, 20000, 40000);
        ContaPoupanca cpHut = new ContaPoupanca(hut, 333, 20000, 20);
     
        System.out.println("----------------------------------");
        System.out.println("Saldo Matheus: R$ "+ceIsrael.getSaldo());
        ceIsrael.sacar((double) 500);
        System.out.println("----------------------------------");
        System.out.println("Saldo Lucy: R$ "+cpCelia.getSaldo());
        cpCelia.depositar((double) 500);
        System.out.println("----------------------------------");
        System.out.println("Saldo Coca-Cola: R$ "+ceAccon.getSaldo());
        ceAccon.transferir(30000, cpCelia);
        System.out.println("Saldo Coca-Cola: R$ "+ceAccon.getSaldo());
        System.out.println("----------------------------------");
        System.out.println("Saldo Pizza Hut: R$ "+cpHut.getSaldo());
        cpHut.atualizaSaldoRendimento();
        System.out.println("----------------------------------");
        
        List<Conta> listConta = new ArrayList<Conta>();
        listConta.add(ceIsrael);
        listConta.add(cpCelia);
        listConta.add(ceAccon);
        listConta.add(cpHut);
        
        double total = 0;
        
        for(Conta conta : listConta) {
        	System.out.println("Nome: "+conta.getCliente().getNome()+" | Saldo: R$ "+conta.getSaldo());
        	total+= conta.getSaldo();
        }
        System.out.println("----------------------------------");
        System.out.println("Total: R$ "+total);
    }
}

