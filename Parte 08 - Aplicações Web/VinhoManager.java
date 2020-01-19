import java.util.ArrayList;
import java.util.List;

public class VinhoManager
{
    public List<String> selecionarVinhosPorTipo(String tipo)
    {
        List<String> vinhos = new ArrayList<String>();
        if( tipo.equals("branco") ) {
			vinhos.add("Chardonnay");
			vinhos.add("Sauvignon Blanc");
		} else if( tipo.equals("tinto") ) {
			vinhos.add("Brunello di Montalcino");
			vinhos.add("Cabernet Sauvignon Santa Helena");
		} else if( tipo.equals("rose") ) {
			vinhos.add("Casillero Del Diablo Rosé");
			vinhos.add("Casa Valduga Naturelle Rosé");
		}
        return vinhos;
    }
}