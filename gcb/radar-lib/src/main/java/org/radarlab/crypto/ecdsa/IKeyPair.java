package org.radarlab.crypto.ecdsa;

import java.math.BigInteger;

public interface IKeyPair {
    String pubHex();
    BigInteger pub();
    byte[] pubBytes();

    String privHex();
    BigInteger priv();

    boolean verify(byte[] data, byte[] sigBytes);
    byte[] sign(byte[] bytes);

    byte[] sha256_Ripemd160_Pub();
}
