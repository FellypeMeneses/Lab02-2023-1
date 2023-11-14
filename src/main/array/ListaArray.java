package array;

import list.EstruturaElementar;

public class ListaArray implements EstruturaElementar{

    private int[] array;
    private int indice_fim;

    public ListaArray() {

    }

    @Override
    public boolean buscaElemento(int valor) {
       if(array == null){
        return false;
    }
    else{
        for(int i=0;i<array.length;i++){
            if(array[i]==valor){
                return true;
            }
        }
        return false;
    }
}
    @Override
    public int buscaIndice(int valor) {
        return array[valor];
    }
    @Override
    public int minimo() {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    @Override
    public int maximo() {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    @Override
    public int predecessor(int valor) {
        return array[valor-1];
    }


    @Override
    public int sucessor(int valor) {
        return array[valor+1];
    }

    @Override
    public void insereElemento(int valor) {
        if(array==null){
            array=new int[1];
            array[0]=valor;
          }
          else{
            int[] novoArray = new int[array.length+1];
            for(int i=0;i<array.length;i++){
               novoArray[i]=array[i];
           }
           novoArray[array.length]=valor;
           array=novoArray;
           }   
       }
   

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        if(array==null){
            array=new int[1];
            array[0]=valor;
        }
        else{
            int[] novoArray = new int[array.length+1];
            for(int i=0;i<buscaIndice;i++){
                novoArray[i]=array[i];
            }
            novoArray[buscaIndice]=valor;
            for(int i=buscaIndice+1;i<array.length;i++){
                novoArray[i]=array[i-1];
            }
            array=novoArray;
        }

    }

    @Override
    public void insereInicio(int valor) {
        if(array==null){
            array=new int[1];
            array[0]=valor;
        }
        else{
            int[] novoArray= new int[array.length+1];
            for(int i=0;i<array.length;i++){
                novoArray[i+1]=array[i];
            }
            novoArray[0]=valor;
            array=novoArray;
        }
    }

    @Override
    public void insereFim(int valor) {
        if(array==null){
            array=new int[1];
            array[0]=valor;
        }
        else{
            int[] novoArray= new int[array.length+1];
            for(int i=0;i<array.length;i++){
                novoArray[i]=array[i];
            }
            novoArray[array.length]=valor;
            array=novoArray;
        }
    }
    @Override
    public void remove(int valor) {
        if(buscaElemento(valor)){
            int[] arrayNovo=new int[array.length-1];
            int indice=0;
            for(int i=0;i<array.length;i++){
                if(array[i]!=valor){
                    arrayNovo[indice]=array[i];
                    indice=indice+1;
                }
                else{}
            }
            array=arrayNovo;
        }
        
    }

    @Override
    public void removeIndice(int indice) {
        if(array==null||array.length==0){
            array=null;
        }
        else{
            int[] arrayNovo = new int[array.length-1];
            for(int i=0;i<indice;i++){
                arrayNovo[i]=array[i];
            }
            for(int i=indice+1;i<array.length;i++){
                arrayNovo[i-1]=array[i];
            }
            array=arrayNovo;
        }
    }

    @Override
    public void removeInicio() {
        if(array==null||array.length==0){
            array=null;
        }
        else{
            int[] arrayNovo = new int[array.length-1];
            for(int i=0;i<array.length-2;i++){
                arrayNovo[i]=array[i+1];
            }
            array = arrayNovo;
        }
    }
    @Override
    public void removeFim() {
       if(array==null||array.length==0){
            array=null;
        }
        else{
            int[] arrayNovo = new int[array.length-1];
            for(int i=0;i<array.length-1;i++){
                arrayNovo[i]=array[i];
            }
            array=arrayNovo;
        }
        
    }
    
}
