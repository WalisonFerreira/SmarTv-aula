public class Usuario {
    public static void main(String[] args) {
        SmartTv smarttv = new SmartTv();
        //Váriavel, chamo uma classe e crio uma nova class da SmartTv.

        System.out.println("Tv Ligada? " + smarttv.ligada);

        System.out.println(smarttv.canal);
        smarttv.mudarCanal(7);
        System.out.println("Canal Atual " + smarttv.canal);

        System.out.println(smarttv.volume);

        smarttv.diminuirVolume();
        smarttv.aumentarVolume();
        smarttv.diminuirCanal();
        smarttv.aumentarCanal();
        System.out.println("Volume Atual " + smarttv.volume);

        smarttv.ligar();
        System.out.println("Ligada " + smarttv.ligada);
        
        smarttv.desligar();
        System.out.println("Ligada " + smarttv.ligada);
    
    }
}
