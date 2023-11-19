public class Main {
    public static void main(String[] args) {

        player player_1 = new player();
        player_1.name = "  Casemiro ";
        player_1.age = 31;
        player_1.rank = 44;
        player_1.info();
        player_1.pass();

        player player_2 = new player();
        player_2.name = "  Kevin De Bruyne ";
        player_2.age = 32;
        player_2.rank = 3;
        player_2.info();
        player_2.pass_2();

        player player_3 = new player();
        player_3.name = "  Jamal Musiala ";
        player_3.age = 20;
        player_3.rank = 73;
        player_3.info();
        player_3.shoot();

        player player_4 = new player();
        player_4.name = "  Herling Haaland ";
        player_4.age = 23;
        player_4.rank = 2;
        player_4.info();
        player_4.jump();

        player player_5 = new player();
        player_5.name = "  kylian Mbappe ";
        player_5.age = 23;
        player_5.rank = 1;
        player_5.info();
        player_5.score();
    }
}