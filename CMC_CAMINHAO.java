 package CarroMotoCaminhao;
    
    public class Caminhao extends CarroMotoCaminhao {
       
       public Caminhao (String marca, String modelo, int ano) {
           super (marca, modelo, ano);
       }
       @Override
       
       public void acelerar(){
           System.out.println(modelo + "" + marca + "está engrenando a próxima marcha e acelerando lentamente.");
       }
       }