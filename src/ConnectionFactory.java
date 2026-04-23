import java.sql.Connection;
public class ConnectionFactory{
    private static String usuario = "postgres";
    private static String senha = "postgres";
    private static String host  = "localhost";
    private static String port = "5432";
    private static String db = "2026_fatec_ipi_poo_pessoas";

    public  static Connection obterConexao(){
        //try/catch
        try{
           //string de conexão
            var s = String.format(
                "jdbc:postgresql://%s:%s/%s",
                host, port, db
            );
            Connection conexao = DriverManager.getConnection(
                s, usuario, senha
            );
        return conexao; 
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
            
        }
    }
    public static void main(String[] args){
        System.out.println(obterConexao());
    }
}