public class MotDict {
    private String mot;
    private String definition;
    public MotDict(String m,String def)
    {
        mot = m;
        definition = def;
    }
    String getMot()
    {
        return mot;
    }
    String getDefinition()
    {
        return definition;
    }
    void setDefinition(String d)
    {
        definition = d;
    }
    void setmot(String m)
    {
        mot = m;
    }
    Boolean synonyme(String chaine)
    {
        if(this.definition.compareTo(chaine)== 0)
        {
            return true;
        }
        else return false;
    }
    Boolean syn(MotDict m)
    {
        if(this.definition.compareTo(m.definition) == 0)
        {
            return true;
        }
        else return false;
    }

}
