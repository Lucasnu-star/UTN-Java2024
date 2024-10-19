public class Banco {


    // ATTRIBUTES
    public static int id = 1; // Esta variable es la que me ayuda a incrementar el id de los usuarios
    private int idUser;
    private String name;
    private double balance;

    // GETTER

    public int getIdUser() {return idUser;}
    public String getName() {return name;}
    public double getBalance() {return balance;}

    // SETTERS

    public void setName(String name) {this.name = name;}
    public void setBalance(double balance) {this.balance = balance;}

    // METHODS
    public void createUser(String name, double balance)
    {
        idUser = Banco.id++;
        this.name= name;
        this.balance= balance;
    }
    public double depositMoney(int money)
    {
        balance += money;
            return balance;
    }
    public double withdrawMoney(int money)
    {
        if(balance < money )
        {
            System.out.println("El monto que quieres sacar excede su balance porfavor intentelo devuelta");
        }
        else
        {
            balance = balance - money;

        }
            return balance;
    }
    public String showUser()
    {
        return "Id:"+ idUser + " " + "Nombre:" + " " + name + " " + "Balance:" + balance;
    }



}
