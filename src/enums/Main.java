package enums;

import static enums.AccountType.JOINT;

public class Main {
    public static void main(String[] args) {
        /*Account account = new Account(10000, "Gopinath", JOINT);
        System.out.println(account);
        System.out.println(account.getAccountType().getMinBal());
        System.out.println(AccountType.CURRENT.getMinBal());*/

        /*int x = 0;
        int y = 0;

        for (int z = 0; z < 5; z++) {
            if ((++x > 2) && (++y > 2))
                x++;
        }
        System.out.println(x + " "+y);*/
        int a= 9;
        int b= 2;
        int c = a | b;
        int d = a & b;
        System.out.println(a + " "+b);
    }
}
