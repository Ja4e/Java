/*
 * RecursiveFactorial.java
 * 
 * Copyright 2024 Jake Z <jakez@fedora>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class RecursiveFactorial {
	public static long factorial(int n){ 
		/*long = 64 bits with 2's complement 
		int = 32 bit with 2's complement
		
		FUNCTION PUBLIC SHAREABLE*/
			if(n==0){
				return 1;
			}
			else{ // using if (n!=0)
				return n*factorial(n-1);// or no else just using return
			}
	}
	public static void main (String[] args) {
		System.out.println( factorial(5));
	}
}

