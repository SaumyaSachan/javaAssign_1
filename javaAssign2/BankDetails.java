package javaAssign2;

// Parent class Bank
class Bank {
    public void getDetails() {
        System.out.println("Bank details are not specified.");
    }
}

// SBI subclass
class SBI extends Bank {
    @Override
    public void getDetails() {
        System.out.println("SBI Bank - Interest Rate: 5.4%");
    }
}

// BOI subclass
class BOI extends Bank {
    @Override
    public void getDetails() {
        System.out.println("BOI Bank - Interest Rate: 5.6%");
    }
}

// ICICI subclass
class ICICI extends Bank {
    @Override
    public void getDetails() {
        System.out.println("ICICI Bank - Interest Rate: 6.2%");
    }
}

// Main class to test the implementation
public class BankDetails {
    public static void main(String[] args) {
        // Creating objects of different banks
        Bank sbi = new SBI();
        Bank boi = new BOI();
        Bank icici = new ICICI();

        // Printing bank details
        sbi.getDetails();
        boi.getDetails();
        icici.getDetails();
    }
}

