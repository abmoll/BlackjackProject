## Description

This project creates a working blackjack card game between a dealer and a player.  Cards are drawn from a deck and given to the dealer and the player. The player can choose to hit or stay.

## Topics Covered

* Object-oriented design and UML
* Enums
* ArrayLists
* Basic game design and game logic


## Class Structure

The following classes exist:
Card - each card has a rank, suit and value.
Deck - the deck is an ArrayList of 52 Cards with a dealCard() and shuffleDeck() method.
Game - contains the main method to start the program and contains game logic.
Hand - contains ArrayList of Cards as well as addCard() and getValueOfHand() methods.
Player - each player has a name and a Hand. 

The following enums exist:
Rank
Suit

## To Run project

In the src directory, run Game.java