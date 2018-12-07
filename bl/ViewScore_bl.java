/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author Hp1
 */
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
*
* @author cgg
*/
public class ViewScore_bl
{
/**
* Connect to database
* @return Connection to database
* @throws java.lang.Exception
*/

/**
* This method will load vector of vector of string and load all the data in
* the vector
* @return vector of vector of string
* @throws java.lang.Exception
*/
        int y=80;
public void drawRecords(Graphics g)
{

try{
Connection conn = dbconnection.buildConnection();
PreparedStatement pre = conn.prepareStatement("select * from tt.userdata");

ResultSet rs = pre.executeQuery();

while(rs.next())
{
int x=10;
for(int i=1;i<8;i++)
g.drawString(rs.getString(i), x+=100, y);

    y+=30;
    
}

/*Close the connection after use (MUST)*/
if(conn!=null)
conn.close();
}catch(Exception ex){}
}
}