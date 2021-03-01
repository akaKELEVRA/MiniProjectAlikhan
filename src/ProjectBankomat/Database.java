package ProjectBankomat;

public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];
    static {
        allAccounts[0] = new CityBankAccount("Iliyas", "Zhuanyshev", 20000, "KZ010322312", "0102");
        allAccounts[1] = new CityBankAccount("Erbol", "Assanbek", 10000, "KZ010322313", "0101");
        allAccounts[2] = new NationalBankAccount("Iliyas Zhuanyshev", 2000, "KZ0101112", "0102");
        allAccounts[3] = new NationalBankAccount("Erbol Assanbek", 2000, "KZ0101113", "0201");
        allAccounts[4] = new NationalBankAccount("Quentin Tarantino", 3000, "KZ0101114", "0202");
        allAccounts[5] = new CityBankAccount("Robert", "Zemeckis", 15000, "KZ010322314", "0103");
        allAccounts[6] = new CityBankAccount("Christopher", "Nolan", 16000, "KZ010322315", "0104");
        allAccounts[7] = new CityBankAccount("David", "Lynch", 11000, "KZ010322316", "0105");
        allAccounts[8] = new CityBankAccount("Steven", "Spielberg", 13000, "KZ010322317", "0106");
        allAccounts[9] = new CityBankAccount("George", "Lucas", 17000, "KZ010322318", "0107");
    }
}
