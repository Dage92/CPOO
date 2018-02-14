
/**
 * Permet de chiffer/dechiffrer un chaine de caracteres.
 *
 * David Goodman
 * 14/02/2018
 */
public class ChaineCryptee
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String en_clair;
    private int decalage;

    /**
     * Constructeur d'objets de classe ChaineCryptee
     */
    public ChaineCryptee(String en_clair, int decalage)
    {
        this.en_clair = en_clair;
        this.decalage = decalage;
    }
    
    /**
     * Retourne la chaine en_clair.
     */
    public String decrypte()
    {
        return en_clair;
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
        return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
    }
    
    /**
     * Retourne la chaine chiffree.
     */
    public String crypte()
    {
        String ChaineCryptee = " ";
        int i;
        if (this.en_clair == null)
        {
            return("Erreur: Chaine vide.");
        }
        else
        {
            for (i = 0; i<this.en_clair.length() ; i++)
            {
                ChaineCryptee = ChaineCryptee + decaleCaractere(this.en_clair.charAt(i),this.decalage);
            }
            return ChaineCryptee;
        }
    }
}
