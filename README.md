# Crypto-Concepts-CIA2
## Cryptography Concepts Algorithm Implementation - Diffie-Hellman Algorithm

### Explanation : 
The Diffie-Hellman algorithm is being used to establish a shared secret that can be used for secret communications while exchanging data over a public network using the elliptic curve to generate points and get the secret key using the parameters.  

### Process :
- We consider 4 variables : P, G, a and b
- P is a prime number and G is a primitive root of P initialised at the beginning with the consent of the two parties
- We ask both the parties to individually enter their private key values (a and b)
- Public key values are comouted using the formula : Math.pow(a, b)) % p
- The public key values are exchanged between the two parties
- Symmetric keys are calculated by each of the parties
- If the two keys are same (which is the objective of the algorithm) - it is known as the shared secret key

### Running the file : 
- javac dh.java
- java dh

