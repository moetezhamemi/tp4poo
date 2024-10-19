//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MotDict m1 = new MotDict("content","contentt");
        MotDict m2 = new MotDict("heureux","contentt");
        MotDict m3 = new MotDict("triste","content");
        Dict d = new Dict(9,"dict");
        d.Ajouter_Mot(m1);
        d.Ajouter_Mot(m2);
        d.Ajouter_Mot(m3);
        d.listerdict();
        boolean b = m1.syn(m2);
        System.out.println( "m1 et m2 est syn ??"+b );
        int nb = 0;
        nb = d.nbrsyn(m1);
        System.out.println("nbr syn "+ nb);
        d.suppmot(m1);
        d.listerdict();
        String c =d.rechdicho("content");
        System.out.println(c);
    }
}