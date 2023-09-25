package com.gentech.programs;

public class traffic {

	public static void main(String[] args) {
		String color=args[0];
		switch(color)
		{
		case "Red":
			System.out.println("stop");
			break;
		case "Green":
			System.out.println("go");
			break;
		case "Yellow":
			System.out.println("ready to go");
			break;
		default:
			System.out.println("invalid");
		}
			}
	}
