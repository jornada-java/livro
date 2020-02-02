public class Unboxing
{ 
    public static void main (String[] args) 
    { 
        // criando um objeto da classe Integer  
        Integer inteiro = new Integer(100); 
  
        // realizando unboxing deste objeto
        int novointeiro = inteiro; 
  
        System.out.println("Valor de inteiro: " + inteiro); 
        System.out.println("Valor de novo inteiro: " + novointeiro); 
    }
}
