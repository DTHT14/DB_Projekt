package se.teq.databasprojekt;
import android.util.Log;

import java.sql.*;
import java.io.*;
/**
 * Created by Linus on 2015-01-19.
 */
public class Communication {

    public Communication(){
        String url = "192.178.235.60";
        String dbName = "ab5492";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "ab5492";
        String passWord = "stina9012";


        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://" + url + "/" + dbName + userName + passWord);


            //conn.close();


            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT Namn FROM Anstalld WHERE AnstID = 1");
            while (res.next()) {
                int id = res.getInt("id");
                String msg = res.getString("text");
                //System.out.println(id + "\t" + msg);
                Log.d("TEST", msg);
                Log.d("TEST", userName);


            }
         }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
