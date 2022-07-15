
package calendario;
import java.util.Calendar;
import java.util.GregorianCalendar;


// Ederson A. Silva Author.
public class Main {

public static void main(String[] args) {
           
    GregorianCalendar dataAtual = new GregorianCalendar(2020,05,12);
    
   
    
    //Retorno da data atual do sistema
    System.out.println("Date" + dataAtual.getTime());
    
    //Retorno apenas o dia do mês a pedido do desafio.
    System.out.println("Dia do Mês: " + dataAtual.get(Calendar.DAY_OF_MONTH));
    //Retorno apenas do mês a pedido do desafio.
    System.out.println("Mes do Ano: " + dataAtual.get(Calendar.MONTH));
    //Retorno apenas do ano a pedido do desafio.
    System.out.println("Ano Atual: " + dataAtual.get(Calendar.YEAR));
    
   //Verifica se o ano é bisexto ou não.
    System.out.println(dataAtual.isLeapYear(2016));
    
  //Clone a Pedido no Desafio
 GregorianCalendar cloneDataAtual = new GregorianCalendar();cloneDataAtual = (GregorianCalendar)dataAtual.clone();
  System.out.println("Data Clonada"+ " Clone dataAtual object : "+ cloneDataAtual.getTime());
  // fim do Clone
  
       GregorianCalendar dataAleatoria = new GregorianCalendar(2021,05,11);
        
      
        int anoDiferente = dataAleatoria.get(Calendar.YEAR);
        int anoSistema = dataAtual.get(Calendar.YEAR);
        int mesDiferente = dataAleatoria.get(Calendar.MONTH);
        int mesSistema = dataAtual.get(Calendar.MONTH);
        int diaDiferente = dataAleatoria.get(Calendar.DAY_OF_MONTH);
        int diaSistema = dataAtual.get(Calendar.DAY_OF_MONTH);
                
        int resultadoMaiorSistema = 0; 
        int resultadoIgual = 1; 
        int resultadoMaiorParametro = -1;

        
      
        if(anoDiferente > anoSistema || mesDiferente > mesSistema || diaDiferente > diaSistema){
            System.out.println("Data do Parametro é maior : " + resultadoMaiorParametro);
        }
        else if(anoDiferente == anoSistema && mesDiferente == mesSistema && diaDiferente == diaSistema){
            System.out.println("Data é a mesma :" + resultadoIgual);
        }
        else{
            System.out.println("Data do Sistema é maior: " + resultadoMaiorSistema);
        }
}
}
