package web;

import java.io.FileReader;
import java.util.List;

public class GestioneCatalogo {
    
    private GestioneCatalogo filein;

    public void RWtXt (){
    }

    public void read(){
        try {       
              filein = new FileReader("prova.txt");
              int next;
            do {
                next = filein.read(); // legge il prossimo carattere
                
                if (next != -1) { // se non e' finito il file
                    char nextc = (char) next;
                    System.out.print(nextc); // stampa il carattere
                }

            } while (next != -1);
            
            filein.close(); // chiude il file
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /*
     * nome metodo -> recuperaComputersDaTxt
     * 
     * nel metodo :
     * 1 recupera dal file txt tutti i record e divide in chiachi le parole precedenti ai : mentre in valori le parole prima dei ;
     * 
     */

    public List<Computers> recuperaComputersDaTxt(){
        List<String> chiavi =  new ArrayList<String>();
        List<String> valori =  new ArrayList<String>();
        List<Computers> com =  new ArrayList<Computers>();

        try {       
            filein = new FileReader("prova.txt");
            int next;
            String text = "";
          do {
              next = filein.read(); // legge il prossimo carattere
                
              if (next != -1) { // se non e' finito il file
                    char nextc = (char) next;
                    if (nextc == ':') {
                        chiavi.add(text);
                        text = "";
                    }else if (nextc == ';'){
                        valori.add(text);
                        text = "";
                    }else if (nextc == ' ') {
                        //non fa nulla
                    }else{
                        text += nextc;
                    }

              }

          } while (next != -1);
          
          filein.close(); // chiude il file

          for (int i = 0; i < valori.size(); i = i+6) {
            Computers comp = new Computers(valori.get(i), valori.get(i+1), valori.get(i+2), Double.parseDouble(valori.get(i+3)), valori.get(i+4), Double.parseDouble(valori.get(i+5)));
            com.add(comp);
          }


      } catch (IOException e) {
          System.out.println(e);
      }
    
      com.forEach(el -> System.out.println(el.toString()));


        return com;
    }
}
