public class Dict {
    int nbmots;
    private MotDict[] tdict;
    private String nom;
    public Dict(int nb, String n) {
        nbmots = 0;
        tdict = new MotDict[nb];
        nom = n;
    }


    void Ajouter_Mot(MotDict m) {
        if (nbmots >= tdict.length) {
            System.out.println("Le dictionnaire est plein, impossible d'ajouter un nouveau mot.");
            return;
        }

        int i = 0;
        boolean trouve = false;
        while (i < nbmots && !trouve) {
            if (tdict[i] != null) {
                String m1 = tdict[i].getMot();
                if (m1.compareTo(m.getMot()) > 0) {
                    trouve = true;
                    i--;
                }
            }
            i++;
        }

        for (int j = nbmots; j > i; j--) {
            tdict[j] = tdict[j - 1];
        }


        tdict[i] = new MotDict(m.getMot(), m.getDefinition());
        nbmots++;
    }

    void trier() {
        boolean trouve;
        for (int i = 0; i < nbmots - 1; i++) {
            trouve = false;
            for (int j = 0; j < nbmots - 1 - i; j++) {
                if (tdict[j].getMot().compareTo(tdict[j + 1].getMot()) > 0) {
                    MotDict temp = tdict[j];
                    tdict[j] = tdict[j + 1];
                    tdict[j + 1] = temp;
                    trouve = true;
                }
            }
            if (!trouve) {
                break;
            }
        }
    }


    void suppmot(MotDict m) {
        for (int i = 0; i < nbmots; i++) {
            if (tdict[i].getMot().compareTo(m.getMot())==0) {
                for (int j = i; j < nbmots - 1; j++) {
                    tdict[j] = tdict[j + 1];
                }
                nbmots--;
                break;
            }
        }
    }
    String rechdicho(String ch) {
        int i = 0;
        while (i < nbmots) {
            if (tdict[i].getMot().compareTo(ch)==0) {
                return tdict[i].getDefinition();
            }
            i++;
        }
        return "non trouve";
    }
    void listerdict() {
        for (int i = 0; i < nbmots; i++) {
            System.out.println("Mot: " + tdict[i].getMot());
            System.out.println("Définition: " + tdict[i].getDefinition());
        }
    }

    int nbrsyn(MotDict m) {
        int nb = 0;
        for (int i = 0; i < nbmots; i++) {
            if (m.syn(tdict[i]))
            {
                nb++;
            }
        }
        return nb - 1;
    }
}
