package com.yedam.homework0403;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Keypad game = new RPGgame();
		Keypad agame = new ArcadeGame();
		
		
		
		game.leftUpButton();
		game.rightUpButton();
		game.changeMode();
		game.leftDownButton();
		game.rightDownButton();
		game.leftDownButton();
		game.changeMode();
		game.rightDownButton();
		
		System.out.println("=================");
		
		agame.leftUpButton();
		agame.rightUpButton();
		agame.leftDownButton();
		agame.changeMode();
		agame.rightUpButton();
		agame.leftUpButton();
		agame.rightDownButton();

	}
}
