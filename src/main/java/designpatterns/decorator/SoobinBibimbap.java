package designpatterns.decorator;

public class SoobinBibimbap {
    public static void main(String agrs[]){
        Bibimbap seoulBibim = new SeoulRice();
        seoulBibim = new Egg(seoulBibim);
        seoulBibim = new Carrot(seoulBibim);
        System.out.println(seoulBibim.getDescription() + " is "  + seoulBibim.cost() + " WON.");

        Bibimbap busanBibim = new BusanRice();
        busanBibim = new Onion(busanBibim);
        busanBibim = new Carrot(busanBibim);
        System.out.println(busanBibim.getDescription() + " is "  + busanBibim.cost() + " WON.");

    }
}
