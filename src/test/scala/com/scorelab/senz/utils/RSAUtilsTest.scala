package com.scorelab.senz.utils

import java.security.KeyPair

import com.scorelab.senz.config.Config
import org.scalatest.FunSuite

class RSAUtilsTest extends FunSuite {

  test("Test KeyPair Generation") {
    val keySize: Int = Config().getInt("app.rsaKeySize")
    val keyPair: KeyPair = RSAUtils.generateKeyPair(keySize)
    val privateKey: String = RSAUtils.privateKeyToString(keyPair.getPrivate)
    val publicKey: String = RSAUtils.publicKeyToString(keyPair.getPublic)
    println(s"Private Key: $privateKey")
    println(s"Public Key: $publicKey")
  }

}
