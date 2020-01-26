package tostringexample;

class AlunoSemToString{  
    int id;  
    String nome;  
    String endereco;  
     
    AlunoSemToString(int id, String nome, String endereco){  
    this.id=id;  
    this.nome=nome;  
    this.endereco=endereco;  
    }  
      
     
    public static void main(String args[]){  
      AlunoSemToString pessoa1=new AlunoSemToString(1,"Kamila","Brasil");  
        
      System.out.println(pessoa1);//compilador escreve no console o resultado de pessoa1.toString()
    }  
   }  