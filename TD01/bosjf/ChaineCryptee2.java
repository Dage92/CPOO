
/**
 * Permet de chiffer/dechiffrer un chaine de caracteres.
 *
 * David Goodman
 * 14/02/2018
 */
public class ChaineCryptee2
{
    
    private String en_clair;
    private int decalage;

    /**
     * Constructeur d'objets de classe ChaineCryptee
     */
    public ChaineCryptee2(String en_clair, int decalage)
    {
        this.en_clair = en_clair;
        this.decalage = decalage;
    }
  
      /**
     * Décale un caractère majuscule.
     * Les lettres en majuscule ('A' - 'Z') sont décalés de <code>decalage</code>
     * caractères de façon circulaire. Les autres caractères ne sont pas modifiés.
     *
     * @param c le caractère à décaler
     * @param decalage le décalage à appliquer
     * @return le caractère décalé
     */
    private static char decaleCaractere(char c, int decalage) {
        return (c < 'A' || c > 'Z')? c : (char)(Math.floorMod(c - 'A' + decalage, 26) + 'A');
    }
    
    public String decrypte ()
    {
        String res = "";
        if (crypte == null)
        {
            return null;
        }
        for (int i = 0; i<crypte.length(); i++)
        {
            res = decaleCaractere(crypte.charAt(i),-decalage);
        }
        return res;
    }
    
    public String crypte()
    {
        return crypte;
    }
    
}