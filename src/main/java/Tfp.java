/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;


      


public class Tfp {
    
    private final String dsi="2018-01-01";
  private final String dsf="2018.31.31";
  private final String userName="root";
  private final String password="test";
  private final String dbms="mysql";
  private final String serverName = "localhost";
  private final String portNumber="3306";
  private final String dbName="test";
   Connection conn =null;

    /**
     * Get the value of password
     *
     * @return the value of password
     */   
    /**
     * @param args the command line arguments
     */

public static void main(String[] args) {
       new Tfp().operate();
    }

void operate(){
try {
            // TODO code application logic here
            Map<String,DatePartida> map = new TreeMap<>();
             conn = new Tfp().cnx();
             
            PreparedStatement stmt;
             stmt = conn.prepareStatement("select * from par  ");
             
            ResultSet rs;
            
            rs=stmt.executeQuery();
           // rs.setFetchSize(100);
          
            Logger.getLogger(Tfp.class.getName()).log(Level.INFO, null, "rs size " + rs.getFetchSize());
            while(rs.next()){
                //System.out.println(rs.getString(1)+" "+rs.getString(4));
                Adresa adr=new Adresa(rs.getString("loca"),rs.getString("adr" ));
                DateBuletin dbul=new DateBuletin(rs.getString("nr"),rs.getString("ser" ),rs.getString("pol"),
                       rs.getString("cnp") ,rs.getDate("delib" ));
                Dateins din=new Dateins(rs.getDate("dins" ),rs.getDate("discre" ),rs.getDate("sot" ));
                Pensie pen=new Pensie(rs.getString("decp") ,rs.getDouble("pen" ));
                Soldinit soldi=new Soldinit(rs.getDouble("soldi" ),rs.getDouble("cot" ),rs.getDouble("depb" ));
                String par=rs.getString("par");
                String nume=rs.getString("nume");
                DatePartida datep=new DatePartida(par,nume,adr,dbul,pen,din,soldi);
                map.put(par,datep);


            }
            for(Map.Entry<String,DatePartida> entry: map.entrySet()){
              entry.getKey(); //in sql
              // entry.getValue().getList().add(res)
            }

            GenPdf generator = new GenPdf();
            generator.createPdf(map,new File("tfp.pdf"));


        } catch (SQLException ex) {
             Logger.getLogger(Tfp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
} finally{
    try {
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(Tfp.class.getName()).log(Level.SEVERE, null, ex);
    }
}
       
}
 
    
    
    public Connection cnx() throws SQLException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.put("user",userName);
        properties.put("password", password);
        StringBuilder sb = new StringBuilder();
        sb.append("jdbc:").append(dbms).append("://")
                .append(serverName).append(":").append(portNumber)
                .append("/").append(dbName).append("?useSSL=false");
        String url = sb.toString();

        Connection cnxtfp= DriverManager.getConnection(url, properties);
        return cnxtfp;
 
    }

}