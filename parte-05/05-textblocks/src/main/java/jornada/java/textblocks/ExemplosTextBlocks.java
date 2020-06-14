package jornada.java.textblocks;

/**
 * Conteúdo para o Jornada Colaborativa. Livro Jornada Java.
 * 
 * @author RinaldoDev
 */
public class ExemplosTextBlocks {

	String html1 = "<html><body><h1>Olá Mundo!</h1></body></html>";
	
	String html12 = "<html>\r\n" + 
					"	<body>\r\n" + 
					"		<h1>Olá Mundo!</h1>\r\n" + 
					"	</body>\r\n" + 
					"</html>";
	
	String html2 =	 """
					<html>
						<body>
							<h1>Olá Mundo!</h1>
						</body>
					</html>
					""";
	
	String html3 =	 """
					<html>
						<body>
							<h1>Olá "Mundo"!</h1>
						</body>
					</html>
					""";
	
	String html4 =	"""
					<html>
						<body>
							<h1>Olá %s</h1>
						</body>
					</html>
					""".formatted("Mundo!");
	
	String linha = 	"""
					Manter \
					na mesma \
					linha!
					""";
		
	String json = 	"""
					{
						"nome": "RinaldoDev",
						"altura": 1.74,
						"mensagem": "Olá Mundo!"
					}			
					""";
		
	String sql = 	"""
					SELECT nome, email 
					FROM escritores
					WHERE nome LIKE '%rinaldo%';
					""";
	
	String xml = 	"""
					<nome>Rinaldo</nome>
					<altura>1.74</altura>
					<mensagem>Olá Mundo!</mensagem>
					""";
	
	String css = 	"""
					h1 {
					  color: black;
					  text-align: center;
					}
					
					.verdana {
					  font-family: verdana;
					}			
					""";
	
	String mensagem = 	"""
						Esse tipo de mensagem, que pode ser muito grande, \
						pode ser declarado com Text Blocks. Assim, mesmo \
						que ela tenha que ficar na mesma linha quando for \
						impressa em algum lugar, fica mais fácil de ler \
						a mensagem no código fonte. Isso é muito melhor \
						do que ficar concatenando várias Strings.
						""";
	
	String javascript = """
						function msg(){  
							alert("Olá Mundo JavaScript!");  
						}  
						""";
	public static void main(String[] args) {
		ExemplosTextBlocks exemplos = new ExemplosTextBlocks();
		System.out.println(exemplos.html1);
		System.out.println(exemplos.html2);
		System.out.println(exemplos.html3);
		System.out.println(exemplos.html4);
		System.out.println(exemplos.linha);
		System.out.println(exemplos.json);
		System.out.println(exemplos.sql);
		System.out.println(exemplos.xml);
		System.out.println(exemplos.css);
		System.out.println(exemplos.mensagem);
		System.out.println(exemplos.javascript);
	}
	
}
