package Controller;

import model.Lista;

public class ListaMaior {

    public ListaMaior(){
        super();
    }

    public void checarMaiores(Lista listaL){
        int tamanho= listaL.size();
        int aux= 0;
        for(int i=0; i< tamanho; i++){
            for (int j=0; j< tamanho - 1; j++){
                try {
                    if (listaL.get(j) > listaL.get(j + 1)){
                        aux= listaL.get(j + 1);
                        listaL.remove(j + 1);
                        listaL.add(listaL.get(j), j + 1);
                        listaL.remove(j);
                        listaL.add(aux, j);
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        try {
            System.out.println("Maior: "+ listaL.get(tamanho - 1) +"\t Segundo Maior: "+ listaL.get(tamanho - 2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
