package Event.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.Event;

/**
 *
 * @author Kelly Buitrago
 */
public class MSAcces {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    private final String dbFilename = "D:\\Sexto Semestre\\Construccion\\plantilla\\src\\Event\\persistence\\plantilla.accdb";
    
    /**
     * Default constructor
     */
    public MSAcces() {
        if (this.connect()) {
        }
    }

   
    public Connection getConnection() {
        return connection;
    }

    
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
 
    private boolean connect() {
         boolean connected = false;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            this.setConnection(DriverManager.getConnection("jdbc:ucanaccess://" 
                    + this.dbFilename));
            connected = true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MSAcces.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connected;
    
    }
    
    /**
     * Work with DB (SELECT, INSERT, UPDATE, DELETE)
     * @param query Query Statement (TABLE)
     * @return True = Successful query
     */
    public boolean execute(String query) {
        boolean result = false;

        try {
            this.setStatement(this.getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY));
            this.getStatement().execute(query);
            this.setResultSet(this.getStatement().getResultSet());
            result = true;
        } catch (SQLException ex) {
            Logger.getLogger(MSAcces.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public List<Event> selectEvents(){
       List<Event> eventList = new ArrayList<>();
        try {
            this.setStatement(this.getConnection().createStatement());
           // String 
        } catch (SQLException ex) {
            Logger.getLogger(MSAcces.class.getName()).log(Level.SEVERE, null, ex);
        }
       return eventList;
    }

    
}
