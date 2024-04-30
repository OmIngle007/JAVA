interface DatabaseConnection {
    void connect();
    void disconnect();
}

class MySqlConnection implements DatabaseConnection {

    public void connect() {
        System.out.println("Connecting to MySQL database...");

    }


    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");

    }
}

class OracleConnection implements DatabaseConnection {

    public void connect() {
        System.out.println("Connecting to Oracle database...");

    }


    public void disconnect() {
        System.out.println("Disconnecting from Oracle database...");

    }
}

public class Main {
    public static void main(String[] args) {
        DatabaseConnection mysqlConnection = new MySqlConnection();
        DatabaseConnection oracleConnection = new OracleConnection();

        mysqlConnection.connect();
        mysqlConnection.disconnect();

        oracleConnection.connect();
        oracleConnection.disconnect();
    }
}
