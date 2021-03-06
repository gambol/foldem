/*
 * This file is part of Fold'em, a Java library for Texas Hold 'em Poker.
 *
 * Fold'em is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Fold'em is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Fold'em.  If not, see <http://www.gnu.org/licenses/>.
 */
package codes.derive.foldem.example;

import static codes.derive.foldem.Poker.*;

import java.util.Collection;

import codes.derive.foldem.Card;
import codes.derive.foldem.Deck;
import codes.derive.foldem.Hand;
import codes.derive.foldem.Suit;

/**
 * An example that shows some basic usage of
 * {@link codes.derive.foldem.Hand}.
 */
public class HandsExample {

	public static void main(String... args) {
		
		// create a hand
		Hand a = hand(card(Card.ACE, Suit.SPADES), card(Card.ACE, Suit.HEARTS));
		
		// create the same hand again using shorthand
		Hand b = hand("AsAh");
		
		// create the hand with no specific suit information
		Collection<Hand> c = handGroup("AA");
		
		// create a hand from a shuffled deck.
		Deck deck = shuffledDeck();
		Hand d = hand(deck.pop(), deck.pop());
		
		// print out hands
		System.out.println(a);
		System.out.println(b);
		for (Hand h : c) {
			System.out.println(h);
		}
		System.out.println(d);
		
		/*
		 * Should output:
		 * 	AsAh
		 *	AsAh
		 *	AsAc
		 *	AsAh
		 *	AsAd
		 * 	AcAh
		 *	AcAd
		 *	AhAd
		 *	<random>
		 */
		
	}
	
}
