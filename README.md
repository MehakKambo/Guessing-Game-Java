# Guessing-Game-Java
This is a guessing game in which you input the range you want the computer to guess the number you have in your mind. 

# Instructions
This game starts with asking you to input a lower bound which is inclusive and then upperbound which is exclusive. This will be the range you guessed a number. Then, according to that, computer will make a guess. It will ask you three options, you must input h, l, or c. H if your number is higher than what computer guessed, l if your number is lower than what computer guessed, c if it is correct. It will keep on asking these options until the guess made by computer is correct. Then, it will ask you if you want to play again, or not.

# How it works
It asks for the bounds. Then if the guess is higher than your number, the guess + 1 becomes the lower bound and the upper bound remains the same. The reason we add 1 to the guess here is that lower bound is always inclusive and we don't want the computer to guess the same number again. Now, if the guess is lower than your number, the guess becomes the upper bound and tries to guess in that range. This keeps on going until the correct answers is guessed.
