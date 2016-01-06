package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

public class PotcoinMain extends CoinType {

    private PotcoinMain() {
        id = "potcoin.main";

        addressHeader = 55;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;

        family = BitFamily.get();
        name = "Potcoin";
        symbol = "POT";
        uriScheme = "potcoin";
        bip44Index = 81;
        unitExponent = 8;
        feePerKb = value(100000);
        minNonDust = value(1000); // 0.00001 MNC mininput
        softDustLimit = value(100000); // 0.001 MONA
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static PotcoinMain instance = new PotcoinMain();
    public static synchronized PotcoinMain get() {
        return instance;
    }

}
