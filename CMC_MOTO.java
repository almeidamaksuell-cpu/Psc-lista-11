   package CarroMotoCaminhao;
  
   public class moto extends CarroMotoCaminhao {
       
       public moto (String marca, String modelo, int ano) {
           super (marca, modelo, ano);
       }
       @Override
       
       public void acelerar(){
           System.out.println(modelo + "" + marca + "está acelerando e empinando a roda dianteira!");
       }
       }
   