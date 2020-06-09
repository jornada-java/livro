class Aluno{  
    int id;  
    String nome;  
    String endereco;  
     
    Aluno(int id, String nome, String endereco){  
    this.id=id;  
    this.nome=nome;  
    this.endereco=endereco;  
    }  
      
    public String toString(){//aqui chamamos o método toString()
     return id+" "+nome+" "+endereco;  
    }  
    public static void main(String args[]){  
      Aluno pessoa1=new Aluno(1,"Kamila","Brasil");  
        
      System.out.println(pessoa1);//compilador escreve no console o resultado de pessoa1.toString()
    }  
   }  