package class1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
    
    private final String url = "jdbc:mysql://localhost/app_password";
    
    PreparedStatement psPrepararSentencia;                    
    Connection con = null;
    
public Conexion() {
     try{
         
         Class.forName("com.mysql.jdbc.Driver");    
         con = DriverManager.getConnection(url,"root","");
        if (con!=null){
            System.out.println("Conexión a base de datos funcionando");                //Sin funciona imprimimos en consola un mensaje
         }
      }//cerramos el try
         catch(SQLException e)        //Agarramos excepciones de tipo SQL
         {
         System.out.println(e);          //las mostramos en consola
         }
         catch(ClassNotFoundException e)       //agarramos excepciones de tipo clase en java
         {
          System.out.println(e);               //las mostramos en consola
         }
    }

public Connection conectado(){  //Este metodo de tipo Connection nos devuelve el estado del objeto
      return con;
}

    public void desconectar(){     //Por seguridad, cuando terminemos sentencias, cerramos la conexion o si la necesitamos cerrar por otro caso
      con = null;                  //Ahora de nuevo con sera null
      System.out.println("La conexion la BD se ha cerrado");

    } 

    
}
